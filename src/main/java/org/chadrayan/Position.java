package org.chadrayan;

import java.util.Objects;

public class Position {
    private int x;
    private int y;
    private int z;

    public Position(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void move(Direction direction, boolean forward) {
        int multiplier = forward ? 1 : -1;
        switch (direction) {
            case N:
                y += multiplier;
                break;
            case S:
                y -= multiplier;
                break;
            case E:
                x += multiplier;
                break;
            case W:
                x -= multiplier;
                break;
            case U:
                z += multiplier;
                break;
            case D:
                z -= multiplier;
                break;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return x == position.x && y == position.y && z == position.z;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }

    @Override
    public String toString() {
        return "Position{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
