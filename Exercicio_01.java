package exercicio1;

import java.util.Scanner;

public class Exercicio_01{
		
		public static void main(String[] args ) 
		{
			
			try (Scanner input = new Scanner ( System.in )) {
				int num1, num2, soma, diferenca, produto, quociente;
				
				System.out.println("Digite um numero inteiro: ");
				num1 = input.nextInt();
				System.out.println("Agora digite outro valor inteiro: ");
				num2 = input.nextInt();
				
				soma = num1 + num2;
				diferenca = num1 - num2;
				produto = num1 * num2;
				quociente = num1 / num2;
				System.out.printf("O valor da soma desses numeros eh: %d\n", soma);
				System.out.printf("O valor da diferenca desses numeros eh: %d\n", diferenca);
				System.out.printf("O valor do produto desses numeros e: %d\n", produto);
				System.out.printf("O valor do quociente desses numeros e: %d\n", quociente);
				
			}
		}
			
	}