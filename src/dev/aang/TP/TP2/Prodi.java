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
        if (kode == null) {
            System.out.println("Kode must not be null");
            return null;
        }  else if(kode.length() != 2) {
            System.out.println("'Kode' Prodi must be 2 characters");
            return null;
        }
        this.kode = kode;
        return this;
    }

    public String getNama() {
        return nama;
    }

    public Prodi setNama(String nama) {
        if (nama == null) {
            System.out.println("'Nama' must not be null");
            return null;
        }
        this.nama = nama;
        return this;
    }

    @Override
    public String toString() {
        return String.format("[%s] (%s)", getNama(), getKode());
    }
}
