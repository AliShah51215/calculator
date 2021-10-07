package touppercase;


import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        try {
            UpperCase.toUpperCase();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}