package ModificadoresAcceso;

public class Persona { // Clase Persona

	// Constructor
	public Persona(){
		System.out.println("Se creó un objeto de tipo persona");
		nombre = "";
	}
	
	
	// Atributos. Antes de los mismos, se puede indicar: public, private, protected, etc. Por defecto son public.
	private String nombre = "";
	int edad = 0;
	
	// Métodos
	public void crecer() {
		
	}
	
	private void vestirse() {
		
	}

}
