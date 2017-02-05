import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
         int A,B;
        Scanner ler = new Scanner(System.in);
        
        A = ler.nextInt();
        B = ler.nextInt();
     
            if( A > B){
                if(A%B==0){
                    System.out.println("Sao Multiplos");
                }else{
                    System.out.println("Nao sao Multiplos");
                }
            }else{
                if(B%A==0){
                    System.out.println("Sao Multiplos");
                }else{
                     System.out.println("Nao sao Multiplos");
                }
            }
 
    }
 
}
