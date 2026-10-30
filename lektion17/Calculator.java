/**
 * This is quite an advanced little file showing off some interresting stuff
 * one can do with an interface and records.
 * 
 * The Expression interface makes an algebraic data type (ADT)
 * 
 */

public class Calculator {
    /*
     * A sealed interface is an advanced feature that forbids
     * anyone to implement it apart from nested classes or those
     * mentioned in a permits-clause.
     * 
     */
    private sealed interface Expression permits Value, Add, Subtract, Multiply, Divide {
        double value();
    }

    private record Value(double value) implements Expression {
        @Override
        public String toString() {
            return Double.toString(value);
        }
    }

    private record Add(Expression op1, Expression op2) implements Expression {
        public double value() {
            return op1.value() + op2.value();
        }

        @Override
        public String toString() {
            return "(" + op1 + " + " + op2 + ")";
        }
    }

    private record Subtract(Expression op1, Expression op2) implements Expression {
        public double value() {
            return op1.value() - op2.value();
        }

        @Override
        public String toString() {
            return "(" + op1 + " - " + op2 + ")";
        }
    }

    private record Multiply(Expression op1, Expression op2) implements Expression {
        public double value() {
            return op1.value() * op2.value();
        }

        @Override
        public String toString() {
            return "(" + op1 + " * " + op2 + ")";
        }
    }

    private record Divide(Expression op1, Expression op2) implements Expression {
        public double value() {
            return op1.value() / op2.value();
        }

        @Override
        public String toString() {
            return "(" + op1 + " / " + op2 + ")";
        }
    }

    public static Expression parse(String input) {
        Parser parser = new Parser(input);
        Expression expr = parser.parseExpression();
        parser.skipWhitespace();
        if (!parser.isAtEnd()) {
            throw new IllegalArgumentException(
                    "Unexpected character at index " + parser.pos + ": " + input.charAt(parser.pos));
        }
        return expr;
    }

    /**
     * This is a simple recursive decent parser for arithmetic expressions
     * building an abstract syntax tree.
     * 
     */
    @SuppressWarnings("java:S125")
    private static class Parser {
        private final String input;
        private int pos = 0;

        Parser(String input) {
            this.input = input;
        }

        // expression = term { ("+" | "-") term }
        Expression parseExpression() {
            Expression left = parseTerm();
            while (true) {
                skipWhitespace();
                if (match('+')) {
                    Expression right = parseTerm();
                    left = new Add(left, right);
                } else if (match('-')) {
                    Expression right = parseTerm();
                    left = new Subtract(left, right);
                } else {
                    break;
                }
            }
            return left;
        }

        // term = factor { ("*" | "/") factor }
        private Expression parseTerm() {
            Expression left = parseFactor();
            while (true) {
                skipWhitespace();
                if (match('*')) {
                    Expression right = parseFactor();
                    left = new Multiply(left, right);
                } else if (match('/')) {
                    Expression right = parseFactor();
                    left = new Divide(left, right);
                } else {
                    break;
                }
            }
            return left;
        }

        // factor = [ "+" | "-" ] primary
        private Expression parseFactor() {
            skipWhitespace();
            if (match('+')) {
                return parseFactor();
            }
            if (match('-')) {
                Expression factor = parseFactor();
                if (factor instanceof Value(double v)) {
                    return new Value(-v);
                }
                return new Subtract(new Value(0), factor);
            }
            return parsePrimary();
        }

        // primary = number | "(" expression ")"
        private Expression parsePrimary() {
            skipWhitespace();
            if (match('(')) {
                Expression expr = parseExpression();
                skipWhitespace();
                if (!match(')')) {
                    throw new IllegalArgumentException("Missing closing parenthesis at index " + pos);
                }
                return expr;
            }

            int start = pos;
            while (pos < input.length() && (Character.isDigit(input.charAt(pos)) || input.charAt(pos) == '.')) {
                pos++;
            }

            if (start == pos) {
                throw new IllegalArgumentException("Expected number or '(' at index " + pos);
            }

            try {
                double val = Double.parseDouble(input.substring(start, pos));
                return new Value(val);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Invalid number format at index " + start, e);
            }
        }

        private void skipWhitespace() {
            while (pos < input.length() && Character.isWhitespace(input.charAt(pos))) {
                pos++;
            }
        }

        private boolean match(char expected) {
            if (pos < input.length() && input.charAt(pos) == expected) {
                pos++;
                return true;
            }
            return false;
        }

        private boolean isAtEnd() {
            return pos >= input.length();
        }
    }

    /**
     * Count the number of Add() operations in the given expression.
     * 
     * @param expr the expression to be examined
     * 
     * @return the number of add operations
     */
    public int countAdds(Expression expr) {
        return switch (expr) {
            // these are record patterns
            case Add(var e1, var e2) -> 1 + countAdds(e1) + countAdds(e2);
            case Subtract(var e1, var e2) -> countAdds(e1) + countAdds(e2);
            case Multiply(var e1, var e2) -> countAdds(e1) + countAdds(e2);
            case Divide(var e1, var e2) -> countAdds(e1) + countAdds(e2);
            // this is a type pattern, not quite the same
            case Value _ -> 0;
            default -> 0;
        };
    }

    void main() {
        Expression expr1 = new Subtract(
                new Multiply(new Value(18), new Value(3)), new Value(4));
        Expression expr2 = new Add(
                new Multiply(new Value(12), new Value(5)), new Value(3));
        Expression expr = new Divide(expr1, expr2);

        System.out.println(expr);
        System.out.println(expr.value());
        System.out.println(countAdds(expr));

        Expression parsedExpr = parse("2 * 3 + (1 + 5) * 2");
        System.out.println(parsedExpr);
        System.out.println(parsedExpr.value());
        System.out.println(countAdds(parsedExpr));
    }
}
