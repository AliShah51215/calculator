package person_class;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Person> persons = new TreeSet<>();
        persons.add(new Person("Jakub", "Stlopiec", 1978, 172, 100.57));
        persons.add(new Person("Patrycja", "Duda", 2001, 169, 72.1));
        persons.add(new Person("Karol", "Dilek", 1965, 156, 69.1));
        persons.add(new Person("Adam", "Adams", 2018, 95, 14.2));
        persons.add(new Person("Przemyslaw", "Nowacki", 1947, 136, 115.69));

        System.out.println("Default sorting (youngest to oldest): ");
        for (Person person : persons) {
            System.out.println(person.toString());
        }

        TreeSet<Person> persons2 = new TreeSet<>(Comparator.comparingInt(Person::getHeight));
        persons2.addAll(persons);

        System.out.println("\n\nSort height by ascending: ");
        for (Person person : persons2) {
            System.out.println(person.toString());
        }

        Set<Person> persons3 = new TreeSet<>((o1, o2) -> Double.compare(o2.getWeight(), o1.getWeight()));
        persons3.addAll(persons);
        System.out.println("\n\nSort weight by descending: ");
        for (Person person : persons3) {
            System.out.println(person.toString());
        }
    }
}
