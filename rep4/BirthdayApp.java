import java.io.*;
import java.nio.file.*;
import java.time.*;
import java.time.temporal.*;
import java.util.*;

public class BirthdayApp {
    void main() throws IOException {
        List<Person> people = new ArrayList<>();

        var lines = Files.readAllLines(Path.of("people.txt"));
        for (String line : lines) {
            String[] parts = line.split(" ", 2);

            String datePart = parts[0];
            String name = parts[1];
            LocalDate date = LocalDate.parse(datePart);

            Person person = new Person(name, date);

            people.add(person);
        }

        Comparator<Person> comp = Comparator.comparingInt(BirthdayApp::getDayOfYear);
        people.sort(comp);

        Person winner = null;
        LocalDate nextBirthday = null;

        LocalDate now = LocalDate.now(ZoneId.of("Europe/Stockholm"));
        for (var person : people) {
            LocalDate birthday = person.birthday().withYear(now.getYear());
            if (!birthday.isBefore(now)) {
                winner = person;
                nextBirthday = birthday;
                break;
            }
        }

        if (winner == null) {
            winner = people.getFirst();
            nextBirthday = winner.birthday().withDayOfYear(now.getDayOfYear() + 1);
        }

        long years = ChronoUnit.YEARS.between(winner.birthday(), nextBirthday);

        System.out.println(winner.name() + " fyller " + years + " år.");
    }

    private static int getDayOfYear(Person person) {
        return person.birthday().getDayOfYear();
    }
}
