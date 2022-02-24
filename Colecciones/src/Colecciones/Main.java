package Colecciones;

import java.util.ArrayList;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {

		// 4 tipos de colecciones principales (hay otros menos utilizados)
		
		// ArrayList. Guarda la información en forma de lista, no es necesario definir tamaño inicialmente aunque se puede.
		
		
			ArrayList datos = new ArrayList();
			
			// Ejemplo definiendo tamaño:
			//ArrayList datos2 = new ArrayList(10);
			// Aunque el tamaño del ArrayList sea indicado, solo se cuentan los elementos el ArrayList rellenos. Sirve para delimitar el ArrayList.
			
			// Insertar datos
			datos.add(5);
			datos.add(10);
			
			for (int i = 0; i < 10; i++) {
				datos.add(i + 1);
			}
			
			
			System.out.println("\nValor obtenido del ArrayList: " + datos.get(1));
			System.out.println("\nValor longitud del ArrayList: " + datos.size());
		
		// Stack - Pila. Es una estructura que permite guardar elementos dinamicamente dentro de ella de forma LIFO (Ultimo en entrar, primero en salir). 
		// Se van añadiendo elementos
			
			// Push - Para insertar elementos en la parte posterior de la pila
			// Pop - Eliminar elementos (último elemento añadido)
			
			Stack miPilaLibros = new Stack();
			
			miPilaLibros.push("Libro1");
			miPilaLibros.push("Libro2");
			miPilaLibros.push("Libro3");
			miPilaLibros.push("Libro4");
			
			// En esta Pila, de forma similar a libros encima de otros en una columna, 
			// de la cual cogeríamos los libros del que está más arriba al que está más abajo. Los libros estarían en este orden:
			// 1. Libro4
			// 2. Libro3
			// 3. Libro2
			// 4. Libro1
			
			// miPilaLibros.clear(); Esto limpia la pila
			
			String elemento;
			
			// miPilaLibros.pop(); Esto elimina el último elemento que fue añadido de la pila
			
			elemento = (String)miPilaLibros.pop();
			
			System.out.println("\nEl ultimo elemento añadido fue: \"" + elemento + "\", y por eso es el primer elemento que se muestra por consola");
			
			// Importante castear a String la pila, ya que inicialmente la definimos sin ningún tipo.
			
		// Queue
		// HastTable
		
	}

}
