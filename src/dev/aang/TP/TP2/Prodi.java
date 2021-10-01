package dev.aang.TP.TP2;

public class Prodi {

    public String kode;
    public String nama;

    public Prodi(){
    }

    public String getKode() {
        return kode;
    }

    public Prodi setKode(String kode) {
        this.kode = kode;
        return this;
    }

    public String getNama() {
        return nama;
    }

    public Prodi setNama(String nama) {
        this.nama = nama;
        return this;
    }

    @Override
    public String toString() {
        return String.format("[%s] (%s)", this.nama, this.kode);
    }
}
