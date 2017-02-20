import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner ler = new Scanner(System.in);
	    int N = ler.nextInt();
	    double media1,media2,media3,soma;
	    for(int i = 0 ; i < N; i++){
	        media1 = ler.nextDouble();
	        media2 = ler.nextDouble();
	        media3 = ler.nextDouble();
	        
	        soma = ((media1 * 2) + ( media2 * 3) + ( media3 * 5))/10;
	        
	        System.out.printf("%.1f\n",soma);
	    }
 
    }
 
}
