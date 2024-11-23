package org.example;

import java.util.Scanner;

public class Primo_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        boolean esPrimo=esPrimo(n1);
        System.out.println(esPrimo ? "Es un numero primo" : "NO es un numero primo");
        numPrimos();
    }
    private static boolean esPrimo(int n1){
        boolean esPrimo = true;
        for (int i=2; i<n1;i++){
            if(esPrimo){
                if(n1%i==0){
                    esPrimo=false;
                }
            }
        }
        return esPrimo;
    }
    private static void numPrimos(){
        boolean esPrimo=true;
        for (int i=2; i<100;i++){
            for(int j=2;j<i;j++){
                if(esPrimo) {
                    if (i % j == 0) {
                        esPrimo = false;
                    }
                }
                if(j==i-1 && esPrimo){
                    System.out.println(i);
                }
            }
            esPrimo=true;
        }
    }
}
