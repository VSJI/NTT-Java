package Encapsulacion;

public class Main {

	public static void main(String[] args) {
		
		// El concepto de encapsulacion, es una clase encapsula todos sus atributos, los hace privados, 
		// y no puede acceder una clase externa a ellos. Solo se puede acceder a ellos con métodos, que son GETTERS Y SETTERS

		Automovil auto = new Automovil();
		
		//int precioAuto = auto.precio;
		//String marcaAuto = auto.marca; 
		
		// Al ser los atributos de la clase "Automovil" privados, ya no es posible acceder directamente a los atributos,
		// sino que hay que interaactuar con ellos a través de los SETTERS y GETTERS creados en la clae "Automovil" 

		auto.setMarca("Ferrari");
		auto.setPrecio(100000);
		
		int precioAuto = auto.getPrecio();
		String marcaAuto = auto.getMarca(); 		
		
		System.out.println("\nValor marca: " + marcaAuto + "\nValor precio: " + precioAuto);
		
		
	}

}
