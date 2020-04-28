package primerosPasos;

import javax.swing.*; //Este es el que me da ventanita

public class EntradaJOption {

	public static void main(String[] args) {

		// Son meetodos estaaticos luego hay que usarlo con JOptionPane.loquesea

		String nombre = JOptionPane.showInputDialog("Introduce tu nombre por favor"); // creo la ventana de
																						// introduccioon de nombre
		String edad = JOptionPane.showInputDialog("Introduce tu edad"); // creo la ventana de introduccioon de edad
		String radicando = JOptionPane.showInputDialog("Introduzca radicando"); // creo la ventana de introduccioon del
																				// radicando

		int edad2 = Integer.parseInt(edad); // convierto el String que he metido de edad en un int para poder operar con
											// eel
		double raiz = Double.parseDouble(radicando); // convierto el radicando en un double (porque va a necesitar
														// decimales

		edad2++; // incremento para la edad del anno que viene

		System.out.println(nombre + "\n" + edad + " \nEl anno que viene tendraas " + edad2 + " annos"); // concatenador
		
		System.out.printf("La raiiz cuadrada de " + radicando + " es " + "%1.2f", Math.sqrt(raiz)); // formato de
																									// dos decimales
		System.out.println("\nHola");// pongo el \n para el salto de linea del printf anterior

	}

}
