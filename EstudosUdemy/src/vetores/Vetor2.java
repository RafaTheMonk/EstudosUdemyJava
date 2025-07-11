package vetores;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produtos;

public class Vetor2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int n = sc.nextInt();
		
		Produtos[] vetor = new Produtos[n];
		
		for (int x = 0; x < vetor.length; x++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			
			vetor[x] = new Produtos(name, price);
		}
		
		double sum = 0.0;
		for(int x = 0; x < vetor.length; x++) {
			sum += vetor[x].getPrice();
		}
		double avg = sum/n;
		System.out.printf("AVERAGE PRICE: %.2f%n", avg);
		
		sc.close();
	}

}
