
package beginner;

import java.util.Scanner;
import java.util.Locale;
public class Exer1005 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        double nota1,nota2,MEDIA;
        Scanner input =  new Scanner(System.in);
        nota1 = input.nextDouble();
        nota2 = input.nextDouble();
        MEDIA = ((nota1*3.5) + (nota2*7.5))/11;
       
        System.out.printf("MEDIA = %.5f\n",MEDIA); // %.5f\n é pra formatar o decimal com 5 casas decimais e pular linha
        
    }
            
}
