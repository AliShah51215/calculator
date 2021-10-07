package divisible_Check;

public class DivisibilityChecker {
    public static void checker(int[] values) {
        for (int value : values) {
            try {
                if (value % 3 != 0) {
                    throw new IllegalArgumentException();
                }
            } catch (IllegalArgumentException e) {
                System.out.println(value + " is not divisible by 3");
                continue;
            }

            int result = value / 3;
            System.out.println(value + "/3 = " + result);
        }
    }
}
