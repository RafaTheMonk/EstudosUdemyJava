package vetores;

import java.util.Scanner;

import entidades.Quarto;

public class Vetor6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Quarto[] vect = new Quarto[10];
		
		System.out.println("How mmany rooms will be rented?");
		int qtdQuartos = sc.nextInt();
		
		for(int x = 0; x < qtdQuartos; x++) {
			sc.nextLine();
			System.out.println("Rent #" + (x+1));
			System.out.println("Name: ");
			String name = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.nextLine();
			System.out.println("Room: ");
			int quarto = sc.nextInt();
			
			vect[quarto] = new Quarto(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		for(int x = 0; x < vect.length; x++) {
			if(vect[x] != null) {
			System.out.println(x + ": " + vect[x]);
			}
		}
		sc.close();
	}

}
