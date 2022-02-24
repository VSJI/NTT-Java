package Encapsulacion;

public class Automovil {

	// Atributos
	private int precio;
	private String marca;
	
	// Constructor
	public Automovil() {
		System.out.println("Creado objeto Automovil!");
	}
	
	// Se crean los métodos GETTER y SETTER para acceder a atributos "private". 
	// Un GETTER un método de una función que va a devolver el valor de dicho método. "Dame este valor"
	// Un SETTER un método de una función que va a asignar el valor de dicho método. "Ponle este valor"
	
	// GETTERS
	
	public int getPrecio() {
		return this.precio;
	}
	
	public String getMarca() {
		return this.marca;	
	}
	
	// SETTERS
	
	public void setPrecio(int p) {
		this.precio = p;
	}
	
	public void setMarca(String m) {
			this.marca = m;
	}
	
}
