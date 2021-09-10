package com.nomor_2;
import java.util.Scanner;

public class P2{
    public static void reverseNumberToWords(int x){
        if(x < 0){
            System.out.print("Angka harus bilangan bulat positif!");
        }else if(x > 99){
            System.out.print("Batas maksimal angka adalah 99");
        }else{
            System.out.print("Hasil: ");
            while(x != 0){
                int r = x % 10;
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
                x /= 10;
            }
        }
        System.out.println("");
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n, x;
        System.out.print("Masukan jumlah input angka: ");
        n = in.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.print("Masukan angka: ");
            x = in.nextInt();
            reverseNumberToWords(x);
        }
        System.out.println("========Program berhenti========");
        in.close();
    }
}