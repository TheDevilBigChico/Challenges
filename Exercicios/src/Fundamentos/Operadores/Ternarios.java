package Fundamentos.Operadores;

public class Ternarios {

	public static void main(String[] args) {
		
		double media = 5;
		// String resultadoParcial = media >= 5 ? "em recuperação." : "reprovado.";
		String resultadoFinal = media >= 7 ? "aprovado." : media >= 5 ? "em recuperação." : "reprovado.";
		
		System.out.println("O aluno está " + resultadoFinal);
		
		double nota = 9.9;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >= 7 ;	
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim." : "Não.";
		
		System.out.printf("Tem desconto ? %s", resultado);
		
		
	}
}
