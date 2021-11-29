package com.wahyuindra.topik06;

import java.util.ArrayList;

public class Main {

    static ArrayList<Member> listMember = new ArrayList<>();

    public static void main(String[] args) {

        Driver driver1 = new Driver("D1", "Indra", "4678", 10000, "A12", "Motor");
        listMember.add(driver1);
        Customer customer1 = new Customer("C1", "Wahyu", "0821", 5000);
        listMember.add(customer1);

        System.out.println("=====Display Member=====");
        displayMember();
        searchById("D1");
        transaction(1);

        System.out.println("=====Display Update Member=====");
        displayMember();
    }

    private static Member searchById(String idMember){
        Member member = null;
        for (Member m : listMember){
            if(m.getNik().equals(idMember)){
                member = m;
                break;
            }
        }
        return member;
    }

    private static void displayMember(){
        for (Member member : listMember){
            member.display();
        }
    }

    private static void transaction(int type){
        String idCustomer = "C1";
        String idDriver = "D1";
        double saldo = 5000;

        Member customer = searchById(idCustomer);
        Member driver = searchById(idDriver);
        if((customer instanceof Customer) && (driver instanceof Driver)){
            if (type == 0){
                customer.transaction(driver, saldo);
            }
            else {
                driver.transaction(customer, saldo);
            }
        }
    }
}

abstract class Member{
    protected String nama, nik, noTelp;
    protected double saldo;

    Member(String nik, String nama, String noTelp, double saldo){
        this.nik = nik;
        this.nama = nama;
        this.noTelp = noTelp;
        this.saldo = saldo;
    }

    public String getNama() {
        return nama;
    }
    public String getNik() {
        return nik;
    }
    public String getNoTelp() {
        return noTelp;
    }
    public double getSaldo() {
        return saldo;
    }


    void transaction(Member other, double jumlah){
        this.saldo = this.saldo + jumlah;
        other.saldo = other.saldo - jumlah;
    }

    abstract void display();
}

class Driver extends Member{
    String noPlat,jenis;

    Driver(String nik, String nama, String noTelp, double saldo, String noPlat, String jenis) {
        super(nik, nama, noTelp, saldo);
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    @Override
    void display(){
        System.out.println("Driver");
        System.out.println("Nama : " + getNama());
        System.out.println("NIK : " + getNik());
        System.out.println("No Telepon : " + getNoTelp());
        System.out.println("Saldo : " + getSaldo());
        System.out.println("No Plat : " + noPlat);
        System.out.println("Jenis : " + jenis + "\n");
    }
}

class Customer extends Member{

    Customer(String nik, String nama, String noTelp, int saldo) {
        super(nik, nama, noTelp, saldo);
    }

    @Override
    void display(){
        System.out.println("Customer");
        System.out.println("Nama : " + getNama());
        System.out.println("NIK : " + getNik());
        System.out.println("No Telepon : " + getNoTelp());
        System.out.println("Saldo : " + getSaldo() + "\n");
    }
}


