import java.io.IOException;
 


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       int contP = 0,contI = 0,contPositivo = 0,contNegativo = 0;
       int[] numeros = new int[5];
       for(int i = 0; i < numeros.length ; i++){
           numeros[i] = ler.nextInt();
       }
       for(int i = 0; i< numeros.length; i++){
           if(numeros[i]%2==0){
               contP++;
           }else{
               contI++;
           }
           if(numeros[i]>0){
               contPositivo++;
           }else if(numeros[i]<0){
               contNegativo++;
           }
           
       }
       System.out.println(contP+" valor(es) par(es)");
       System.out.println(contI+" valor(es) impar(es)");
       System.out.println(contPositivo+" valor(es) positivo(s)");
       System.out.println(contNegativo+" valor(es) negativo(s)");
     
    }

}
