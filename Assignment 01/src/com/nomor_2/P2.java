package com.nomor_2;
import java.util.Scanner;

public class P2{
    // Fungsi konversi angka ke kata reverse
    public static void reverseNumberToWords(int x){
        if(x < 0){
            System.out.print("Angka harus bilangan bulat positif!"); // Jika input kurang dari 0
        }else if(x > 99){
            System.out.print("Batas maksimal angka adalah 99"); // Jika input melebihi batas maksimal 99
        }else{
            System.out.print("Hasil: ");
            // Looping selama x / 10 masih diatas 0
            while(x != 0){
                // x % 10 untuk mendapatkan angka paling kanan
                int r = x % 10;
                // Menampilkan angka dalam bentuk kata menggunakan switch case
                switch(r){
                    case 0: System.out.print("zero "); break;
                    case 1: System.out.print("one "); break;
                    case 2: System.out.print("two "); break;
                    case 3: System.out.print("three "); break;
                    case 4: System.out.print("four "); break;
                    case 5: System.out.print("five "); break;
                    case 6: System.out.print("six "); break;
                    case 7: System.out.print("seven "); break;
                    case 8: System.out.print("eight "); break;
                    case 9: System.out.print("nine "); break;
                }
                // Membagi angka untuk menghilangkan angka paling kanan yang telah dikonversi ke kata
                x /= 10;
            }
        }
        System.out.println("");
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n, x;
        // Meminta jumlah angka yang akan diinput
        System.out.print("Masukan jumlah input angka: ");
        n = in.nextInt();
        // Looping sebanyak input jumlah angka
        for(int i = 1; i <= n; i++){
            System.out.print("Masukan angka: ");
            x = in.nextInt();
            reverseNumberToWords(x);
        }
        System.out.println("========Program berhenti========");
        in.close();
    }
}