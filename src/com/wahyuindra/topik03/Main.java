package com.wahyuindra.topik03;

import java.util.ArrayList;

class Mahasiswa{
    String nim;
    String nama;

    Mahasiswa(String nim, String nama){
        this.nim = nim;
        this.nama = nama;
    }
    String getNama() {
        return nama;
    }
    String getNim() {
        return nim;
    }

}

class Jurusan{
    String kode;
    String nama;
    ArrayList<Mahasiswa> list = new ArrayList<>();

    Jurusan(String kode, String nama){
        this.kode = kode;
        this.nama = nama;
    }

    String getNama() {
        return nama;
    }
    String getKode() {
        return kode;
    }
    void addMhs(Mahasiswa mahasiswa){
        list.add(mahasiswa);
    }

    void show(){
        System.out.println("Kode : " + getKode());
        System.out.println("Nama : " + getNama());
        System.out.println("Daftar Mahasiswa : ");
        int i = 1;
        for(Mahasiswa mhs : list){
            System.out.println("   " + i++ + ". "+ mhs.getNim() + "-" + mhs.getNama());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Jurusan jurusan1 = new Jurusan("D3IF", "Diploma 3 Rekayasa Perangkat lunak aplikasi");
        Mahasiswa mahasiswa1 = new Mahasiswa("6701", "Rendi");
        Mahasiswa mahasiswa2 = new Mahasiswa("6702", "Chaca");
        Mahasiswa mahasiswa3 = new Mahasiswa("6703", "Agus");

        jurusan1.addMhs(mahasiswa1);
        jurusan1.addMhs(mahasiswa2);
        jurusan1.addMhs(mahasiswa3);
        jurusan1.show();

        System.out.println();

        Jurusan jurusan2 = new Jurusan("D3SI", "Diploma 3 Sistem Informasi");
        Mahasiswa mahasiswa4 = new Mahasiswa("6301", "Ridwan");
        Mahasiswa mahasiswa5 = new Mahasiswa("6302", "Siska");
        Mahasiswa mahasiswa6 = new Mahasiswa("6303", "Zayn");
        Mahasiswa mahasiswa7 = new Mahasiswa("6304", "Rahmat");

        jurusan2.addMhs(mahasiswa4);
        jurusan2.addMhs(mahasiswa5);
        jurusan2.addMhs(mahasiswa6);
        jurusan2.addMhs(mahasiswa7);
        jurusan2.show();
    }
}
