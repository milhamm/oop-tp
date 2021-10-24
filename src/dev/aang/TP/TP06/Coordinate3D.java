package dev.aang.TP.TP06;

public class Coordinate3D extends Coordinate {

    private int z;

    public Coordinate3D(int x, int y, int z){
        super(x, y);
        setZ(z);
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public double calculateDistance(Coordinate3D c) {
        return Math.sqrt(
                Math.pow(this.getX() - c.getX(), 2) +
                Math.pow(this.getY() - c.getY(), 2) +
                Math.pow(this.getZ() - c.getZ(), 2)
        );
    }
}

