package labs;

public class SentenciaSwitch {

	public static void main(String[] args) {
		
		int option = 5;
		String seleccionado = "";
		
		switch(option) {
			case 1: {
				seleccionado = "Opcion 1";
				break; // (Opcional)
			}
			case 2: {
				seleccionado = "Opcion 2";
			}
			case 3: {
				seleccionado = "Opcion 3";
			}
			default: // (Opcional)
				seleccionado = "Opcion no seleccionada";
		}
		
		System.out.println("Opción elegida: " + seleccionado);
		
	}
	
}
