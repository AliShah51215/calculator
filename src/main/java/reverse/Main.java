package reverse;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            ReverseText.reverseText();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
