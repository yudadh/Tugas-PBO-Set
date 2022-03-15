package com.yuda.BelajarJava.collection;

import java.util.*;

public class set {

    public static void main(String[] args) {

        Set<String> bola = new HashSet<>(); //penggunaan HashSet

        bola.add("Tenis"); // menambahkan objek ke dalam collection 
        bola.add("Ping-Pong");
        bola.add("Bekel");
        bola.add("Kasti");
        bola.add("Voli");
        bola.add("Futsal");

        System.out.println("Jumlah Bola = " + bola.size()+ "\nDengan Nama :"); // menampilkan jumlah dari collection 
        for(String bol : bola){              // perulangan untuk menampilan isi collection
            System.out.println("\t " +bol);
        }

        bola.remove("Ping-Pong");  // menghapus objek collection
        bola.remove("Tenis");
        bola.add("Basket");        // menambah objek collection

        System.out.println("Jumlah bola akhir = " + bola.size() + "\nDengan Nama :");

        for(String bol :bola){
            System.out.println("\t " +bol);
        }
        
    }

}
