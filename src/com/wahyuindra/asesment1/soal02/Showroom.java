package com.wahyuindra.asesment1.soal02;

import java.util.ArrayList;
import java.text.DecimalFormat;

class Mobil{
    String merk, tahunKeluaran;
    double harga;
    int stok;

    Mobil(String merk, String tahunKeluaran, double harga, int stok){
        this.merk = merk;
        this.tahunKeluaran = tahunKeluaran;
        this.harga = harga;
        this.stok = stok;
    }

    //getter
    public String getMerk() {
        return merk;
    }
    public String getTahunKeluaran() {
        return tahunKeluaran;
    }
    public double getHarga() {
        return harga;
    }
    public int getStok() {
        return stok;
    }

    //setter
    public void setStok(int stok) {
        this.stok = stok;
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }

    void displayInfo(){
        DecimalFormat dcm = new DecimalFormat();
        System.out.println("Merk \t\t\t: " + getMerk());
        System.out.println("Harga \t\t\t: " + dcm.format(getHarga()));
        System.out.println("Tahun Keluaran \t: " + getTahunKeluaran());
        System.out.println("Sisa Stok \t\t: " + getStok() + "\n");
    }
}

public class Showroom {
    private static final ArrayList<Mobil> list = new ArrayList<>();

    public static void main(String[] args) {

        Mobil mobil1 = new Mobil("Avanza", "2018",  150000000.0, 5);
        Mobil mobil2 = new Mobil("Aston Martin", "2019", 394000000.0, 5);
        Mobil mobil3 = new Mobil("YARIS 1.5 G M/T 3 Airbags", "2020", 248300000.0, 5);

        tambahMobil(mobil3);
        System.out.println("Informasi Mobil");
        viewStok();

        beliMobil("YARIS 1.5 G M/T 3 Airbags","2020",6);

    }

    private static void tambahMobil(Mobil mobil){
        list.add(mobil);
    }


    private static void beliMobil(String merk, String tahun, int jumlahBeli){
        System.out.println("Input");
        System.out.println("Merk \t\t\t: " + merk);
        System.out.println("Tahun Keluaran \t: " + tahun);
        System.out.println("Jumlah \t\t\t: " + jumlahBeli + "\n");
        System.out.println("Output");
        for (Mobil mobil : list) {
            if(merk.equalsIgnoreCase(mobil.getMerk())
                    && tahun.equalsIgnoreCase(mobil.getTahunKeluaran())
                    && jumlahBeli < mobil.getStok()
            ){
                mobil.setStok(mobil.getStok()-jumlahBeli);
                double diskon = 0.0;
                double hargaDiskon = 0.0;
                DecimalFormat dcm = new DecimalFormat("0.0");

                String satuan = dcm.format(mobil.getHarga());
                String harga = dcm.format(mobil.getHarga() * jumlahBeli);

                System.out.println("Merk \t\t\t: " + mobil.getMerk());
                System.out.println("Harga Satuan \t: " + satuan);
                System.out.println("Tahun Keluaran \t: " + mobil.getTahunKeluaran());
                System.out.println("Jumlah Beli \t: " + jumlahBeli);
                System.out.println("Total Harga \t: " + harga);

                double bayar = mobil.getHarga() * jumlahBeli;
                
                if (jumlahBeli == 2){
                    diskon = 10.0;
                    hargaDiskon = (mobil.getHarga()*jumlahBeli) * 0.1;
                    mobil.setHarga(hargaDiskon);
                }
                if (jumlahBeli > 2){
                    diskon = 20.0;
                    hargaDiskon = (mobil.getHarga()*jumlahBeli) * 0.2;
                    mobil.setHarga(hargaDiskon);
                }
                String total = dcm.format(hargaDiskon);
                String totalBayar = dcm.format(bayar - hargaDiskon);

                System.out.println("Diskon \t\t\t: " + diskon + "%");
                System.out.println("Total Diskon \t: " + total);
                System.out.println("Total Bayar \t: " + totalBayar + "\n");
            }else {
                System.out.println("Maaf, Jumlah Stok Tidak Mencukupi\n");
            }
        }       

    private static void viewStok(){
        list.forEach(Mobil::displayInfo);
    }

}
