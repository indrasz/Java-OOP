package com.wahyuindra.topik04.packageOne;

import com.wahyuindra.topik04.packageTwo.Print;
import java.util.ArrayList;

class Buku {
    private final String name;
    private final String pengarang;
    private final int harga;
    private final static ArrayList<String> list = new ArrayList<>();

    public Buku(String name, String pengarang, int harga){
        this.name = name;
        this.pengarang = pengarang;
        this.harga = harga;
        Buku.list.add("\n" + this.name + " - " + this.pengarang + " - " + this.harga);
    }

    public static String getNames(){
        return Buku.list.toString().replace("[", "").replace(",", "").replace("]", "");
    }

    public static void display(int index){
        String name = list.get(index);
        Print.message(name);
    }

}
