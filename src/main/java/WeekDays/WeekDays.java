package WeekDays;

public class WeekDays {
    public static String daysOfWeek (int nameOfDays) {
        return switch (nameOfDays) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6, 7 -> "Weekend";
            default -> "There is no such a day!";
        };

    }

    public static void main( String[] args ){

        System.out.println(daysOfWeek(1));
        System.out.println(daysOfWeek(7));
        System.out.println(daysOfWeek(10));





    }
}
