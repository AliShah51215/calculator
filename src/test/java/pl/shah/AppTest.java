package pl.shah;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    void shouldAddTwoNumbers15and21() {
        int num1 = 15;
        int num2 = 21;

        int sum = Calculator.sum(num1, num2);

        Assertions.assertEquals(36, sum);
    }
    @Test
     void shouldSubtractTwoNumbers31and12() {
        int num1 = 31;
        int num2 = 12;

        int subtract = Calculator.subtract(num1, num2);

        Assertions.assertEquals(19, subtract);
    }
    @Test
    void shouldMultiplyTwoNumbers9and43() {
        int num1 = 9;
        int num2 = 43;

        int multiplication = Calculator.multiplication(num1, num2);

        Assertions.assertEquals(387, multiplication);
    }
    @Test
    void shouldDivideTwoNumbers10and5() {
        int num1 = 6;
        int num2 = 2;

        int division = Calculator.division(num1, num2);

        Assertions.assertEquals(3, division);
    }
}