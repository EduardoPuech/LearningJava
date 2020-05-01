package graficoSwing;

import java.awt.GraphicsEnvironment;

public class CapturaDeFuentes {
	/*
	 * TODO: este programa es una ayuda que me va a servir para saber quee tipos de
	 * fuentes estaan instaladas en el PC que estoy usando. Para ello voy a utilizar
	 * la clase GraphicsEnvironment
	 */
	public static void main(String[] args) {
		String[] nombresDeFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		for (String i : nombresDeFuentes) {
			System.out.println("Fuente: " + i);
		}
	}
}
