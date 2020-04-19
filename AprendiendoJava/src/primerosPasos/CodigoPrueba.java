package primerosPasos;

import javax.swing.JOptionPane;

public class CodigoPrueba {

	public static void main(String[] args) {

		/*
		 * test de por quee no funcionaba el resultado de un double con decimal al menos
		 * uno de los dos operadores en forma variable tiene que estar en modo double
		 * para que el resultado salga con los decimales correctos int a = 5; double b =
		 * 6; double c = a/b; double d = 5/6.0;
		 */

		/*
		 * es curioso, porque en este caso si me acepta una operacioon de int con double
		 * para darme un double ¿seraa el final? final int c = 7; double a = 3.4; double
		 * d = c*a;
		 */

		// System.out.println(c);
		// System.out.println(d);

		/*
		 * // Aarea circulo
		 * 
		 * double radio, areaC;
		 * 
		 * String input6 = JOptionPane.showInputDialog("Radio del ciirculo en cm"); //
		 * pido el radio
		 * 
		 * radio = Double.parseDouble(input6);
		 * 
		 * areaC = Math.PI * Math.pow(radio, 2);
		 * 
		 * System.out.printf("%1.3f", + areaC);
		 * System.out.printf("El area de un ciirculo de radio " + radio + " es " +
		 * "%1.3f", + areaC + " algo"); //Si no quito el " algo" no funciona
		 */
		
		/*
		 * Creacioon de un nuumero aleatorio entre 0 y 100
		 * 
		final int variable = (int) (Math.random()*100);
		System.out.print(variable);
		*/
		
	}

}
