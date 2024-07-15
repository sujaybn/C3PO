package org.chadrayan;

public class Spacecraft {
    private Position position;
    private Direction direction;

    public Spacecraft(int x, int y, int z, Direction initialDirection) {
        this.position = new Position(x, y, z);
        this.direction = initialDirection;
    }

    public Position getPosition() {
        return position;
    }

    public Direction getDirection() {
        return direction;
    }

    public void executeCommand(char command) {
        switch (command) {
            case 'f':
                position.move(direction, true);
                break;
            case 'b':
                position.move(direction, false);
                break;
            case 'l':
                direction = direction.turnLeft();
                break;
            case 'r':
                direction = direction.turnRight();
                break;
            case 'u':
                direction = Direction.U;
                break;
            case 'd':
                direction = Direction.D;
                break;
            default:
                System.err.println("Invalid command, Kindly provide the correct command");
                break;
        }
    }
}
