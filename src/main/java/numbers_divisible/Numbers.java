package numbers_divisible;

public class Numbers {
    public static boolean isDivisibleBy2(int num1) {
        return num1 % 2 == 0;

    }

    public static int sumOfDigits(int num2) {
        int sum = 0;

        if (num2 < 0) {
            num2 = -num2;
        }

        while (num2 > 0) {
            sum += num2 % 10;
            num2 /= 10;
        }

        return sum;
    }


    }
