package com.yuda.BelajarJava.collection;

import java.util.*;

public class set {

    public static void main(String[] args) {

        Set<String> bola = new HashSet<>(); //penggunaan HashSet

        bola.add("Tenis"); // menambahkan objek ke dalam bola
        bola.add("Ping-Pong");
        bola.add("Bekel");
        bola.add("Kasti");
        bola.add("Voli");
        bola.add("Futsal");

        System.out.println("Jumlah Bola = " + bola.size()+ "\nDengan Nama :");
        for(String bol : bola){
            System.out.println("\t " +bol);
        }

        bola.remove("Ping-Pong");
        bola.remove("Tenis");
        bola.add("Basket");

        System.out.println("Jumlah bola akhir = " + bola.size() + "\nDengan Nama :");

        for(String bol :bola){
            System.out.println("\t " +bol);
        }
        /*Iterator<String> i = bola.iterator();
        while(i.hasNext()) {
            // looping menggunakan Iterator
            //System.out.println("\t " + i.next());
        }*/
    }

}
