package com.inheritance;

public class BangunRuang{
    public String name;
    BangunRuang(String name){
        this.name = name;
        System.out.println("Telah dibuat object dari class "+ this.name);
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