package primerosPasos;

public class MatricesArraysArreglos { // https://www.youtube.com/watch?v=UID_EKKfpcE&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=23

	/*
	 * Matriz, array y arreglo es lo mismo, en distintos sitios se usa una cosa u
	 * otra
	 * 
	 * Es una estructura de datos que contiene una coleccioon de valores del mismo
	 * tipo
	 * 
	 * Sirve para almacenar valores relacionados entre sii (cuando son muchas
	 * variables iguales y relacionadas usas esto
	 * 
	 * empieza a contar las posiciones en 0, no en 1 (igual que el String) no
	 * confundir que si tiene 5 elementos sea int [4], simplemente empieza a contar
	 * las posiciones internas desde 0
	 */
	// int [5]-> 5 elementos-> posicioon 0,1,2,3,4

	/*
	 * El bucle ideal para recorrer una matriz es for ya que see cual es el nuumero
	 * de elementos de la matriz y por tanto marca el nuumero de repeticiones del
	 * bucle
	 * 
	 * array tambien tiene .length().
	 */

	// SINTAXIS

	// declarar: int[] miMatriz = new int [10];
	// iniciar: miMatriz[0] = 1;
	// iniciar y declarar en misma linea: int[] miMatriz = {1,2,3,4,5};
	// tipoDeDato [especifico que esto es una matriz] nombreMatriz =
	// new (operador) tipoDeDato [nuumero de datos que hay en la matriz]
	// int[] matrizPrueba = new int [i];
	// int i = 0; si quiero una matriz que vaya aumentando puedo hacer esto

	public static void main(String[] args) {

		// declarar
		int[] miMatriz = new int[5];
		// iniciar
		miMatriz[0] = 5;
		miMatriz[1] = 38;
		miMatriz[2] = -15;
		miMatriz[3] = 92;
		miMatriz[4] = 71;
//		int[] miMatriz = { 5, 38, -15, 92, 71 };

		// ver el valor de una posicioon concreta
		// System.out.println("El valor en esta posicioon 3 es " + miMatriz[3]);
		// sin bucle si quiero todos los demaas valores un print por cada posicioon

		// con bucle recorre toda la matriz
		for (int i = 0; i < 5; i++) {

			System.out.println("El valor del iindice " + i + " es " + miMatriz[i]);
		}

		// declaracioon e inicio simultaneos
		int[] miMatriz2 = { 7, 19, 57, -12, 90 };

		for (int i = 0; i < 5; i++) {

			System.out.println("El valor del iindice " + i + " es " + miMatriz2[i]);
		}
	}

}
