package labs;

import java.util.Scanner;

public class SentenciaWhile {

	public static void main(String[] args) {
		
		
//		System.out.println("=============");
//		int x = 3;
//		while (x > 0) {
//			System.out.println("El valor de \"x\" es: " + x);
//			x--;
//		}
//		
//		System.out.println("=============");
//		int y = 3;
//		while (y > 0) {
//			System.out.println("El valor de \"y\" es: " + y);
//			y++;
//		}
		
		// Lectura de un n�mero introducido y mostrar por consola su cuadrado. Repetir solicitud n�mero hasta que sea negativo el n�mero introducido 
		
		System.out.println("=============");
		
		Scanner entradaDato = new Scanner(System.in);
		int num = 0;
		
		System.out.println("Introduzca un n�mero: ");
		num = Integer.valueOf(entradaDato.nextLine());
		
		while (num >= 0) {
			System.out.println("N�mero al cuadrado = " + Math.pow(num, 2));
			
			System.out.println("\nIntroduzca un n�mero: ");
			num = Integer.valueOf(entradaDato.nextLine());
		}
		
		System.out.println("Fin ejecuci�n");
		
	}
	
}
