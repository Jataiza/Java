import java.util.Scanner;

public class Comparacao {

	public static void main(String[] args) {

	// COMANDO DE ENTRADA DE DADOS
		
		Scanner input=new Scanner(System.in);

	//DECLARAÇÃO DA VARIAVEIS
		
		int valor1,valor2;
		
    // SOLICITANDO ENTRADA DO USUÁRIO
		System.out.print("Digite o primeiro número:");
		valor1= input.nextInt();
		
		System.out.print("Digite o segundo número:");
		valor2 = input.nextInt();

   // UTILIZANDO O COMANDO IF (COMPARAÇÃO)
		if(valor1 == valor2) {
			 System.out.println("Os valores são iguais");
		}
		if(valor1 != valor2) {
			 System.out.println("Os valores são diferentes!");
		}
		if(valor1 > valor2) {
			 System.out.println("O valor 1 e maior");
		}
		if(valor1 < valor2) {
			 System.out.println("O valor 2 e maior");
		}	
	}
}
