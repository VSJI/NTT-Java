package labs;
import java.util.Scanner;

public class EjemploFactorial {

	public static void main(String[] args) {
		
		// Factorial 6 = 6 x 5 x 4 x 3 x 2 x 1
		
		Scanner entradaDato = new Scanner(System.in);
		System.out.println("Introduzca un número:");
		int numeroIntroducido = Integer.valueOf(entradaDato.nextLine());
		
		String cadenaResultado = "" + numeroIntroducido;
		int resultado = 0;
		
		for (int i = numeroIntroducido; i > 0; i--) {
			resultado *= i;
		}
		
		System.out.println("\nFactorial de" + numeroIntroducido + ":\n" + resultado);
		
	}
	
}
