package fundamentos;

public class TiposPrimmitivos {

	public static void main(String[] args) {
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3234845223L;
		
		float salario = 11445.44F;
		double vendasAcumuladas = 299176.01;
		
		boolean estaDeFerias = false;
		char status = 'A';
		//o CHAR só aceita um único caractere//
		
		System.out.println(anosDeEmpresa * 365);
		System.out.println(numeroDeVoos / 2);
		System.out.println(pontosAcumulados / vendasAcumuladas);
	    System.out.println("Férias?" + estaDeFerias);
	}
}
