package graficoSwing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.SystemColor;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FrameConColor {

	/*
	 * TODO: Tomaando de coodigo base FrameGraphics2D voy a utilizar la clase
	 * Graphic2D, el meetodo setColor para ver su utilizacioon cambiando colorines.
	 */

	public static void main(String[] args) {
		FrameWithColor myFrame = new FrameWithColor();
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class FrameWithColor extends JFrame {

	public FrameWithColor() {
		setTitle("Prueba con un color");
		setSize(400, 400);
		LaminaConColor myPanel = new LaminaConColor();
		add(myPanel);
		// con el meetodo setBackground le doy color a toda la laamina (EN EL
		// CONSTRUCTOR):
		myPanel.setBackground(Color.PINK);
//		myPanel.setBackground(SystemColor.window); // esta instruccioon le da el color predeterminado de las ventanas
		// del S.O. en el que estaa. Ahora parece inuutil, pero cuando tienes maas de
		// una ventana superpuesta puede no serlo.
	}
}

class LaminaConColor extends JPanel {

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		// dibujo y relleno el rectaangulo
		Rectangle2D rectangulo1 = new Rectangle2D.Double(100, 100, 200, 150);
		g2.setPaint(Color.RED); // con esto le doy el color
		g2.fill(rectangulo1); // con esto relleno toda la figura
		Color colorRectangulo = new Color(0, 0, 255);
		g2.setPaint(colorRectangulo);
		g2.draw(rectangulo1);
		// con la elipse voy a utilizar el meetodo RGB
		Ellipse2D elipse = new Ellipse2D.Double();
		elipse.setFrame(rectangulo1);
		g2.setPaint(new Color(109, 172, 59)/* .brighter() */); // instancio la clase Color para el constructor de RGB y
																// meto las cantidades que yo quiera puedo hasta
																// concatenar dos meetodos (los meetodos brighter y
																// darker se pueden acumular). Quizaa lo mejor es
																// construir la instanca independiente y luego ya
																// meterla:

		// Color myColor = new Color (y aquii uso las constantes de clase, el RGB...)
		g2.fill(elipse);
	}
}