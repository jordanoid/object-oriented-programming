package com.inheritance;

public class Main {
    public static void main(String[] args){
        Segitiga bangun1 = new Segitiga(11, 8);
        System.out.println("Luas = "+bangun1.getLuas());
        Limas bangun2 = new Limas(100, 18);
        System.out.println("Volume = "+bangun2.getVolume());
        Java bahasa = new Java();
    }
}
