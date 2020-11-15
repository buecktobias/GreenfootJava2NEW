package tests;

import helper.Direction;
import helper.Vector2D;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DirectionTest {

    @Test
    void createDirection(){
        Direction.Values.valueOf("UP");
        Direction.Values.valueOf("DOWN");
        Direction.Values.valueOf("LEFT");
        Direction.Values.valueOf("RIGHT");
    }

    @Test
    void testGetVector2D() {
        assertEquals(new Vector2D(0,-1), new Direction(Direction.Values.UP).getVector2D());
        assertEquals(new Vector2D(0,1), new Direction(Direction.Values.DOWN).getVector2D());
        assertEquals(new Vector2D(-1,0), new Direction(Direction.Values.LEFT).getVector2D());
        assertEquals(new Vector2D(1,0), new Direction(Direction.Values.RIGHT).getVector2D());
    }
}

