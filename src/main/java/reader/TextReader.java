package reader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TextReader {
    public void showTextInConsoleFromFile() {
        {
            try {
                String textFromFile = Files.readString(Path.of("src/main/java/reader/data.text"));
                System.out.println(textFromFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
