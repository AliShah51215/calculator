package pesel_validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\d{11}");
        Matcher matcher = pattern.matcher("98111726063");

        boolean matches = matcher.matches();
    }
}
