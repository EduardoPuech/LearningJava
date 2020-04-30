package graficoSwing;

import java.awt.*;
import java.awt.geom.*;
import java.awt.geom.Ellipse2D.Double;

import javax.swing.*;

public class FrameConGraphics2D {

	/*
	 * TODO: Tomaando de coodigo base FrameConFigura voy a utilizar la clase
	 * Graphics2D para ver su utilizacioon.
	 */

	public static void main(String[] args) {
		FrameWithG2D myFrame = new FrameWithG2D();
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class FrameWithG2D extends JFrame {

	public FrameWithG2D() {
		setTitle("Prueba con un dibujito");
		setSize(400, 400);
		LaminaConG2D myPanel = new LaminaConG2D();
		add(myPanel);
	}
}

// Aquii es donde tengo que empezar a cambiar cosas
class LaminaConG2D extends JPanel {

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
///		 // Hasta aquii es igua que FrameConFigura
		// para utilizar un objeto de tipo Graphics2D CASTEO:
		Graphics2D g2 = (Graphics2D) g;
		// utilizo la clase Rectangle2D.double para instanciar un objeto
		Rectangle2D rectangulo1 = new Rectangle2D.Double(100, 100, 200, 150); // (x,y,ancho,alto)
		// Rectangle2D.Double hereda de Rectangle2D luego por el principio de
		// sustitucioon puedo instanciar aunque Rectangle2D sea abstracta

		// Ahora utilizando el meetodo draw de la clase G2D que pide un argumento de la
		// interfaz Shape (rectangulo1 cumple esa condicioon):
		g2.draw(rectangulo1);

		/*
		 * Ahora voy a dibujar una elipse. Para dibujar una elipse le doy un rectaangulo
		 * que tenga circunscrita la elipse que quiero
		 */
		// Aquii la instancio sin argumentos
		Ellipse2D elipse = new Ellipse2D.Double();
		// Aquii hago el rectaangulo en el que la voy a circunscribir: daandole uno ya
		// hecho o creando otro con el mismo constructor que Rectangle2D
		elipse.setFrame(rectangulo1);
		// y ahora la pinto: (loogicamente la pinta sin el rectaangulo, en este caso se
		// ve porque en la linea 47 le estoy diciendo que me pinte tambieen el
		// rectaangulo.
		g2.draw(elipse);
		// voy a pintar una linea usando g2d directamente, instanciaandola
		g2.draw(new Line2D.Double(100, 100, 300, 250)); // ademaas lo he hecho para que coincida con las medidas del
														// rectaangulo
//		// si pinto una linea pasaandole paraametros: esta NO ES G2D.
//		g2.drawLine(10, 10, 200, 15);

		/*
		 * Ahora voy a pintar una circunferencia que englobe al rectaangulo utilizando
		 * el meetodo getCenter(para x e y) que aplicaandolo a dicho rectaangulo me dice
		 * donde estaan el centro en x y en y: eso lo meto en dos variables y se lo paso
		 * al ciirculo como punto central:
		 */
		double centroX = rectangulo1.getCenterX(); // si quiero puedo castear a int
		double centroY = rectangulo1.getCenterY();
		double radio = 150; // cojo el alto del rectaangulo como radio
		Ellipse2D circulo = new Ellipse2D.Double();
		circulo.setFrameFromCenter(centroX, centroY, centroX + radio, centroY + radio);
		g2.draw(circulo);
	}
}
