
package beginner;
import static java.lang.Math.pow;
import java.util.Scanner;
public class Exer1011 {
    public static void main(String[] args) {
        Scanner ler =  new Scanner(System.in);
        double pi,raio,volume;
        pi = 3.14159;
        raio = ler.nextDouble();
        volume = (4.0/3)*pi*pow(raio,3);
        System.out.printf("VOLUME = %.3f\n",volume);
    }
}
