package labs;
import java.util.Scanner;

public class Labs {


	public static void main (String[] args) {
		
		
		
		System.out.println("Hola mundo!");
		

		double pi = 3.1416;
		String firstMidName = "David";
		String lastName = "Santafe";
		boolean active = true;
		char gender = 'C';
		
		// Este es un comentario simple
		
		System.out.println(pi);
		
		Scanner entradaDato = new Scanner(System.in);
		
		System.out.println("\nIntroduzca nombre del cliente");
		firstMidName = entradaDato.nextLine();
		
		System.out.println("\nIntroduzca apellido del cliente");
		lastName = entradaDato.nextLine();
		
		System.out.println("\nNombre completo:\n" + firstMidName + " " + lastName);
		
		//Conversiones entre los tipos de datos
		
		int age = 0;
		double price = 0;
		
		System.out.println("\nIntroduzca edad del cliente");
		age = Integer.valueOf(entradaDato.nextLine());
		
		//age = Integer.parseInt(entradaDato.nextLine());
		//age = entradaDato.nextInt();

		System.out.println("\nIntroduzca precio del producto");
		price = Double.valueOf(entradaDato.nextLine());
		//price = Double.parseDouble(entradaDato.nextLine());
		//price = entradaDato.nextDouble();
		
		String ageString = String.valueOf(age);
		
		System.out.println("\nEdad: " + age);
		System.out.println("Valor producto: " + price);
		
		
		
	} 

	
}