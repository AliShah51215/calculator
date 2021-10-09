package seasons;

import java.time.Month;

public class WhatSeason {
    public static String whatIsSeason(Month month) {
        if (month == null) return "Please Enter Month in Capital Letters";
        return switch (month) {
            case MARCH, APRIL, MAY -> Seasons.SPRING.toString();
            case JUNE, JULY, AUGUST -> Seasons.SUMMER.toString();
            case SEPTEMBER, OCTOBER, NOVEMBER -> Seasons.AUTUMN.toString();
            case DECEMBER, JANUARY, FEBRUARY -> Seasons.WINTER.toString();
        };
    }
}
