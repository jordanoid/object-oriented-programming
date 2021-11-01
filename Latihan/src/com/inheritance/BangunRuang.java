package com.inheritance;

public class BangunRuang{
    BangunRuang(String name){
        System.out.println("Ini adalah "+ name);
    }
}
class Prisma extends BangunRuang{
    float luasalas, tinggi, volume;
    Prisma(float luasalas, float tinggi){
        super("Prisma");
        this.luasalas = luasalas;
        this.tinggi = tinggi;
    }
    float getVolume(){
        this.volume = this.luasalas * this.tinggi;
        return this.volume;
    }
}
class Limas extends BangunRuang{
    float luasalas, tinggi, volume;
    Limas(float luasalas, float tinggi){
        super("Limas");
        this.luasalas = luasalas;
        this.tinggi = tinggi;
    }
    float getVolume(){
        this.volume = this.luasalas * this.tinggi / 3;
        return this.volume;
    }
}
class Bola extends BangunRuang{
    float jari, volume;
    Bola(float jari){
        super("Bola");
        this.jari = jari;
    }
    float getVolume(){
        this.volume = (float) (this.jari * this.jari * this.jari * 3.14 * 4/3);
        return this.volume;
    }
}