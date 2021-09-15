package WeekDays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeekDaysTest {

    @Test
    void shouldCheckMonday() {
        String day1 = "Monday";

        String result =  WeekDays.daysOfWeek(1);

        assertEquals(result, day1);
    }
    @Test
    void shouldCheckWeekends() {
        String weekend = "Weekend";

        String result1 = WeekDays.daysOfWeek(6);
        String result2 = WeekDays.daysOfWeek(7);

        assertEquals(result1, weekend);
        assertEquals(result2, weekend);
    }
    @Test
    void shouldCheckDefaultValue() {
        String properResult = "There is no such a day!";

        int badInput = 8;

        String result = WeekDays.daysOfWeek(badInput);

        assertEquals(result, properResult);
    }
}