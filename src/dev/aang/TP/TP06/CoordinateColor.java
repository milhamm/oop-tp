package dev.aang.TP.TP06;

public class CoordinateColor extends Coordinate {

    private String color;

    public CoordinateColor(int x, int y, String color){
        super(x, y);
        setColor(color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String calculateDistance(CoordinateColor c) {
        System.out.printf("Distance: %.2f", super.calculateDistance(c));
        return String.format("Color: %s and %s\n", this.getColor(), c.getColor());
    }
}
