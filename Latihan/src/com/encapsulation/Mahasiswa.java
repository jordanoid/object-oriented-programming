package com.encapsulation;

public class Mahasiswa {
    private String NIM;
    private String nama;
    private String doswal;
    public Mahasiswa(String NIM, String nama){
        this.NIM = NIM;
        this.nama = nama;
        System.out.println("Object baru dari class Mahasiswa telah dibuat!");
    }
    public String getNama(){
        return this.nama;
    }
    public String getNIM(){
        return this.NIM;
    }
    public void setDoswal(String doswal){
        this.doswal = doswal;
    }
    public String getDoswal(){
        return this.doswal;
    }
}
