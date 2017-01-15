
package beginner;
import java.util.Scanner;
public class Exer1010 {
    public static void main(String[] args) {
        int peca1,peca2,nPeca1,nPeca2;
        double valorUnit1,valorUnit2,Total;
        Scanner ler = new Scanner(System.in);
         peca1 = ler.nextInt();
         nPeca1 = ler.nextInt();
         valorUnit1 = ler.nextDouble();
         
         peca2 = ler.nextInt();
         nPeca2 = ler.nextInt();
         valorUnit2 = ler.nextDouble();
         
         Total = ((nPeca1 * valorUnit1) + (nPeca2 * valorUnit2));
         System.out.printf("VALOR A PAGAR: R$ %.2f\n",Total);
    }
}
