import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
		int valor = ler.nextInt();
		
		int qtos100 = valor/100;
		int resto100 = valor%100;
		int qtos50 = resto100/50;
		int resto50 = resto100%50;
		int qtos20 = resto50/20;
		int resto20 = resto50%20;
		int qtos10 = resto20/10;
		int resto10 = resto20%10;
		int qtos5 = resto10/5;
		int resto5 = resto10%5;
		int qtos2 = resto5/2;
		int resto2 = resto5%2;
		int qtos1 = resto2/1;
		
		
		System.out.println(valor);
		System.out.println(qtos100+" nota(s) de R$ 100,00");
		System.out.println(qtos50+" nota(s) de R$ 50,00");
		System.out.println(qtos20+" nota(s) de R$ 20,00");
		System.out.println(qtos10+" nota(s) de R$ 10,00");
		System.out.println(qtos5+" nota(s) de R$ 5,00");
		System.out.println(qtos2+" nota(s) de R$ 2,00");
		System.out.println(qtos1+" nota(s) de R$ 1,00");
 
    }
 
}
