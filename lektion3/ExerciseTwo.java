public class ExerciseTwo {
    public static void main(String[] args) {
        double radius = 1;
        
        // code goes here, use StrictMath.PI
        double circumference = 2 * radius * StrictMath.PI;
        double area = radius * radius * StrictMath.PI;

        System.out.printf("Omkretsen på cirkeln är %.2f.%n", circumference);
        System.out.println("Omkrets: " + circumference);
        System.out.printf("Arean på cirkeln är %.2f.%n", area);
        System.out.println("Area: " + area);
    }
}