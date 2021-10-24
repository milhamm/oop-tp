package dev.aang.TP.TP06;

public class DriverTP06 {

    public static void main(String[] args) {
        Coordinate A = new Coordinate(15, 12);
        Coordinate3D B = new Coordinate3D(10, 28, 30);
        Coordinate3D C = new Coordinate3D(11, 26, 32);
        CoordinateColor D = new CoordinateColor(35, 60, "black");
        CoordinateColor E = new CoordinateColor(25, 50, "white");

        System.out.printf("Distance B to A: %.2f\n", B.calculateDistance(A));
        System.out.printf("Distance B to C: %.2f\n", B.calculateDistance(C));
        System.out.printf("Distance between B and D: %.2f\n\n", B.calculateDistance(D));

        System.out.println("Distance between D and E");
        System.out.printf(" %s\n", D.calculateDistance(E));
    }
}
