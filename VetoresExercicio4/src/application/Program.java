package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		 * Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas.
		 * Fazer um programa que calcule e escreva a maior e a menor altura do grupo, a
		 * média de altura das mulheres, e o número de homens.
		 */

		double menorAltura, maiorAltura, mediaAlturaF;
		int quantidadeMasculino, quantidadeFeminino;

		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();

		Pessoa[] vect = new Pessoa[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.printf("Altura da %da pessoa: ", i + 1);
			double altura = sc.nextDouble();
			System.out.printf("Genero da %da pessoa: ", i + 1);
			char genero = sc.next().charAt(0);
			vect[i] = new Pessoa(altura, genero);
		}

		menorAltura = vect[0].getAltura();
		for (int i = 1; i < vect.length; i++) {
			if (menorAltura > vect[i].getAltura()) {
				menorAltura = vect[i].getAltura();
			}

		}

		maiorAltura = vect[0].getAltura();
		for (int i = 1; i < vect.length; i++) {
			if (maiorAltura < vect[i].getAltura()) {
				maiorAltura = vect[i].getAltura();
			}

		}

		mediaAlturaF = 0.0;
		quantidadeFeminino = 0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getGenero() == 'F') {
				mediaAlturaF += vect[i].getAltura();
				quantidadeFeminino += 1;
			}
		}
		mediaAlturaF = mediaAlturaF / quantidadeFeminino;

		quantidadeMasculino = 0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getGenero() == 'M') {
				quantidadeMasculino += 1;
			}
		}

		System.out.printf("Menor altura = %.2f%n", menorAltura);
		System.out.printf("Maior altura = %.2f%n", maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f%n", mediaAlturaF);
		System.out.println("Numero de Homens = " + quantidadeMasculino);

		sc.close();
	}

}
