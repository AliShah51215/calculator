package mockito_training;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullSource;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class EvaluatorTest {

    @ParameterizedTest
    @MethodSource("provideSampleTrainingsRateOne")
    void shouldVerifyRateForLengthIsOne(Training training) {
        Evaluator trainingEvaluator = new Evaluator(training);
        int actual = trainingEvaluator.rateForLength();

        assertEquals(1, actual);
    }

    @ParameterizedTest
    @MethodSource("provideSampleTrainingsRateOne")
    void shouldVerifyRateForKCalIsOne(Training training) {
        Evaluator Evaluator = new Evaluator(training);
        int actual = Evaluator.rateForKCal();

        assertEquals(1, actual);
    }

    @ParameterizedTest
    @MethodSource("provideSampleTrainingsRateOne")
    void shouldVerifyRateForPulseIsOne(Training training) {
        Evaluator Evaluator = new Evaluator(training);
        int actual = Evaluator.rateForPulse();

        assertEquals(1, actual);
    }

    private static Stream<Arguments> provideSampleTrainingsRateOne() {
        Training training1 = new Training(1, 300, 176);
        Training training2 = new Training(29, 100, 190);
        return Stream.of(
                Arguments.of(training1),
                Arguments.of(training2));
    }

    @ParameterizedTest
    @MethodSource("provideSampleTrainingsRateTwo")
    void shouldVerifyRateForLengthIsTwo(Training training) {
        Evaluator Evaluator = new Evaluator(training);
        int actual = Evaluator.rateForLength();

        assertEquals(2, actual);
    }

    @ParameterizedTest
    @MethodSource("provideSampleTrainingsRateTwo")
    void shouldVerifyRateForKCalIsTwo(Training training) {
        Evaluator Evaluator = new Evaluator(training);
        int actual = Evaluator.rateForKCal();

        assertEquals(2, actual);
    }

    @ParameterizedTest
    @MethodSource("provideSampleTrainingsRateTwo")
    void shouldVerifyRateForPulseIsTwo(Training training) {
       Evaluator Evaluator = new Evaluator(training);
        int actual = Evaluator.rateForPulse();

        assertEquals(2, actual);
    }

    private static Stream<Arguments> provideSampleTrainingsRateTwo() {
        Training training1 = new Training(30, 301, 160);
        Training training2 = new Training(60, 399, 175);
        return Stream.of(
                Arguments.of(training1),
                Arguments.of(training2));
    }

    @ParameterizedTest
    @MethodSource("provideSampleTrainingsRateThree")
    void shouldVerifyRateForLengthIsThree(Training training) {
        Evaluator Evaluator = new Evaluator(training);
        int actual = Evaluator.rateForLength();

        assertEquals(3, actual);
    }

    @ParameterizedTest
    @MethodSource("provideSampleTrainingsRateThree")
    void shouldVerifyRateForKCalIsThree(Training training) {
       Evaluator Evaluator = new Evaluator(training);
        int actual = Evaluator.rateForKCal();

        assertEquals(3, actual);
    }

    @ParameterizedTest
    @MethodSource("provideSampleTrainingsRateThree")
    void shouldVerifyRateForPulseIsThree(Training training) {
        Evaluator Evaluator = new Evaluator(training);
        int actual = Evaluator.rateForPulse();

        assertEquals(3, actual);
    }

    private static Stream<Arguments> provideSampleTrainingsRateThree() {
        Training training1 = new Training(61, 400, 159);
        Training training2 = new Training(720, 3000, 30);
        return Stream.of(
                Arguments.of(training1),
                Arguments.of(training2));
    }

    @ParameterizedTest
    @NullSource
    @MethodSource("provideSampleTrainingsWithIllegalLengthException")
    void shouldThrowIllegalLengthException(Training training) {
        Evaluator Evaluator = new Evaluator(training);

        try {
            new AtomicInteger(Evaluator.rateForLength());
            fail("illegal Exception");
        } catch (IllegalLength exception) {
            String message = exception.getMessage();
            boolean rightMessage = message.equals("training length should be in the range of 1 - 720 minutes");
            assertTrue(rightMessage);
        }
    }

    private static Stream<Arguments> provideSampleTrainingsWithIllegalLengthException() {
        Training training1 = new Training(0, 400, 159);
        Training training2 = new Training(-100, 3000, 30);
        Training training3 = new Training(721, 3000, 30);

        return Stream.of(
                Arguments.of(training1),
                Arguments.of(training2),
                Arguments.of(training3));
    }

    @ParameterizedTest
    @NullSource
    @MethodSource("provideSampleTrainingsWithIllegalKCalException")
    void shouldThrowIllegalKCalException(Training training) {
        Evaluator trainingEvaluator = new Evaluator(training);

        try {
            int actual = trainingEvaluator.rateForKCal();
            fail("This method should throw IllegalKcalException");
        } catch (IllegalKCal exception) {
            String message = exception.getMessage();
            boolean rightMessage = message.equals("calories burned should be in the range of 1 - 3000");
            assertTrue(rightMessage);
        }
    }

    private static Stream<Arguments> provideSampleTrainingsWithIllegalKCalException() {
        Training training1 = new Training(40, -300, 159);
        Training training2 = new Training(40, 3001, 30);

        return Stream.of(
                Arguments.of(training1),
                Arguments.of(training2));
    }

    @ParameterizedTest
    @NullSource
    @MethodSource("provideSampleTrainingsWithIllegalPulseException")
    void shouldThrowIllegalPulseException(Training training) {
        Evaluator trainingEvaluator = new Evaluator(training);

        try {
            int actual = trainingEvaluator.rateForPulse();
            fail("This method should throw IllegalPulseException");
        } catch (IllegalPulse exception) {

            String message = exception.getMessage();
            boolean rightMessage = message.equals("Check Once Again");
            assertTrue(rightMessage);
        }
    }

    private static Stream<Arguments> provideSampleTrainingsWithIllegalPulseException() {
        Training training1 = new Training(40, 300, 0);
        Training training2 = new Training(40, 500, 400);

        return Stream.of(
                Arguments.of(training1),
                Arguments.of(training2));
    }

    @Test
    void testForPerfectTrainingEfficiency() {
        Training training = new Training(40, 349, 155);
        Evaluator trainingEvaluator = new Evaluator(training);

        TrainingScale actual = trainingEvaluator.evaluate();

        Assertions.assertEquals(TrainingScale.PERFECT, actual);
    }
}