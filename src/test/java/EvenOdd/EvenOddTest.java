package EvenOdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EvenOddTest {

    @Test
    void If11IsEven() {

        int number = 11;

        boolean result = EvenOdd.even(number);
        Assertions.assertFalse(result);
    }

    @Test
    void If31IsOdd() {

        int number = 31;

        boolean result = EvenOdd.odd(number);
        Assertions.assertTrue(result);
    }

    @Test
    void If12345678IsEven() {

        int number = 12345678;

        boolean result = EvenOdd.even(number);
        Assertions.assertTrue(result);
    }

    @Test
    void if1234531IsOdd() {

        int number = 1234531;

        boolean result = EvenOdd.odd(number);
        Assertions.assertTrue(result);
    }

    @Test
    void ResultNegativeIf179Even() {

        int number = -179;

        boolean result = EvenOdd.even(number);
        Assertions.assertFalse(result);
    }

    @Test
    void ResultNegativeIf100Odd() {

        int number = 100;

        boolean result = EvenOdd.odd(number);
        Assertions.assertFalse(result);
    }


}