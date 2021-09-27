package fl.pm;

import org.apache.commons.math3.util.Precision;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RectangleTest {
    Rectangle rectangle;

    @BeforeEach
    public void setRectangle() {

        rectangle = new Rectangle(3, 5);
    }

    @Test
    void getAreaTest() {

        double result = Precision.round(rectangle.getArea(), 2);

        Assertions.assertEquals(15.00, result);
    }

    @Test
    void getPerimeterTest() {

        double result = Precision.round(rectangle.getPerimeter(), 2);

        Assertions.assertEquals(16.00, result);
    }
}

