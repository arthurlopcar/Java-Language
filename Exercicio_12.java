package exercicio1;

import java.util.Scanner;

public class Exercicio_12 {

	public static void main(String [] args) {
	try (Scanner input = new Scanner	(System.in)) {
		
		double pesoEmQuilogramas, alturaEmMetros;
		
		System.out.println("Qual o seu peso: ");
		pesoEmQuilogramas = input.nextInt();
		System.out.println("Qual a sua altura:");
		alturaEmMetros = input.nextInt();
	
	
		double imc;
	
			imc = (pesoEmQuilogramas / (alturaEmMetros * alturaEmMetros));
	
	
			// MÉDIA DO IMC: 24,9 Kg/m²
	
			if (imc < 18.5) {
				System.out.println("Underweight");
			} else if (18.5 < imc && imc < 24.9) {
				System.out.println("Normal");
			} else if (25 < imc && imc < 29.9) {
				System.out.println("Overweight");
			} else if(imc >= 30) {
				System.out.println("Obese");
		
			}
		System.out.println("Seu IMC é " + imc);
	}
	}
}