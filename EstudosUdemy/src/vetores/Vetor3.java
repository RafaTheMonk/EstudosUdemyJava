package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vetor3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		System.out.println("Digite o tamanho da lista: ");
		int qtd = sc.nextInt();
		int[] lista = new int[qtd];
		
		for(int x = 0; x < lista.length; x++) {
			lista[x] = sc.nextInt();
		}
		System.out.println("NUMEROS NEGATIVOS: ");
		for(int x = 0; x < lista.length; x++) {
			if(lista[x] < 0) {
				System.out.println(lista[x]);
			}
		}
		
		sc.close();
	}

}
