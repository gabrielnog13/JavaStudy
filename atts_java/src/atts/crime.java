package atts;
import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class crime {

	public static void main(String[] args) {
		
		int contador =0;
			
		System.out.println("          🚨🚓 INVESTIGAÇÃO CRIMINAL 🚓🚨");
			
			
		Scanner pergunta = new Scanner(System.in);
		System.out.println("Digite seu Nome: ");
		String resp = pergunta.nextLine();
		
		System.out.println (resp + " Temos algumas perguntas para lhe fazer!");
		System.out.println();
		System.out.println("Você esta pronto (a)?");
		System.out.println();
			
			Scanner pergunta1 = new Scanner(System.in);
			System.out.println("Digite sim ou nao: ");
		String resp1 = pergunta1.nextLine();
		
		try (Scanner pergunta2 = new Scanner(System.in)) {
			System.out.println("Telefonou para a vitima? Se SIM digite 1 se NAO digite 0: ");
		double resp2 = pergunta2.nextDouble();
		
		if (resp2 ==1) {
			contador += 1;
		System.out.println();	
		}
		
		Scanner pergunta3 = new Scanner(System.in);
		System.out.println(" Esteve no local do Crime? Se SIM digite 1 se NAO digite 0:");
		double resp3 = pergunta3.nextDouble();
		
		if (resp3 ==1) {
			contador += 1;	
		System.out.println();	
		}
		
		System.out.println("Mora perto da vitima? Se SIM digite 1 se NAO digite 0: ");
		resp3 = pergunta3.nextDouble();
		if (resp3 ==1) {
			contador +=1;
		System.out.println();			
		}
		
		System.out.println("Devia para a vitima? Se SIM digite 1 se NAO digite 0: ");
		resp3 = pergunta3.nextDouble();
		if (resp3 ==1) {
			contador +=1;
		System.out.println();			
		}
		
		System.out.println("Ja trabalhou com a vitima? Se SIM digite 1 se NAO digite 0: ");
		resp3 = pergunta3.nextDouble();
		if (resp3 ==1) {
			contador +=1;
		System.out.println();
		
		}if (contador ==1) {
			System.out.println("Voce e Inocente do crime");
		}else if (contador ==2) {
			System.out.println("Voce e um Suspeito do crime!");
		}else if (contador ==3 || contador == 4) {
			System.out.println("Voce foi complice nesse crime!");
		}else {
			System.out.println("Assassino! Voce é um verme!");
			}
					
		}
		
	}	
}


