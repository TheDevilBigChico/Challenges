package Desafios;

public class DesafioAritimeticos {

	public static void main(String[] args) {

		// Proposta do exercicio seria realizar a operação alocando cada etapa em
		// variaveis para visualização de cada etapa
		// Como desafio proprio coloquei a operação em uma unica linha

		// The purpose of the exercise would be to perform the operation by placing each
		// step in
		// variables for viewing each step
		// As a challenge of my own, I put the operation in a single line.

		// Para fazer expo considerar Math.pow (variavel, expoente);
		// int a = 3 * 4 - 10;
		// int b = (int) Math.pow(a, 3);
		// double c = Math.pow(a, 3);

		// ([6*(3+2)]² - ((1-5)*(2-7))²)³
		// ---------- -----------
		// (( 3*2 ) - ( 2 ) )³
		// ------------------------------
		// 10³

		// (6 * ( 3 + 2 ))^2 / (3*2) -> ( a, b , c, d )
		// (( 1 - 5 ) * ( 2 - 7 ) / 2 )^2 -> (e, f )
		// ( 150 - 100 ) ^3 / (10 ^ 3 ) -> ( i, j )

		double a = 6 * (3 + 2);
		double b = Math.pow(a, 2);
		double c = 3 * 2;
		double d = b / c;

		double e = (1 - 5) * (2 - 7) / 2;
		double f = Math.pow(e, 2);

		double i = (d - f) / 10;
		double j = Math.pow(i, 3);

		System.out.println(j);

		double x = Math.pow(((Math.pow(6 * (3 + 2), 2) / (3 * 2)) - Math.pow((1 - 5) * (2 - 7) / 2, 2)) / 10, 3);

		System.out.println(x);

	}

}
