package labs;

public class Incrementales {

	public static void main (String[] args) {
		
		int a = 10;
		
		a++;	//a = 11
		a--;	//a = 10
		
		System.out.println("Valor de \"a\":\n" + a);

		// pre-incremento o pre-decremento
		
		int x = 10;
		
		//++x;	//x = 9
		//--x;	//x = 10
		
		//System.out.println("\nValor inicial \"x\" = " + x + " || x++ = " + x++ + " || Resultado \"x\" = " + x);
		//System.out.println("\nValor inicial \"x\" = " + x + " || ++x = " + ++x + " || Resultado \"x\" = " + x);
		//System.out.println("\nValor inicial \"x\" = " + x + " || x-- = " + x-- + " || Resultado \"x\" = " + x);
		//System.out.println("\nValor inicial \"x\" = " + x + " || --x = " + --x + " || Resultado \"x\" = " + x);
		
		x = 0;
		//el último incremento no tiene efecto
		//x = x++ + 1 + x++; //x = 0 + 1 + 1. Cuidad, el segundo "1", es del primer x++, no es del segundo x++
		//System.out.println("\nValor \"x\" = " + x); //2
		
		//Correcto
		x = x++ + 1 + x; //x = 0 + 1 + 1
		x++; //Suma 1. Esto hay que hacerlo para ejecutar el primer post-incremento, es decir el primer "x++"
		System.out.println("\nValor \"x\" = " + x); //3
		
		
	}
	
}
