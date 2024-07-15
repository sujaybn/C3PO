package org.chadrayan;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CommandProcessorTest {

    @Test
    public void testProcessCommands() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, Direction.N);
        CommandProcessor processor = new CommandProcessor(spacecraft);
        char[] commands = {'f', 'r', 'f', 'l', 'b'};
        processor.processCommands(commands);
        assertEquals(new Position(1, 0, 0), spacecraft.getPosition());
        assertEquals(Direction.N, spacecraft.getDirection());
    }

    @Test
    public void testProcessEmptyCommands() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, Direction.N);
        CommandProcessor processor = new CommandProcessor(spacecraft);
        char[] commands = {};
        processor.processCommands(commands);
        assertEquals(new Position(0, 0, 0), spacecraft.getPosition());
        assertEquals(Direction.N, spacecraft.getDirection());
    }
}
