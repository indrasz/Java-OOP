package com.wahyuindra.topik01.totalhargabarang;

class Barang{
    private final String idProduct;
    private final String nama;
    private double harga;

    Barang(String idProduct, String nama, double harga){ //konstruktor 3 parameter
        this.idProduct = idProduct;
        this.nama = nama;
        this.harga = harga;
    }

    Barang(String idProduct, String nama){ //konstruktor 2 parameter
        this.idProduct = idProduct;
        this.nama = nama;
    }

    void setHarga(double harga){
        this.harga = harga;
    }

    String getIdProduct(){
        return this.idProduct;
    }

    String getNama(){
        return this.nama;
    }

    double getHarga(){
        return harga;
    }

    void show(){
        System.out.println("Id Product : " + getIdProduct());
        System.out.println("Nama : " + getNama());
        System.out.println("Harga : " + getHarga() + "\n");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Konstruktor dengan 2 parameter\n");
        Barang dataBarang1 = new Barang("BRG-001", "Tas Gucci");
        dataBarang1.setHarga(1200);
        System.out.println("Data Barang 1");
        dataBarang1.show();

        Barang dataBarang2 = new Barang("BRG-002", "Printer Epson L355");
        dataBarang2.setHarga(200);
        System.out.println("Data Barang 2");
        dataBarang2.show();

        System.out.println("Konstruktor dengan 3 parameter\n");
        Barang dataBarang3 = new Barang("BRG-003", "Koper", 150);
        System.out.println("Data Barang 3");
        dataBarang3.show();

        Barang dataBarang4 = new Barang("BRG-004", "Helm", 20);
        System.out.println("Data Barang 4");
        dataBarang4.show();

        System.out.println("Jumlah Harga Barang");
        System.out.println("Id Product : " + dataBarang1.getIdProduct());
        System.out.println("Id Product : " + dataBarang3.getIdProduct());
        System.out.println("Id Product : " + dataBarang4.getIdProduct());

        double barang1 = dataBarang1.getHarga();
        double barang2 = dataBarang3.getHarga();
        double barang3 = dataBarang4.getHarga();
        double totalHarga = barang1+barang2+barang3;
        System.out.println("Total Harga = " + totalHarga + " $");
    }
}
