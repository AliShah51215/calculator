package fl.pm;

import org.apache.commons.math3.util.Precision;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    private Triangle triangle;

    @BeforeEach
    public void setTriangle() {

        triangle = new Triangle(4, 5, 6);
    }

    @Test
    void getAreaTest() {

        double result = Precision.round(triangle.getArea(), 2);

        Assertions.assertEquals(9.92, result);
    }

    @Test
    void getPerimeterTest() {

        double result = Precision.round(triangle.getPerimeter(), 2);

        Assertions.assertEquals(15.00, result);
    }

}