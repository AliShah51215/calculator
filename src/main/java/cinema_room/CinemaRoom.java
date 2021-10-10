package cinema_room;

public class CinemaRoom {
    private String name;
    private TypeOfHalls typeOfHall;

    public CinemaRoom(String name, TypeOfHalls typeOfHall) {
        this.name = name;
        this.typeOfHall = typeOfHall;
    }

    public String getName() {
        return name;
    }

    public TypeOfHalls getTypeOfHall() {
        return typeOfHall;
    }
}
