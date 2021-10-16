package password_validator;

import java.time.LocalDateTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {
    private static String year = String.valueOf(LocalDateTime.now().getYear());
    private static String year2 = year.substring(2,4);
    private static final Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])(?=\\S+$).{7,}$");


    public static boolean isValid(String password) {
        if (password.contains(year2)) {
            return false;
        } else {
            Matcher matcher = pattern.matcher(password);
            return matcher.matches();
        }
    }

    public static void main(String[] args) {
        System.out.println(isValid("Rafash21ah@2021"));
        System.out.println(isValid("Rafashah@21"));
        System.out.println(isValid("Rafas21hah@1"));
        System.out.println(isValid("Rafashah@1"));
    }

}

