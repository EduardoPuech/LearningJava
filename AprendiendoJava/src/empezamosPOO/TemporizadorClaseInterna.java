package empezamosPOO;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Toolkit;

import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class TemporizadorClaseInterna { // https://www.youtube.com/watch?v=rQS5P63GTU8&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=53

	public static void main(String[] args) {
		Reloj miReloj = new Reloj(3000, true); // utilizando el constructor le paso los paraametros.
		miReloj.iniciar();
		JOptionPane.showMessageDialog(null, "Pulse Ok para acabar");
		System.exit(0);
	}
}

class Reloj {

	private int intervalo;
	private boolean sonido;

	// constructor
	public Reloj(int intervalo, boolean sonido) { // intervalo va a funcionar como setter de la cantidad de tiempo y
													// sonido va a decidir si pita o no.
		this.intervalo = intervalo;
		this.sonido = sonido;
	}

	public void iniciar() {
		ActionListener oyente = new DameHora2();
		Timer miTemporizador = new Timer(intervalo, oyente);
		miTemporizador.start();
	}

	// clase interna
	private class DameHora2 implements ActionListener { // el modificador private solo lo pueden utilizar las clases
														// internas.

		public void actionPerformed(ActionEvent evento) {
			Date ahora = new Date();
			System.out.println("Te pongo la hora cada 3 segundos: " + ahora);
			// las variables booleanas son true por defecto.
			if (sonido) { // la clase estaa accediendo a un campo de ejemplar PRIVADO (variable) que no es
							// suyo, esta es una de las principales ventajas de las clases internas,
							// "amplia" el aambito de la variable. Se puede hacer con una clase externa,
							// pero eso implicariia la creacioon de los meetodos setter y getter para poder
							// acceder a ello. Por lo tanto el criterio apropiado es ¿cuaantos van a
							// necesitar utilizar esos campos? si es uno se puede hacer una clase interna,
							// si son dos o maas es mejor usar una normal y hacer los meetodos de acceso
							// (set y get).
				Toolkit.getDefaultToolkit().beep();
			}
		}
	}
}
