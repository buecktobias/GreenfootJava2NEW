package tests;

import helper.Vector2D;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Vector2DTest {
    private double x = 10;
    private double y = 4;
    private final Vector2D vector2D = new Vector2D(this.x, this.y);
    @Test
    void testX() {
        assertEquals(this.x, this.vector2D.getX());
    }
    @Test
    void setX(){
        Vector2D newVector2D = new Vector2D(this.x, this.y);
        newVector2D.setX(2);
        assertEquals(newVector2D.getX(), 2);
    }

}
