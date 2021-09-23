package RightAngledTriangle;

public class AngledTriangle {
    private static double base;
    private static double height;
    private static double hypotenuse;

    public static boolean RightAngledTriangle(double base, double height, double hypotenuse) {
        AngledTriangle.base = base;
        AngledTriangle.height = height;
        AngledTriangle.hypotenuse = hypotenuse;
        if (base > 0 && height > 0 && hypotenuse > 0) {
            return Math.pow(base, 2) + Math.pow(height, 2) == Math.pow(hypotenuse, 2);
        } else {
            return false;
        }
    }
}
