package primerosPasos;

import java.util.*;

public class BucleForEach { // https://www.youtube.com/watch?v=NwztwM_xGgU&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=24

	/*
	 * Bucle incorporado a java para facilitar el recorrido de matrices Conocido
	 * como bucle for each o forMejorado
	 */

	/*
	 * TODO declarar matriz de tipo String, recorrer la matriz con un for,
	 * recorrerla con un for each para ver la diferencia y por uultimo hacer una
	 * matriz rellenada por consola
	 */

	// SINTAXIS
	// for (String nombreVariable: nombreMatriz) {
	// (variable del mismo tipo que la matriz con el nombre que me plazca)
	// coodigo
	// }

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String[] paises = new String[8];
		int[] matrizAleatorios = new int[20];

		/*
		 * paises[0] = "España"; paises[1] = "Meejico"; paises[2] = "Colombia";
		 * paises[3] = "Peruu"; paises[4] = "Chile"; paises[5] = "Argentina"; paises[6]
		 * = "Ecuador"; paises[7] = "Venezuela";
		 */

		// Se puede hacer la declaracion en inicializacioon simultaanea;

//		for (int i = 0; i < paises.length; i++) {
//			
//			System.out.println("Nombre del paiis " + (i+1) + " " + paises[i]);
//
//		}

		for (int i = 0; i < paises.length; i++) {

			System.out.println("Introduzca nombre del paiis " + (i + 1) + " ");
			String texto = input.nextLine(); // recordar crear esto en el lugar adecuado
			paises[i] = texto;

		}

		for (String elementos : paises) { // no necesitas meter rango

			System.out.println("Nombre del paiis: " + elementos); // en caso de que quisiese ordenar tendriia que crear
																	// una variable como por ejempo un i++;
		}
		
		for (int posicion = 0; posicion < matrizAleatorios.length; posicion++) {
			
			matrizAleatorios[posicion] = (int) (Math.random() *100);

		}
		
		for (int numeros : matrizAleatorios) { // no necesitas meter rango

			System.out.print(numeros + " "); // en caso de que quisiese ordenar tendriia que crear
																	// una variable como por ejempo un i++;
		}

	}
}