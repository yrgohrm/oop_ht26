public class Example1 {
    public static void main() {
        int stackVar1 = 100;
        int stackVar2 = stackVar1;

        System.out.printf("stack 1: %d, stack 2: %d%n", stackVar1, stackVar2);

        stackVar2 = 99;

        System.out.printf("stack 1: %d, stack 2: %d%n", stackVar1, stackVar2);

        Rectangle heapVar1 = new Rectangle();
        heapVar1.height = 1;
        heapVar1.width = 1;
        heapVar1.color = "red";

        Rectangle heapVar2 = heapVar1;

        heapVar1.print();
        heapVar2.print();

        heapVar2.color = "blue";

        heapVar1.print();
        heapVar2.print();
    }
}
