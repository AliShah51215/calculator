package square_root;

public class SquareRoot {

    public static double getSquareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException();
        }
        return Math.sqrt(number);
    }
}
