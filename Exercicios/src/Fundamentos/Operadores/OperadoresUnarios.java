package Fundamentos.Operadores;

public class OperadoresUnarios {
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++; // a = a + 1 
		a--; // a = a - 1 
		
		++b; // b = b + 1 
		--b; // b = b - 1 
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(++a == b--); // da positivo pois o lado do incremento ou decremento interefere na ordem 
		// a ser executada, quando antes da variavel é aplicado antes da execução, se após a variavel é aplicado depois
		// da execusão 
		System.out.println(a == b); 
		
		System.out.println(a);
		System.out.println(b);
		
		
		
	}

}
