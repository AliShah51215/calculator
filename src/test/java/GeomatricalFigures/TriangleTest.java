package GeomatricalFigures;

import org.apache.commons.math3.util.Precision;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleTest {
    private Triangle triangle;

    @BeforeEach
    public void setTriangle() {
        triangle = new Triangle(4, 5, 6);
    }

    @Test
    void getAreaTest() {
        double result = triangle.getArea();
        assertEquals(9.92, Precision.round(result, 2));
    }

    @Test
    void getPerimeterTest() {
        double result = triangle.getPerimeter();
        assertEquals(15.00, Precision.round(result, 2));
    }
}