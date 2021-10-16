package phoneBook;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

@SuppressWarnings("ALL")
public class PhoneBook {
    class Entry {
        private final String nameAndSurname;
        private final String address;
        private final Optional<String> phoneNumber;

        public Entry(String nameAndSurname, Optional<String> phoneNumber, String address) {
            this.nameAndSurname = nameAndSurname;
            this.address = address;
            this.phoneNumber = phoneNumber;
        }

        public String getNameAndSurname() {
            return nameAndSurname;
        }

        @Override
        public String toString() {
            return "Name And Surname: " + nameAndSurname + ", address: " + address +
                    ", phoneNumber: " + phoneNumber.orElse("");
        }
    }

    private final List<Entry> entryList = new ArrayList<>();

    public PhoneBook() {
        File phoneBook = new File("src/main/java/phoneBook/PhoneBook.csv");

        try (Scanner scanner = new Scanner(phoneBook)) {
            scanner.useDelimiter(",|\\r\\n");
            while (scanner.hasNext()) {
                String nameAndSurname = scanner.next();
                String phoneNumber = scanner.next();
                String address = scanner.next();

                entryList.add(new Entry(nameAndSurname, Optional.ofNullable(phoneNumber), address));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void findEntry(String nameAndSurname) {
        boolean isPresent = false;
        for (Entry entry : entryList) {
            if (entry.getNameAndSurname().equals(nameAndSurname)) {
                isPresent = true;
                System.out.println(entry);
            }
        }
        if (!isPresent) {
            throw new NoSuchElementException("there is no such person!");
        }
    }
}
