package empezamosPOO;

import java.util.*;

public class EmpleadoUnaFuente { // todo en un uunico fichero fuente para probar todos los modelos. No confundir
									// archivos.java (es uno) con archivos.class (que son dos ya que hay dos
									// clases).

	public static void main(String[] args) {

		// esto es la manera a pincho de hacerlo
//		// instancio tres objetos de la clase empleado
//		Empleado empleado1 = new Empleado("Cesar de Echagüe", 25000, 2010, 03, 16); // enero es 00 pero le hemos dado
//		// mes-1, este es marzo ya que la cuarta posicioon es abril, abril - 1 = marzo.
//		Empleado empleado2 = new Empleado("Leonor de Acevedo", 24000, 2008, 01, 16);
//		Empleado empleado3 = new Empleado("Lupe de Torres", 26000, 2012, 02, 17);
//
//		// utilizo el meetodo subir el sueldo
//		empleado1.subidaSueldo(20);
//		empleado2.subidaSueldo(24);
//		empleado3.subidaSueldo(16);
//
//		System.out.println("Nombre: " + empleado1.getNombre() + "\nSueldo actual: " + empleado1.getSueldo()
//				+ "\nAnno de entrada en la empresa: " + empleado1.getAltaContrato());
//		System.out.println("Nombre: " + empleado2.getNombre() + "\nSueldo actual: " + empleado2.getSueldo()
//				+ "\nAnno de entrada en la empresa: " + empleado2.getAltaContrato());
//		System.out.println("Nombre: " + empleado3.getNombre() + "\nSueldo actual: " + empleado3.getSueldo()
//				+ "\nAnno de entrada en la empresa: " + empleado3.getAltaContrato());

		// ahora lo vamos a hacer con un array para almacenar los empleados y un bucle
		// for para subir el sueldo (y ver la informacioon en consola

		Empleado[] misEmpleados = new Empleado[3]; // creo el array
		misEmpleados[0] = new Empleado("Cesar de Echagüe", 25000, 2010, 03, 16);
		misEmpleados[1] = new Empleado("Leonor de Acevedo", 24000, 2008, 01, 16);
		misEmpleados[2] = new Empleado("Lupe de Torres", 26000, 2012, 02, 17);
////		Empleado[] tusEmpleados = {("Cesar de Echagüe", 25000, 2010, 03, 16), ("Leonor de Acevedo", 24000, 2008, 01, 16),
//		("Lupe de Torres", 26000, 2012, 02, 17)}; // Estaa mal aunque no see por quee.

		// for para el aumento de sueldo
//		for (int i = 0; i < misEmpleados.length; i++) {
//			misEmpleados[i].subidaSueldo(15);
//		}

		// for each para el aumento
		for (Empleado aumento : misEmpleados) { // le doy este nombre a la variable porque representa en cierta medida
												// la funcioon del bucle.
			aumento.subidaSueldo(15);
		}

		// este for es para la impresioon
//		for (int i = 0; i < misEmpleados.length; i++) {
//			System.out.println(
//					"Nombre: " + misEmpleados[i].getNombre() + "\nSueldo actual: " + misEmpleados[i].getSueldo()
//							+ "\nAnno de entrada en la empresa: " + misEmpleados[i].getAltaContrato());
//		}

		// for each para impresioon
		for (Empleado impresion : misEmpleados) {
			System.out.println("Nombre: " + impresion.getNombre() + "\nSueldo actual: " + impresion.getSueldo()
					+ "\nAnno de entrada en la empresa: " + impresion.getAltaContrato());
		}

	}
}

class Empleado { // creo a los empleados

	public Empleado(String nom, double sld, int anno, int mes, int dia) { // creo un constructor que va a recibir
		// paraametros (dinaamico) por decirlo de alguna manera esto actuua de setter
		nombre = nom;
		sueldo = sld;
		GregorianCalendar fecha = new GregorianCalendar(anno, mes - 1, dia); // meetodo predeterminado de java.util
		// mes -1 porque enero es 0
		altaContrato = fecha.getTime(); // con esto adapto de GregorianCalendar a Date: HERENCIA
	}

	public String getNombre() { // getter del nombre
		return nombre;
	}

	public double getSueldo() { // getter del sueldo
		return sueldo;
	}

	public Date getAltaContrato() { // getter de la fecha de alta del contrato
		return altaContrato;
	}

	// meetodo de tipo setter para el incremento de sueldo en funcioon del tiempo
	// trabajado
	public void subidaSueldo(double porcentaje) {
		double aumento = sueldo * porcentaje / 100;
		sueldo = sueldo + aumento;
	}

	// voy a crear las variables de clase al final para que se vea que se puede
	// crear donde se quiera
	private String nombre;
	private double sueldo;
	private Date altaContrato;

}
