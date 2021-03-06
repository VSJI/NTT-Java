package Colecciones;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {

		// 4 tipos de colecciones principales (hay otros menos utilizados)
		
		// ArrayList. Guarda la informaci?n en forma de lista, no es necesario definir tama?o inicialmente aunque se puede.
		
		
			ArrayList datos = new ArrayList();
			
			// Ejemplo definiendo tama?o:
			//ArrayList datos2 = new ArrayList(10);
			// Aunque el tama?o del ArrayList sea indicado, solo se cuentan los elementos el ArrayList rellenos. Sirve para delimitar el ArrayList.
			
			// Insertar datos
			datos.add(5);
			datos.add(10);
			
			for (int i = 0; i < 10; i++) {
				datos.add(i + 1);
			}
			
			
			System.out.println("\nValor obtenido del ArrayList: " + datos.get(1));
			System.out.println("\nValor longitud del ArrayList: " + datos.size());
		
		// Stack - Pila. Es una estructura que permite guardar elementos dinamicamente dentro de ella de forma LIFO (Ultimo en entrar, primero en salir). 
				
				// Se van a?adiendo elementos
				// Push - Para insertar elementos en la parte posterior de la pila
				// Pop - Eliminar elementos (?ltimo elemento a?adido)
				
				Stack miPilaLibros = new Stack();
				
				miPilaLibros.push("Libro1");
				miPilaLibros.push("Libro2");
				miPilaLibros.push("Libro3");
				miPilaLibros.push("Libro4");
				
				// En esta Pila, de forma similar a libros encima de otros en una columna, 
				// de la cual coger?amos los libros del que est? m?s arriba al que est? m?s abajo. Los libros estar?an en este orden:
				// 1. Libro4
				// 2. Libro3
				// 3. Libro2
				// 4. Libro1
				
				// miPilaLibros.clear(); Esto limpia la pila
				
				String elemento;
				
				// miPilaLibros.pop(); Esto elimina el ?ltimo elemento que fue a?adido de la pila
				
				elemento = (String)miPilaLibros.pop();
				
				System.out.println("\nEl ultimo elemento a?adido fue: \"" + elemento + "\", y por eso es el primer elemento que se muestra por consola");
				
				// Importante castear a String la pila, ya que inicialmente la definimos sin ning?n tipo.
			
		// Queue - Cola. FIFO, First In First Out. IMPORTANTE, no es recomendable fijar un tama?o ya que es din?mico, aunque se puede
			
				// -> Add - Para insertar elementos en la cola
				// -> poll - Para eliminar el primer elemento de la cola
				// -> peek - Para consultar el primer elemento de la cola
			
				// Ejemplo de contexto: la fila de un cine para comprar entradas.
			
				//Queue NO es una clase, es una interfaz, por eso no es correcto "new Queue()" sino que se usa "new LinkedList()"
				
				Queue cola = new LinkedList();
				
				// Restringir la cola con tipo Integer:
				Queue<Integer> cola2 = new LinkedList();
				
				cola.add(5);
				cola.add(10);
				cola.add(15);
				
				System.out.println("Cola:\n" + cola + "\n");
				System.out.println("Primer elemento de la cola:\n" + cola.peek() + "\n");
				System.out.println("Eliminamos elemento de la cola: \"" + cola.poll() + "\", y queda en la cola:\n" + cola + "\n");
			
			
			
		// HastTable <K, V> K=Key, V=Value
		
				Hashtable tabla2 = new Hashtable<>();
				
				// Este Hastable que creamos es para contenter Enteros para nuestras KEYS y Strings para nuestros VALORES
				// Hashtable<Integer, String> tabla2 = new Hashtable<>(); 
				
				tabla2.put(1, "Apple");
				tabla2.put(2, "Sony");
				tabla2.put(6, "Samsung");
				
				tabla2.put("Ferrari", 400);
				
				System.out.println("Hashtable:\n" + tabla2 + "\n");
				System.out.println("Hashtable tabla2.get(2):\n" + tabla2.get(2) + "\n");
				System.out.println("Hashtable tabla2.get(Ferrari):\n" + tabla2.get("Ferrari") + "\n");
	}

}
