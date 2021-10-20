package com.wahyuindra.topik04.packageOne;

import com.wahyuindra.topik04.packageTwo.Print;

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Buku buku1 = new Buku("Harry Potter","J.K. Rowling", 300000);
        Buku buku2 = new Buku("UML","Ivar Jacobson", 400000);

        Print.message("Data buku :" + Buku.getNames());

        System.out.print("Masukan index buku : ");
        int index = in.nextInt();

        try{
            Buku.display(index);
        }catch (Exception e){
            Print.error(e);
        }
    }
}
