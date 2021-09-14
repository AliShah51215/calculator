package Age;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgeTestTest {

    @Test
    void shouldReturnFalseWhenAgeIs13() {

        Boolean result = AgeTest.VerifyAge(13);
        Assertions.assertEquals(false, result);

    }

    @Test
    void shouldReturnTrueWhenAgeIs51() {

        Boolean result = AgeTest.VerifyAge(51);
        Assertions.assertEquals(true, result);
    }

    @Test
    void shouldReturnFalseWhenAgeIs11() {

        Boolean result = AgeTest.VerifyAge(11);
        Assertions.assertEquals(false, result);

    }
}