package Desafios;

import javax.swing.JOptionPane;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro salario:");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo salario:");
		String valor3 = JOptionPane.showInputDialog("Digite o terceiro salario:");
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		double numero3 = Double.parseDouble(valor3);
		double soma = numero1 + numero2 + numero3;
		double media = soma / 3;
		
		System.out.printf("Ultimos tres salario digitados %.2f - %.2f - %.2f", numero1, numero2, numero3);
		System.out.println("\nSoma salarios " + soma);
		System.out.printf("Media salario %.2f ", media);
		
	}

}
