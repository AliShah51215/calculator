package personclass.lesson8;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Adam", "Kowalski", 2012);
        Person person2 = new Person("Agnieszka", "Adamczyk", 1988);
        Person person3 = new Person("Karol", "Kurczak", 2000);

        System.out.println(person1.equals(person2));
        System.out.println(person2.hashCode() == person1.hashCode());
        System.out.println(person1.hashCode() == person2.hashCode());

        System.out.println(person2.equals(person3));
        System.out.println(person3.hashCode() == person2.hashCode());
        System.out.println(person2.hashCode() == person3.hashCode());

        System.out.println(person1.equals(person3));
        System.out.println(person3.hashCode() == person1.hashCode());
        System.out.println(person1.hashCode() == person3.hashCode());
    }
}
