package labs;

import java.util.Scanner;

public class EjemploAdivinaNumero {

	public static void main(String[] args) {
		
		// Juego para adivinar número. Se introducen números y se dan pistas acerca del número elegido de forma aleatoria. 
		
		System.out.println("=============");
		
		int numAdv = 0;
		System.out.println("Introduzca un número a adivinar: ");
		Scanner entradaDato = new Scanner(System.in);
		numAdv = Integer.valueOf(entradaDato.nextLine());
		
		int numIntroducido = 0;
		System.out.println("Introduzca un número: ");
		numIntroducido = Integer.valueOf(entradaDato.nextLine());
		
		while (numIntroducido != numAdv) {
			if (numIntroducido > numAdv) {
				System.out.println("Has fallado :(\n(Pista: El número introducido es mayor que el número secreto)");
			}
			else {
				System.out.println("Has fallado :(\n(Pista: El número introducido es menor que el número secreto)");
			}
			
			System.out.println("\nIntroduzca un número: ");
			numIntroducido = Integer.valueOf(entradaDato.nextLine());
		}
		
		System.out.println("HAS ACERTADO!!");
	}
	
	
}
