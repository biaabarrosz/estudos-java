package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("informe a média: ");
		double media = scan.nextDouble();
		
		if(media >= 7.0) {
			System.out.println("Aprovado!");
		}
		
		scan.close();
	}
	
}
