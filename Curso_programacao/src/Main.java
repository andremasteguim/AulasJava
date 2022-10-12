import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		double x = 10.35789;
		String nome = "Luana";
		int idade = 28;
		double renda = 5000.0;
		
		//System.out.println(x);
		//System.out.printf("%.2f%n", x);
		//System.out.printf("%.4f%n", x);
		//Locale.setDefault(Locale.US);
		//System.out.printf("%.4f%n", x);
		//System.out.println("Resultado = " + x + " Metros");
		//System.out.printf("Resultado = %.2f Metros %n", x);
		//System.out.println("Resultado = " + x + " Metros");
		//System.out.printf("teste");
		//Locale.setDefault(Locale.US);
		//System.out.printf("%s tem %d anos e recebe R$%.2f %n", nome, idade, renda);
		
		String product1 = "Computador";
		String product2 = "Office desk";
		
		int age = 28;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Produtos:");
		System.out.printf("%s, cujo preço é R$ %.2f%n", product1, price1);
		System.out.printf("%s, cujo preço é R$ %.2f%n", product2, price2);
		System.out.println();
		System.out.printf("Registro: %d anos, código: %d e genero: %c%n", age, code, gender);
		System.out.println();
		System.out.printf("Medida com oito casas decimais: %.8f%n", measure);
		System.out.printf("Arredondado (Tres casas decimais): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("Ponto decimal dos EUA: %.3f%n", measure);
		
	}

}
