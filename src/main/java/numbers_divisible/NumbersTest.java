package numbers_divisible;

import static numbers_divisible.Numbers.isDivisibleBy2;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class NumbersTest {

    @ParameterizedTest

    @ValueSource(ints = {2, -32, 0, 123456})
    void shouldCheckIfDivisionBy2IsPossible(int input) {


        assertTrue(isDivisibleBy2(input));

    }


    @ParameterizedTest

    @CsvSource(value = {"2 : 2", "-32 : 5", "0 : 0", "123456 : 21"}, delimiter = ':')
    void shouldCheckSumOfDigits(String input, String expected) {


        int actualValue = Integer.parseInt(input);

        int expectedValue = Integer.parseInt(expected);


        actualValue = Numbers.sumOfDigits(actualValue);


        assertEquals(expectedValue, actualValue);


    }

}