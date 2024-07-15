package org.chadrayan;

public class CommandProcessor {
    private final Spacecraft spacecraft;

    public CommandProcessor(Spacecraft spacecraft) {
        this.spacecraft = spacecraft;
    }

    public void processCommands(char[] commands) {
        for (char command : commands) {
            spacecraft.executeCommand(command);
        }
    }
}
