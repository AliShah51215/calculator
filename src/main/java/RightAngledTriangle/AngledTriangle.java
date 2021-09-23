package RightAngledTriangle;

public class AngledTriangle {
    public static boolean RightAngledTriangle(double base, double height, double hypotenuse) {
        if (base > 0 && height > 0 && hypotenuse > 0) {
            return Math.pow(base, 2) + Math.pow(height, 2) == Math.pow(hypotenuse, 2);
        } else {
            return false;
        }
    }
}
