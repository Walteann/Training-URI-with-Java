import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
    Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("####.00");
		double aumento, novoSalario;
		double salario = in.nextDouble();
		if (salario >= 0.0 && salario <= 400.00) {
			aumento = (salario * 15) / 100;
			novoSalario = aumento + salario;
			System.out.println("Novo salario: " + df.format(novoSalario));
			System.out.println("Reajuste ganho: " + df.format(aumento));
			System.out.println("Em percentual: 15 %");
		} else if (salario > 400.00 && salario < 800.01) {
			aumento = (salario * 12) / 100;
			novoSalario = aumento + salario;
			System.out.println("Novo salario: " + df.format(novoSalario));
			System.out.println("Reajuste ganho: " + df.format(aumento));
			System.out.println("Em percentual: 12 %");
		} else if (salario > 800.00 && salario < 1200.01) {
			aumento = (salario * 10) / 100;
			novoSalario = aumento + salario;
			System.out.println("Novo salario: " + df.format(novoSalario));
			System.out.println("Reajuste ganho: " + df.format(aumento));
			System.out.println("Em percentual: 10 %");
		} else if (salario > 1200.00 && salario < 2000.01) {
			aumento = (salario * 7) / 100;
			novoSalario = aumento + salario;
			System.out.println("Novo salario: " + df.format(novoSalario));
			System.out.println("Reajuste ganho: " + df.format(aumento));
			System.out.println("Em percentual: 7 %");
		} else if (salario > 2000.00) {
			aumento = (salario * 4) / 100;
			novoSalario = aumento + salario;
			System.out.println("Novo salario: " + df.format(novoSalario));
			System.out.println("Reajuste ganho: " + df.format(aumento));
			System.out.println("Em percentual: 4 %");
		}
 
    }
 
}
