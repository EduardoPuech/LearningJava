package graficoSwing;

import java.awt.GraphicsEnvironment;

import javax.swing.*;

public class CapturaDeFuentes {
	/*
	 * TODO: este programa es una ayuda que me va a servir para saber quee tipos de
	 * fuentes estaan instaladas en el PC que estoy usando. Para ello voy a utilizar
	 * la clase GraphicsEnvironment
	 */
	public static void main(String[] args) {

		String fuente = JOptionPane.showInputDialog("Introduce fuente");
		boolean comprueboFuente = false;
		String[] nombresDeFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

		for (String i : nombresDeFuentes) {
			if (i.equalsIgnoreCase(fuente)) {
				comprueboFuente = true;
			}
		}
		
		if (comprueboFuente) {
			System.out.println("Fuente instalada");
		} else {
			System.out.println("No estaa instalada dicha fuente");
		}
	}
}
