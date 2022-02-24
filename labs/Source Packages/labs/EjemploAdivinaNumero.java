package labs;

import java.util.Scanner;

public class EjemploAdivinaNumero {

	public static void main(String[] args) {
		
		// Juego para adivinar n�mero. Se introducen n�meros y se dan pistas acerca del n�mero elegido de forma aleatoria. 
		
		System.out.println("=============");
		
		int numAdv = 0;
		System.out.println("Introduzca un n�mero a adivinar: ");
		Scanner entradaDato = new Scanner(System.in);
		numAdv = Integer.valueOf(entradaDato.nextLine());
		
		int numIntroducido = 0;
		System.out.println("Introduzca un n�mero: ");
		numIntroducido = Integer.valueOf(entradaDato.nextLine());
		
		while (numIntroducido != numAdv) {
			if (numIntroducido > numAdv) {
				System.out.println("Has fallado :(\n(Pista: El n�mero introducido es mayor que el n�mero secreto)");
			}
			else {
				System.out.println("Has fallado :(\n(Pista: El n�mero introducido es menor que el n�mero secreto)");
			}
			
			System.out.println("\nIntroduzca un n�mero: ");
			numIntroducido = Integer.valueOf(entradaDato.nextLine());
		}
		
		System.out.println("HAS ACERTADO!!");
	}
	
	
}
