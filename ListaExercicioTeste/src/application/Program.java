package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		for (int i = 0; i < 2; i++) {
			System.out.print("Id ");
			int id = sc.nextInt();
			System.out.print("Name ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Altura ");
			double altura = sc.nextDouble();
			System.out.print("Idade ");
			int idade = sc.nextInt();
			Employee emp = new Employee(id, name, altura, idade);
			list.add(emp);
			System.out.println("------------------");
		}

		// Para fazer com que o for each imprima corretamente a lista abaixo, precisei
		// fazer um toString na classe Employee
		for (Employee correLista : list) {
			System.out.println(correLista);
		}

		sc.close();

	}

}
