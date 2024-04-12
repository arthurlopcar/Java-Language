package exercicio1;
import java.util.Scanner;

public class Exercicio_14{
	public static void main( String []args) {
		
		try(Scanner input = new Scanner (System.in)) {
		
			//Quilometragem total dirigida por dia 		->	52.6 
			//Preço por galão de gasolina 				->  28.15
			//Quilometragem média por galão				->  01.87
			//Taxas de estacionamento por dia 			->  50.00
			//Pedágio por dia							->  05.75
			
			double media, caronaSolidaria, quilometrosDia, precoGasolina, estacionaDia, pedagioDia;
			
			System.out.println("Quilômetros total por dia: ");
			quilometrosDia = input.nextDouble();
			System.out.println("Preço por galão de gasolina: ");
			precoGasolina = input.nextDouble();
			System.out.println("Taxas de estacionamento por dia: ");
			estacionaDia = input.nextDouble();
			System.out.println("Pedágio por dia: ");
			pedagioDia = input.nextDouble();

			media = (quilometrosDia / precoGasolina);
			
			System.out.println("Quilometragem média por galão: " + media);
			System.out.println(" ");
			
			caronaSolidaria = precoGasolina + estacionaDia + pedagioDia;
		
			System.out.println("Na carona solidária você irá economizar " + caronaSolidaria);
		
		}	
	}
}