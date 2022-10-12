import java.util.Locale;
import java.util.Scanner;

public class Revisao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int minutos = sc.nextInt();
		double valor = 50.00;
		
		if(minutos > 100) {
			valor = (minutos - 100) * 2.0 + 50.00;
			System.out.printf("Valor a pagar: R$ %.2f%n", valor);
		}
		else {
			System.out.println("Valor a pagar: R$ 50.00");
		}
		
		
		
		sc.close();

	}

}
