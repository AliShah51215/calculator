package cinema_room;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<CinemaRoom> cinemaHalls = Arrays.asList(
                new CinemaRoom("A", TypeOfHalls.TWO_D),
                new CinemaRoom("B", TypeOfHalls.THREE_D),
                new CinemaRoom("C", TypeOfHalls.FOUR_D),
                new CinemaRoom("D", TypeOfHalls.TWO_D),
                new CinemaRoom("E", TypeOfHalls.TWO_D),
                new CinemaRoom("F", TypeOfHalls.TWO_D),
                new CinemaRoom("G", TypeOfHalls.FOUR_D),
                new CinemaRoom("H", TypeOfHalls.THREE_D),
                new CinemaRoom("I", TypeOfHalls.FOUR_D),
                new CinemaRoom("J", TypeOfHalls.TWO_D)
        );

        Map<TypeOfHalls, List<CinemaRoom>> hallsPerType = cinemaHalls.stream()
                .collect(Collectors.groupingBy(CinemaRoom::getTypeOfHall));

        long halls_2D = hallsPerType.get(TypeOfHalls.TWO_D).size();
        System.out.println("Number of 2D halls: " + halls_2D);

        long halls_3D = hallsPerType.get(TypeOfHalls.THREE_D).size();
        System.out.println("Number of 3D halls: " + halls_3D);

        long halls_4D = hallsPerType.get(TypeOfHalls.FOUR_D).size();
        System.out.println("Number of 4D halls: " + halls_4D);
    }
}