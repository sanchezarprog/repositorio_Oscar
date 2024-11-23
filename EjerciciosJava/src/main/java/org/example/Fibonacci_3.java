package org.example;

public class Fibonacci_3 {
    public static void main(String[] args){
        long n1=0;
        long n2=1;
        System.out.println(n1);
        System.out.println(n2);
        for(int i=0;i<48;i++){
            long resultado=n1+n2;
            System.out.println(resultado);
            n1=n2;
            n2=resultado;
        }
    }
}
