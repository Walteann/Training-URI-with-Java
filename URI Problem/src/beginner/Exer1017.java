import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
         Scanner ler = new Scanner (System.in);
      Locale.setDefault(Locale.US);
      int horas = ler.nextInt();
      int velocidade = ler.nextInt();
      
      double distancia = horas * velocidade;
      double qtdLitros = distancia / 12;
      
      System.out.printf("%.3f\n",qtdLitros);
 
    }
 
}
