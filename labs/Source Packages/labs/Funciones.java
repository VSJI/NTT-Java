package labs;

public class Funciones {

	public static void main(String[] args) {
		
		/*FUNCIÓN PRINCIPAL*/
		
		/* Función: Un bloque de código que se ejecuta dependiendo de nuestras necesidades. Hay 4 tipos: */
		/* 1. Las que ejecutan código. */
		/* 2. Las que ejecutan código y devuelven un valor. */
		/* 3. Las que reciben un valor. */
		/* 4. Las que reciben valor y devuelven un valor. */
		
		System.out.println("1. Esta es la función Main");
		
		// llamada a otra función
		Hola();
		
		int res = 0;
		res = devuelveValor();
		System.out.println("\n2. Función Main. Hemos asignado a la variable \"res\" el valor de la función devuelveValor(), que es: " + res);
		
		String valorDavuelveCadena = devuelveCadena();
		System.out.println(valorDavuelveCadena);
	}
	
	/* Estructura de una función: */
	/* Modificador: Sirven para acceder a una variable dependiendo de su clase (public, private, protected)*/
	/* Tipo Dato a devolver: Es el tipo de dato que va a devolver la función (int, String, float...) */
	/* Nombre de la función: Nombre por el que se accederá a la función */
	/* Parámetros: Valores que recibe como INPUT la función */
	/* Return: Devuelve un valor. Dependerá de si la función va a retornar valor o no. 
	 * Si la función no retorna valor deberá ser una fucnión "void". Si la función retorna valor debe tener RETURN */
	
	/* modificador tipoDatoADevolver nombreFuncion (Valores recibidos) {
	 * 
	 * Instrucciones de la función
	 * 
	 * }
	 * */
	
	public static void Hola() {
		
	/* 1. "public" -> Una función debe tener un modificador de acceso. Pueden ser private, public, protected, etc */
	/* 2. "void" -> En una función se debe indicar si retorna valor o no. "void" no devuelve ningún valor, en su lugar se puede indicar: String, float, boolean, etc */
	/* 3. "(Nombre)" -> Se indica el nombre de la función*/
	/* 4. "(Contenido parentesis)" -> Se indican los parámetros de entrada */
		
		
		
		int i = 0;
		System.out.println("\n3. Hola mundo");
	}
	
	/* TIPOS DE FUNCIONES */
	
	// 1. Las que ejecutan código
	
	public static void Hola2() {
		
		// Instrucciones
		System.out.println("Hola");
	}

	// 2. Las que devuelven un valor.
	
	public static int devuelveValor() {
		int test = 0;
		
		// Instrucciones
		System.out.println("\n4. Función devuelve valor");
		
		return test;
	}
	
	public static String devuelveCadena() {
		
		return "\n5. HOLA SOY LA FUNCIÓN QUE SOLO DEVUELVE UNA CADENA EN EL RETURN DE LA FUNCIÓN devuelveCadena()";
	}
	
	/* PARA VER LOS OTROS 2 TIPOS DE FUNCIONES, VER EN EL PROYECTO "RetornoYParametros" */
	/* 3. Las que reciben un valor. */
	/* 4. Las que reciben valor y devuelven un valor. */
}
