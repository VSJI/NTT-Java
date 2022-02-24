package Matrices;

public class Main {

	public static void main(String[] args) {

		/* Matriz: arreglo bidimensional */
		
		int[][] matriz = new int[3][4]; 
		
		matriz[0][0] = 77;
		System.out.println("Valor matriz[0][0]: " + matriz[0][0]);
		
		System.out.println("Tamaño filas: " + matriz.length);
		System.out.println("Tamaño columnas: " + matriz[0].length + "\n");
		
//		for (int i = 0; i < matriz.length; i++) {
//			for (int x = 0; x < matriz[0].length;x++) {
//				matriz[i][x] = 5;
//			}
//		}
		
		for (int i = 0; i < matriz.length; i++) {
			for (int x = 0; x < matriz[0].length;x++) {
//				matriz[i][x] = 5;
				System.out.println(matriz[i][x]);
			}
			System.out.println("\n");
		}
		
	}

}
