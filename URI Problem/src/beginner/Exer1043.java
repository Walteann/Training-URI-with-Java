import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        double A,B,C,p,area;
         Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);
        A = ler.nextDouble();
        B = ler.nextDouble();
        C = ler.nextDouble();
        
            if( A + B > C && A + C > B && B + C > A){
                p = A + B + C;
                System.out.printf("Perimetro = %.1f\n",p);

            }else {
                area = ((A + B)* C) /2;
                System.out.printf("Area = %.1f\n",area);
            }
 
    }
 
}
