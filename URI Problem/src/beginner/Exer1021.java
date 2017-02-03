import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
         Scanner ler = new Scanner(System.in);
			double valor = ler.nextDouble();
			int mudar = (int) valor;
			
			int qtos100 =  mudar/100;
			int resto100 = mudar%100;
			int qtos50 = resto100/50;
			int resto50 = resto100%50;
			int qtos20 = resto50/20;
			int resto20 = resto50%20;
			int qtos10 = resto20/10;
			int resto10 = resto20%10;
			int qtos5 = resto10/5;
			int resto5 = resto10%5;
			int qtos2 = resto5/2;
			
			
			double somar = (qtos100 *100.00 + qtos50 * 50.00 + qtos20*20.00 + qtos10*10.00 + qtos5*5.00 + qtos2*2);
			double mudar2 = ( valor - somar) * 100;
			int moedas = (int) mudar2;
			int m100 = moedas/100;
			int r100 = moedas%100;
			int m50 = r100/50;
			int r50 = r100%50;
			int m25 = r50/25;
			int r25 = r50%25;
			int m10 = r25/10;
			int r10 = r25%10;
			int m5 = r10/5;
			int r5 = r10%5;
			int m1 = r5/1;
			

			System.out.println("NOTAS:");
			System.out.println(qtos100+" nota(s) de R$ 100.00");
			System.out.println(qtos50+" nota(s) de R$ 50.00");
			System.out.println(qtos20+" nota(s) de R$ 20.00");
			System.out.println(qtos10+" nota(s) de R$ 10.00");
			System.out.println(qtos5+" nota(s) de R$ 5.00");
			System.out.println(qtos2+" nota(s) de R$ 2.00");
			
			System.out.println("MOEDAS:");
			System.out.println(m100+" moeda(s) de R$ 1.00");
			System.out.println(m50+" moeda(s) de R$ 0.50");
			System.out.println(m25+" moeda(s) de R$ 0.25");
			System.out.println(m10+" moeda(s) de R$ 0.10");
			System.out.println(m5+" moeda(s) de R$ 0.05");
			System.out.println(m1+" moeda(s) de R$ 0.01");
		
		
		
		ler.close();
 
    }
 
}
