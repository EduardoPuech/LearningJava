package graficoSwing;

import java.awt.*;

import javax.swing.*;

public class FrameConFuente { // https://www.youtube.com/watch?v=4J-10RpxK_w&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=62

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

		LaminaWithFont lamina = new LaminaWithFont();
		add(lamina);
		// para asignar un uunico color a todos los elementos de la laamina utilizamos
		// el meetodo foreground (y quito lo del otro sitio claro):
		lamina.setForeground(Color.ORANGE);

	}

}

class LaminaWithFont extends JPanel {

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		Font fuente = new Font("Chiller", Font.BOLD, 26); // instancio un objeto de la clase fuente para alterar la
															// fuente del texto
		g2.setFont(fuente);
//		g2.setColor(Color.GREEN.darker());
		g2.drawString("Eduardo", 90, 100);
		g2.setFont(new Font("Dubai", Font.ITALIC, 40));
//		g2.setColor(Color.RED.darker());
		g2.drawString("Crisis", 90, 135);
	}
}