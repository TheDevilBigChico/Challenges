package Fundamentos.Operadores;

public class Relacionais {
	
	public static void main(String[] args) {
		
		int a = 97;
		int b = 'a';
		
		System.out.println(a == b);
		System.out.println(b);
		
		System.out.println(3 > 4);
		System.out.println(3 >= 3);
		System.out.println(3 < 7);
		System.out.println(30 <= 7);
		System.out.println(30 != 7);
		
		double nota = 7.3;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >= 7 ;	
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem desconto? " + temDesconto);
		

	
		System.out.print('\u0046');
		System.out.print('\u0052');
		System.out.print('\u0041');
		System.out.print('\u004E');
		System.out.print('\u0043');
		System.out.print('\u0049');
		System.out.print('\u0053');
		System.out.print('\u0043');
		System.out.print('\u004F');
		
	}

}
