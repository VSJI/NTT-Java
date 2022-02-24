package RetornoValor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Transporte transport = new Transporte(5000);
		
		int valor = 0;
		valor = transport.precio(); // Importante: Cuidado al referenciar a una función de otra clase, hay que poner los paréntesis "()"
		
		System.out.println("La función devuelve el valor: " + valor);
		
		
	}

}
