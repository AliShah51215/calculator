package MinutesToSeconds;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class minutesToSecondsTest {

    @Test
    public void should4Point4MinutesBe264Seconds() {
        double time = 4.4;

        double result = minutesToSeconds.minToSec(time);

        assertEquals(result, 264);
    }

    @Test
    public void should26Point27MinutesBe1576Point2Seconds() {
        double time = 26.27;

        double result = minutesToSeconds.minToSec(time);

        Assertions.assertEquals(result, 1576.2);
    }

    @Test
    public void should0MinutesBe0Seconds() {
        double time = 0;

        double result = minutesToSeconds.minToSec(time);

        Assertions.assertEquals(result, 0);


    }
}