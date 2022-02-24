package labs;

public class Cadenas {

	public static void main(String[] args) {
		
		String text1 = "Hola mundo";
		String text2 = "Hola mundo";		
		
		int result = text1.compareTo(text2);
		
		System.out.println("\nResultado comparación:\n" + result);
		
		// Búsqueda de caracteres
		
		int result2 = text1.indexOf("wo"); // Si no encuentra cadena devuelve -1
		System.out.println("\nPosición coincidencia:\n" + result2);
		
		// Métodos con subcadena
		
		String text3 = text1.substring(5);
		System.out.println("\nResultado substring:\n" + text3);
		
		String s = "En un lugar de la mancha ...";
		String text4 = s.substring(6, 11);
		System.out.println("\nResultado substring:\n" + text4);
		
		// Manejo de caracteres
		
		System.out.println("\nLowercase:\n" + s.toLowerCase());
		System.out.println("\nUppercase:\n" + s.toUpperCase());
		System.out.println("\nReplace:\n" + s.replace(".","+")); // Replace old-new
		System.out.println("\nReplace:\n" + s.replace("a","*")); // Replace old-new
		
		boolean bandera = s.contains("lugar");
		System.out.println("\nContains: " + bandera);
		System.out.println("\nStartsWith: " + s.startsWith("Un"));
		System.out.println("\nEndsWith: " + s.endsWith("."));
	}
	
}
