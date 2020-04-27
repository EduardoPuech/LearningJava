package graficoSwing;

import java.awt.Frame;

import javax.swing.*; // ESTO ES IMPRESCINDIBLE SIEMPRE QUE QUIERA CREAR FRAMES

public class CreandoFrames { // https://www.youtube.com/watch?v=7q2VBGIKeYc&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=55

	//

	/*
	 * Crear un frame se puede hacer de muchas maneras distintas: se puede hacer
	 * todo en una uunica clase, puedes dividirlo y crearla en dos clases (es lo que
	 * vamos a hacer en este ejemplo). Se puede crear en un uunico fichero fuente
	 * (lo que vamos a hacer) o en varios.
	 * 
	 * IMPRESCINDIBLE IMPORTAR JAVAX.SWING.*;
	 * 
	 * https://www.youtube.com/watch?v=7q2VBGIKeYc&list=
	 * PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=56
	 * 
	 * En el segundo video voy a cambiar el spawn point, cambiar el tamanno y el
	 * spawn con una sola instruccioon, permitir o no al usuario alterar el tamanno
	 * de la ventana y cambiar el tiitulo de la ventana.
	 */
	public static void main(String[] args) {
		MyFrame frame1 = new MyFrame(); // objeto de la clase MyFrame que he escrito
		frame1.setVisible(true); // con esto hago que aparezca en pantalla, tambieen se puede meter directamente
									// en el constructor.
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // con esto indico el comportamiento en el momento de
																// cierre de la ventana, en este caso el programa acaba
																// cuando se acaba el programa. API JFrame setDef...,
																// aunque en las otras instrucciones no sea JFrame la
																// clase, como hay herencia utilizo JFr.LO_QUE_Sea.
//		frame1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); // esta instruccioon mantendriia el programa activo
		// incluso despuees de cerrar la ventana (por ejemplo si
		// tengo maas de una ventana si al cerrar una se acaba
		// todo es caca...)
	}

}

// como lo vamos a hacer en dos clases aquii va la segunda:
class MyFrame extends JFrame { // hereda de jframe para poder utilizar todos sus meetodos. Si no hubiese
								// importado swing no podriia heredar de JFrame.

	// primero creo el constructor
	public MyFrame() {
//		setSize(500, 300); // ancho y alto. Este tamanno tiene que es fijo, dependiendo de la pantalla en
		// la que se abra puede ser demasiado grande o demasiado pequenno. Si quiero que
		// se adapte al tamanno y resolucioon de cada pantalla tengo que utilizar la
		// clase Toolkit, es bastante maas complejo pero a cambio funciona mejor.
//		una vez hecho esto instancio esta clase en el main

//		setVisible(true); // si meto esta instruccioon aqui abriraa una ventana por cada objeto creado de
		// la clase MyFrame. Y de la misma manera puedo meter el CloseOperation.

////	COODIGO SEGUNDO VIDEO
//		setLocation(500, 300); // con esto reubico el spawn del marco: eje casrtesiano (x,y) recordando que el
		// punto 0,0 es la esquina superior izquierda

		// utilizando setBounds doy tanto tamanno como ubicacioon asii que puedo quitar
		// las otras dos instrucciones
		setBounds(500, 300, 400, 200); // (x,y,ancho,alto)

		// permitir o no que el usuario modifique el tamanno de la ventana con el
		// pinchar y arrastrar, en el momento en el que lo impido el botoon de maximizar
		// se desactiva SI NO ANNADO ESTO, por defecto es verdadero luego podraa
		// modificarlo.
//		setResizable(false);

		// esto hace que el spawn sea modificado seguun el paraametro (en este caso
		// apareceriia agrandado tanto ancho como largo), si existe la instruction
		// setResizable(false) esto no tiene utilidad alguna.
//		setExtendedState(Frame.MAXIMIZED_BOTH); // la instruccioon Frame. no es necesaria

		// le doy un tiitulo a la ventana
		setTitle("Mi ventana");
	}

}