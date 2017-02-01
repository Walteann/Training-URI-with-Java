import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
      	Scanner ler =  new Scanner(System.in);
		
		double A = ler.nextDouble();
		double B = ler.nextDouble();
		double C = ler.nextDouble();
		
		double delta = Math.pow(B, 2) - 4 * A * C;
		
			if(delta == 0 || delta < 0 || A == 0 ){
				System.out.println("Impossivel calcular");
		
			}else{
				double R1 = (-B + Math.sqrt(delta))/ (2 * A);
				double R2 = (-B - Math.sqrt(delta))/ (2 * A);
				System.out.printf("R1 = %.5f\n",R1);
				System.out.printf("R2 = %.5f\n",R2);
			}
			ler.close();
 
    }
 
}
