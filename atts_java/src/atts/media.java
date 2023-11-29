package atts;
import java.util.Scanner;
public class media {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("digite a primeira nota: ");
			Double n1 = scanner.nextDouble();
		
			System.out.print("digite a segunda nota: ");
			Double n2 = scanner.nextDouble();
			
			double media = (n1 + n2) / 2;
			
			if (media >= 7 && media <= 10) {
				System.out.println("sua média é igual a: " +media);
				System.out.println("aprovado!");
			} else if (media < 7 && media >=4) {
				System.out.println("sua média é igual a: " +media);
				System.out.println("recuperação!");
			} else if (media < 4 && media >= 0) {
				System.out.println("sua média é igual a: " +media);
				System.out.println("reprovado!");
			} else {
				System.out.println("digite uma nota válida para a média poder ser cálculada!");
			}
		}
	}		
}
