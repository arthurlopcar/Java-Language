package exercicio1;

import java.util.Scanner;

public class Exercicio_07 {
	
	public static void main(String [] args) {
		
		try(Scanner input = new Scanner (System.in)){
			
			int valor1, valor2, divisivel;
			
			System.out.println("Digite um valor inteiro: ");
			valor1 = input.nextInt();
			System.out.println("Digite outro valor inteiro: ");
			valor2 = input.nextInt();
			
			if (valor1 % valor2 == 0) {
				System.out.println("O primeiro valor é multiplo do segundo valor.");
			} else {
				System.out.println("O primeiro valor não é múltiplo do segundo valor.");
			}
			
			divisivel = valor1/valor2;
			
			System.out.println("O prismeiro valor é o segundo vezes " + divisivel);
	}
	
	}
}
