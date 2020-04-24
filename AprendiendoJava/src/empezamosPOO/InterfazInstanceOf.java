package empezamosPOO;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class InterfazInstanceOf {
	public static void main(String[] args) {

		Jefaturases jefeRRHH = new Jefaturases("Alfonso", 40000, 2005, 11, 27);
		jefeRRHH.setIncentivo(2570);
		Empleadosesa[] misEmpleados = new Empleadosesa[6];
		misEmpleados[0] = new Empleadosesa("Cesar de Echagüe", 25000, 2010, 03, 16);
		misEmpleados[1] = new Empleadosesa("Leonor de Acevedo", 25000, 2008, 01, 16);
		misEmpleados[2] = new Empleadosesa("Lupe de Torres", 26000, 2012, 02, 17);
		misEmpleados[3] = new Empleadosesa("Paca");
		misEmpleados[4] = jefeRRHH;
		misEmpleados[5] = new Jefaturases("Maria", 60000, 2000, 07, 15);
		Jefaturases jefaFinanzas = (Jefaturases) misEmpleados[5];
		jefaFinanzas.setIncentivo(1500);

		Empleadosesa directorComercial = new Jefaturases("Pedro", 60000, 2020, 12, 02); // principio de sustitucioon en
																						// clases
		Comparable ejemplo = new Empleadosesa("Eduardo", 50000, 1993, 02, 16); // principio de sustitucioon en interfaz.

		if (directorComercial instanceof Empleadosesa) { // si pertenece a la subclase se hace eso.
			System.out.println("Es de tipo Jefaturases"); // ya que jefatura hereda de empleado
		} else {
			System.out.println("No es instancia de Empleadoses"); // no hace falta pero lo pongo igual.
		}

		if (ejemplo instanceof Comparable) { // aquii compruebo lo mismo para ejemplo: Empleado tiene la interfaz
												// Comparable.
			System.out.println("Es una instancia de Comparable, estaa implementando la interfaz.");
		} // antes he puesto el else porque sii, realmente solo me interesa saber si lo es
			// o no, luego puedo escribirlo de manera que en caso de no serlo directamente
			// ni lo diga, como he hecho en este caso.

		for (Empleadosesa aumento : misEmpleados) {
			aumento.subidaSueldo(10);
		}

		Arrays.sort(misEmpleados);

		for (Empleadosesa impresion : misEmpleados) {
			System.out.println("Nombre: " + impresion.getNombre() + " -Sueldo actual: " + impresion.getSueldo()
					+ " -Anno de entrada en la empresa: " + impresion.getAltaContrato() + " -Id de empleado: "
					+ impresion.getId());
		}
	}
}

class Empleadosesa implements Comparable {

	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private static int idSiguiente = 1;
	private int id;

	public Empleadosesa(String nom, double sld, int anno, int mes, int dia) {
		nombre = nom;
		sueldo = sld;
		GregorianCalendar fecha = new GregorianCalendar(anno, mes - 1, dia);
		altaContrato = fecha.getTime();
		id = idSiguiente;
		idSiguiente++;
	}

	public Empleadosesa(String nom) {
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

	public int getId() {
		return id;
	}

	public static String getSiguienteId() {
		return "El id siguiente seriia: " + idSiguiente;
	}

	public int compareTo(Object miObjeto) {
		Empleadosesa comparador = (Empleadosesa) miObjeto;
		if (this.sueldo < comparador.sueldo) {
			return -1;
		} else if (this.sueldo > comparador.sueldo) {
			return 1;
		} else {
			return 0;
		}
	}
}

class Jefaturases extends Empleadosesa {

	private double incentivo;

	public Jefaturases(String nom, double sld, int anno, int mes, int dia) {
		super(nom, sld, anno, mes, dia);
	}

	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}

	public double getSueldo() {
		double sueldoJefe = super.getSueldo();
		sueldoJefe = sueldoJefe + incentivo;
		return sueldoJefe;
	}
}
