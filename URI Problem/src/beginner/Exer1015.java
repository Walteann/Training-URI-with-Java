
package beginner;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Exer1015 {
    public static void main(String[] args) {
        double p1x1,p1y1,p2x2,p2y2,distancia;
        Scanner ler = new Scanner(System.in);
        p1x1 = ler.nextDouble();
        p1y1 = ler.nextDouble();
        p2x2 = ler.nextDouble();
        p2y2 = ler.nextDouble();
        
        distancia = sqrt(pow((p2x2 - p1x1),2) + pow((p2y2 - p1y1),2));
        System.out.printf("%.4f\n",distancia);
        
    }
}
