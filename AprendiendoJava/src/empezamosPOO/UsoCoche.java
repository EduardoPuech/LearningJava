package empezamosPOO;

import javax.swing.*;

public class UsoCoche {

	public static void main(String[] args) {

		// Ahora creo los objetos que van a compartir la estructura comuun de la clase
		// EjemploClaseCoche: instanciar la clase
		// NombreClase NombreObjeto = new Constructor();
		Coche Seat = new Coche(); // ejemplar de clase, puede ser en minuuscula
		Coche miCarro = new Coche();

		// Con esta frase establezco que el coche tiene color, ya que no viene en el
		// constructor.
//		miCarro.setColor(JOptionPane.showInputDialog("De quee color es su coche")); // si yo no establezco el color la
		// siguiente linea no da informacioon porque no he modificado/usado, o lo que es
		// lo mismo, me da una respuesta vaciia. Eso quiere decir que si yo comento esta
		// linea obtengo null como color del coche.
		Seat.setColor(JOptionPane.showInputDialog("De quee color es su coche"));
		Seat.setAsientosCuero(JOptionPane.showInputDialog("¿Quiere usted asientos de cuero? y/n")); // si es el valor
		// que asignee en la clase Coche para comparar, tiene que coincidir con ese
		// valor, si es distinto no entra en los if
		Seat.setClimatizador(JOptionPane.showInputDialog("¿Quiere usted climatizador? y/n"));

		System.out.println(Seat.getConstructor());
		System.out.println(Seat.getColor());
		System.out.println(Seat.getAsientos());
		System.out.println(Seat.getClimatizador());
		System.out.println(Seat.setGetPesoCoche() + " kilos");
		System.out.println("El precio total del coche es " + Seat.getPrecioCoche() + " euros");
	}

}
