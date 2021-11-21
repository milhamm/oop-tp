package dev.aang.TP.TP07;

public class Semut extends Serangga {

    private Koordinat posisi;

    public Semut(String color, int x, int y) {
        super(color);
        posisi = new Koordinat(x, y);
    }

    @Override
    public void gerak(int[] position) {
        posisi = new Koordinat(position[0], position[1]);
    }

    @Override
    public void info() {
        System.out.printf("Posisi Semut: X = %d, Y = %d\n", posisi.getX(), posisi.getY());
    }
}
