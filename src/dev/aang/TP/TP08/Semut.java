package dev.aang.TP.TP08;

public class Semut extends Serangga{
    private Koordinat k;

    public Semut(String warna, Koordinat k) {
        super(warna, k);
        this.k = k;
    }

    public void gerak(Koordinat k) {
        this.k = k;
    }

    @Override
    public void info() {
        System.out.printf("Posisi Semut: \tX = %d\n\t\t\t\tY = %d\n", k.getX(), k.getY());
    }
}
