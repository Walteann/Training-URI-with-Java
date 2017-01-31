import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
      Scanner ler = new Scanner(System.in);
		int idade = ler.nextInt();
		int ano = idade/365;
		int meses = (idade%365)/30;
		int dias = idade%365%30;
		
		System.out.println(ano + " ano(s)");
		System.out.println(meses + " mes(es)");
		System.out.println(dias + " dia(s)");
 
    }
 
}
