package lenghtOftext;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class TextLengthTest {

    @ParameterizedTest
    @MethodSource("provideTextExample")
    void shouldCheckTextLength(String input, int expected) {

        int actual = TextLength.getTextLength(input);

        Assertions.assertEquals(expected, actual);
    }

    private static Stream<Arguments> provideTextExample() {
        return Stream.of(
                Arguments.of("Test", 4),
                Arguments.of("text", 4),
                Arguments.of("to", 2),
                Arguments.of("check", 5),
                Arguments.of("", 0)
        );
    }
}