package dev.aang.TP.TP07;

public class Lebah extends Serangga implements BisaTerbang {

    private Koordinat3D posisi;

    public Lebah(String color, int x, int y, int z) {
        super(color);
        posisi = new Koordinat3D(x, y, z);
    }

    @Override
    public void terbang(int x, int y, int z) {
        posisi.setX(posisi.getX() + x);
        posisi.setY(posisi.getY() + y);
        posisi.setZ(posisi.getZ() + z);
    }

    @Override
    public void gerak(int[] position) {
        posisi = new Koordinat3D(position[0], position[1], position[2]);
    }

    @Override
    public void info() {
        System.out.printf("Posisi Lebah: X = %d, Y = %d, Z = %d\n", posisi.getX(), posisi.getY(), posisi.getZ());
    }
}
