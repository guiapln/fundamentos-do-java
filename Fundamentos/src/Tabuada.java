import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		System.out.println("===== TABUADA =====");
		Scanner leia = new Scanner(System.in);
		//dica: <ctrl><shift><o> importação
		int valor;
		System.out.println("Digite o valor da tabuada:");
		valor = leia.nextInt();
		System.out.println("");
		// Estrutura de repetição
		for (int i = 0; i <= 10 ; i++) {
			System.out.println(valor + "x" + i +"=" + (valor * i));
		}
		
	
		leia.close();
	
	}

}
