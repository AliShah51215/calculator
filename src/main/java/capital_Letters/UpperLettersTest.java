package capital_Letters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

class UpperCaseLettersTest {

    @ParameterizedTest
    @ValueSource(strings = {"to", "be", "or", "not", "to", "be"})
    void verifyTextToUpperCase(String input) {

        String expected = input.toUpperCase();
        String actual = UpperLetters.toUpperCase(input);

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @NullAndEmptySource
    void verifyIfStringIsEmpty(String input) {
        String expected = "";
        String actual = UpperLetters.toUpperCase(input);

        Assertions.assertEquals(expected, actual);
    }
}