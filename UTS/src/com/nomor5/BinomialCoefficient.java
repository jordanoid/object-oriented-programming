package com.nomor5;

public class BinomialCoefficient {
    public static long factorial(int n){
        if(n==0 || n==1){
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }
    public static long combination(int n, int y){
        return factorial(n)/(factorial(y)*factorial(n-y));
    }
    public static void printBinomialCoefficient(int n){
        for(int i=0; i <= n; i++){
            System.out.print(combination(n, i)+" ");
        }
        System.out.println("");
    }
    public static void main(String[] args){
        printBinomialCoefficient(0);
        printBinomialCoefficient(1);
        printBinomialCoefficient(2);
        printBinomialCoefficient(3);
        printBinomialCoefficient(4);
        printBinomialCoefficient(5);
        
    }
}
