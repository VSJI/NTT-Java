package labs;

public class SentenciaForEach {

	public static void main(String[] args) {
		
		int tabla;
		int[] tabla2 = new int[10];
		int[] tabla3 = {1,2,3,4,5,6};
		
		tabla2[0] = tabla3[1];
		tabla = tabla3[2];
		
//		System.out.println("\n" + tabla3[0]);
//		System.out.println("\n" + tabla3[5]);
//		System.out.println("\n" + tabla2[0]);
//		System.out.println("\n" + tabla);
//		System.out.println(tabla3.length);
//		System.out.println(tabla2.length);
		
		for (int i = 0; i < tabla3.length; i++) {
			System.out.println("Vuelta For: " + tabla3[i]);
		}
		
		System.out.println("\n");
		
		for (int posicion: tabla3) {
			System.out.println("ForEach: " + posicion);
		}
		
	}
	
}
