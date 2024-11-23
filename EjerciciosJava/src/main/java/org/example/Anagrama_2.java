package org.example;

import java.util.Scanner;

public class Anagrama_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word1=sc.nextLine();
        String word2=sc.nextLine();
        boolean anagrama=esAnagrama(word1,word2);
        System.out.println((anagrama ? "Es un anagrama":"No es un anagrama"));
    }
    private static boolean esAnagrama(String word1, String word2){
        boolean anagrama = false;
        boolean yaContado=false;    //Booleano que nos haga salir del contador una vez hayamos visto que coincide una letra
        int count=0;  //Un contador que cuenta la cantidad de veces que la letra de la palabra a y b coinciden

            if (!word1.equals(word2) && word1.length()==word2.length()){
                for(int i=0;i<word1.length();i++){
                    for (int j=0;j<word2.length();j++){
                        if(word1.charAt(i)==word2.charAt(j) && !yaContado) {
                            count++;
                            yaContado=true;
                        }
                    }
                    yaContado=false;
                }
            }
            if (count==word1.length()){
                anagrama=true;
            }
        return anagrama;
    }
}
