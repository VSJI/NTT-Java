package RetornoYParametros;

public class Main {

	public static void main(String[] args) {

		int suma = devuelveEntero(5,7);
		
		System.out.println("El resultado de la suma es: " + suma);

	}
	
	public static int devuelveEntero(int num1, int num2) {
		return num1 + num2;
	}

}
