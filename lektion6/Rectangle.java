public class Rectangle {
    double height;
    double width;
    String color;

    Rectangle() {
        height = 0;
        width = 0;
        color = "purple";
    }

    Rectangle(double height, double width, String color) {
        this.height = height;
        this.width = width;
        this.color = color;
    }

    void print() {
        System.out.println("Rectangle:");
        System.out.printf("\theight: %.2f%n", height);
        System.out.printf("\twidth:  %.2f%n", width);
        System.out.printf("\tcolor:  %s%n", color);
    }
}
