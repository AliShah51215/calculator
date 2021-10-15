package date_of_birth;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;

class DateOfBirthTest {
    DateOfBirth date = new DateOfBirth(LocalDate.of(1906, 6, 6));

    @Test
    void shouldVerifyAge() {
        int age = date.getAge();
        Assertions.assertEquals(115, age);
    }

    @Test
    void shouldVerifyWeekNumber() {
        int week = date.getWeek();
        Assertions.assertEquals(23, week);
    }

    @Test
    void shouldVerifyDayOfWeek() {
        DayOfWeek day = date.getDayOfWeek();
        Assertions.assertEquals(DayOfWeek.WEDNESDAY, day);
    }
}