package org.chadrayan;

public enum Direction {
    N, S, E, W, U, D;

    public Direction turnLeft() {
        switch (this) {
            case N:
                return W;
            case S:
                return E;
            case E:
                return N;
            case W:
                return S;
            default:
                return this;
        }
    }

    public Direction turnRight() {
        switch (this) {
            case N:
                return E;
            case S:
                return W;
            case E:
                return S;
            case W:
                return N;
            default:
                return this;
        }
    }
}
