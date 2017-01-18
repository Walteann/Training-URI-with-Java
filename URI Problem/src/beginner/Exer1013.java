package beginner;
import java.util.Scanner;
public class Exer1013 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a,b,c;
        a = ler.nextInt();
        b = ler.nextInt();
        c = ler.nextInt();
        int ab = (a + b + Math.abs(a - b))/2;
        int abc = (ab + c + Math.abs(ab - c))/2;
        
        System.out.println(abc + " eh o maior");
        
    }
}
