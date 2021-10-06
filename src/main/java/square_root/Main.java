package square_root;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        double number = 0;
        double squareRoot;

        System.out.println("Enter a number: ");

        try (Scanner scanner = new Scanner(System.in)) {
            number = scanner.nextDouble();
            squareRoot = SquareRoot.getSquareRoot(number);
        } catch (IllegalArgumentException exception) {
            squareRoot = SquareRoot.getSquareRoot(number * -1);
        }

        System.out.println(squareRoot);
    }
}
