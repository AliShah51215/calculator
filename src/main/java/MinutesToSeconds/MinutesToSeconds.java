package MinutesToSeconds;

import java.util.Scanner;


class minutesToSeconds
{
    public static void main(String[] arg)
    {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Minutes");
        double min = input.nextDouble();
        double sec = minToSec(min);
        System.out.println("Seconds: "+sec);
    }
    static double minToSec(double x)
    {
        return x*60;

    }
}

