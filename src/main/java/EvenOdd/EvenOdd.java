package EvenOdd;

class EvenOdd {
    public static boolean even(int number) {
        return number % 2 == 0;
    }

    public static boolean odd(int number) {
        return number % 2 != 0;
    }



        public static void main(String[] args) {


        System.out.println("is number even" +even(6));
        System.out.println("is number Odd" +odd(9));
    }
    }
