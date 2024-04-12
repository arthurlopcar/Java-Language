package exercicio1;

import java.util.Scanner;

public class Exercicio_03 {

	public static void main (String[]args) {
		
		try( Scanner input = new Scanner (System.in)){
			
			int number1, number2,  number3, soma, media, produto; 
			
			System.out.println("Insira um número inteiro: ");
			number1 = input.nextInt();
			System.out.println("Um segundo número inteiro: ");
			number2 = input.nextInt();
			System.out.println("Um terceiro número inteiro");
			number3 = input.nextInt();
			
			soma = number1 + number2 + number3;
			System.out.println("A soma dos três números é " + soma);
			
			produto = number1 * number2 * number3;
			System.out.println("O produto entre eles é " + produto);
			
			media = (number1 * number2 * number3)/3;
			System.out.println("A média entre os números é " + media);
			
			if (number1 > number2 && number1 > number3) {
				System.out.println("O primeiro número é maior que o segundo e o terceiro");
			} else if(number2 > number1 && number2 > number3) {
				System.out.println("O segundo número é maior que o primeiro e o terceiro");
			} else if (number3 > number1 && number3 > number2) {
				System.out.println("O terceiro número é maior que o primeiro e o segundo");
			} else { 
				System.out.println("Os três número são iguais");
			}
			
			}
		}
		
	}
