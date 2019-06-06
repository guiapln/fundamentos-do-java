import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculadoraIMC {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		double peso, altura, imc;
		System.out.println("========");
		System.out.println("Calculo do IMC");
		System.out.println("========");
		System.out.println("Digite o seu peso:");
		peso = leia.nextDouble();
		System.out.println("Digite a sua altura:");
		altura = leia.nextDouble();
		imc = peso / (altura * altura);
		System.out.println("IMC: " + formatador.format(imc));
		leia.close();
		//Para criar um intervalo usamos o operador AND (&&)
		if (imc <18.5) {
			System.out.println("Abaixo do peso");
			} else if (imc >= 18.5 && imc <25) {
				System.out.println("Peso normal");
			} else if (imc >= 25 && imc <30) {
				System.out.println("Acima do peso");	
			} else  {	
			System.out.print("Obeso");
			}
			}
	}


