import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner in = new Scanner(System.in);
		String filo = in.next();
		String classe = in.next();
		String alimentacao = in.next();

		if (filo.equals("vertebrado") && classe.equals("ave") && alimentacao.equals("carnivoro")) {
			System.out.println("aguia");
		} else if (filo.equals("vertebrado") && classe.equals("ave") && alimentacao.equals("onivoro")) {
			System.out.println("pomba");
		} else if (filo.equals("vertebrado") && classe.equals("mamifero") && alimentacao.equals("onivoro")) {
			System.out.println("homem");
		} else if (filo.equals("vertebrado") && classe.equals("mamifero") && alimentacao.equals("herbivoro")) {
			System.out.println("vaca");
		} else if (filo.equals("invertebrado") && classe.equals("inseto") && alimentacao.equals("hematofago")) {
			System.out.println("pulga");
		} else if (filo.equals("invertebrado") && classe.equals("inseto") && alimentacao.equals("herbivoro")) {
			System.out.println("lagarta");
		} else if (filo.equals("invertebrado") && classe.equals("anelideo") && alimentacao.equals("hematofago")) {
			System.out.println("sanguessuga");
		} else if (filo.equals("invertebrado") && classe.equals("anelideo") && alimentacao.equals("onivoro")) {
			System.out.println("minhoca");
		}

		in.close();
 
    }
 
}
