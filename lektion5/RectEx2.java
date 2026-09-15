public class RectEx2 {
    public static void main() {
        Rectangle rect = new Rectangle();
        rect.print();

        rect.height = 999;
        rect.color = "blue";

        rect.print();
    }
}