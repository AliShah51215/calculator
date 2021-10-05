package bettercalculator;

import java.util.Scanner;


public class Main {


    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("write numerical for [numerical] and geometric for [geometric] calculator?");
        String calculator = keyboard.nextLine();

        switch (calculator) {

            case ("numerical"):
                System.out.println("Choose [add], [subtract],[divide],[multiply],[modulo], [sinus], [ cosine], [power]");
                String numerical = keyboard.nextLine();

                switch (numerical) {
                    case ("add") -> {
                        System.out.println("Write 1st Sum:");
                        double a = Double.parseDouble(keyboard.nextLine());
                        System.out.println("Write 2nd Sum:");
                        double b = Double.parseDouble(keyboard.nextLine());
                        System.out.println(BetterCalculator.add(a, b));
                    }
                    case ("subtract") -> {
                        System.out.println("Write 1st Sum:");
                        double c = Double.parseDouble(keyboard.nextLine());
                        System.out.println("Write 2nd Sum:");
                        double d = Double.parseDouble(keyboard.nextLine());
                        System.out.println(BetterCalculator.subtract(c, d));
                    }
                    case ("divide") -> {
                        System.out.println("Write 1st Sum:");
                        double e = Double.parseDouble(keyboard.nextLine());
                        System.out.println("Write 2nd Sum:");
                        double f = Double.parseDouble(keyboard.nextLine());
                        System.out.println(BetterCalculator.division(e, f));
                    }
                    case ("multiply") -> {
                        System.out.println("Write 1st Sum:");
                        double g = Double.parseDouble(keyboard.nextLine());
                        System.out.println("Write 2nd Sum:");
                        double h = Double.parseDouble(keyboard.nextLine());
                        System.out.println(BetterCalculator.multiply(g, h));
                    }
                    case ("modulo") -> {
                        System.out.println("Write 1st Sum:");
                        double i = Double.parseDouble(keyboard.nextLine());
                        System.out.println("Write 2nd Sum:");
                        double j = Double.parseDouble(keyboard.nextLine());
                        System.out.println(BetterCalculator.modulo(i, j));
                    }
                    case ("sinus") -> {
                        System.out.println("Enter value for the angle a (in radians):");
                        double k = Double.parseDouble(keyboard.nextLine());
                        System.out.println(BetterCalculator.sinus(k));
                    }
                    case ("cosine") -> {
                        System.out.println("Enter value for the angle a (in radians):");
                        double l = Double.parseDouble(keyboard.nextLine());
                        System.out.println(BetterCalculator.cosine(l));
                    }
                    case ("power") -> {
                        System.out.println("Enter base of the power:");
                        double m = Double.parseDouble(keyboard.nextLine());
                        System.out.println("Enter the exponent of the power:");
                        double n = Double.parseDouble(keyboard.nextLine());
                        System.out.println(BetterCalculator.power(m, n));
                    }
                    default -> System.out.println("No such answer.");
                }

            case ("geometric"):

                System.out.println("Write if calculate field or circumference?");
                String geometric = keyboard.nextLine();


                switch (geometric) {
                    case ("field"):
                        System.out.println("Write if you want it for rectangle, trapezoid or circle?");
                        String vertical = keyboard.nextLine();

                        switch (vertical) {
                            case ("rectangle") -> {
                                System.out.println("Write Side 1:");
                                double a = Double.parseDouble(keyboard.nextLine());
                                System.out.println("Write Side 2");
                                double b = Double.parseDouble(keyboard.nextLine());
                                System.out.println(BetterCalculator.rectangleArea(a, b));
                            }
                            case ("trapezoid") -> {
                                System.out.println("Write Base 1:");
                                double c = Double.parseDouble(keyboard.nextLine());
                                System.out.println("Write Base 2");
                                double d = Double.parseDouble(keyboard.nextLine());
                                System.out.println("Write Height:");
                                double e = Double.parseDouble(keyboard.nextLine());
                                System.out.println(BetterCalculator.trapezoidField(c, d, e));
                            }
                            case ("circle") -> {
                                System.out.println("Write Field:");
                                double f = Double.parseDouble(keyboard.nextLine());
                                System.out.println(BetterCalculator.circleField(f));
                            }
                        }
                    case ("circumference"):
                        System.out.println("Write if you want it for rectangle, trapezoid or circle?");
                        String technical = keyboard.nextLine();

                        switch (technical) {
                            case ("rectangle") -> {
                                System.out.println("Write Side 1:");
                                double a = Double.parseDouble(keyboard.nextLine());
                                System.out.println("Write Side 2");
                                double b = Double.parseDouble(keyboard.nextLine());
                                System.out.println(BetterCalculator.circumferenceOfRectangle(a, b));
                            }
                            case ("trapezoid") -> {
                                System.out.println("Write Side 1:");
                                double c = Double.parseDouble(keyboard.nextLine());
                                System.out.println("Write Side 2:");
                                double d = Double.parseDouble(keyboard.nextLine());
                                System.out.println("Write Side 3:");
                                double e = Double.parseDouble(keyboard.nextLine());
                                System.out.println("Write Side 4:");
                                double f = Double.parseDouble(keyboard.nextLine());
                                System.out.println(BetterCalculator.trapezoidCircumference(c, d, e, f));
                            }
                            case ("circle") -> {
                                System.out.println("Write Radius:");
                                double g = Double.parseDouble(keyboard.nextLine());
                                System.out.println(BetterCalculator.piRadius(g));
                            }
                        }
                }
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + calculator);
        }
    }
}


