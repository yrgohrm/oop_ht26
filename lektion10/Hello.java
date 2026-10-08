public class Hello {
    public static void main(String[] args) {
        Person p = new Person("Bosse");

        p.sayHello();

        Student s = new Student("Lena", "Automation");

        s.sayHello();

        s.sayHello("Nisse");

        Person p2 = s;

        p2.sayHello();
    }
}
