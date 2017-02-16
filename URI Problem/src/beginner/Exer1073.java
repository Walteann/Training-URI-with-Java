import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner tec = new Scanner(System.in);
	        int N = tec.nextInt();
	            for(int i = 2 ;i <= N; i++){
	                if(i%2==0){
	                   System.out.println(i+"^2 = "+i*i);
	                }
	            }
		

	}

}
