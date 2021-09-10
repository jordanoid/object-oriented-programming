package com.nomor_3;
import java.util.Scanner;

public class P3 {
    public static int k;
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.print("Tinggi: ");
            int n = in.nextInt();
            if(n > 0){
                for(int i = 1; i <= n; i++){
                    for(int j = 1; j <= n-i; j++){
                        System.out.print("  ");
                    }
                    for(int j = i; j <= i+i-1; j++){
                        System.out.print(j%10 + " ");
                        k = j-1;
                    }
                    for(int j = k; j >= i; j--){
                        System.out.print(j%10 + " ");
                    }
                    System.out.println("");
                }
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
