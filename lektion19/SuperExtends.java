import java.util.*;

public class SuperExtends {
    private static class Person {

    }

    private static class Employee extends Person {

    }

    private static class Boss extends Employee {

    }

    void save(List<? super Employee> list) {
        list.add(new Employee());
    }

    void read(List<? extends Employee> list) {
        Employee e = list.getFirst();
        System.out.println(e);
    }

    void main() {
        List<Boss> bosses = List.of(new Boss());
        List<Person> people = List.of(new Person());

        save(bosses);
        save(people);

        read(bosses);
        read(people);
    }
}
