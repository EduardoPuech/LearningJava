package primerosPasos;

public class IncrementoInteresArrayBid {

	/*
	 * TODO dados cinco depoositos bancarios con el mismo capital inicial y distinto
	 * tipo de interes anual constante, sacar por consola una matriz bidimensional
	 * que muestre el incrmento anual hasta los siguientes seis años.
	 */

	public static void main(String[] args) {

		double acumulado; // variable para meter los valores
		double interes = .1; // variable para el tipo de interes
		double[][] saldo = new double[5][6]; // tabla en la que voy a meter los valores, cuantos maas huecos cree maas
												// veces va a hacer el proceso y maas informacioon me va a dar, esto es,
												// ESTA TABLA ES DINAAMICA

		// este bucle llena la tabla
		for (int i = 0; i < 5; i++) {
			saldo[i][0] = 10000; // almaceno los valores fijos en la tabla (los de 10000)
			acumulado = 10000; // reinicio acumulado para el siguiente tipo de interes
			
			for (int j = 1; j < 6; j++) { // j empieza en uno porque la posicioon 0 ya estaa llenada
				acumulado = acumulado + (acumulado * interes); // aplico el interes
				saldo[i][j] = acumulado; // meto los valores en la columna
			}
			interes = interes + .01; // subo el interes para que en el siguiente recorrido del bucle sea 11 y 12...
		}

		// este bucle imprime la tabla
		for (int i = 0; i < 5; i++) {
			System.out.println(); // salto de linea
			
			for (int j = 0; j < 6; j++) {
				System.out.printf("%1.2f", saldo[i][j]);
				System.out.print(" ");
			}
		}
	}
}