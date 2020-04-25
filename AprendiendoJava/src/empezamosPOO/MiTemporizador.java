package empezamosPOO;

import javax.swing.*; // import para timer. En caso de que no hiciese falta todo el paquete swing podriia ahorrarme esta linea e importar solo el Timer
						// pero en este caso voy a usar JOoptionPane asii que necesito ambos (a no ser que importase cosa a cosa).
import javax.swing.Timer; // especifico esto porque el objeto de tipo timer me interesa que sea de swing y no de util.

import java.awt.Toolkit;
import java.awt.event.*; // import requerido por la interfaz

import java.util.*;

public class MiTemporizador {

	public static void main(String[] args) {

		DameHora oyente = new DameHora(); // estoy utilizando el constructor por defecto de la clase DameHora.

		// Alternativa: creo la instancia de la interfaz de tipo DameHora (propiedad de
		// sustitucioon).
//		ActionListener oyente = new DameHora(); //ambas opciones funcionan.

		// creo el temporizador. Hay tres clases predefinidas con el nombre Timer: del
		// paquete swing, util y managementTimer. Si solo importase swing todo tan
		// pichi, pero como estoy importando swing y util, ambas teniendo un Timer tego
		// que especificar a cual de ellas pertenece el que voy a usar, y eso se hace
		// asii: en vez de importar el paquete entero (.*) importo la clase, eso
		// especifica lo suficiente.
		Timer miTemporizador = new Timer(5000, oyente); // le doy un delay y el argumento de tipo ActionListener. Ese
														// argumento llama al meetodo de la interfaz actionPerformed y
														// lo ejecuta. Y es de tipo interfaz para que me fuerce a crear
														// el meetodo actionPerformed, si no no funcionariia esto: la
														// interfaz es una guiia de coomo escribir el programa sin que
														// se me olvide nada.
		// con esto empieza a funcionar el temporizador y oyente llama a
		// actionPerformed,
		miTemporizador.start(); // esto ocurre muy raapido y no vemos ninguun resultado, por lo tanto tengo que
								// extender el tiempo de ejecucioon del programa: uso una ventanita de
								// JOptionPane.
		JOptionPane.showMessageDialog(null, "Pulsa Ok para detener"); // showMessageDialog me saca una ventana que
																		// no necesita input.
		System.exit(0); // cuando llega aquii sale para que al pulsar el botoon pare.
	}
}

class DameHora implements ActionListener { // no pongo get porque no es un getter, es una clase.

	public void actionPerformed(ActionEvent e) { // tal cual lo que pide la interfaz
		Date ahora = new Date();// aquii creo el objet de clase Date que va a realizar la funcioon deseada: la
								// actualizacioon de la variable que se guarda en el meetodo al que luego llama
								// el Timer: actualizar la hora cada 5 secundos, por eso utilizo la clase Date.
		System.out.println("Te pongo la hora cada 5 segundos: " + ahora); // instruccion de comportamiento.
		// usamos Toolkit para que haga ruidito windows cada vez que imprima
		// (informacioon en API)
		Toolkit.getDefaultToolkit().beep();
	}
}
