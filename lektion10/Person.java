public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sayHello() {
        System.out.println("Hej");
    }

    public void sayHello(String name) {
        System.out.println("Hej på dig " + name);
    }
}
