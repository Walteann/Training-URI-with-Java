import java.io.IOException;
 
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
     
    int x = ler.nextInt();
    
        if(x%2==0){                                 // Primeiro vc tem q testa se o x é par..
            for(int i = x ;i < x+12; i++){          // caso sim, então é preciso coloca +12 para poder imprimir os 6 numeros impares
                if(i%2==1){
                    System.out.println(i);
                }
            }
        }else{                                // Agora se x for impar, é preciso coloca x+11,logo ele vaiimprimir ele e + 5 nº impares
            for(int i = x ;i < x+11; i++){
                if(i%2==1){
                    System.out.println(i);
                }
        }

}
}
}
