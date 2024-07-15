package org.chadrayan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter initial x coordinate:");
        int x = scanner.nextInt();
        System.out.println("Enter initial y coordinate:");
        int y = scanner.nextInt();
        System.out.println("Enter initial z coordinate:");
        int z = scanner.nextInt();
        System.out.println("Enter initial direction (N, S, E, W, U, D):");
        Direction direction = Direction.valueOf(scanner.next().toUpperCase());

        Spacecraft spacecraft = new Spacecraft(x, y, z, direction);

        System.out.println("Enter commands (as a single string, e.g., 'frulb'):");
        String commands = scanner.next();
        char[] commandArray = commands.toCharArray();

        CommandProcessor commandProcessor = new CommandProcessor(spacecraft);
        commandProcessor.processCommands(commandArray);

        System.out.println("Final Position: " + spacecraft.getPosition());
        System.out.println("Final Direction: " + spacecraft.getDirection());
    }
}
