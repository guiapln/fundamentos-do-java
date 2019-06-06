import java.util.Scanner;

public class PedraPapelTesoura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Lógica do jogador
		int jogador;
		Scanner mao = new Scanner(System.in);
		System.out.println("______________________");
		System.out.println("___________JoKenPo_________");
		System.out.println("__");
		System.out.println("1. Pedra");
		System.out.println("2. Papel");
		System.out.println("3. Tesoura");
		System.out.print("Digite a opção desejada: ");
		jogador = mao.nextInt();
		//estrutura switch case admite apenas tipo int e char
		switch (jogador) {
		case 1:
			System.out.println("Jogador escolheu PEDRA");
			break;
		case 2: 
			System.out.println("Jogador escolheu PAPEL");
			break;
		case 3:
			System.out.println("Jogador escolheu Tesoura");
			break;
		default:
			System.out.println("Opção inválida");
			break;
		  }
		//lógia do computador
		//a linha abaixo gera números aleatórios entre 0 e 2
		//(int) converte para o tipo inteiro (casting)
		//+1 soma 1 ao resultado
		int computador = (int)(Math.random() * 3 + 1);
		System.out.println(computador);
		switch (computador) {
	case 1:
		System.out.println("Computador escolheu PEDRA");
		break;
		case 2:
		System.out.println("Computador escolheu PAPEL");
	break;
		case 3:
		System.out.println("Computador escolheu TESOURA");
	break;
		
		}
	//Lógica para determinar o vencedor ou empate
	if (jogador == computador) {
	System.out.println("EMPATE");	
	}else {
		if ((jogador == 1 && computador == 3) || (jogador == 2 && computador == 1) || (jogador == 3 && computador == 2) ) {
			System.out.println("JOGADOR VENCEU");		
		}else {
		System.out.println("Computador Venceu");
		
		}
		
		mao.close();		

		}
	}
}
