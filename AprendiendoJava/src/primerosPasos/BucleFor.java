package primerosPasos;

public class BucleFor {

	/*
	 * Bucle determinado, esto es, see cuantas veces se va a ejecutar antes de que
	 * se ejecute. coodigo inicio| coodigo condicioon (hasta cuando se repite)|
	 * coodigo contador (la manera de incrementar el nuumero de veces que se ha
	 * repetido
	 */

	// for (inicio bucle, condicioon, contador bucle) {
	// coodigo
	// }

	public static void main(String[] args) {

		// imprimir en consola n nuumero de veces nuestro nombre como queramos
		// (condicioon)

		// ejemplo sencillo de abajo a arriba
		for (int i = 0/* iniciacioon, suele usarse i o j */; i < 10 /* cuaantas veces se repite: de 0 a 9 hay 10 */; i++) {
			// i++ es la velocidad a la que aumenta, puede ser de lo que sea en lo que sea.
			System.out.println("Te quiero mamaa");
		}

		// ejemplo sencillo de arriba a abajo, es lo mismo, pero si estoy cogiendo como
		// condicioon otra parte del coodigo puede ser maas uutil en funcioon de la
		// necesidad
		for (int i = 10; i > 0; i -= 2) { // annado en este ejemplo el salto de dos en dos
			System.out.println("Supa dupa");
		}

	}

}
