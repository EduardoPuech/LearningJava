package primerosPasos;

import javax.swing.*;

public class BuclesWhile { // Estructura de control de flujo de ejecucioon

	/*
	 * Dos cateogiias: indeterminados (no sabes cuantas veces se va a repetir:
	 * while, to while) y determinados (sabes sin necesidad de ejecutar el programa
	 * cuantas veces se va a ejecutar for, for - each)
	 */

	// while (condicion) { **intentar igualar siempre a falso ya que (linea 15)**
	// codigo
	// }

	public static void main(String[] args) { // no pongo la condicioon a negativo para que sea maas sencillo ya que si
												// fuese a positivo se cortariia si fallo y se no parariia si acierto

		// ESTO ES LO QUE HACE EL Y LO COPIO PORQUE METE UN IF EN EL WHILE
		final String clave = "Eduardo";
		String pass = ""; // tengo que iniciarla para que no me de error en la condicioon del bucle

		while (clave.equals(pass) == false) { // si la condicioon no se cumple salto el bucle
			pass = JOptionPane.showInputDialog("Introduzca contrasenna"); // esto actualiza el valor de pass
			if (clave.equals(pass) == false) { // si esto se cumple repite
				System.out.println("Pruebe otra vez");
			} // aquii es el punto de retorno
		} // salto hasta aquii y sigo ejecutando

		System.out.println("Correcto");

		// ESTO ES LO QUE HICE YO QUE PARECE FAACIL o por lo menos maas raapido
		/*
		 * final String clave = "Eduardo";
		 * 
		 * String inicio = JOptionPane.showInputDialog("Introduzca contrasenna");
		 * 
		 * while (clave.equals(inicio) == false) {
		 * 
		 * inicio = JOptionPane.showInputDialog("Pruebe otra vez"); }
		 * 
		 * System.out.println("Correcto");
		 * 
		 */

	}
}
