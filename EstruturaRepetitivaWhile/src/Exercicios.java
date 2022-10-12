import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.print(i);
			System.out.print(" " + i*i + " ");
			System.out.println(i*i*i);
		}
		
		
		sc.close();
	}

}



/*
 * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a
 * seguir. Cada caso de teste consiste de 3 valores reais, cada um deles com uma
 * casa decimal. Apresente a média ponderada para cada um destes conjuntos de 3
 * valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e
 * o terceiro valor tem peso 5.
 * 
 * Locale.setDefault(Locale.US);
 * Scanner sc = new Scanner(System.in);
 * 
 * int n = sc.nextInt();
 * 
 * double media;
 * 
 * for(int i=0; i<n; i++) { double v1 = sc.nextDouble(); double v2 =
 * sc.nextDouble(); double v3 = sc.nextDouble(); media = (v1 * 2.0 + v2 * 3.0 +
 * v3 * 5.0) / 10; System.out.printf("%.1f%n", media);
 * 
 * }
 * 
 * sc.close();
 */

/*
 * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X
 * que serão lidos em seguida. Mostre quantos destes valores X estão dentro do
 * intervalo [10,20] e quantos estão fora do intervalo, mostrando essas
 * informações conforme exemplo (use a palavra "in" para dentro do intervalo, e
 * "out" para fora do intervalo).
 * 
 * Scanner sc = new Scanner(System.in);
 * 
 * 
 * int n = sc.nextInt(); int in = 0; int out = 0;
 * 
 * for(int i=0; i<n; i++) { int x = sc.nextInt(); if(x>=10 && x<=20) { in = in +
 * 1; } else { out = out + 1; } }
 * 
 * System.out.println(in + " in"); System.out.println(out + " out");
 * 
 * sc.close();
 */

/*
 * Leia um valor inteiro X. Em seguida mostre os ímpares de 1 até X, um valor
 * por linha, inclusive o X, se for o caso
 * 
 * Scanner sc = new Scanner(System.in);
 * 
 * int x = sc.nextInt();
 * 
 * for (int i=1; i<=x; i++) { if(i % 2 != 0) { System.out.println(i); }
 * 
 * }
 * 
 * sc.close();
 */

/*
 * ***********WHILE WHILE WHILE WHILE WHILE WHILE WHILE********************
 * *****************************************************************************
 * ********** Escreva um programa que repita a leitura de uma senha até que ela
 * seja válida. Para cada leitura de senha incorreta informada, escrever a
 * mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
 * impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que
 * a senha correta é o valor 2002.
 * 
 * Scanner sc = new Scanner (System.in);
 * 
 * int senha = sc.nextInt();
 * 
 * while(senha != 2002) { System.out.println("Senha Invalida"); senha =
 * sc.nextInt(); } System.out.println("Acesso Permitido");
 * 
 * sc.close();
 */

/*
 * *****************************************************************************
 * ********** Escreva um programa para ler as coordenadas (X,Y) de uma
 * quantidade indeterminada de pontos no sistema cartesiano. Para cada ponto
 * escrever o quadrante a que ele pertence. O algoritmo será encerrado quando
 * pelo menos uma de duas coordenadas for NULA (nesta situação sem escrever
 * mensagem alguma).
 * 
 * Scanner sc = new Scanner(System.in);
 * 
 * int x = sc.nextInt(); int y = sc.nextInt();
 * 
 * while (x != 0 && y != 0) { if (x > 0 && y > 0) {
 * System.out.println("Primeiro"); } else if (x < 0 && y > 0) {
 * System.out.println("Segundo"); } else if (x < 0 && y < 0) {
 * System.out.println("Terceiro"); } else { System.out.println("Quarto"); } x =
 * sc.nextInt(); y = sc.nextInt(); }
 * 
 * sc.close();
 */
/*
 * *****************************************************************************
 * ********** Um Posto de combustíveis deseja determinar qual de seus produtos
 * tem a preferência de seus clientes. Escreva um algoritmo para ler o tipo de
 * combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina
 * 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de
 * 1 a 4) deve ser solicitado um novo código (até que seja válido). O programa
 * será encerrado quando o código informado for o número 4. Deve ser escrito a
 * mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada
 * tipo de combustível, conforme exemplo. Scanner sc = new Scanner(System.in);
 * 
 * int combust = 0; int alcool = 0; int gasolina = 0; int diesel = 0;
 * 
 * while (combust != 4) { combust = sc.nextInt(); if (combust == 1) { alcool +=
 * 1; } else if (combust == 2) { gasolina += 1; } else if(combust == 3){ diesel
 * += 1; } }
 * 
 * System.out.println("MUITO OBRIGADO"); System.out.println("Alcool:" + alcool);
 * System.out.println("Gasolina:" + gasolina); System.out.println("Diesel:" +
 * diesel);
 * 
 * sc.close();
 */