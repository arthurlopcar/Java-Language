package exercicio1;

public class Exercicio_08 {

	public static void main(String [] args) {
		
		    // Caracteres a serem analysts
	        char[] caracteres = {'A', 'B', 'C', 'a', 'b', 'c', '0', '1', '2', '$', '*', '+', '/', ' ', '\n'};

	        // Exibindo os equivalentes inteiros
	        for (char caractere : caracteres) {
	            System.out.println("Caractere: " + caractere + " | Valor inteiro: " + (int) caractere);
	        }
	    }
	}	