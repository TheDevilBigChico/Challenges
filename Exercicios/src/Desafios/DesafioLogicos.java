package Desafios;

public class DesafioLogicos {

	public static void main(String[] args) {

		// Trabalho na terça ( V ou F)
		// Trabalho na quinta (V ou F)

		// Se trabalha terça e quinta = compra tv 50 polegadas + sorvete
		// Se só pegar um trabalho terça ou quinta = compra TV de 30 polegadas + sorvete
		// Se não pega nenhum trabalho = Fica em casa

		boolean trabalho1 = false;
		boolean trabalho2 = false;
		boolean comprouSorvete = trabalho1 || trabalho2;

		boolean comprouTv50 = trabalho1 && trabalho2;
		System.out.println("Comprou TV 50\"? " + comprouTv50);

		boolean comprouTv30 = trabalho1 ^ trabalho2;
		System.out.println("Comprou TV 30\"? " + comprouTv30);
		System.out.println("Comprou sorvete ?" + comprouSorvete);

		boolean naoComprouTv = !trabalho1 && !trabalho2;
		System.out.println("Não comprou nada\"? " + naoComprouTv);

		// Worked on Tuesday ( T or F)
		// Worked on Thursday (T or F)

		// If you work Tuesday and Thursday = buy 50 inch TV + ice cream
		// If you only get a job on Tuesday or Thursday = buy a 30-inch TV + ice cream
		// If you don't get any work = Stay at home

		boolean work1 = false;
		boolean work2 = false;
		boolean buyIceCream = work1 || work2;

		boolean boughtTV50 = work1 && work2;
		System.out.println("\nBought the 50 inch TV\"? " + boughtTV50);

		boolean boughtTV30 = work1 ^ work2;
		System.out.println("Bought the 30 inch TV\"? " + boughtTV30);
		System.out.println("Did you buy ice cream ?" + buyIceCream);

		boolean noBoughtTV = !work1 && !work2;
		System.out.println("Didn't buy anything?\"? " + noBoughtTV);

	}

}
