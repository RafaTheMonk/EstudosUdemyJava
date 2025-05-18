package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vetor1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de posicoes");
		int qtd = sc.nextInt();
		double[] vect = new double[qtd];
		
		for(int x = 0; x < qtd; x++) {
			vect[x] = sc.nextDouble();
		}
		
		double sum = 0.0;
		for(int x = 0; x < qtd; x++) {
			sum += vect[x];
		}
		double avg = sum/qtd;
		
		System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
	
		sc.close();
	}
}
