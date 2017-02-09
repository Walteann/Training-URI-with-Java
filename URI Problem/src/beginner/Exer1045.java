import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
    Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		double[] triangulo = new double[3];
		triangulo[0] = in.nextDouble();
		triangulo[1] = in.nextDouble();
		triangulo[2] = in.nextDouble();

		double aux;
		boolean trocar = true;
	                                              // joga os valores no array, para poder ordena os valores
		while (trocar == true) {
			trocar = false;
			for (int i = 0; i < 2; i++) {
				if (triangulo[i] > triangulo[i + 1]) {
					aux = triangulo[i];
					triangulo[i] = triangulo[i + 1];
					triangulo[i + 1] = aux;
					trocar = true;
				}
			}
		}
                                                // depois colocar eles em ordem decrescente.
		double A = triangulo[2];
		double B = triangulo[1];
		double C = triangulo[0];
		
		if( A >= B + C){
			System.out.println("NAO FORMA TRIANGULO");
		}else{
			if(A * A == B * B + C * C){
				System.out.println("TRIANGULO RETANGULO");
			}else if(A * A > B * B + C * C){
				System.out.println("TRIANGULO OBTUSANGULO");
			}else{
				System.out.println("TRIANGULO ACUTANGULO");
			}
		}
		if(A==B && B==C){
			System.out.println("TRIANGULO EQUILATERO");
		}else if(A==B || A==C || B==C){
			System.out.println("TRIANGULO ISOSCELES");
		}
		in.close();
 
    }
 
}
