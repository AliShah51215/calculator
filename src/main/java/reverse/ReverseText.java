package reverse;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReverseText {
    public static void reverseText() throws IOException {
        String content;
        content = Files.readString(Paths.get("src/main/java/reverse/data.txt"));
        StringBuilder sb = new StringBuilder(content);
        System.out.println(sb.reverse());
    }
}
