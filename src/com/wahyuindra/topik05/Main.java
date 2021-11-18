package com.wahyuindra.topik05;

public class Main {
    public static void main(String[] args) {

        Karyawan karyawanTetap = new Tetap("Wahyu", 20, 10);
        Karyawan karyawanKontrak = new Kontrak("Indra", 20, 10);

        Departemen departemen = new Departemen("Google");

        departemen.addKaryawan(karyawanTetap);
        departemen.addKaryawan(karyawanKontrak);

        departemen.displayAll();
        departemen.displayTetap();
        departemen.displayKontrak();
    }
}

class Departemen{
    String nama;
    private Karyawan[] kar = new Karyawan[2];
    int index = 0;
    Departemen(String nama){
        this.nama = nama;
    }

    public void addKaryawan (Karyawan karyawan){
        kar[index] = karyawan;
        index++;
        index = index %  kar.length;
    }

    public void displayAll(){
        System.out.println("========= Display All ========");
        for(Karyawan karyawan : kar){
            karyawan.display();
        }
    }

    public void displayTetap(){
        System.out.println("========= Display Tetap =========");
        for(Karyawan karyawan : kar){
            if (karyawan.status == 0){
                karyawan.display();
            }
        }
    }

    public void displayKontrak(){
        System.out.println("\n========= Display Kontrak ========");
        for(Karyawan karyawan : kar){
            if (karyawan.status == 1){
                karyawan.display();
            }
        }
    }

}

class Karyawan{ //super class
    protected String nama;
    protected double gaDas;
    protected int status;

    Karyawan(String nama, double gaDas){
        this.nama = nama;
        this.gaDas = gaDas;
        this.status = 2;
    }

    public String getNama() {
        return nama;
    }

    public double getGaDas() {
        return gaDas;
    }

    public void display(){
        System.out.println("Nama : " + getNama());
        System.out.println("Gaji Dasar : " + getGaDas());
    }
}

class Tetap extends Karyawan{ //sub class
    private double tuDas;

    Tetap(String nama, double gaDas, double tuDas){
        super(nama, gaDas);
        this.tuDas = tuDas;
        this.status = 0;
    }

    double getTuDas() {
        return tuDas;
    }

    @Override
    public void display(){
        System.out.println("\nKaryawan tetap");
        super.display();
        System.out.println("Tunjangan dasar : " + getTuDas());
    }
}


class Kontrak extends  Karyawan{ //sub class
    private int waktu;

    Kontrak(String nama, double gaDas, int waktu){
        super(nama, gaDas);
        this.waktu = waktu;
        this.status = 1;
    }

    int getWaktu() {
        return waktu;
    }

    @Override
    public void display(){
        System.out.println("\nKaryawan Kontrak");
        super.display();
        System.out.println("Waktu kontrak : " + getWaktu() + " hari\n");
    }
}
