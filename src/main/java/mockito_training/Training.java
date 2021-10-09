package mockito_training;

public class Training {
    private final int lengthInMinutes;
    private final int kCalBurned;
    private final int averagePulse;

    public Training(int lengthInMinutes, int kCalBurned, int averageHeartRate) {
        this.lengthInMinutes = lengthInMinutes;
        this.kCalBurned = kCalBurned;
        this.averagePulse = averageHeartRate;
    }

    public int getLengthInMinutes() {
        return lengthInMinutes;
    }

    public int getkCalBurned() {
        return kCalBurned;
    }

    public int getAveragePulse() {
        return averagePulse;
    }
}
