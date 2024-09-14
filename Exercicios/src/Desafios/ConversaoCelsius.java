package Desafios;
// Desafio proposto para realizar a conversão das temperaturas utilizando variaveis e constantes
// Como desafio proprio alterei a dinamica para que pudesse ser escolhido a conversão e os valores
import java.util.Locale;
import java.util.Scanner;

public class ConversaoCelsius {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// (0 °C × 9/5) + 32 = 32 °F
		// (32 °F − 32) × 5/9 = 0 °C

		double celsius, fare;
		char unidade;
		final double f1, f2, c1, c2;
		f1 = -32;
		f2 = 5 / 9.0;
		c1 = +32;
		c2 = 9 / 5.0;
		System.out.println("Qual a medida a ser convertida °C ou °F ? ");
		unidade = sc.next().charAt(0);

		if (unidade == 'C') {
			System.out.println("Digite a temperatura em °C: ");
			sc.nextLine();
			celsius = sc.nextDouble();
			fare = (celsius * c2) + c1;
			System.out.println("Temperatura = º " + String.format("%.2f", fare));
		} else {
			System.out.println("Digite a temperatura em °F ");
			fare = sc.nextDouble();
			celsius = (fare + f1) * f2;
			System.out.println("Temperatura = ° " + String.format("%.2f", celsius));
		}
		sc.close();
	}
}
