package primerosPasos;

import java.util.*;

public class PesoIdeal {

	/*
	 * TODO hacer un calculador del peso ideal de cada persona a travees de consola
	 * utilizando la proporcioon hombre = altura - 110 y mujer = altura - 120; en un
	 * bucle do while
	 */

	public static void main(String[] args) {

		// Creo las cosas
		Scanner input = new Scanner(System.in); // creo la entrada por consola
		String valor = ""; // inicializo para poder usarla luego
							// lo hago con String en vez de int para practicar.equals
		int pesoIdeal; // si la inicializo aquii no tengo que hacer un print para cada if

		do { // instrucciones al consumidor y comprobacioon de que el valor que me han dado
				// es el correcto, si no lo es vuelve a saltar hasta que lo sea, tantas veces
				// como sea necesario
			System.out.println("Pulse H si es hombre o M si es mujer");
			valor = input.nextLine(); // asigno el valor recibido por consola a valor para poder comparar
		} while (valor.equalsIgnoreCase("H") == false && valor.equalsIgnoreCase("M") == false); // utilizo IgnoreCase
																								// para que no tenga que
																								// ser en mayuuscula

		if (valor.equalsIgnoreCase("H")) { // si es hombre aplica la ecuacioon del hombre
			System.out.println("Introduzca su altura en cm");
			// Scanner input2 = new Scanner(System.in); NO HACE FALTA crear otro input, se
			// repite por local
			pesoIdeal = input.nextInt() - 110; // recordar que puedo meter esto directamente en el print

		} else { // para todo otro caso salta esto, como solo le he dado opcioon de h o m porque
					// si me dan otra cosa se reinicia el bucle no necesito un else if que
					// especifique que tenga que ser m
			System.out.println("Introduzca su altura cm");
			pesoIdeal = input.nextInt() - 120;
		}

		System.out.println("Su peso ideal es de " + pesoIdeal + " kilos");
	}
}
