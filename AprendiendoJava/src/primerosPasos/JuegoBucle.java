package primerosPasos;

import javax.swing.*;

public class JuegoBucle { // mejorado en un do while en BucleDoWhile

	// TODO un juego en el que la maaquina genera un nuumero que no conozco de 0 a
	// 100 y tengo que averiguarlo, el propio juego me da pistas (<...) utilizo
	// swing

	public static void main(String[] args) {
		// TODO pistas, generar el nuumero, hacer el swing, mensaje outOfBounds

		// generar el nuumero aleatorio

		final int variable = (int) (Math.random() * 100); // de 0 a 100, excluye 101 (si quiero que sea desde 10
															// tengo que poner *101+40)
		int numero = 0; // creo e inicializo (a 0 porque es int) la variable de captura de swing
		int numeros = 0; // creo un contador de todos los numeros que hago TIENE QUE ESTAR FUERA, si no
							// el bucle la reinicia cada vez que empieza

		// bucle para la insercion de numero

		while (variable != numero) {

			numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un nuumero")); // swing creado y pasado
																								// a int
			numeros++; // aumento 1 cada vez que se ejecuta el bucle el nuumero de intentos

			// pistas creadas
			if (numero > variable) {

				System.out.println("Menos " + numero);

			} else if (numero < variable) {

				System.out.println("Maas " + numero);

			}
		}
		System.out.println("Vaya genio, has utilizado " + numeros + " intentos y el nuumero era " + variable);
	}

}
