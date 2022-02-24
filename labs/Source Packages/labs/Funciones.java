package labs;

public class Funciones {

	public static void main(String[] args) {
		
		/*FUNCI�N PRINCIPAL*/
		
		/* Funci�n: Un bloque de c�digo que se ejecuta dependiendo de nuestras necesidades. Hay 4 tipos: */
		/* 1. Las que ejecutan c�digo. */
		/* 2. Las que ejecutan c�digo y devuelven un valor. */
		/* 3. Las que reciben un valor. */
		/* 4. Las que reciben valor y devuelven un valor. */
		
		System.out.println("1. Esta es la funci�n Main");
		
		// llamada a otra funci�n
		Hola();
		
		int res = 0;
		res = devuelveValor();
		System.out.println("\n2. Funci�n Main. Hemos asignado a la variable \"res\" el valor de la funci�n devuelveValor(), que es: " + res);
		
		String valorDavuelveCadena = devuelveCadena();
		System.out.println(valorDavuelveCadena);
	}
	
	/* Estructura de una funci�n: */
	/* Modificador: Sirven para acceder a una variable dependiendo de su clase (public, private, protected)*/
	/* Tipo Dato a devolver: Es el tipo de dato que va a devolver la funci�n (int, String, float...) */
	/* Nombre de la funci�n: Nombre por el que se acceder� a la funci�n */
	/* Par�metros: Valores que recibe como INPUT la funci�n */
	/* Return: Devuelve un valor. Depender� de si la funci�n va a retornar valor o no. 
	 * Si la funci�n no retorna valor deber� ser una fucni�n "void". Si la funci�n retorna valor debe tener RETURN */
	
	/* modificador tipoDatoADevolver nombreFuncion (Valores recibidos) {
	 * 
	 * Instrucciones de la funci�n
	 * 
	 * }
	 * */
	
	public static void Hola() {
		
	/* 1. "public" -> Una funci�n debe tener un modificador de acceso. Pueden ser private, public, protected, etc */
	/* 2. "void" -> En una funci�n se debe indicar si retorna valor o no. "void" no devuelve ning�n valor, en su lugar se puede indicar: String, float, boolean, etc */
	/* 3. "(Nombre)" -> Se indica el nombre de la funci�n*/
	/* 4. "(Contenido parentesis)" -> Se indican los par�metros de entrada */
		
		
		
		int i = 0;
		System.out.println("\n3. Hola mundo");
	}
	
	/* TIPOS DE FUNCIONES */
	
	// 1. Las que ejecutan c�digo
	
	public static void Hola2() {
		
		// Instrucciones
		System.out.println("Hola");
	}

	// 2. Las que devuelven un valor.
	
	public static int devuelveValor() {
		int test = 0;
		
		// Instrucciones
		System.out.println("\n4. Funci�n devuelve valor");
		
		return test;
	}
	
	public static String devuelveCadena() {
		
		return "\n5. HOLA SOY LA FUNCI�N QUE SOLO DEVUELVE UNA CADENA EN EL RETURN DE LA FUNCI�N devuelveCadena()";
	}
	
	/* PARA VER LOS OTROS 2 TIPOS DE FUNCIONES, VER EN EL PROYECTO "RetornoYParametros" */
	/* 3. Las que reciben un valor. */
	/* 4. Las que reciben valor y devuelven un valor. */
}
