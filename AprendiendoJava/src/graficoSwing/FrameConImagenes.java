package graficoSwing;

import java.awt.*;
import java.io.*;

import javax.imageio.*; // throws IOException (primera clase que tiene excepcioon, vamos a necesitar una mini introduccioon.
import javax.swing.*;

public class FrameConImagenes { // https://www.youtube.com/watch?v=4J-10RpxK_w&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=63

	public static void main(String[] args) {

		FrameWithImages marcoFuente = new FrameWithImages();
		marcoFuente.setVisible(true);
		marcoFuente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class FrameWithImages extends JFrame { // caca

	public FrameWithImages() {
		setBounds(750, 300, 400, 350);
		setTitle("Trabajando con imaagenes");

		LaminaWithImages laminaImagen = new LaminaWithImages();
		add(laminaImagen);
	}
}

class LaminaWithImages extends JPanel {

	private Image imagen; // aquii puedo almacenar la imagen de la carpeta

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		File foto1 = new File("src/graficoSwing/imagenSinCorona.jpg"); // read pide un paraametro de tipo file que es la ruta de
																// ubicacioon del archivo con *.*	 
		// de momento esto lo vamos a tomar como dogma y ya entenderemos en su momento:
		try {
			imagen = ImageIO.read(foto1); // da error hasta que escriba el coodigo de la excepcioon
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Imagen no encontrada");
		}

		g.drawImage(imagen, 10, 10, null); // pongo el observador de tipo null ya que el tamanno de esta imagen no
											// conllevaraa un tiempo de carga elevado.
	}

}