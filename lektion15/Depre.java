public class Depre {
    private static class Foo {

        @Deprecated
        public static void foo() {
            System.out.println("foo");
        }
    }

    public static void main() {
        Foo.foo();
    }
}
