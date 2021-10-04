package bettercalculator;

public class Multiply implements BetterCalculator{

    @Override
    public double calculate(double ...values) {
        double multiplication = 1;
        for(double value: values) {
            multiplication *= value;
        }

        return multiplication;
    }

}
