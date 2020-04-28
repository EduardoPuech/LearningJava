package primerosPasos;

import java.util.*;

public class EntradaScanner {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in); // new (constructor) Scanner (meetodo) System.in (consola)
													// instanciar o ejemplarizar

		System.out.println("Introduce tu nombre por favor: ");

		String nombre = entrada.nextLine(); // creo una variable en la que voy a meter lo que me da la consola.
											// ATENCIOON: depuees del println porque si no pide primero la info y
											// luego hace el print

		System.out.println("Introduzca su edad por favor: ");

		int edad = entrada.nextInt();

		System.out.println("Hola " + nombre + ", buenos diias. El anno que viene tendraas " + (edad + 1) + " años.");

		// edad++; aqui estaria usando un incremento
		// System.out.println("Hola " + nombre + ", buenos diias. El anno que viene
		// tendraas " + edad + " años.");
	}
}
