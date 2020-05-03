package graficoSwing;

import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.awt.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagLayout;
import java.awt.RenderingHints;

import javax.swing.*;

public class CapturaDeFuentes {
	/*
	 * TODO: este programa es una ayuda que me va a servir para saber quee tipos de
	 * fuentes estaan instaladas en el PC que estoy usando. Para ello voy a utilizar
	 * la clase GraphicsEnvironment. Ademaas voy a hacer primero una ventana en la
	 * que se escriban todos los nombres de las instaladas y luego va a tener un
	 * buscador en el que si ya me see el nombre me indique si estaa instalada o no.
	 */
	public static void main(String[] args) {

		FrameConFuentes frameFuente = new FrameConFuentes();
		frameFuente.setTitle("Listado de fuentes instaladas en el PC");
		
		JScrollPane barraScroll = new JScrollPane();
		barraScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

		String[] nombresDeFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		String fuente = JOptionPane.showInputDialog("Introduce fuente");
		boolean comprueboFuente = false;

		for (String i : nombresDeFuentes) {
			if (i.equalsIgnoreCase(fuente)) {
				comprueboFuente = true;
			}
		}

		if (comprueboFuente) {
			JOptionPane.showMessageDialog(null, "Fuente instalada");
		} else {
			JOptionPane.showMessageDialog(null, "No estaa instalada dicha fuente");
		}
	}

}

// Con esta clase voy a crear un Frame en el que voy a pintar la lista de todas
// las fuentes que hay instaladas en la maaquina. Si no se entiende alguna parte
// del codigo referir a CreandoFrameCentradoToolkit
class FrameConFuentes extends JFrame {

	int screenHeight;
	int screenWidth;

	public FrameConFuentes() {
		Toolkit myScreen = Toolkit.getDefaultToolkit();
		Dimension screenSize = myScreen.getScreenSize();

		screenHeight = screenSize.height; // aquii meto solo la altura
		screenWidth = screenSize.width;

		setVisible(true);
		setSize(350, 500);
		setLocation(200, 40);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		LaminaConFuentes laminaFuentes = new LaminaConFuentes();
		add(laminaFuentes);
	}

}

class LaminaConFuentes extends JPanel {

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("Lista de fuentes:", 10, 15);

		String[] nombresDeFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

		int salto = 15;
		int ancho = 15;
		int altoInicial = 30;

		for (String i : nombresDeFuentes) {
			g.drawString(i, ancho, altoInicial);
			altoInicial = altoInicial + salto;
		}
		/*
		JScrollPane scrollPane = new JScrollPane(new LongImagePanel(),
	            JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
	            JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		setLayout(new BorderLayout());
	      add(scrollPane, BorderLayout.PAGE_END);*/
	}
}











