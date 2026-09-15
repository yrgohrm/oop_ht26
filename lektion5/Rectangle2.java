public class Rectangle2 {
    double height;
    double width;
    String color;

    Rectangle2(double height, double width) {
        if (width < height) {
            this.height = width;
            this.width = height;
            this.color = "red";
        }
        else {
            this.height = height;
            this.width = width;
            this.color = "red";
        }
    }

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
