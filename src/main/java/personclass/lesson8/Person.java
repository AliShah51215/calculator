package personclass.lesson8;

import java.util.Objects;

public class Person {
    private final String name;
    private final String surname;
    private final int dateOfBirth;

    public Person(String name, String surname, int dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person;
        person = (Person) o;
        return dateOfBirth == person.dateOfBirth;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateOfBirth);
    }

}
