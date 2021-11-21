package dev.aang.TP.TP07;

public class Serangga {

    private final int jmlKaki = 6;
    private String warna;

    public Serangga(String color) {
        setWarna(color);
    }

    public void gerak(int[] position) {

    }

    public void info() {

    }

    public int getJmlKaki() {
        return jmlKaki;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
}
