package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		 * Fazer um programa para ler nome, idade e altura de N pessoas, conforme
		 * exemplo. Depois, mostrar na tela a altura média das pessoas, e mostrar também
		 * a porcentagem de pessoas com menos de 16 anos, bem como os nomes dessas
		 * pessoas caso houver.
		 */

		int n;
		double mediaAltura;
		double idadeMenor16;

		System.out.print("Quantas pessoas serao digitadas? ");
		n = sc.nextInt();

		Pessoa[] vect = new Pessoa[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.printf("Dados da %da pessoa:%n", i + 1);
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			vect[i] = new Pessoa(name, idade, altura);

		}

		mediaAltura = 0.0;
		for (int i = 0; i < vect.length; i++) {
			mediaAltura += vect[i].getAltura();
		}
		mediaAltura = mediaAltura / vect.length;

		idadeMenor16 = 0.0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getIdade() < 16) {
				idadeMenor16 += 1;
			}
		}
		idadeMenor16 = idadeMenor16 / vect.length * 100; // Calculo para saber a porcentagem de idade menor que 16 anos.

		System.out.println();
		System.out.printf("Altura Média: %.2f%n", mediaAltura);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", idadeMenor16);

		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getIdade() < 16) {
				System.out.println(vect[i].getName());
			}
		}

		sc.close();
	}

}
