package com.wahyuindra.topik01.pendataanbuku;

class Buku{
    String judul;
    String pengarang;
    double harga;

    Buku(String judul, String pengarang, double harga){
        this.judul = judul;
        this.pengarang = pengarang;
        this.harga = harga;
    }

    String getJudul() {
        return judul;
    }
    String getPengarang() {
        return pengarang;
    }
    double getHarga() {
        return harga;
    }

    void show(){
        System.out.print(getJudul() + ", ");
        System.out.print(getPengarang() + ", ");
        System.out.print(getHarga() + "\n");
    }


}
public class Main {
    public static void main(String[] args) {

        Buku buku1 = new Buku("Harry Potter", "J.K. Rowling", 300000);
        Buku buku2 = new Buku("UML", "Ivar Jacobson", 400000);

        buku1.show();
        buku2.show();
    }
}
