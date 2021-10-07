package divisible_Check;

public class Main {
    public static void main( String[] args ) {
        int[] numbers1 = {3, 6, 9, 10, 12, 15};
        int[] numbers2 = {1, 7, 10, 33};

        DivisibilityChecker.checker(numbers1);
        System.out.println();
        DivisibilityChecker.checker(numbers2);
    }
}
