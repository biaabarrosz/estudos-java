package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String texto = "";

		
		do {
			System.out.println("fale a palavra mágica...");
			System.out.println("quer sair?");
			texto = scan.nextLine();
		} while(!texto.equalsIgnoreCase("por favor"));

		scan.close();
	}
}
