package exercicio1;

import java.util.Scanner;

public class Exercicio_06 {

	public static void main(String[]args) {
		try(Scanner input = new Scanner (System.in)){
			
			int numero;
			
			System.out.println("Insira um número inteiro: ");
			numero = input.nextInt();
			
			if(numero % 2 == 0) {
				System.out.println("O número é par.");
			} else {
				System.out.println("O número é ímpar. ");
			}
		
		}
	}
}
