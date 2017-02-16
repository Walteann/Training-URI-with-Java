import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int X = ler.nextInt();
		int Y = ler.nextInt();
		int tempo = (24 - X)+(Y - 24) + 24;
		int tempo2 = (24 - X)+(Y - 24) + 24 - 24;
		if(X > Y || X == Y){
		    System.out.println("O JOGO DUROU "+tempo+" HORA(S)");
		}else if(X < Y){
		    System.out.println("O JOGO DUROU "+tempo2+" HORA(S)");
		}
	}
}	
