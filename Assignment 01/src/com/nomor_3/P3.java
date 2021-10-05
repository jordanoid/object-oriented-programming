package com.nomor_3;
import java.util.Scanner;

public class P3 {
    public static int k; // global variable
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        // Looping program
        while(true){
            System.out.print("Tinggi: ");
            int n = in.nextInt();
            if(n > 0){
                // Looping sebanyak nilai input tinggi
                for(int i = 1; i <= n; i++){
                    // Looping untuk membuat deretan angka berada pas di tengah
                    for(int j = 1; j <= n-i; j++){
                        System.out.print("  ");
                    }
                    // Looping untuk menuliskan deretan angka dari kiri sampai ke tengah
                    for(int j = i; j <= i+i-1; j++){
                        System.out.print(j%10 + " ");
                        k = j-1;
                    }
                    // Looping untuk menuliskan deretan angka dari tengah + 1 sampai kanan
                    for(int j = k; j >= i; j--){
                        System.out.print(j%10 + " ");
                    }
                    System.out.println("");
                }
            }else if(n == -1){
                // Menghentikan program apabila input tinggi == -1
                System.out.println("Program dihentikan!");
                break;
            }else{
                System.out.println("Input salah!");
            }
        }   
        in.close();
    }
}
