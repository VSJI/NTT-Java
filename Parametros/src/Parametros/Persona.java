package Parametros;

public class Persona {

	String nombre = "";
	int edad = 29;
	
	//		public Persona (String nom) {
	//			System.out.println("EL objeto persona se ha creado! y es: " + nom);
	//		}
	
	// Constructor de la clase Persona
	public Persona (String nom, int age) {
		this.nombre = nom;
		this.edad = age;
		System.out.println("El objeto persona se ha creado! y es: " + nombre + ", y tiene " + age + " años.");
	}
		
	

}
