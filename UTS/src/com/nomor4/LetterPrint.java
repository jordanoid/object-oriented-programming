package com.nomor4;

public class LetterPrint {

    public static void printLetterA(){
        int tinggi = 5;
        int lebar = 9;
        int n = lebar / 2;
        for(int i = 0; i < tinggi; i++){
            for(int j = 0; j <= lebar; j++){
                if(j == n || j == (lebar - n) || (i == tinggi / 2 && j > n && j < (lebar - n))){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
            n--;
        }
    }
    public static void printLetterB(){
        int tinggi = 5;
        int lebar = 9;
        int half = (tinggi / 2);
        for(int i = 0; i < tinggi; i++){
            System.out.print("*");
            for(int j = 0; j < lebar; j++){
                if((i == 0 || i == tinggi - 1 || i == half) && j < (lebar - 2)){
                    System.out.print("*");
                }else if(j == (lebar - 2) && !(i == 0 || i == tinggi - 1|| i == half)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    public static void printLetterJ(){
        int tinggi = 5;
        for(int i = 0; i < tinggi; i++){
            for(int j = 0; j < tinggi; j++){
                if(i == tinggi - 1 && (j > 0 && j < tinggi - 1)){
                    System.out.print("*");
                }else if((j == tinggi - 1 && i != tinggi - 1) || (i > (tinggi / 2) - 1 && j == 0 && i != tinggi - 1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    public static void printLetterI(){
        int tinggi = 5;
        for(int i = 0; i < tinggi; i++){
            for(int j = 0; j < tinggi; j++){
                if(i == 0 || i == tinggi - 1){
                    System.out.print("*");
                }else if(j == tinggi / 2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    public static void printLetterD(){
        int tinggi = 5;
        for(int i = 0; i < tinggi; i++){
            System.out.print("*");
            for(int j = 0; j < tinggi; j++){
                if((i == 0 || i == tinggi - 1)&& j < tinggi - 1){
                    System.out.print("*");
                }else if(j == tinggi - 1 && i != 0&& i != tinggi - 1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}