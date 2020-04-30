package graficoSwing;

import java.awt.*;

import javax.swing.*;

public class FrameConTexto { // https://www.youtube.com/watch?v=zWUMgcFbOlg&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=58

	/*
	 * Cuando quiero escribir en un frame en java, no escribo directamente sobre
	 * eel, lo que hago es crear una serie de laaminas transparentes utilizando la
	 * clase JFrame que se iraan superponiendo en las que creo "lienzos" con el
	 * meetodo paintComponent en los que puedo sii voy a escribir con el meetodo
	 * drawString.
	 */

	/*
	 * TODO: Voy a crear un frame de cero para repasar lo aprendido en los viideos
	 * anteriores y a empezar a editar sobre ese marco. Todo en un solo archivo
	 * fuente.
	 */

	public static void main(String[] args) {
		// Lo segundo es instanciar objetos de la clase FrameWithText para poder
		// trabajar sobre eel.
		FrameWithText myFrameText = new FrameWithText();
		// establezco comportamiento al cierre del frame
		myFrameText.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

// Lo primero es crear el frame.
class FrameWithText extends JFrame {

	/*
	 * Creo el constructor que me da las condiciones predeterminadas de cada objeto
	 * de esta clase. Le voy a dar visibilidad, tamanno, localicazioon y tiitulo.
	 */
	public FrameWithText() {
		setVisible(true); // le doy visibilidad
		setSize(600, 450); // le doy tamanno
		setLocation(400, 200); // le doy posicioon
		setTitle("Primer frame con texto"); // le doy un tiitulo
		// Por uultimo meto la laamina que he creado, si no hago esto NO SE DIBUJA
		LaminaConTexto miLamina = new LaminaConTexto(); // la instancio
		add(miLamina);// la agrego

	}
}

// Lo tercero es crear una clase que herede de JPanel para crear los paneles transparentes sobre los que sii voy a escribir.
class LaminaConTexto extends JPanel {
	/*
	 * No voy a crear ninguun constructor, lo cual quiere decir que va a utilizar el
	 * constructor por defecto de la clase JPanel. Lo que voy a hacer es
	 * sobreescribir el meetodo paintComponent para adecuarlo a mis necesidades, en
	 * este caso quiero drawString para "pintar" texto, luego uso este.
	 */
	public void paintComponent(Graphics g) { // sobreescritura de un meetodo heredado (triangulito verde)

		super.paintComponent(g); // primero llamo al meetodo de la clase JComponent para que haga su trabajo y
									// ademaas me escribe eso.
		// texto, posicioon en x, posicioon en y (como siempre con respecto al extremo
		// superior izquierdo.
		g.drawString("Mi primer texto en una ventana usando Swing", 100, 100); // en el momento en el que se escribe la
																				// g. salen todos los meetodos de la
																				// clase paintCo...
		/*
		 * esto no hace nada, es un void, solo le estoy diciendo que me escriba este
		 * texto... si quiero que haga ademaas lo que programaron cuando hicieron la
		 * clase JComponent entonces tengo que INVOCARLO: SUPER. Lo he explicado aquii
		 * pero acaba estando escrito encima del g.
		 */

		/*
		 * Realmente en este ejemplo, al ser una laamina muy baasica no es necesario
		 * usar el super, pero si quisiese cambiar fuentes, colores... todas esas
		 * cositas ricas que me permite hacer JComponente sii lo necesito: ya que esto
		 * es un ejemplo lo annado
		 */

		/*
		 * Para annadirlo tengo que irme al CONSTRUCTOR DEL MARCO, no al main y decirle
		 * que actuue en consecuencia
		 */
	}
}
