package DaysOfWeek;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeekDaysTest {
    @Test
    void shouldCheckMonday() {
        String day1 = "Monday";

        String result =  WeekDays.DayOfWeek(1);

        Assertions.assertEquals(result, day1);
    }
    @Test
    void shouldCheckWeekends() {
        String weekend = "Weekends";

        String result1 =  WeekDays.DayOfWeek(6);
        String result2 =  WeekDays.DayOfWeek(7);

        assertEquals(result1, weekend);
        assertEquals(result2, weekend);
    }
    @Test
    void shouldCheckDefaultValue() {
        String properResult = "There is no such day!";

        int badInput = 8;

        String result =  WeekDays.DayOfWeek(badInput);

        assertEquals(result, properResult);
    }
}