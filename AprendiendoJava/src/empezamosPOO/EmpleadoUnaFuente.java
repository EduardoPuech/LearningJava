package empezamosPOO;

import java.util.*;

public class EmpleadoUnaFuente { // todo en un uunico fichero fuente para probar todos los modelos

	public static void main(String[] args) {

		// instancio tres objetos de la clase empleado
		Empleado empleado1 = new Empleado("Cesar de Echag�e", 25000, 2010, 03, 16); // enero es 00 pero le hemos dado
																					// mes-1
																					// luego esto seriia febrero.
		Empleado empleado2 = new Empleado("Leonor de Acevedo", 24000, 2008, 01, 16);
		Empleado empleado3 = new Empleado("Lupe de Torres", 26000, 2012, 02, 17);

		// utilizo el meetodo subir el sueldo
		empleado1.subidaSueldo(10);
		empleado2.subidaSueldo(15);
		empleado3.subidaSueldo(5);

		System.out.println("Nombre: " + empleado1.getNombre() + "\nSueldo actual: " + empleado1.getSueldo()
				+ "\nAnno de entrada en la empresa: " + empleado1.getAltaContrato());
		System.out.println("Nombre: " + empleado2.getNombre() + "\nSueldo actual: " + empleado2.getSueldo()
		+ "\nAnno de entrada en la empresa: " + empleado2.getAltaContrato());
		System.out.println("Nombre: " + empleado3.getNombre() + "\nSueldo actual: " + empleado3.getSueldo()
		+ "\nAnno de entrada en la empresa: " + empleado3.getAltaContrato());

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
