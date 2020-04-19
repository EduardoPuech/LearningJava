package primerosPasos;

import javax.swing.JOptionPane;

//test for git

public class BucleDoWhile {

	// SINTAXIS
	// do{
	// codigo
	// }while(condicion);

	// lo mismo que el while, pero obliga a que el bucle se ejecute una vez
	// por ejemplo, en el juego de JuegoBucle genera directamente un 0, saltariia el
	// bucle sin nada. Con esto se ejecutaria al menos 1 vez, esto es, aunque genere
	// ese 0, al pedir que le metas un nuevo valor a numero ya comprueba la
	// condicioon con mi valor en vez de con el 0 de la inicializacion

	public static void main(String[] args) {

		// int variable = (int) (Math.random() * 100);
		int varibleParaDo = 0; // fuerzo a que la condicioon se cumpla
		int numero = 0;
		int numeros = 0;

		do {

			numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un nuumero")); //cambio numero
			numeros++;

			if (numero > varibleParaDo) {

				System.out.println("Menos " + numero);

			} else if (numero < varibleParaDo) {
				System.out.println("Maas " + numero);

			}
		} while (varibleParaDo != numero);
		System.out.println("Vaya genio, has utilizado " + numeros + " intentos y el nuumero era " + varibleParaDo);

	}
}
