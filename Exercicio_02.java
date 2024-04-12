	package exercicio1;
		
	import java.util.Scanner;
	
	public class Exercicio_02 {
		
		public static void main(String []args) {
			
			try (Scanner input = new Scanner (System.in)) {
				int number1, number2;
				
				System.out.println("Insira um numero inteiro: ");
				number1 = input.nextInt();
				
				System.out.println("Agora insira outro numero inteiro: ");
				number2 = input.nextInt();
				
				if (number1 > number2) {
					System.out.println(number1 + "'Is larger'");
				} else if (number2 > number1) {
					System.out.println(number2 + "'Is larger'");		
				} else {
					System.out.println("These numbers are equals.");
				}
			}
		}
}
