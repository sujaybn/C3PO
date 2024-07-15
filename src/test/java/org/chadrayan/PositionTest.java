package org.chadrayan;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class PositionTest {

    @Test
    public void testMoveNorth() {
        Position position = new Position(0, 0, 0);
        position.move(Direction.N, true);
        assertEquals(new Position(0, 1, 0), position);
    }

    @Test
    public void testMoveSouth() {
        Position position = new Position(0, 0, 0);
        position.move(Direction.S, true);
        assertEquals(new Position(0, -1, 0), position);
    }

    @Test
    public void testMoveEast() {
        Position position = new Position(0, 0, 0);
        position.move(Direction.E, true);
        assertEquals(new Position(1, 0, 0), position);
    }

    @Test
    public void testMoveWest() {
        Position position = new Position(0, 0, 0);
        position.move(Direction.W, true);
        assertEquals(new Position(-1, 0, 0), position);
    }

    @Test
    public void testMoveUp() {
        Position position = new Position(0, 0, 0);
        position.move(Direction.U, true);
        assertEquals(new Position(0, 0, 1), position);
    }

    @Test
    public void testMoveDown() {
        Position position = new Position(0, 0, 0);
        position.move(Direction.D, true);
        assertEquals(new Position(0, 0, -1), position);
    }

    @Test
    public void testEqualsAndHashCode() {
        Position position1 = new Position(0, 0, 0);
        Position position2 = new Position(0, 0, 0);
        Position position3 = new Position(1, 0, 0);

        assertEquals(position1, position2);
        assertNotEquals(position1, position3);
        assertEquals(position1.hashCode(), position2.hashCode());
        assertNotEquals(position1.hashCode(), position3.hashCode());
    }
}
