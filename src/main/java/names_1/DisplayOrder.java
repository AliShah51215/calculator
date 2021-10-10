package names_1;

import java.util.*;

public class DisplayOrder {
    public static void displayWithoutDuplicates(List<String> list) {
        Set<String> set = new LinkedHashSet<>(list);
        List<String> withoutDuplicates = new ArrayList<>(set);

        System.out.println("Names without duplicates: " + withoutDuplicates);
    }

    public static void displayReverseOrder(List<String> list) {
        List<String> reversedOrder = new ArrayList<>(list);
        Collections.reverse(reversedOrder);

        System.out.println("Names in reversed order: " + reversedOrder);
    }

    public static void displayWithReplacedElements(String toReplace, String replacement, List<String> list) {
        List<String> withReplacedElements = new ArrayList<>(list);
        ListIterator<String> iterator = withReplacedElements.listIterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.equals(toReplace)) {
                iterator.set(replacement);
            }
        }

        System.out.println("List Entry " + toReplace + " replaced with " + replacement + ": " + withReplacedElements);
    }
}
