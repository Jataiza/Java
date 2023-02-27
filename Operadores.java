import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// DECLARAÇÃO DAS VARIAVEIS

		int valor1, valor2;
		int resultado1, resultado2, resultado3, resultado4;

		// SOLICITANDO ENTRADA DO USUÁRIO

		System.out.println("Digite o primeiro valor:");
		valor1 = input.nextInt();

		System.out.println("Digite o primeiro valor:");
		valor2 = input.nextInt();

		// PROCESSAMENTO

		resultado1 = valor1 + valor2;
		resultado2 = valor1 - valor2;
		resultado3 = valor1 * valor2;
		resultado4 = valor1 / valor2;

		// RESULTADO (SAIDA)
		System.out.println("O valor da soma é:" + resultado1);
		System.out.println("O valor da subtração é:" + resultado2);
		System.out.println("O valor da multiplicação é:" + resultado3);
		System.out.println("O valor da divisão é:" + resultado4);

	}
}
