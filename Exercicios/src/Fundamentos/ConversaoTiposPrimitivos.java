package Fundamentos;

public class ConversaoTiposPrimitivos { // Numerico
	
	public static void main(String[] args) {
		
		double a = 1; // implicita
		System.out.println(a);
		
		float b = (float) 1.1234568; // explicita (CAST)
		System.out.println(b);
		
		int c = 1;
		byte d = (byte) c; // explicita (CAST)
		
		System.out.println(d);
		
		double e = 1.5;
		int f = (int) e; // explicita (CAST)
		System.out.println(f);
	}

}
