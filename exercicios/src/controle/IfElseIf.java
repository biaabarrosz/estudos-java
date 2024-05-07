package controle;

import java.util.Scanner;

public class IfElseIf {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("digite a nota: ");
		
		double nota = scan.nextDouble();
		
		if(nota > 10 || nota < 0) {
			System.out.println("inválida!");
		} else {
			if(nota >= 8.1) {
				System.out.println("conceito A!");
			}
			
		}
		
		scan.close();
	}

}
