package primerosPasos;

public class MatrizBidimensional { // https://www.youtube.com/watch?v=_tUncS0AsNE&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=25

	/*
	 * En java las matrices bidimiensionales (nxm) no existen per se, son arrays
	 * anidados. Graaficamente se parecen a una tabla, SOLO graaficamente.
	 * 
	 * Seriia como dos iindices, uno para vertical y otro para horizontal. Realmente
	 * es, cuando utilizas el "columnas" pasa a ser "filas"
	 * 
	 * Existen los multidimensionales aunque parecen ser complejos (nxmxl) como un
	 * cubo
	 */

	/*
	 * TODO: declarar una matriz de dos dimensiones que va a almacenar 20 elementos
	 * (4x5 || 5x4) y rellenarla de manera manual para verlo por lo menos una vez.
	 */

	// SINTAXIS
	// int[][] nombreMatriz = new int [n][m];
	// tantos[] como dimensiones tenga

	public static void main(String[] args) {

		int[][] matriz = new int[4][5];

		// rellenado manual, puedo mezclar los valores, mientras el n y el m esteen bien
		// puestos da igual cuaal metas antes
		matriz[0][0] = 12;
		matriz[0][1] = 51;
		matriz[0][2] = 24;
		matriz[0][3] = 21;
		matriz[0][4] = 76;

		matriz[1][0] = 75;
		matriz[1][1] = 34;
		matriz[1][2] = 98;
		matriz[1][3] = 12;
		matriz[1][4] = 43;

		matriz[2][0] = 72;
		matriz[2][1] = 26;
		matriz[2][2] = 59;
		matriz[2][3] = 23;
		matriz[2][4] = 43;

		matriz[3][0] = 15;
		matriz[3][1] = 15;
		matriz[3][2] = 76;
		matriz[3][3] = 84;
		matriz[3][4] = 23;

		int[][] matriz2 = { // para declarar e inicilizar de una vez se ponen 2 llaves
				{ 12, 31, 2, 1, 87 }, { 65, 12, 2, 3, 41 }, { 54, 9, 123, 54, 1 }, { 21, 43, 65, 87, 88 } };

		// para imprimir todos los valores tengo que hacer dos bucles, uno recorreraa el
		// primer grupo de iindices y el otro el segundo

		// primer bucle que recorre el indice 1
//		for (int i = 0; i < 4; i++) { // empieza a 0
//			System.out.println(); // salto de linea para que el print lo haga bonito en tabla
//
//			// bucle anidado que recorre el indice 2
//			for (int j = 0; j < 5; j++) { // este no para hasta que j llega hasta el uultimo, una vez llega vuelve al
//											// anterior y comienza otra vez
//
//				System.out.print(matriz[i][j] + " ");
//
//			}
//
//		}

		// array for each
		for (int[] fila : matriz2) {
			System.out.println();
			for (int z : fila) {
				System.out.print(z + " ");
			}
		}
	}

}
