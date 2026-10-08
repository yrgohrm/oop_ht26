package exercise;

public class Triangle extends Shape {
    private int height;
    private int width;

    public Triangle(int height, int width) {
        super("triangle");
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return String.format("%s %d %d", super.toString(), height, width);
    }
}
