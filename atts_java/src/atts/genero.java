package atts;
import java.util.Scanner;

public class genero {
	
	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.print("Escolha a opcao 'F' ou 'M': ");
			
			String resp = entrada.nextLine().toLowerCase();
			
			if(resp.equals("f")) {
				System.out.println("GENERO FEMININO");}
			else if (resp.equals("m")) {
				System.out.println("GENERO MASCULINO");}
			else {
				System.out.println("OPCAO INVALIDA");
			}
		}
		
	}
}
