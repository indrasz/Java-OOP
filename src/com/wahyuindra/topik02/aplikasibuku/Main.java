package com.wahyuindra.topik02.aplikasibuku;
import java.util.Scanner;
import java.util.ArrayList;

class Buku {
    String isbn;
    String judul;
    String pengarang;
    String tahunTerbit;
    String harga;
    float rating;

    Buku(String isbn,
         String judul,
         String pengarang,
         String tahunTerbit,
         String harga,
         float rating)  //konstruktor
    {
        this.isbn = isbn;
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
        this.harga = harga;
        this.rating = rating;
    }
    //setter
    void setJudul(){
        this.judul = "Laravel";
    }
    void setPengarang(){
        this.pengarang = "Taylor Otwell";
    }
    void setTahunTerbit(){
        this.tahunTerbit = "2010";
    }
    void setHarga(){
        this.harga = "90000";
    }
    void setRating(){
        this.rating = (float) 10.0;
    }

    //getter
    String getIsbn(){
        return this.isbn;
}
    String getJudul(){
        return this.judul;
    }
    String getPengarang(){
        return this.pengarang;
    }
    String getTahunTerbit(){
        return this.tahunTerbit;
    }
    String getHarga(){
        return this.harga;
    }
    float getRating(){
        return this.rating;
    }

    //method search ISBN
    void searchId(String isbn){
        if(this.isbn.equalsIgnoreCase(isbn)){
            System.out.println(isbn + " " + judul + " " + pengarang + " " + tahunTerbit + " " + harga + " " + rating);
        }
    }

    //convert ti string
    @Override
    public String toString() {
        return "ISBN : " + getIsbn() + "\n" +
                "Judul : " + getJudul() + "\n" +
                "Pengarang : " +getPengarang() + "\n" +
                "Tahun terbit : "+getTahunTerbit() + "\n" +
                "Harga : " + getHarga() + "\n" +
                "Rating : " +getRating() + "\n";
    }

}
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Buku> list = new ArrayList<>();
        boolean lanjut = false;

        //core aplication
        do {
            System.out.print("Ingin menambahkan buku ? (y/n) : " ); String kondisi = in.next();
            if(kondisi.equals("y")){
                System.out.print("Masukan Jumlah Buku : "); int jumlah = in.nextInt();
                for (int i = 1; i <= jumlah; i++){
                    System.out.println("Buku ke-" + i + ":");
                    System.out.print("ISBN : ");String isbn = in.next();
                    System.out.print("Judul : ");String judul = in.next();
                    System.out.print("Pengarang : ");String pengarang = in.next();
                    System.out.print("Tahun terbit : ");String tahunTerbit = in.next();
                    System.out.print("Harga : ");String harga = in.next();
                    System.out.print("Rating : ");float rating = in.nextFloat();
                    Buku buku = new Buku(isbn, judul, pengarang, tahunTerbit, harga, rating);
                    list.add(buku); //menambahkan data
                }
            }
            else {
                System.out.println("Program Berhenti");
                lanjut = true;
            }

        } while (!lanjut);

        //menampilkan Data
        String hasil = list.toString().replace("[", "").replace(",", "").replace("]", "");
        System.out.println(hasil);

        //mengubah data
        System.out.println("Menampilkan data yang telah di ubah");
        list.get(0).setJudul();
        list.get(0).setPengarang();
        list.get(0).setTahunTerbit();
        list.get(0).setHarga();
        list.get(0).setRating();
        String hasilSet = list.toString().replace("[", "").replace(",", "").replace("]", "");
        System.out.println(hasilSet);

        //mengambil data dengan isbn yang di input
        System.out.println("mengambil data buku");
        String ambil = in.next();
        for (Buku buku:list){
            buku.searchId(ambil);
        }
        System.out.println();

        //hapus salah satu data
        System.out.println("Menghapus Data Buku");
        int hapus = in.nextInt();
        list.remove(hapus);
        String hasilRemove = list.toString().replace("[", "").replace(",", "").replace("]", "");
        System.out.println(hasilRemove);

    }

    //https://youtu.be/ohHsqwM6Rrg
}





