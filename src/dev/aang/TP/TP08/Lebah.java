package dev.aang.TP.TP08;

public class Lebah extends Serangga{
    private Koordinat3D k;

    public Lebah(String warna, Koordinat3D k) {
        super(warna, k);
        this.k = k;
    }

    @Override
    public void gerak(Koordinat k) {
        this.k = (Koordinat3D) k;
    }

    @Override
    public void info() {
        System.out.printf("Posisi Lebah: \tX = %d\n\t\t\t\tY = %d\n\t\t\t\tZ = %d\n", k.getX(), k.getY(), k.getZ());
    }
}
