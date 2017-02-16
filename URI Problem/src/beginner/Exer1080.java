import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner ler = new Scanner(System.in);
        int N,maior = -1;
        int indice = -1;
        for(int i = 0; i < 100; i++){
            N = ler.nextInt();
                if(N > maior){
                    maior = N;
                    indice = i;
                }
        }
        System.out.println(maior);
        System.out.println(indice + 1);
 
    }
 
}
