package com.encapsulation;

public class Main {
    public static void main(String[] args){
        Mahasiswa anak = new Mahasiswa("21120120130073", "Jordano Iqbal Darmawan");
        anak.setDoswal("Bu Ike Pertiwi Windasari, ST, MT");
        System.out.println("Memanggil atribut dari object dengan method get");
        System.out.println("Nama\t\t: "+anak.getNama());
        System.out.println("NIM\t\t: "+anak.getNIM());
        System.out.println("Dosen Wali\t: "+anak.getDoswal());
    }
}
