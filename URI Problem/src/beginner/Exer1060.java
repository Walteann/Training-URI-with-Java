import java.io.IOException;
 
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       int contador = 0;
       double[] numeros = new double[6];
        for(int i =0;i<numeros.length;i++){
            numeros[i] = ler.nextDouble();
        }
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] >= 0){
                contador++;
            }
        }
        System.out.println(contador + " valores positivos");
     
     
      
     
    }

}
