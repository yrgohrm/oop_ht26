import java.time.*;
import java.util.*;

public class Person implements Comparable<Person> {
    private String name;
    private String email;
    private Instant birthDay;

    public Person(String name, String email, Instant birthDay) {
        this.name = name;
        this.email = email;
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Instant getBirthDay() {
        return birthDay;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((birthDay == null) ? 0 : birthDay.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (birthDay == null) {
            if (other.birthDay != null)
                return false;
        } else if (!birthDay.equals(other.birthDay))
            return false;
        return true;
    }

    @Override
    public int compareTo(Person o) {
        Comparator<Person> comp = Comparator.comparing(Person::getName)
                .thenComparing(Person::getBirthDay)
                .thenComparing(Person::getEmail);
        return comp.compare(this, o);
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", email=" + email + ", birthDay=" + birthDay + "]";
    }
}