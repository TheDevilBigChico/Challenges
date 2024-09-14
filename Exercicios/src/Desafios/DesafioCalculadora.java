package Desafios;

import javax.swing.JOptionPane;

public class DesafioCalculadora {

	public static void main(String[] args) {

		// Desafio de criar uma calculadora apenas com os fundamentos
		// Ler num1 e Ler num2 - Escolher a operação + - * / %
		// Challenge of creating a calculator with just the basics
		// Read num1 and Read num2 - Choose the operation + - * / %

		String num1 = JOptionPane.showInputDialog("Digite o primeiro numero:").replace(",", ".");

		String operacao = JOptionPane.showInputDialog("Digite a operação a ser realizada :".trim());

		String num2 = JOptionPane.showInputDialog("Digite o segundo numero:").replace(",", ".");

		double valor1 = Double.parseDouble(num1);
		double valor2 = Double.parseDouble(num2);
		double soma = valor1 + valor2;
		double subtracao = valor1 - valor2;
		double multiplicacao = valor1 * valor2;
		double divisao = valor1 / valor2;
		double mod = valor1 % valor2;

		String operacao2 = "+".equals(operacao.trim()) ? ("" + soma)
				: "-".equals(operacao.trim()) ? ("" + subtracao)
						: "*".equals(operacao.trim()) ? ("" + multiplicacao)
								: "/".equals(operacao.trim()) ? ("" + divisao)
										: "%".equals(operacao.trim()) ? ("" + mod) : "Invalido";
		double op = Double.parseDouble(operacao2);

		System.out.printf("%.2f %s %.2f = %.2f ", valor1, operacao, valor2, op);

	}

}
