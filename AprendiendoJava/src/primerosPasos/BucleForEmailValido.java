package primerosPasos;

import java.util.*;

public class BucleForEmailValido {

	/*
	 * TODO Crear un programa que compruebe si la direccioon de correo electroonico
	 * introducida por consola es vaalida. Las condiciones son: tiene que haber al
	 * menos un diigito alfanumeerico, seguido de un uunico @ seguido de al menos
	 * otro diigito alganumeerico, despuees tiene que estar un punto y despues un
	 * maaximo de tres letras
	 * 
	 * Utilizando al menos un bucle for
	 */

	/*
	 * INTENTO OPTIMIZACIOON
	 * 
	 * 1 -> He intentado meter el bucle que busca el segundo punto dentro del busque
	 * que busca el segundo @ para no tener que crear un for solo para darle la
	 * posicioon --> no es un planteamiento vaalido porque si luego se cumpliese la
	 * condicioon de un solo punto reiniciariia la condicioon
	 * 
	 * 2 -> He intentado hacer solo una condicioon de salida para reducir el nuumero
	 * de variables pero no funciona ya que si hay dos @ pero un solo punto el
	 * coodigo del punto reinicia la condicioon del arroba y se va todo al
	 * carajillo.
	 * 
	 * 
	 * Sii podriia reutilizar una de las de punto o arroba para lo del espacio ya
	 * que dada cualquier situacioon en la que haya un espacio es invaalida pero a
	 * efectos de ensennanza con poner este comentario es suficiente
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); // creo la entrada por consola
		System.out.println("Introduzca su direccioon de correo"); // texto para empezar a interactuar
		String texto = input.nextLine(); // almaceno la entrada por consola para poder hacer comparaciones
		char vacio = ' '; // para asegurarme de que no hay ninguun espacio
		boolean condArroba = false; // variable que utilizo como condicioon para el if final, se actualiza en cada
		// bucle (si entra)
		boolean condPunto = false; // variable para la condicioon punto
		boolean condEspacio = true; // variable para la condicioon de espacios
		int longitud = texto.length(); // longitud del correo introducido para saber cuaanto tiene que durar el bucle
		int salidaBucle = 0; // condicion salida de bucle para da valor en aambito local a contarDesde
		int contarDesde = 0; // variable utilizada para guardar la posicioon desde la que tengo que empezar a
								// buscar para distintos casos

		// este bucle busca si hay un @ en el input
		for (int i = 0; i < (longitud); i++) {
			// pongo la salida de ambos bucles para que no cierre el segundo y vuelva a
			// hacer el primero hasta el final
			// no pongo longitud-1 ya que al ser un menor absoluto la posicioon no llega
			// hasta eel
			if (texto.charAt(i) == '@') { // comparo cada posicioon del bucle con un @
				condArroba = true; // si lo encuentro cambio el arroba para que al final salga vaalido (se cumple
									// la primera condicioon)
				contarDesde = i; // utilizo esta variable para la comprobacioon de si hay maas arrobas
				// con este busco si hay alguun arroba o espacio despues del primero
				for (i = contarDesde + 1; i < (longitud); i++) { // empieza a contar desde el
																	// anterior
					if (texto.charAt(i) == '@') { // vuelvo a comparar
						condArroba = false; // si hay maas de un arroba arroba vuelve a false para que vuelva a ser
											// email incorrecto
					}
				}
			}
		}

		// este genera la posicioon desde la que voy a buscar el punto
		for (int j = 0; j < (longitud) && salidaBucle != 1; j++) {
			if (texto.charAt(j) == '@') {
				salidaBucle++;
				contarDesde = j; // variable donde guardaba la posicioon de buusqueda
			}

			// este busca, a partir del @ (contarDesde), si hay un punto, misma estructura
			// que el @
			for (j = contarDesde + 1; j < (longitud); j++) {
				if (texto.charAt(j) == '.') {
					condPunto = true;
					contarDesde = j;// actualizo la posicioon de inicio a donde estaa el punto
					for (j = contarDesde + 1; j < (longitud); j++) {
						if (texto.charAt(j) == '.') {
							condPunto = false;
						}
					}
				}
			}
		}

		// este busca espacios
		for (int i = 0; i < longitud; i++) { // como i es local a cada bucle puedo usarla tantas veces como guste
			if (texto.charAt(i) == vacio) {
				condEspacio = false;
			}
		}

		if (texto.charAt(0) == '@' || texto.charAt(0) == '.' || texto.charAt(longitud - 1) == '@'
				|| texto.charAt(longitud - 1) == '.') {
			// si el primer o el uultimo valor es . oo @ no es vaalida
			// va al final porque si no los bucles me cambian el valor
			condArroba = false;
		}

		if (condArroba == false || condPunto == false || condEspacio == false) { // si alguna de las condiciones falla
																					// no es vaalida
			System.out.println("Direccioon de correo no vaalida");

		} else {
			System.out.println("Direccioon de correo vaalida");
		}
	}
}
