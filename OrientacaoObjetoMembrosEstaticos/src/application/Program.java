package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a cotação do dolar? ");
		double cotacao = sc.nextDouble();
		System.out.print("Quantos dolar deseja comprar? ");
		double quantidade = sc.nextDouble();
		double result = CurrencyConverter.dollarToReal(quantidade, cotacao);
		System.out.printf("Valor total a pagar em reais = %.2f%n", result);
		
		sc.close();
	}

}
