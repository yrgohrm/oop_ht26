public class Hello2 {
    public static void main(String[] args) {
        // Person p = new Student("Lena", "Automation");
        Person p = new Person("Kalle");

        if (p instanceof Student) {
            Student s = (Student) p;
            s.sayHello(3);
        }
    }
}
