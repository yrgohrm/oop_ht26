import java.time.*;
import java.util.*;

void main() {

    Person nisse = new Person("Nisse Larsson", "nisse@example.com", Instant.now());
    Person nisse2 = new Person("Nisse Larsson", "alpha_nisse@example.com", nisse.getBirthDay());
    Person lena = new Person("Lena Lamm", "xxlenaxx@example.com", Instant.now());
    Person zaphod = new Person("Zaphod Beeblebrox", "space@example.com", Instant.now());

    List<Person> persons = new ArrayList<>(List.of(nisse, nisse2, lena, zaphod));

    Comparator<Person> byEmail = Comparator.comparing(Person::getEmail);

    Collections.sort(persons, byEmail);

    System.out.println(persons);

}