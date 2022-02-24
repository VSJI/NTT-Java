package RetornoValor;

public class Transporte {

	int precio = 0;
	
	public Transporte(int price) {
		
		System.out.println("Se cre� un objeto transporte");
		this.precio = price;
	}
	
	// Funci�n que devuelve in "int". Se puede indicar un String, un Float, etc.
	public int precio() {
		
		// Intrucciones que acaban devolviendo un valor
		
		this.precio++;
		
		return this.precio;
		
	}
	
	// El retorno de valor es tratar una funci�n (en este caso, "precio") como si fuera una variable
}
