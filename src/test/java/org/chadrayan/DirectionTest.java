package org.chadrayan;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DirectionTest {

    @Test
    public void testTurnLeft() {
        assertEquals(Direction.W, Direction.N.turnLeft());
        assertEquals(Direction.E, Direction.S.turnLeft());
        assertEquals(Direction.N, Direction.E.turnLeft());
        assertEquals(Direction.S, Direction.W.turnLeft());
    }

    @Test
    public void testTurnRight() {
        assertEquals(Direction.E, Direction.N.turnRight());
        assertEquals(Direction.W, Direction.S.turnRight());
        assertEquals(Direction.S, Direction.E.turnRight());
        assertEquals(Direction.N, Direction.W.turnRight());
    }
}
