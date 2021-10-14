package password_validator;

import java.time.LocalDateTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {
    private static final String year = String.valueOf(LocalDateTime.now().getYear());
    private static final String year2 = year.substring(2,4);
    private static final String PASSWORD_PATTERN =
            "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–{}:;',?/*~$^+=<>]).{7,20}$";

    private static final Pattern pattern = Pattern.compile(PASSWORD_PATTERN);

    public static boolean isValid(final String password) {
        if (password.contains(year) || password.contains(year2)) {
            return false;
        } else {
            Matcher matcher = pattern.matcher(password);
            return matcher.matches();
        }
    }
}