package wordsfinder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WordsFinder {
    public static boolean findWord(String word) throws IOException {
        String textFromFile = Files.readString(Path.of("src/main/java/wordsfinder/data.text"));
        return textFromFile.contains(word);
    }
}
