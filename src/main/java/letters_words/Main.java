package letters_words;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("Marcin", "Malwina", "Adrianna", "Natalia",
                "Sandra", "Piotr", "Martin", "Michał", "Joanna", "Natasa", "Sasa","Patrycja"));

        List<String> namesToUpperCase = names
                .stream()
                .map(String::toUpperCase)
                .map(Main::removeDuplicates)
                .collect(Collectors.toList());

        namesToUpperCase.forEach(System.out::println);
    }

    public static String removeDuplicates(String input) {
        StringBuilder sb = new StringBuilder();

        input
                .chars()
                .distinct()
                .forEach(c -> sb.append((char) c));
        return sb.toString();
    }
}
