package dev.aang.TP.TP06;

public class Coordinate {

    private int x;
    private int y;

    public Coordinate(int x, int y) {
        setX(x);
        setY(y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double calculateDistance(Coordinate c) {
        return Math.sqrt(
                Math.pow(this.getX() - c.getX(), 2) +
                Math.pow(this.getY() - c.getY(), 2)
        );
    }
}
