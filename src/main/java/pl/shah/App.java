package pl.shah;

class Calculator {
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }
    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }
    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }
    public static int division(int num1, int num2) {
        return num1 / num2;
    }

    public static void main( String[] args ) {
        System.out.println("Addition is = " + sum(5,10));
        System.out.println("Subtraction is = " +subtract(5,10));
        System.out.println("Multiplication is =" +multiplication(5,10));
        System.out.println("Division is = " +division (20,10));
    }
}
