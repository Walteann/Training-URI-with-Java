import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner ler = new Scanner(System.in);
		
		int N = ler.nextInt();
		int cont = 0;
		
		for(int j = 1 ; j <=N*4; j++){
		
				if(j%4==0){
					System.out.println("PUM");
				}else{
					System.out.print(j+" ");
				}
			}
 
    }
 
}
