package seasons;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.NullSource;

import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

class WhatSeasonTest {
    @ParameterizedTest
    @NullSource
    void shouldReturnMessageStringForNull(Month month) {
        String expected = "Please Enter Month in Capital Letters";
        String actual = WhatSeason.whatIsSeason(month);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @EnumSource(value = Month.class, names = {"MARCH", "APRIL", "MAY"})
    void shouldReturnSpring(Month month) {
        String expected = Seasons.SPRING.toString();
        String actual = WhatSeason.whatIsSeason(month);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @EnumSource(value = Month.class, names = {"DECEMBER", "JANUARY", "FEBRUARY"})
    void shouldReturnWinter(Month month) {
        String expected = Seasons.WINTER.toString();
        String actual = WhatSeason.whatIsSeason(month);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @EnumSource(value = Month.class, names = {"SEPTEMBER", "OCTOBER", "NOVEMBER"})
    void shouldReturnAutumn(Month month) {
        String expected = Seasons.AUTUMN.toString();
        String actual = WhatSeason.whatIsSeason(month);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @EnumSource(value = Month.class, names = {"JUNE", "JULY", "AUGUST"})
    void shouldReturnSummer(Month month) {
        String expected = Seasons.SUMMER.toString();
        String actual = WhatSeason.whatIsSeason(month);
        assertEquals(expected, actual);
    }
}