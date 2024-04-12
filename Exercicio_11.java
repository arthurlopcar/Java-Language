package exercicio1;

import java.util.Scanner;

public class Exercicio_11 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			int positivos = 0;
			int negativos = 0;
			int zeros = 0;

			System.out.println("Digite cinco números:");

			for (int i = 0; i < 5; i++) {
			    System.out.print("Número " + (i + 1) + ": ");
			    int numero = input.nextInt();

			    if (numero > 0) {
			        positivos++;
			    } else if (numero < 0) {
			        negativos++;
			    } else {
			        zeros++;
			    }
			}

			System.out.println("Resultados da análise:");
			System.out.println("Números positivos: " + positivos);
			System.out.println("Números negativos: " + negativos);
			System.out.println("Zeros: " + zeros);
		}

    }
}