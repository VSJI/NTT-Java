package Arreglos;

public class Main {

	public static void main(String[] args) {
		
		// Una variable se asemeja a una caja, que puede contener un juguete, un disco. Un arreglo que como tener varias cajas.
		// Arreglo es una coleción de elementos del mismo tipo
		
		// tipo[] arreglo = new tipo[tamanoArreglo];
		
		int [] arregloEnteros = new int[10];
		// String [] arregloCadenas = new String[10];
		
		arregloEnteros[0] = 10;
		arregloEnteros[1] = 20;
		arregloEnteros[9] = 90;
		
		System.out.println(arregloEnteros[9]);
		System.out.println("===============");
		
		// Para dar valor a todos los índices del arreglo, se podría hacer de 1 en 1, pero es mucho más eficiente con bucle "for"
		
		for (int i = 0; i < arregloEnteros.length; i++ ) {
			arregloEnteros[i] = i * 10;
			System.out.println("Valor arregloEnteros["+ i +"]: " + arregloEnteros[i]);
		}
	}

}
