package empezamosPOO;

import java.util.Date;
import java.util.GregorianCalendar;

public class EmpleadoHerencia { // https://www.youtube.com/watch?v=3g_3cbH97cs&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=42

	/*
	 * Utilizo el coodigo de EmpleadoSobrecargaConstrucotores
	 */

	public static void main(String[] args) {

		Empleadoses[] misEmpleados = new Empleadoses[4];
		misEmpleados[0] = new Empleadoses("Cesar de Echagüe", 25000, 2010, 03, 16);
		misEmpleados[1] = new Empleadoses("Leonor de Acevedo", 24000, 2008, 01, 16);
		misEmpleados[2] = new Empleadoses("Lupe de Torres", 26000, 2012, 02, 17);
		misEmpleados[3] = new Empleadoses("Paca");

		for (Empleadoses aumento : misEmpleados) {
			aumento.subidaSueldo(15);
		}

		for (Empleadoses impresion : misEmpleados) {
			System.out.println("Nombre: " + impresion.getNombre() + "\nSueldo actual: " + impresion.getSueldo()
					+ "\nAnno de entrada en la empresa: " + impresion.getAltaContrato());
		}
	}
}

class Empleadoses {

	public Empleadoses(String nom, double sld, int anno, int mes, int dia) {
		nombre = nom;
		sueldo = sld;
		GregorianCalendar fecha = new GregorianCalendar(anno, mes - 1, dia);
		altaContrato = fecha.getTime();
	}

	public Empleadoses(String nom) {
		this(nom, 20000, 2000, 01, 01);
	}

	public String getNombre() {
		return nombre;
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

	private String nombre;
	private double sueldo;
	private Date altaContrato;

}

class Jefatura extends Empleadoses {

	private double incentivo;

	public Jefatura(String nom, double sld, int anno, int mes, int dia) { // el constructor de la clase Empleado recibe argumentos, por lo tanto si quiero utilizarlo en la subclase tambieen tengo que darle argumentos (el mismo nuumero que en Empleado).
		super(String nom, double sld, int anno, int mes, int dia); // Como teniia dos constructores, en funcioon de cuaantos argumentos pase estoy llamando a un constructor o a otro.
	}
}
