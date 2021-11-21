package dev.aang.TP.TP08;

public abstract class Serangga {
    private final int jmlKaki = 6;
    private String warna;
    public Koordinat k;

    public Serangga(String warna, Koordinat k) {
        setWarna(warna);
        this.k = k;
    }

    public int getJmlKaki() {
        return jmlKaki;
    }

    public String getWarna() {
        return warna;
    }

    public abstract void gerak(Koordinat k);

    public abstract void info();

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public Koordinat getPosisi() {
        return k;
    }
}
