package CinemaSeat;

public class placeInHall {

    private final int numberOfSeat;
    private final int numberOfRow;
    private boolean isOccupied;

    protected placeInHall(int numberOfSeat, int numberOfRow, boolean Occupied) {
        this.numberOfSeat = numberOfSeat;
        this.numberOfRow = numberOfRow;
        this.isOccupied = Occupied;
    }

    public int numberOfSea(int i) {
        return numberOfSeat;
    }

    public int getNumberOfRow() {
        return numberOfRow;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean Occupied) {
        this.isOccupied = Occupied;
    }
}
