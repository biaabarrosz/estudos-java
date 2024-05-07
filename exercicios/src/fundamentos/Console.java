package fundamentos;
import java.util.Scanner;
public class Console {

	public static void main(String[] args) {
		System.out.print("bom");
		System.out.print("dia!");
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite seu nome: ");
		String nome = entrada.nextLine();
		System.out.println("nome = " + nome);
	}
	
}
