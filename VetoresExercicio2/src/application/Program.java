package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		 * Faça um programa que leia N números reais e armazene-os em um vetor. Em
		 * seguida: - Imprimir todos os elementos do vetor - Mostrar na tela a soma e a
		 * média dos elementos do vetor
		 */

		int n = sc.nextInt();
		double soma = 0.0;
		double media = 0.0;
		double[] vect = new double[n];
		
		for(int i=0; i<vect.length;i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		System.out.println();
		System.out.print("Valores = ");
		
		for (int i=0; i<vect.length; i++) {
			System.out.printf("%.1f ", vect[i]);
			soma += vect[i];
			media += vect[i] / vect.length;
		}
		
		System.out.println();
		System.out.printf("Soma = %.2f%n", soma);
		System.out.printf("Media = %.2f%n", media);
		sc.close();
	}

}
