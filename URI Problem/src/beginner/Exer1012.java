
package beginner;
import java.util.Scanner;
public class Exer1012 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double A,B,C;
        A = ler.nextDouble();
        B = ler.nextDouble();
        C = ler.nextDouble();
        double aTriangulo = (A * C)/2;
        double aCirculo = 3.14159*C*C;
        double aTrapezio = C*(A+B)/2;
        double aQuadrado = B*B;
        double aRetangulo = A * B;
        
        System.out.printf("TRIANGULO: %.3f\n", aTriangulo);
        System.out.printf("CIRCULO: %.3f\n", aCirculo);
        System.out.printf("TRAPEZIO: %.3f\n", aTrapezio);
        System.out.printf("QUADRADO: %.3f\n", aQuadrado);
        System.out.printf("RETANGULO: %.3f\n", aRetangulo);
    }
}
