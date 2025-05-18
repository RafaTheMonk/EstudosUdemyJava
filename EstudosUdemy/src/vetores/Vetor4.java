package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vetor4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("DIGITE O TAMANHO DA LISTA: ");
		int qtd = sc.nextInt();
		double[] lista = new double[qtd];
		
		for(int x = 0; x < lista.length; x++) {
			lista[x] = sc.nextDouble();
		}
		
		double sum = 0.0;
		for(int x = 0; x < lista.length; x++) {
			sum += lista[x];
		}
		
		double media = sum/qtd;
		
		System.out.printf("SOMA: %.2f%n", sum);
		System.out.printf("MEDIA: %.2f%n", media);
		
		sc.close();
	}

}
