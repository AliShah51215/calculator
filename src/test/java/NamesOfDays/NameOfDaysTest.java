package NamesOfDays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NameOfDaysTest {

    @Test
    void shouldReturnFriday() {
        Days day;
        day = Days.FRIDAY;

        String result =
                NameOfDays.getDay(day);

        Assertions.assertEquals("FRIDAY", result);
    }

    @Test
    void shouldReturnSaturday() {
        Days day = Days.SATURDAY;
        String result =
                NameOfDays.getDay(day);
        Assertions.assertEquals("SATURDAY", result);
    }
}