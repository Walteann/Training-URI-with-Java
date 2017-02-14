import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
       Scanner ler = new Scanner(System.in);
		int N = ler.nextInt();
			for(int i = 1; i <=N;i++){
				System.out.println(i+" "+i*i+" "+i*i*i);
				System.out.println(i+" "+(i*i+1)+" "+(i*i*i+1));
			}
		
		
		ler.close();
 
    }
 
}
