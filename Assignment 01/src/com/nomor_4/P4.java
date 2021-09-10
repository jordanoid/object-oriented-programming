package com.nomor_4;
import java.util.Scanner;

public class P4 {
    public static boolean palindrome(int x){
        if(x<0){
            return false;
        }
        int div = 1;
        while(x / div >= 10){
            div *= 10;
        }
        while(x > 0){
            int right = x % 10;
            int left = x / div;
            if(left != right){
                return false;
            }
            x = (x % div) / 10;
            div /= 100;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n;
        while(true){
            System.out.print("Masukan bilangan bulat: ");
            n = in.nextInt();
            if(n >= 0){
                System.out.println(palindrome(n));
            }else if(n == -1){
                System.out.println("Program dihentikan!");
                break;
            }else{
                System.out.println("Input salah!");
            }
        }
        in.close();
    }
}
