package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Quartos;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Quartos[] vect = new Quartos[10];

		System.out.print("Quantos quartos serão alugados? ");
		int qtdLocacao = sc.nextInt();
		System.out.println();

		for (int i = 0; i < qtdLocacao; i++) {
			System.out.printf("Aluguel #%d%n", i + 1);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			System.out.println();
			vect[quarto] = new Quartos(nome, email);
		}

		System.out.println("Quartos ocupados:");
		for (int i = 0; i < vect.length; i++) {
			if(vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}

		sc.close();

	}

}
