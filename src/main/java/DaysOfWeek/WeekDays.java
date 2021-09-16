package DaysOfWeek;


    public class WeekDays {

        public static String DayOfWeek (int dayOfWeek) {

            return switch (dayOfWeek) {
                case 1 -> "Monday";
                case 2 -> "Tuesday";
                case 3 -> "Wednesday";
                case 4 -> "Thursday";
                case 5 -> "Friday";
                case 6, 7 -> "Weekend";
                default -> "There is no such day!";
            };

        }

        public static void main( String[] args ){

            System.out.println(DayOfWeek(1));
            System.out.println(DayOfWeek(7));
            System.out.println(DayOfWeek(10));





        }
    }


