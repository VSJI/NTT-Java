package labs;

public class SentenciaIF {

	public static void main(String[] args) {
		
		// Sentencias condicionales
		
		int a = 8;
		int b = 2;
		
		if (a < 42 && a < 10) {
			System.out.println("True");
			
			if (a == 9) {
				
				System.out.println("ReTrue");
				
			} else {
				
				System.out.println("CasiTrue");
				
			}
		} else {
			
			System.out.println("False");
			
		}
		
		int edad = 16;
		System.out.println("\nEdad:");
			if (edad <= 0) {
				System.out.println("Error");
			}
			else if (edad <= 16) {
				System.out.println("Muy joven");
			}
			else if (edad <= 100) {
				System.out.println("Bienvenido!");
			} 
			else {
				System.out.println("¿En serio?");
			}
			
			
			// Operadores lógicos 
		
			int age = 23;
			double money = 1000;

			if (age > 18) {
				if (money > 500) {
					System.out.println("\nBienvenido! (1)");
				}
			}
			
			if (age > 18 && money > 500) {
				System.out.println(" \nBienvenido! (2)");
			}
			
			if ( !(age < 18) ) {
					System.out.println("\nBienvenido! (3)");
			}
			
		}
		
	}
	
