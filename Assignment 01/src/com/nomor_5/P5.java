package com.nomor_5;
import java.util.Scanner;

public class P5{
    public static void main(String[] args){
        double x , a = 1, b = 2, c = 3, a1 = 1, b1 = 2;
        Scanner in = new Scanner(System.in);
        // Meminta input angka
        System.out.print("Masukan angka antara -1 s.d. 1: ");
        x = in.nextDouble();
        double hasil = x;
        if(x < 1 || x > -1){
            // Melakukan perhitungan sesuai dengan rumus yang diberikan oleh soal
            for(int i = 1; i <= 7; i++){
                hasil += (a/b)*(Math.pow(x, c)/c);
                a1 += 2; b1 += 2;
                a *= a1; b *= b1;
                c += 2;
            }
            // Menampilkan hasil
            System.out.println("Hasil = " + hasil);
        }else{
            System.out.println("Input salah");
        }
        in.close();
    }
}
