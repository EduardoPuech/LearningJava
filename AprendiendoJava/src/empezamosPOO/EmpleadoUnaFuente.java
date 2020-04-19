package empezamosPOO;

import java.util.*;

public class EmpleadoUnaFuente { // todo en un uunico fichero fuente para probar todos los modelos

	public static void main(String[] args) {

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
	public void setSubidaSueldo(double porcentaje) {
		double aumento = sueldo*porcentaje/100;
	}

	// voy a crear las variables de clase al final para que se vea que se puede
	// crear donde se quiera
	private String nombre;
	private double sueldo;
	private Date altaContrato;

}
