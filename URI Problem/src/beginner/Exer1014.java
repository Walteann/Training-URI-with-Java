
package beginner;
import java.util.Scanner;
public class Exer1014 {
    public static void main(String[] args) {
        Scanner ler  =  new Scanner(System.in);
        int X = ler.nextInt();
        double Y = ler.nextDouble();
        System.out.printf("%.3f km/l\n",X/Y);
    }
}
