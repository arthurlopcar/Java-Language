package exercicio1;
import java.util.Scanner;

public class Exercicio_13 {
	public static void main(String [] args) {
		
		//A população mundial em 2023 é de 8074387536 pessoas1
		
		try (Scanner input = new Scanner (System.in)) {
			
			System.out.println("Qual a população mundial atual? ");
			long pop = input.nextLong();	
		
		double taxaCrescimentoAnual = 0.0088;
		
		
		for (int ano = 1; ano <= 5; ano++) {
			pop += (long) (pop * taxaCrescimentoAnual);
			System.out.println("Ano" + ano +": População estimada = " + pop);
		}
		
		}
		
		
	}

}