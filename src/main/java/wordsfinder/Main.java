package wordsfinder;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(WordsFinder.findWord("future"));
            System.out.println(WordsFinder.findWord("collars"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
