package lesson6Task6;

public class PeselNumber {
    public static String PESELValidation(String Pesel) {
        if (!(Pesel.matches("[0-9]+"))) {
            throw new WrongTypeOfDataException("Please only write numbers.");
        }

        if (Pesel.length() != 11) {
            throw new IllegalLengthException("Pesel Must Contain 11 characters.");

        }
        return "Pesel Number Validated";
    }
}