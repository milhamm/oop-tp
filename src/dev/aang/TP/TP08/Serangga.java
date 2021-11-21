package dev.aang.TP.TP08;

public class Serangga {
    private final int jmlKaki = 6;
    private String warna;

    public Serangga(String warna, Koordinat k) {
        this.warna = warna;
    }

    public int getJmlKaki() {
        return jmlKaki;
    }

    public String getWarna() {
        return warna;
    }

    public void gerak(Koordinat k) {}


    public void info() {}
}
