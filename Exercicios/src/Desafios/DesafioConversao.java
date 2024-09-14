package Desafios;

import javax.swing.JOptionPane;

public class DesafioConversao {

	public static void main(String[] args) {

		String valor1 = JOptionPane.showInputDialog("Digite o primeiro salário:").replace(",", ".");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo salário:").replace(",", ".");
		String valor3 = JOptionPane.showInputDialog("Digite o terceiro salário:").replace(",", ".");

		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		double numero3 = Double.parseDouble(valor3);
		double soma = numero1 + numero2 + numero3;
		double media = soma / 3;

		System.out.printf("Ultimos tres salários digitados %.2f - %.2f - %.2f", numero1, numero2, numero3);
		System.out.println("\nSoma salários " + soma);
		System.out.printf("Media salários %.2f ", media);

		String value1 = JOptionPane.showInputDialog("Enter the first salary:").replace(",", ".");
		String value2 = JOptionPane.showInputDialog("Enter the second salary:").replace(",", ".");
		String value3 = JOptionPane.showInputDialog("Enter the third salary:").replace(",", ".");

		double number1 = Double.parseDouble(value1);
		double number2 = Double.parseDouble(value2);
		double number3 = Double.parseDouble(value3);
		double sum = number1 + number2 + number3;
		double average = sum / 3;

		System.out.printf("\nLast three salaries entered %.2f - %.2f - %.2f", number1, number2, number3);
		System.out.println("\nSum of wages " + sum);
		System.out.printf("Average salary %.2f ", average);

	}

}
