package beginner;
import static java.lang.Math.pow;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;


public class Exer1002 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // para aceitar (.) no lugar de (,)
        double raio,pi,area;
        pi = 3.14159;
        Scanner input = new Scanner(System.in);
        raio = input.nextDouble();
        area = pi*pow(raio,2);
        DecimalFormat df = new DecimalFormat("####.0000"); // Formatar para coloca quatro casas decimais depois da virgula.
        System.out.println("A="+df.format(area));
    }
}
