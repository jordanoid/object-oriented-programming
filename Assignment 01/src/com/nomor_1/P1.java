package com.nomor_1;
import java.util.Scanner;

public class P1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] horoscope = {"Monkey","Rooster","Dog","Pig","Rat","Cow", "Tiger",
                              "Rabbit","Dragon", "Snake", "Horse", "Goat"};
        while(true){
            System.out.println("========Program Horoscope China========");
            System.out.print("Tahun Lahir: ");
            int tahun = in.nextInt();
            if(tahun > 0){
                System.out.println("Horoscope: " + horoscope[tahun % 12]);
                System.out.println("=======================================");
            }else if(tahun == -1){
                System.out.println("=======================================");
                System.out.println("Program telah dihentikan!");
                break;
            }else{
                System.out.println("Input salah!");
            }
        }
    in.close();
    }
}