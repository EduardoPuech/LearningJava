package primerosPasos;

import java.util.*;
import javax.swing.*;

public class CondicionSwitch {
	// TODO area de un cuadrado, rectaangulo, triaanguo y ciirculo utilizando switch
	// y que el usuario elija cual de las figuras hacer. La eleccioon de figura por
	// consola y los datos de la figura por ventana.

	public static void main(String[] args) {

		// switch (valor a evaluar) { (uutil cuando hay muchas condiciones fijas)
		// case valor1 LA INSTRUCCION HACE LA COMPARACIOON DIRECTAMENTE
		// codigo a ejecutar
		// break
		// case valor2
		// codigo a ejecutar
		// break
		// }
		//
		// puede ir acompannado de un default

		System.out.println("Seleccione la figura: \n1-Cuadrado \n2-Rectaangulo \n3-Triaangulo \n4-Ciirculo");

		Scanner input = new Scanner(System.in);
		int figura = input.nextInt();

		switch (figura) { // cada vez que meto el int en el cuadro de dialogo compara input con el valor
							// de cada caso (el numerito en azul)
		case 1: // cuadrado
			double lado = Double.parseDouble(JOptionPane.showInputDialog("Longitud del lado del cuadrado en cm"));
			double areaC = lado * lado;
			System.out.println("El area de un cuadrado de lado " + lado + " es " + areaC + " cm*2");
			break; // indica que si ha entrado aquii, al llegar hasta esta linea acaba el switch

		case 2: // rectaangulo
			double baseR = Double.parseDouble(JOptionPane.showInputDialog("Base del rectaangulo en cm"));
			double alturaR = Double.parseDouble(JOptionPane.showInputDialog("Altura del rectaangulo en cm"));
			double areaR = baseR * alturaR;
			System.out.println(
					"El area de un rectaangulo de base " + baseR + " y altura " + alturaR + " es " + areaR + " cm*2");
			break;

		case 3: // triaangulo
			double baseT = Double.parseDouble(JOptionPane.showInputDialog("Base del triaangulo en cm"));
			double alturaT = Double.parseDouble(JOptionPane.showInputDialog("Altura del triaangulo en cm"));
			double areaT = (baseT * alturaT) / 2;
			System.out.println(
					"El area de un triaangulo de base " + baseT + " y altura " + alturaT + " es " + areaT + " cm*2");
			break;

		case 4:
			double radio = Double.parseDouble(JOptionPane.showInputDialog("Radio del ciirculo en cm"));
			double areaCi = Math.PI * Math.pow(radio, 2);
			System.out.printf("El area de un ciirculo de radio " + radio + " es " + "%1.3f", +areaCi);
			break;

		default: // si el valor de input no es 1,2,3,4 entonces no estudia ninguno de los casos
			System.out.println("Solo hay cuatro opciones meloon");
			break;
		}
	}
}
