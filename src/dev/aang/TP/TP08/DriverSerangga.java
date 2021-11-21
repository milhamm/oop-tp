package dev.aang.TP.TP08;

public class DriverSerangga {

    public static void main(String[] args) {
        Serangga s = new Semut("Merah", new Koordinat(70, 90));
        System.out.printf("Warna Semut: \t%s\n", s.getWarna());
        s.info();
        s.gerak(new Koordinat(80, 100));
        s.info();

        s = new Lebah("Oranye", new Koordinat3D(30, 40, 50));
        System.out.printf("Warna Lebah: \t%s\n", s.getWarna());
        s.info();
        s.gerak(new Koordinat3D(45, 55, 65));
        s.info();
    }
}
