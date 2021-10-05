package com.nomor_1;
import java.util.Scanner;

public class P1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        // Membuat array berisi horoscope dengan index yang telah ditentukan
        String[] horoscope = {"Monkey","Rooster","Dog","Pig","Rat","Cow", "Tiger", 
                              "Rabbit","Dragon", "Snake", "Horse", "Goat"};
        while(true){
            System.out.println("========Program Horoscope China========");
            System.out.print("Tahun Lahir: ");
            // Input tahun lahir
            int tahun = in.nextInt();
            if(tahun >= 0){
                // Mengambil index dari array horoscope dengan angka index tahun modulo 12
                System.out.println("Horoscope: " + horoscope[tahun % 12]);
                System.out.println("=======================================");
            }else if(tahun == -1){
                 // Mengehantikan program apabila input pada tahun == -1
                System.out.println("=======================================");
                System.out.println("Program telah dihentikan!");
                break;
            }else{
                // Jika input tahun < -1 karena tidak ada tahun yang bernilai minus
                System.out.println("Input salah!");
            }
        }
    in.close();
    }
}