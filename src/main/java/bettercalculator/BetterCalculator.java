package bettercalculator;

interface BetterCalculator {
    static double add(double firstSum, double secondSum) {
        return firstSum + secondSum;
    }

    static double subtract(double firstSum, double secondSum) {
        return firstSum - secondSum;
    }

    static double division(double firstSum, double secondSum) {
        return firstSum / secondSum;
    }

    static double multiply(double firstSum, double secondSum) {
        return firstSum * secondSum;
    }

    static double modulo(double firstSum, double secondSum) {
        return firstSum % secondSum;
    }

    static double sinus(double angleA) {
        return Math.sin(angleA);
    }

    static double cosine(double angleA) {
        return Math.cos(angleA);
    }

    static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    static double rectangleArea(double side1, double side2) {
        return side1 * side2;
    }

    static double trapezoidField(double base1, double base2, double height) {
        return ((base1 + base2) * height) / 2;
    }

    static double circleField(double radius) {
        final double pi = 3.14;
        return pi * radius * radius;
    }

    static double circumferenceOfRectangle(double side1, double side2) {
        return (side1 + side2) * 2;
    }

    static double trapezoidCircumference(double side1, double side2, double side3, double side4) {
        return side1 + side2 + side3 + side4;
    }

    static double piRadius(double radius) {
        final double pi = 3.14;
        return 2 * pi * radius;
    }
}