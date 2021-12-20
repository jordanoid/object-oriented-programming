package com.inheritance;

public class Main {
    public static void main(String[] args){
        System.out.println("================Class Bangun Datar================");
        Segitiga bangunD1 = new Segitiga(11, 8);
        System.out.println("Luas " + bangunD1.name + " = " + bangunD1.getLuas());
        Segiempat bangunD2 = new Segiempat(10);
        System.out.println("Luas " + bangunD2.name + " = " +  bangunD2.getLuas());
        Lingkaran bangunD3 = new Lingkaran(14);
        System.out.println("Luas " + bangunD3.name + " = " +  bangunD3.getLuas());
        System.out.println("================Class Bangun Ruang================");
        Prisma bangunR1 = new Prisma(100, 5);
        System.out.println("Volume " + bangunR1.name + " = " +  bangunR1.getVolume());
        Limas bangunR2 = new Limas(100, 18);
        System.out.println("Volume " + bangunR2.name + " = " +  bangunR2.getVolume());
        Bola bangunR3 = new Bola(21);
        System.out.println("Volume " + bangunR3.name + " = " +  bangunR3.getVolume());
        System.out.println("=================Class Pemrograman=================");
        Java bahasa1 = new Java();
        System.out.println("Tahun Rilis Bahasa " + bahasa1.name + " = " +  bahasa1.getTahunRilis());
        Python bahasa2 = new Python();
        System.out.println("Tahun Rilis Bahasa " + bahasa2.name + " = " + bahasa2.getTahunRilis());
        C bahasa3 = new C();
        System.out.println("Tahun Rilis Bahasa " + bahasa3.name + " = " +  bahasa3.getTahunRilis());
    }
}
