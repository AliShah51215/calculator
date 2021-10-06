package touppercase;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class UpperCase {
    public static void toUpperCase() throws IOException {

        String content = Files.readString(Paths.get("src/main/java/touppercase/data.txt"));
        Files.writeString(Paths.get("output.txt"), content.toUpperCase());

        System.out.println(content.toUpperCase());
    }

}

