package empezamosPOO;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class TemporizadorClaseInternaLocal {

	// me quito dos campos de clase y un constructor

	public static void main(String[] args) {
		RelojLocal miReloj = new RelojLocal(); // los paraametros dejan de entrar por el constructor
		miReloj.iniciar(3000, true); // y pasa a entrar por el meetodo.
		JOptionPane.showMessageDialog(null, "Pulse Ok para acabar");
		System.exit(0);
	}
}

class RelojLocal {

//	private int intervalo; // no las necesito en este sitio ya que las puedo definir como argumentos del propio iniciar
//	private boolean sonido;

	// debido a la creacioon de la clase interna local y lo consecuente eliminacioon
	// de las variables tambieen puedo saltarme el constructor
//	public RelojLocal(int intervalo, boolean sonido) {
//		this.intervalo = intervalo;
//		this.sonido = sonido;
//	}

	public void iniciar(int intervalo, final boolean sonido) { // creacion de los argumentos locales, como voy a acceder
																// a sonido dentro de la clase tengo que crearla como
																// final, como intervalo solo es argumento de entrada y
																// no lo llama nadie maas dentro del meetodo no hace
																// falta que sea final. ¿El final no da problemas ya que
																// este meetodo solo lo usa un objeto, por lo tanto no
																// hay posibilidad de que tenga dos valores distintos?
		// voy a convertir esta clase en clase interna local
		class DameHoraLocal implements ActionListener {

			public void actionPerformed(ActionEvent evento) {
				Date ahora = new Date();
				System.out.println("Te pongo la hora cada 3 segundos: " + ahora);

				if (sonido) { // si no declar sonido como final me daraa un error. ES UNA REGLA DE SINTAXIS A
								// LA HORA DE QUE LAS CLSES INTERNAS LOCALES ACCEDAN A VARIABLES LOCALES
								// PERTENECIENTES AL MEETODO DONDE ESTAAN ESCRITAS
					Toolkit.getDefaultToolkit().beep();
				}

				// si aquii annadiese un if (intervalo) entonces sii tendriia que declarla como
				// final
			}
		}

		ActionListener oyente = new DameHoraLocal(); // esta es la uunica instruccioon en la que se utiliza la clase
		// DameHoraLocal con lo cual la voy a mover a este meetodo.
		Timer miTemporizador = new Timer(intervalo, oyente);
		miTemporizador.start();
	}
}
