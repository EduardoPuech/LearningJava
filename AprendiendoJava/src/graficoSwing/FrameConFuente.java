package graficoSwing;

import java.awt.*;

import javax.swing.*;

public class FrameConFuente {

	public static void main(String[] args) {

		FrameWithFont marcoFuente = new FrameWithFont();
		marcoFuente.setVisible(true);
		marcoFuente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class FrameWithFont extends JFrame { // caca

	public FrameWithFont() {

		setBounds(400, 400, 300, 300);
		setTitle("Trabajando con fuentes");

		LaminaConFuentes lamina = new LaminaConFuentes();
		add(lamina);

	}

}

class LaminaConFuentes extends JPanel {

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
	}
}