package org.chadrayan;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
public class SpacecraftTest {

    @Test
    public void testInitialization() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, Direction.N);
        assertEquals(new Position(0, 0, 0), spacecraft.getPosition());
        assertEquals(Direction.N, spacecraft.getDirection());
    }

    @Test
    public void testMoveForward() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, Direction.N);
        spacecraft.executeCommand('f');
        assertEquals(new Position(0, 1, 0), spacecraft.getPosition());

        spacecraft = new Spacecraft(0, 0, 0, Direction.S);
        spacecraft.executeCommand('f');
        assertEquals(new Position(0, -1, 0), spacecraft.getPosition());

        spacecraft = new Spacecraft(0, 0, 0, Direction.E);
        spacecraft.executeCommand('f');
        assertEquals(new Position(1, 0, 0), spacecraft.getPosition());

        spacecraft = new Spacecraft(0, 0, 0, Direction.W);
        spacecraft.executeCommand('f');
        assertEquals(new Position(-1, 0, 0), spacecraft.getPosition());

        spacecraft = new Spacecraft(0, 0, 0, Direction.U);
        spacecraft.executeCommand('f');
        assertEquals(new Position(0, 0, 1), spacecraft.getPosition());

        spacecraft = new Spacecraft(0, 0, 0, Direction.D);
        spacecraft.executeCommand('f');
        assertEquals(new Position(0, 0, -1), spacecraft.getPosition());
    }

    @Test
    public void testMoveBackward() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, Direction.N);
        spacecraft.executeCommand('b');
        assertEquals(new Position(0, -1, 0), spacecraft.getPosition());

        spacecraft = new Spacecraft(0, 0, 0, Direction.S);
        spacecraft.executeCommand('b');
        assertEquals(new Position(0, 1, 0), spacecraft.getPosition());

        spacecraft = new Spacecraft(0, 0, 0, Direction.E);
        spacecraft.executeCommand('b');
        assertEquals(new Position(-1, 0, 0), spacecraft.getPosition());

        spacecraft = new Spacecraft(0, 0, 0, Direction.W);
        spacecraft.executeCommand('b');
        assertEquals(new Position(1, 0, 0), spacecraft.getPosition());

        spacecraft = new Spacecraft(0, 0, 0, Direction.U);
        spacecraft.executeCommand('b');
        assertEquals(new Position(0, 0, -1), spacecraft.getPosition());

        spacecraft = new Spacecraft(0, 0, 0, Direction.D);
        spacecraft.executeCommand('b');
        assertEquals(new Position(0, 0, 1), spacecraft.getPosition());
    }

    @Test
    public void testRotateLeft() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, Direction.N);
        spacecraft.executeCommand('l');
        assertEquals(Direction.W, spacecraft.getDirection());

        spacecraft = new Spacecraft(0, 0, 0, Direction.S);
        spacecraft.executeCommand('l');
        assertEquals(Direction.E, spacecraft.getDirection());

        spacecraft = new Spacecraft(0, 0, 0, Direction.E);
        spacecraft.executeCommand('l');
        assertEquals(Direction.N, spacecraft.getDirection());

        spacecraft = new Spacecraft(0, 0, 0, Direction.W);
        spacecraft.executeCommand('l');
        assertEquals(Direction.S, spacecraft.getDirection());
    }

    @Test
    public void testRotateRight() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, Direction.N);
        spacecraft.executeCommand('r');
        assertEquals(Direction.E, spacecraft.getDirection());

        spacecraft = new Spacecraft(0, 0, 0, Direction.S);
        spacecraft.executeCommand('r');
        assertEquals(Direction.W, spacecraft.getDirection());

        spacecraft = new Spacecraft(0, 0, 0, Direction.E);
        spacecraft.executeCommand('r');
        assertEquals(Direction.S, spacecraft.getDirection());

        spacecraft = new Spacecraft(0, 0, 0, Direction.W);
        spacecraft.executeCommand('r');
        assertEquals(Direction.N, spacecraft.getDirection());
    }

    @Test
    public void testChangeDirectionUpDown() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, Direction.N);
        spacecraft.executeCommand('u');
        assertEquals(Direction.U, spacecraft.getDirection());

        spacecraft.executeCommand('d');
        assertEquals(Direction.D, spacecraft.getDirection());
    }

    @Test
    public void testCommandSequence() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, Direction.N);
        char[] commands = {'f', 'r', 'f', 'l', 'b'};
        for (char command : commands) {
            spacecraft.executeCommand(command);
        }
        assertEquals(new Position(1, 0, 0), spacecraft.getPosition());
        assertEquals(Direction.N, spacecraft.getDirection());
    }
}
