import java.io.IOException;
 

 
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1, n2, n3;
        int numeros[] = new int[3];
        n1 = ler.nextInt();
        n2 = ler.nextInt();
        n3 = ler.nextInt();

        numeros[0] = n1;
        numeros[1] = n2;
        numeros[2] = n3;

        boolean trocar = true;
        while (trocar == true) {
            trocar = false;
            for (int contador = 0; contador < 2; contador++) {
                if (numeros[contador] > numeros[contador + 1]) {
                    int aux = numeros[contador];
                    numeros[contador] = numeros[contador + 1];
                    numeros[contador + 1] = aux;
                    trocar = true;
                }
            }
        }
        
        for(int i = 0;i <3 ; i++){
        System.out.println(numeros[i]);
    }
        System.out.println("\n"+n1+"\n"+n2+"\n"+n3);

    }

}
