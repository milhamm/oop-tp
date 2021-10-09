package dev.aang.TP.TP2;

import java.util.ArrayList;
import java.util.Arrays;

public class DriverMahasiswa {

    private static ArrayList<Mahasiswa> mahasiswaArrayList;

    public static void main(String[] args) {
        Prodi pr1 = new Prodi();
        Prodi pr2 = new Prodi();

        pr1.setKode("SE").setNama("Rekayasa Perangkat Lunak");
        pr2.setKode("IT").setNama("Teknologi Informasi");

        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        Mahasiswa mhs3 = new Mahasiswa();

        mhs1.setNim("1302191234").setNama("Eren Yeager").setProdi(pr1);
        mhs2.setNim("1303205555").setNama("Armin Arlert").setProdi(pr2);
        mhs3.setNim("1302990001").setNama("Mikasa Ackerman").setProdi(pr1);

        mahasiswaArrayList = new ArrayList<>(Arrays.asList(mhs1, mhs2, mhs3));

        play();
    }

    public static void play() {
        for (Mahasiswa mhs: mahasiswaArrayList) {
            System.out.printf("Name: %s\nNIM: %s\nProdi:%s\nAngkatan:%s\n\n",
                    mhs.getNama(),
                    mhs.getNim(),
                    mhs.getProdi(),
                    mhs.getAngkatan());
        }
    }
}
