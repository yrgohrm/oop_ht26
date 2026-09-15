public class Rectangle {
    double height = 1;
    double width = 2;
    String color = "pink";

    void print() {
        System.out.println("Rectangle:");
        System.out.printf("\theight: %.2f%n", height);
        System.out.printf("\twidth:  %.2f%n", width);
        System.out.printf("\tcolor:  %s%n", color);
    }

    double area() {
        return width * height;
    }
}
