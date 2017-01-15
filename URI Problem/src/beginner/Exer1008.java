package beginner;

import java.util.Scanner;
import java.util.Locale;

public class Exer1008 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int numero, horas;
        double vSal, NovoSalario;
        numero = ler.nextInt();
        horas = ler.nextInt();
        vSal = ler.nextDouble();
        
        NovoSalario = horas * vSal;
        
        System.out.println("NUMBER = "+numero);
        System.out.printf("SALARY = U$ %.2f\n",NovoSalario);
        
        
        
        
    }
}
