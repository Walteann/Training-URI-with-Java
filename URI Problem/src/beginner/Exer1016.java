
package beginner;
import java.util.Scanner;
public class Exer1016 {
    public static void main(String[] args) {
        int km,min;
        Scanner ler = new Scanner(System.in);
        km = ler.nextInt();
        min = (60 * km)/30;
        System.out.println(min+" minutos");
    }
}
