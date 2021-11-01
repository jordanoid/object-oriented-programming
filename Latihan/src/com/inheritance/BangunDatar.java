package com.inheritance;

public class BangunDatar{
    BangunDatar(String name){
        System.out.println("Ini adalah "+ name);
    }
}
class Segitiga extends BangunDatar{
    float luas, alas, tinggi;
    Segitiga(float alas, float tinggi){
        super("Segitiga");
        this.alas = alas;
        this.tinggi = tinggi;
    }
    float getLuas(){
        this.luas = this.alas * this.tinggi / 2; 
        return this.luas;
    }
}
class Segiempat extends BangunDatar{
    float sisi, luas;
    Segiempat(float sisi){
        super("Segiempat");
        this.sisi = sisi;
    }
    float getLuas(){
        this.luas = this.sisi * this.sisi;
        return this.luas;
    }
}
class Lingkaran extends BangunDatar{
    float jari, luas;
    Lingkaran(){
        super("Lingkaran");
    }
    float getLuas(){
        this.luas = (float) (this.jari * this.jari * 3.14);
        return this.luas;
    }
}