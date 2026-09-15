public class RectEx {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();

        rect.height = 22;
        rect.width = 13.56;
        rect.color = "blue";

        rect.print();

        double a = rect.area();
        System.out.println("arean är: " + a);

        Rectangle rect2 = new Rectangle();

        rect2.height = 2;
        rect2.width = 56;
        rect2.color = "red";

        rect2.print();

        for (int i = 0; i < 4; ++i) {
            new Rectangle();
        }

    }
}