package dev.aang.TP.TP2;

public class Mahasiswa {

    public String nim;
    public String nama;
    public Prodi prodi;

    public Mahasiswa(){
    }

    public String getNim() {
        return nim;
    }

    public Mahasiswa setNim(String nim) {
        if (nim == null) {
            System.out.println("NIM must not be null");
            return null;
        }
        this.nim = nim;
        return this;
    }

    public String getNama() {
        return nama;
    }

    public Mahasiswa setNama(String nama) {
        if (nama == null) {
            System.out.println("Nama must not be null");
            return null;
        }
        this.nama = nama;
        return this;
    }

    public String getProdi() {
        return prodi.toString();
    }

    public Mahasiswa setProdi(Prodi prodi) {
        if (prodi == null) {
            System.out.println("Prodi must not be null");
            return null;
        }
        this.prodi = prodi;
        return this;
    }

    public int getAngkatan() {
        String angkatanSubstring = this.nim.substring(4,6);
        int angkatanCode = Integer.parseInt(angkatanSubstring);
        String angkatan = "0";

        if (angkatanCode >= 0 && angkatanCode <= 20){
            angkatan = "20" + angkatanSubstring;
        } else if (angkatanCode >= 90 && angkatanCode <= 99) {
            angkatan = "19" + angkatanSubstring;
        }

        return Integer.parseInt(angkatan);
    }
}
