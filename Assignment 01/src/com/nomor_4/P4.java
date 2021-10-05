package com.nomor_4;
import java.util.Scanner;

public class P4 {
    // Fungsi palindrome (angka bernilai sama jika dibalik dari kanan)
    public static boolean palindrome(int x){
        if(x<0){
            // Angka tidak boleh minus
            return false;
        }
        // Membuat pembagi untuk mendapatkan angka paling kiri
        int div = 1;
        while(x / div >= 10){
            div *= 10;
        }
        while(x > 0){
            // Mendapatkan angka paling kanan dengan modulo
            int right = x % 10;
            // Mendapatkan angka paling kiri dengan pembagian
            int left = x / div;
            // Melakukan pengecekan kesamaan angka paling kiri dan kanan
            if(left != right){
                return false;
            }
            // Menghilangkan angka paling kiri dan kanan yang telah diperiksa kesamaannya
            x = (x % div) / 10;
            div /= 100;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n;
        // Looping program
        while(true){
            System.out.print("Masukan bilangan bulat: ");
            n = in.nextInt();
            if(n >= 0){
                System.out.println(palindrome(n));
            }else if(n == -1){
                // Menghentikan looping
                System.out.println("Program dihentikan!");
                break;
            }else{
                // Apabila angka bernilai minus
                System.out.println("Input salah!");
            }
        }
        in.close();
    }
}
