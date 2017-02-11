import java.io.IOException;
 
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
     
    int x = ler.nextInt();
        for( int i = 1; i <= x; i++){
            if(i%2==1){
                System.out.println(i);
            }
        }
    }

}
