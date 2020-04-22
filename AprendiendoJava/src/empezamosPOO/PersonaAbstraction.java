package empezamosPOO;

import java.util.Date;
import java.util.GregorianCalendar;

public class PersonaAbstraction { // https://www.youtube.com/watch?v=LDZUBY0mxv8&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=46

	/*
	 * Voy a ver un ejemplo de clase y meetodo abstractos.
	 */

	public static void main(String[] args) {
		Persona[] todos = new Persona[2];

		todos[0] = new EmpleadosAbs("Eduardo", 15000, 2020, 02, 02);
		todos[1] = new Estudiante("Marina", "Derecho");

		for (Persona impresion : todos) {
			System.out.println(
					"Nombre: " + impresion.getNombre() + " y su descripcioon es: " + impresion.getDescripcion());
		}
	}
}

abstract class Persona {
	private String nombre;

	public Persona(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public abstract String getDescripcion();
}

class EmpleadosAbs extends Persona {
	private double sueldo;
	private Date altaContrato;
	private static int idSiguiente = 1;
	private int id;

	public EmpleadosAbs(String nombre, double sueldo, int anno, int mes, int dia) {
		super(nombre);
		this.sueldo = sueldo;
		GregorianCalendar fecha = new GregorianCalendar(anno, mes - 1, dia);
		altaContrato = fecha.getTime();
		id = idSiguiente;
		idSiguiente++;
	}

	public String getDescripcion() {
		return "los empleados de esta clase tienen un Id: " + id + " con un sueldo: " + sueldo;
	}

	public double getSueldo() {
		return sueldo;
	}

	public Date getAltaContrato() {
		return altaContrato;
	}

	public void subidaSueldo(double porcentaje) {
		double aumento = sueldo * porcentaje / 100;
		sueldo = sueldo + aumento;
	}
}

class Estudiante extends Persona {
	private String carrera;

	public Estudiante(String nombre, String carrera) {
		super(nombre);
		this.carrera = carrera;
	}

	public String getDescripcion() {
		return "este estudiante tiene un nombre " + getNombre() + " y estudia la carrera de " + carrera;
	}
}
