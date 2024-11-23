package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class FizzBuzz_1 {
    public static void main(String[] args) {

        for (int i=1; i<=100;i++){
            //Declararamos variable booleanas y alteramos su valor en cada caso
            boolean multiplo3, multiplo5;
            if(i%3==0){
                multiplo3=true;
            }else{
                multiplo3=false;
            }if(i%5==0){
                multiplo5=true;
            }else{
                multiplo5=false;
            }
            //Imprimimos el resultado por pantalla
            if(multiplo3 && multiplo5){
                System.out.println("fizzbuzz");
            }else if(multiplo3){
                System.out.println("fizz");
            }else if(multiplo5){
                System.out.println("buzz");
            }else{
                System.out.println(i);
            }
        }
        System.out.println("Probando ");
    }
}