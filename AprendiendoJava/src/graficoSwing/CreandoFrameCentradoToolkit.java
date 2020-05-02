package graficoSwing;

import javax.swing.*;

import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.Image;

public class CreandoFrameCentradoToolkit { // https://www.youtube.com/watch?v=zADgVrhtBDs&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=57

	/*
	 * Para no que no sea demasiado liio hemos creado una fuente nueva. En esta
	 * vamos a centrar la ventana utilizando Toolkit para: saber la resolucioon de
	 * la pantalla en la que estoy trabajando y a partir de ello centrar la ventana.
	 * Tambieen voy a cambiar el icono de la ventana.
	 */

	public static void main(String[] args) {
		// creo que objeto ventana
		FrameCentrado frame2 = new FrameCentrado();
		frame2.setVisible(true);
		frame2.setLocation(frame2.anchoPantalla / 4, frame2.altoPantalla / 4);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // comportamiento del programa al cierre
		frame2.setTitle("Ventana centrada");
	}
}

class FrameCentrado extends JFrame {

	int altoPantalla; // creo la variable en la que voy a almacenar el alto y el ancho de la pantalla.
	int anchoPantalla; // las creo aquii fuera para poder utilizar el setLocation en el main. Si lo
						// usase en el constructor podriia crearla como variable local.
	/*
	 * La utilidad de crearla como local seriia alta si soolo tengo que crear una
	 * ventana y siempre va a estar en el centro.
	 * 
	 * En cambio, si crease el constructor con los argumentos necesarios (4x ints),
	 * cada vez que utilizase el constructor podriia construir pantallas con
	 * dimensiones distintas y en sitios distintos
	 */

	public FrameCentrado() {
		// para obtener la resolucioon de la pantalla vamos a necesitar el meetodo
		// getDefaultToolkit de la clase estaatica Toolkit ergo Toolkit.getD...
		Toolkit miPantalla = Toolkit.getDefaultToolkit(); // para utilizar el meetodo getScreenSize, por documentacioon
															// de la api see que necesito un objeto de tipo Dimension.
															// Por lo tanto lo creo.
		Dimension tamanoPantalla = miPantalla.getScreenSize(); // Aquii se almacena el ancho y el alto de mi pantalla.
		// y ahora almaceno cada cosa en una variable
		altoPantalla = tamanoPantalla.height; // aquii meto solo la altura
		anchoPantalla = tamanoPantalla.width; // aquii la anchura

		setSize(anchoPantalla / 2, altoPantalla / 2); // creo una ventana cuyo tamanno es la mitad del alto y del
														// ancho de mi pantalla, pero al usar toolkit, seraa la mitad de
														// la pantalla en la que abro el programa: si es en el pc seraa
														// maas grande que en el portaatil.
//		setLocation(anchoPantalla / 4, altoPantalla / 4);

//		setBounds(anchoPantalla / 4, altoPantalla / 4, anchoPantalla / 2, altoPantalla / 2); // lo mismo pero con bounds en vez de location y size

		Image myIcon = miPantalla.getImage("src/graficoSwing/icono.gif"); // el *.tipoArchivo es necesario
		setIconImage(myIcon);
	}
}
