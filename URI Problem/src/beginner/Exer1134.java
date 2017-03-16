import java.util.Scanner;
public class Main {

	public static void main(String[] args){
		boolean terminar =  true;
		Scanner ler = new Scanner(System.in);
		int numero, gasolina = 0, alcool = 0,diesel = 0;
		do{
			terminar = false;
			numero = ler.nextInt();
			
			switch(numero){
				
			case 1:
				alcool = alcool + 1;
				break;
			case 2:
				gasolina = gasolina + 1;
				break;
			case 3:
				diesel = diesel + 1;
				break;
			case 4:
				terminar = true;
				break;
			
				default:
					break;
			}

		}while(terminar != true);
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: "+alcool);
		System.out.println("Gasolina: "+gasolina);
		System.out.println("Diesel: "+diesel);
		
	}

}
