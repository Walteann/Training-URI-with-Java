import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
         Scanner ler = new Scanner(System.in);
	    int senha;
	    boolean acessoPermitido = false;
	    
	    do{
	        senha = ler.nextInt();
	        if(senha == 2002){
	            System.out.println("Acesso Permitido");
	            acessoPermitido = true;
	        }else{
	            System.out.println("Senha Invalida");
	            acessoPermitido = false;
	        }
	        
	        
	    }while(acessoPermitido!=true);
 
    }
 
}
