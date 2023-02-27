import java.util.Scanner;
import java.util.ArrayList;

public class ListaMaterial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("----Lista de compra de carnaval----");
		
		Scanner input =new Scanner(System.in);
		ArrayList<String> listaDeCompras = new ArrayList<String>();
		
		listaDeCompras.add("Glitter");
		listaDeCompras.add("Protetor Solar");
		listaDeCompras.add("Confete");
		listaDeCompras.add("Fantasia");
		
		
		System.out.println(listaDeCompras.get(2));
		
		int valor;
		Integer valorObjeto=5;
		System.out.println(valorObjeto);
		
		listaDeCompras.remove("Confete");
		System.out.println(listaDeCompras);
		
	}

}
