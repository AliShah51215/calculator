package RightAngledTriangle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RightAngledTriangleTest {
    @Test
    void ReturnFalseIfCalculationsAreZero() {
        double base = 0;
        double height = 0;
        double hypotenuse = 0;
        boolean result = AngledTriangle.RightAngledTriangle(base, height, hypotenuse);
        Assertions.assertFalse(result);
    }

    @Test
    void ReturnFalseIfCalculationsAreThreePointThreeAndFourAndFive() {
        double base = 3.3;
        double height = 4;
        double hypotenuse = 5;
        boolean result = AngledTriangle.RightAngledTriangle(base, height, hypotenuse);
        Assertions.assertFalse(result);
    }

    @Test
    void ReturnFalseIfCalculationsAreMinusThreePointThreeAndThreeAnd4() {
        double base = -3.3;
        double height = -3;
        double hypotenuse = -4;
        boolean result = AngledTriangle.RightAngledTriangle(height, base, hypotenuse);
        Assertions.assertFalse(result);

    }

    @Test
    void ReturnTrueIfCalculationsAreThreeFourAndFive() {
        double base = 3;
        double height = 4;
        double hypotenuse = 5;
        boolean result = AngledTriangle.RightAngledTriangle(base, height, hypotenuse);
        Assertions.assertTrue(result);
    }

}