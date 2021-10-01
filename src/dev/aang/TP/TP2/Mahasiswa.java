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
        this.nim = nim;
        return this;
    }

    public String getNama() {
        return nama;
    }

    public Mahasiswa setNama(String nama) {
        this.nama = nama;
        return this;
    }

    public String getProdi() {
        return prodi.toString();
    }

    public Mahasiswa setProdi(Prodi prodi) {
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
