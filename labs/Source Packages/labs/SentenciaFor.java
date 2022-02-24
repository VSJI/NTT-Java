package labs;
import java.util.Scanner;

public class SentenciaFor {

	public static void main(String[] args) {
		
		System.out.println("===============");
		
		System.out.println("\nCONTADOR INCREMENTAL");
		
		for (int x = 1; x <= 5; x++) {
			System.out.println("\nEl valor de \"x\" es: " + x);
		}
		
		System.out.println("\n**************");
		
		System.out.println("\nCONTADOR DECREMENTAL");
		for (int x = 5; x > 0; x--) {
			System.out.println("\nEl valor de \"x\" es: " + x);
		}
		
		System.out.println("\n///////////////");
		
		Scanner entradaDato = new Scanner(System.in);
		System.out.println("\nIntroduzca un número:");
		int numeroIntroducido = Integer.valueOf(entradaDato.nextLine());
		System.out.println("Tabla del " + numeroIntroducido);
		
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(numeroIntroducido + " X " + i + " = " + (numeroIntroducido * i));
		}
	}
	
}
