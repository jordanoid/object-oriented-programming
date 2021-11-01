package com.nomor2;

public class Converter {
    public static long binToDecimal(String binary){
        int sum = 0;
        int bin = Integer.parseInt(binary);
        int n = binary.length();
        for(int i = 0; i < n; i++){
            int x = bin%10;
            sum += x*(Math.pow(2,i));
            bin /= 10;
        }
        return sum;
    }
    public static long hexToDecimal(String hex){
        int sum = 0;
        String list = "0123456789ABCDEF";
        hex = hex.toUpperCase();
        int l = hex.length();
        for(int i = l-1; i >= 0; i--){
            char x = hex.charAt(i);
            int y = list.indexOf(x);
            sum += y*Math.pow(16, (l-1)-i);
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.println(binToDecimal("111111"));
        System.out.println(hexToDecimal("AF"));
    }
}
