package phoneBook;


import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.findEntry("Marek Pawel");
        phoneBook.findEntry("Adam Nowak");
        System.out.println();

        try {
            phoneBook.findEntry("Jackob Jakubski");
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }
}