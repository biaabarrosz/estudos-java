package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int quantidadeNotas = 0;
		double nota = 0;
		double total = 0;
		
		while(nota != -1) {
			System.out.println("Informe a nota: ");
			nota = scan.nextDouble();
			
			total += nota;
			quantidadeNotas++;
		}

		double media = total / quantidadeNotas;
		System.out.println("Média = " + media);
		scan.close();
		
	}
}
