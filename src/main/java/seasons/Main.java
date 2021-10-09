package seasons;

import java.time.Month;

public class Main {
    public static void main(String[] args) {
        System.out.println("Season is: " + WhatSeason.whatIsSeason(Month.JANUARY));
        System.out.println(WhatSeason.whatIsSeason(null));
        System.out.println("Season is: " + WhatSeason.whatIsSeason(Month.JUNE));
    }
}
