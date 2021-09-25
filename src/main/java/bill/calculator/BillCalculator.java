package bill.calculator;

public class BillCalculator {
    public static double billCalculate(double billAmount, double serviceFee) {
        return billAmount + serviceFee;
    }

    public static double billCalculate(double billAmount, double serviceFee, double discount) {
        return billAmount + serviceFee - discount;
    }

    public static double billCalculate(double billAmount, double serviceFee, int packingCharges) {
        return billAmount + serviceFee + packingCharges;
    }
}