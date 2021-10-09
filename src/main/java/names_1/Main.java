package names_1;

import java.util.ArrayList;

import static names_1.NamesList.getStrings;


public class Main {
    public static void main(String[] args) {
        ArrayList<String> names;
        names = getStrings();

        DisplayOrder.displayWithoutDuplicates(names);
        DisplayOrder.displayReverseOrder(names);
        DisplayOrder.displayWithReplacedElements("Anna",
                "Joanna",
                names);
    }

}

