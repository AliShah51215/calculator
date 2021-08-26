package pl.shah;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String yn;

        do
        {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter First No.");
            double no1 = s.nextDouble();
            System.out.println("Enter Second No.");
            double no2 = s.nextDouble();
            System.out.println("Select Symbol(+,-,*,/)");
            String sym = s.next();
            double res;
            switch (sym) {
                case "+" -> {
                    res = no1 + no2;
                    System.out.println("Addition is : " + res);
                } case "-" -> {
                    res = no1 - no2;
                    System.out.println("Subtraction is : " + res);
                }
                case "*" -> {
                    res = no1 * no2;
                    System.out.println("Multiplication is : " + res);
                }
                case "/" -> {
                    res = no1 / no2;
                    System.out.println("Division is : " + res);
                }
                default -> System.out.println("Invalid Symbol");
            }
            System.out.println("Do You Want To Continue(Press y for Yes and n for No)");
            yn=s.next();

        } while (yn.equals("y")||yn.equals("Y"));
    }


}
