package com.wahyuindra.asesment1.soal01;

class Marketplace{
    String noTransaksi, noResi, namaEkspedisi, namaPenjual, alamatPenjual, namaPembeli, alamatPembeli;
    double ongkosKirim;

    String namaDropshiper, alamatDropshipper;
    boolean statusDropshipper = false;

    double nominalAsuransi;
    boolean statusAsuransi = false;

    // ====== NORMAL =======
    public Marketplace(
            String noTransaksi,
            String noResi,
            String namaEkspedisi,
            double ongkosKirim,
            String namaPenjual,
            String alamatPenjual,
            String namaPembeli,
            String alamatPembeli
    ){
        this.noTransaksi = noTransaksi;
        this.noResi = noResi;
        this.namaEkspedisi = namaEkspedisi;
        this.namaPenjual = namaPenjual;
        this.alamatPenjual = alamatPenjual;
        this.namaPembeli = namaPembeli;
        this.alamatPembeli = alamatPembeli;
        this.ongkosKirim = ongkosKirim;
    }

    // ====== Dropship =======
    public Marketplace(
            String noTransaksi,
            String noResi,
            String namaEkspedisi,
            String namaDropshiper,
            String alamatDropshipper,
            String namaPembeli,
            String alamatPembeli,
            double ongkosKirim
    ){
        this.noTransaksi = noTransaksi;
        this.noResi = noResi;
        this.namaEkspedisi = namaEkspedisi;
        this.namaDropshiper = namaDropshiper;
        this.alamatDropshipper = alamatDropshipper;
        this.namaPembeli = namaPembeli;
        this.alamatPembeli = alamatPembeli;
        this.ongkosKirim = ongkosKirim;
        this.statusDropshipper = true;
    }

    // ASURANSI
    public Marketplace(
            String noTransaksi,
            String noResi,
            String namaEkspedisi,
            String namaPenjual,
            String alamatPenjual,
            String namaPembeli,
            String alamatPembeli,
            double nominalAsuransi,
            double ongkosKirim
    ) {
        this.noTransaksi = noTransaksi;
        this.noResi = noResi;
        this.namaEkspedisi = namaEkspedisi;
        this.namaPembeli = namaPembeli;
        this.alamatPembeli = alamatPembeli;
        this.ongkosKirim = ongkosKirim;
        this.namaPenjual = namaPenjual;
        this.alamatPenjual = alamatPenjual;
        this.nominalAsuransi = nominalAsuransi;
        this.statusAsuransi = true;
    }

    // ===== DROPSHIPPER + ASURANSI =======
    public Marketplace(
            String noTransaksi,
            String noResi,
            String namaEkspedisi,
            double ongkosKirim,
            String namaDropshiper,
            String alamatDropshipper,
            String namaPembeli,
            String alamatPembeli,
            double nominalAsuransi
    ) {
        this.noTransaksi = noTransaksi;
        this.noResi = noResi;
        this.namaEkspedisi = namaEkspedisi;
        this.namaPembeli = namaPembeli;
        this.alamatPembeli = alamatPembeli;
        this.ongkosKirim = ongkosKirim;
        this.namaDropshiper = namaDropshiper;
        this.alamatDropshipper = alamatDropshipper;
        this.nominalAsuransi = nominalAsuransi;
        this.statusAsuransi = true;
        this.statusDropshipper = true;
    }

    //getter
    public String getNoTransaksi() {
        return noTransaksi;
    }
    public String getNoResi() {
        return noResi;
    }
    public String getNamaEkspedisi() {
        return namaEkspedisi;
    }
    public double getOngkosKirim() {
        return ongkosKirim;
    }
    public String getNamaPenjual() {
        return namaPenjual;
    }
    public String getAlamatPenjual() {
        return alamatPenjual;
    }
    public String getNamaDropshiper() {
        return namaDropshiper;
    }
    public String getAlamatDropshipper() {
        return alamatDropshipper;
    }
    public String getNamaPembeli() {
        return namaPembeli;
    }
    public String getAlamatPembeli() {
        return alamatPembeli;
    }
    public double getNominalAsuransi() {
        return nominalAsuransi;
    }


    void display(){
        System.out.println("No Transaksi \t: " + getNoTransaksi());
        System.out.println("No Resi \t\t: " + getNoResi());
        System.out.println("Nama Ekspedisi \t: " + getNamaEkspedisi());

        if (statusAsuransi && !statusDropshipper && getOngkosKirim() > 20000){
            System.out.println("Ongkos Kirim \t: " + (getOngkosKirim() - 5000));
        }else {
            System.out.println("Ongkos Kirim \t: " + getOngkosKirim());
        }

        if(statusDropshipper){
            System.out.println("Nama pengirim \t: " + getNamaDropshiper());
            System.out.println("Alamat Pengirim : " + getAlamatDropshipper());
        }else {
            System.out.println("Nama pengirim \t: " + getNamaPenjual());
            System.out.println("Alamat Pengirim : " + getAlamatPenjual());
        }

        System.out.println("Nama Penerima \t: " + getNamaPembeli());
        System.out.println("Alamat Penerima : " + getAlamatPembeli());
        if (statusAsuransi) System.out.println("Nominal Asuransi: " + getNominalAsuransi());

        System.out.println();
    }

}

public class Main {
    public static void main(String[] args) {
        // ASURANSI & DROPSHIP
        Marketplace marketplace1 = new Marketplace(
                "1",
                "N0001",
                "JNE",
                21000.0,
                "Dropship1",
                "Surabaya",
                "Bejo",
                "DayeuhKolot",
                40000.0
        );
        System.out.println("Asuransi dan Dropship");
        marketplace1.display();

        // ASURANSI
        Marketplace marketplace2 = new Marketplace(
                "2",
                "N0003",
                "J&T",
                "Eiger",
                "Bandung Kopo",
                "Tini",
                "DayeuhKolot",
                40000.0,
                21000.0
        );
        System.out.println("Asuransi");
        marketplace2.display();

        //NORMAL
        Marketplace marketplace3 = new Marketplace(
                "3",
                "N0004",
                "Pos Indonesia",
                23000.0,
                "Eiger",
                "Bandung Kopo",
                "Bambang",
                "DayeuhKolot"
        );
        System.out.println("Normal");
        marketplace3.display();

        // DROPSHIP
        Marketplace marketplace4 = new Marketplace(
                "4",
                "N0002",
                "siCepat",
                "Dropship2",
                "Pontianak",
                "Joko",
                "DayeuhKolot",
                24000.0
        );
        System.out.println("Dropship");
        marketplace4.display();
    }
}
