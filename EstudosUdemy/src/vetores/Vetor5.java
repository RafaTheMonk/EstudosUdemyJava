package vetores;

import java.util.Locale;
import java.util.Scanner;

import entidades.Pessoas;

public class Vetor5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Quantas pessoas serao digitadas? ");
		int qtd = sc.nextInt();
		Pessoas[] vetor = new Pessoas[qtd];
		
		for(int x = 0; x < vetor.length; x++) {
			sc.nextLine();
			System.out.println("Dados da " + (x+1) + "ª pessoa");
			System.out.println("Nome: ");
			String nome = sc.nextLine();
			System.out.println("Idade: ");
			int idade = sc.nextInt();
			System.out.println("Altura: ");
			double altura = sc.nextDouble();
			
			vetor[x] = new Pessoas(nome, idade, altura);
		}
		
		double sum = 0.0;
		int menor = 0;
		for(int x = 0; x < vetor.length; x++) {
			sum += vetor[x].getAltura();
			if(vetor[x].getIdade() < 16) {
				menor++;
			}
		}
		double media = sum/qtd;
		double porcentagem = menor * 100.0 / vetor.length;
		System.out.printf("Media da altura das pessoas: %.2f%n", media);
		System.out.println("Porcentagem de pessoas menores que 16 anos: " + porcentagem + "%");
		
		sc.close();
	}

}
