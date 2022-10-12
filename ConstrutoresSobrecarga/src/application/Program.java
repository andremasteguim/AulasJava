package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter account number: ");
		int numberAccount = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine(); // esse nextLine serve para consumir a quebra de linha que ficou pendente.
		String name = sc.nextLine();
		
		Conta conta = new Conta(numberAccount, name);
		
		System.out.print("Is there na initial deposit (y/n)? ");
		char resp = sc.next().charAt(0);
		double deposito;
		if(resp == 'y') {
			System.out.print("Enter initial deposit value: ");
			deposito = sc.nextDouble();
			conta.deposito(deposito);
		}
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		deposito = sc.nextDouble();
		conta.deposito(deposito);
		System.out.println("Updated account data: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double saque = sc.nextDouble();
		conta.saque(saque);
		System.out.println("Updated account data: ");
		System.out.println(conta);
		
		sc.close();
	}

}
