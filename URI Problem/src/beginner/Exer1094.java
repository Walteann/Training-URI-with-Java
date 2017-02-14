/*VALE RESALTAR QUE, EXISTE UMA MANEIRA MAIS FACIL DE FAZER ESSA QUESTÃO, EU UTILIZEI DOIS ARRAY,
POREM É POSSIVEL FAZER SEM UTILIZAR ARRAYS"NOTA COM ARRAY FICA MAIS COMPLICADO EU ACHO". WALTEANN.
*/

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.00");
		int casos = ler.nextInt();
		int[] cobaias = new int[casos];
		String[] tipoCobaias = new String[casos];
		
		double contC = 0, contR = 0, contS = 0;
		int totalCobaias = 0;
		
		for( int i = 0; i < cobaias.length; i++){
			cobaias[i] = ler.nextInt();
			tipoCobaias[i] = ler.next();
			
		}
		
		for( int k = 0; k < casos; k++){
			if(tipoCobaias[k].equals("C")){
				
				contC = contC +  cobaias[k];
			}else if(tipoCobaias[k].equals("R")){
				
				contR = contR + cobaias[k];
			}else if(tipoCobaias[k].equals("S")){
				
				contS = contS + cobaias[k];
			}
			totalCobaias = totalCobaias + cobaias[k];
		}
		
		double porC = contC * 100/ totalCobaias;
		double porR = contR * 100/ totalCobaias;
		double porS = contS * 100/ totalCobaias;
		
		System.out.println("Total: "+totalCobaias+" cobaias");
		System.out.printf("Total de coelhos: %.0f\n",contC);
		System.out.printf("Total de ratos: %.0f\n",contR);
		System.out.printf("Total de sapos: %.0f\n",contS);
		System.out.println("Percentual de coelhos: "+df.format(porC)+" %");
		System.out.println("Percentual de ratos: "+df.format(porR)+" %");
		System.out.println("Percentual de sapos: "+df.format(porS)+" %");
		
		ler.close();
 
    }
 
}
