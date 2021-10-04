package bettercalculator;

public class Subtract implements  BetterCalculator {

    @Override
    public double calculate(double... values) {

        if (values.length > 0) {
            double subtraction = values[0];
            for (int i = 1; i < values.length; i++) {
                subtraction -= values[i];
            }
            return subtraction;

        }
        return 0;
    }
}