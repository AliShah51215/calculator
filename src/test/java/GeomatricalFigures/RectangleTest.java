package GeomatricalFigures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.apache.commons.math3.util.Precision.round;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {
    private Rectangle rectangle;

    @BeforeEach
    public void setRectangle() {
        rectangle = new Rectangle(3, 5);
    }

    @Test
    void getAreaTest() {
        double result = rectangle.getArea();
        assertEquals(15.00, round(result, 2));
    }

    @Test
    void getPerimeterTest() {
        double result = rectangle.getPerimeter();
        assertEquals(16.00,
                round(result, 2));
    }
}