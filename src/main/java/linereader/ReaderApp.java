package linereader;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReaderApp {
    public static void main(String[] args) {
        try {
            Path file = Paths.get("..\\CreateTxtFile\\data.txt");
            long countLines = Files.lines(file).count();
            System.out.println("Total lines: " + countLines);

            int i = 0;
            while (i < countLines) {
                String line = Files.readAllLines(Paths.get("..\\CreateTxtFile\\data.txt")).get(i);
                System.out.println(line);
                i = i + 2;
            }

        } catch (Exception e) {
            e.getStackTrace();

        }
    }
}
