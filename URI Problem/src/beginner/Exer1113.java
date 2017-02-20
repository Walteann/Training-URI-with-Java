import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
         Scanner ler = new Scanner(System.in);
	    int X,Y;
	    boolean acessoPermitido = false;
	    
	    do{
	        X = ler.nextInt();
	        Y = ler.nextInt();
	        if(X == Y){
	            acessoPermitido = true;
	        }else if(X > Y){
	            System.out.println("Decrescente");
	            acessoPermitido = false;
	        }else if(X < Y){
	            System.out.println("Crescente");
	        }
	        
	        
	    }while(acessoPermitido!=true);
 
    }
 
}
