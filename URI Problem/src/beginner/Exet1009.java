
package beginner;
import java.util.Scanner;
public class Exet1009 {
    public static void main(String[] args) {
    String nome;
    double salFixo,totalVendas,totalSalario;
    Scanner input = new Scanner(System.in);
    nome = input.next();
    salFixo = input.nextDouble();
    totalVendas = input.nextDouble();
    
    totalSalario = ((totalVendas*15)/100)+salFixo;
    
    System.out.printf("TOTAL = R$ %.2f\n",totalSalario);
    }
    
    
}
