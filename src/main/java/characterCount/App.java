package characterCount;

import java.io.IOException;


public class App {
    private static final String filePath = "src/main/java/characterCount/data.txt";

    public static void main(String[] args) throws IOException {
        try (FileUtility ignored = new FileUtility(filePath)) {
            System.out.println("This file contains " + FileUtility.countCharacters() + " characters");
        }
    }
}
