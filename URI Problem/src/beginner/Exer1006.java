
package beginner;
import java.util.Scanner;
import java.util.Locale;
public class Exer1006 {
    public static void main(String[] args) {
        double A,B,C,MEDIA;
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);
        A = leia.nextDouble();
        B = leia.nextDouble();
        C = leia.nextDouble();
        
        MEDIA = (A*2 + B*3 + C*5)/10;
        System.out.printf("MEDIA = %.1f\n",MEDIA);
    }
}
