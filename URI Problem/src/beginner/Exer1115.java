import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
       boolean nulo = true;
		int x,y;
		Scanner ler = new Scanner(System.in);
		do{
			nulo = false;
			x = ler.nextInt();
			y = ler.nextInt();
			if(x == 0 || y == 0){
				nulo = true;
			}else{
				if(x > 0 && y > 0){
					System.out.println("primeiro");
					nulo = false;
				}else if(x < 0 && y > 0 ){
					System.out.println("segundo");
					nulo = false;
				}else if(x < 0 && y < 0){
					System.out.println("terceiro");
					nulo = false;
				}else if(x > 0 && y < 0){
					System.out.println("quarto");
					nulo = false;
				}
			}
			
			
		}while(nulo!=true);

 
    }
 
}
