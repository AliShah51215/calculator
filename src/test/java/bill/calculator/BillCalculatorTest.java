package bill.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BillCalculatorTest {

    @Test
    void mustReturn60WhenSumAre50and10() {
        double billAmount = 50;
        double serviceFee = 10;
        double result = BillCalculator.billCalculate(billAmount, serviceFee);
        assertEquals(60, result);
    }


    @Test
    void mustReturn45WhenSumAre45point7and4point3and5() {
        double billAmount = 45.7;
        double serviceFee = 4.3;
        double discount = 5;
        double result = BillCalculator.billCalculate(billAmount, serviceFee, discount);
        assertEquals(45, result);
    }

    @Test
    void mustReturn90WhenSumAre74point5dot10point5dot5and5() {
        double billAmount = 74.5;
        double serviceFee = 10.5;
        int packingCharges = 5;
        double result = BillCalculator.billCalculate(billAmount, serviceFee, packingCharges);
        assertEquals(90, result);
    }
}