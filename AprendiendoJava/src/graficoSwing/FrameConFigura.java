package graficoSwing;

import java.awt.*;

import javax.swing.*;

public class FrameConFigura {

	/*
	 * En este lo que voy a hacer es lo mismo que en la de FrameConTexto pero con un
	 * dibujito (en este caso un rectaangulo utilizando el meetodo drawRect de la
	 * clase JPanel.
	 */

	public static void main(String[] args) {

		FrameWithFigure myFrame = new FrameWithFigure();
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

// Lo primero creamos el marco
class FrameWithFigure extends JFrame {

	// Creo el constructor
	public FrameWithFigure() {
		setTitle("Prueba con un dibujito");
		setSize(400, 400);
		LaminaConDibujo myPanel = new LaminaConDibujo();
		add(myPanel);
	}
}

// Despuees creo la laamina sobre la que pinto
class LaminaConDibujo extends JPanel {

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		// esto pinta un rectaangulo en la posicioon y con las medidas(x, y, ancho,
		// alto)
		g.drawRect(50, 50, 200, 100);

		// a modo de praactica voy a annadir maas cosas en la misma ventana.
		g.drawString("Eres caca humana", 15, 15);
		g.drawLine(80, 80, 180, 80); // x e y del primer y segundo puntos
		g.drawArc(20, 300, 350, 400, 50, 50); // x e y de comienzo, ancho y alto del arco, aangulo
																// inicial y final del arco
	}
}