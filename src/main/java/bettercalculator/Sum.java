package bettercalculator;

public class Sum implements BetterCalculator {

    @Override
    public double calculate(double ...values) {
        double add = 0;
        for(double value: values) {
            add += value;
        }

        return add;

    }

}
