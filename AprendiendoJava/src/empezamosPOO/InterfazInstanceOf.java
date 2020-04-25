package empezamosPOO;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class InterfazInstanceOf {
	public static void main(String[] args) {

		JefaturaInstanceOf jefeRRHH = new JefaturaInstanceOf("Alfonso", 40000, 2005, 11, 27);
		jefeRRHH.setIncentivo(2570);
		EmpleadoInstanceOf[] misEmpleados = new EmpleadoInstanceOf[6];
		misEmpleados[0] = new EmpleadoInstanceOf("Cesar de Echagüe", 25000, 2010, 03, 16);
		misEmpleados[1] = new EmpleadoInstanceOf("Leonor de Acevedo", 25000, 2008, 01, 16);
		misEmpleados[2] = new EmpleadoInstanceOf("Lupe de Torres", 26000, 2012, 02, 17);
		misEmpleados[3] = new EmpleadoInstanceOf("Paca");
		misEmpleados[4] = jefeRRHH;
		misEmpleados[5] = new JefaturaInstanceOf("Ana", 60000, 2000, 07, 15);
		JefaturaInstanceOf jefaFinanzas = (JefaturaInstanceOf) misEmpleados[5];
		jefaFinanzas.setIncentivo(1500);

		EmpleadoInstanceOf directorComercial = new JefaturaInstanceOf("Pedro", 60000, 2020, 12, 02); // principio de sustitucioon en
																						// clases
		Comparable ejemplo = new EmpleadoInstanceOf("Eduardo", 50000, 1993, 02, 16); // principio de sustitucioon en interfaz.

		if (directorComercial instanceof EmpleadoInstanceOf) { // si pertenece a la subclase se hace eso.
			System.out.println("Es de tipo JefaturaInstanceOf"); // ya que jefatura hereda de empleado
		} else {
			System.out.println("No es instancia de Empleadoses"); // no hace falta pero lo pongo igual.
		}

		if (ejemplo instanceof Comparable) { // aquii compruebo lo mismo para ejemplo: Empleado tiene la interfaz
												// Comparable.
			System.out.println("Es una instancia de Comparable, estaa implementando la interfaz.");
		} // antes he puesto el else porque sii, realmente solo me interesa saber si lo es
			// o no, luego puedo escribirlo de manera que en caso de no serlo directamente
			// ni lo diga, como he hecho en este caso.

		for (EmpleadoInstanceOf aumento : misEmpleados) {
			aumento.subidaSueldo(10);
		}

		Arrays.sort(misEmpleados);

		for (EmpleadoInstanceOf impresion : misEmpleados) {
			System.out.println("Nombre: " + impresion.getNombre() + " -Sueldo actual: " + impresion.getSueldo()
					+ " -Anno de entrada en la empresa: " + impresion.getAltaContrato() + " -Id de empleado: "
					+ impresion.getId());
		}
	}
}

class EmpleadoInstanceOf implements Comparable {

	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private static int idSiguiente = 1;
	private int id;

	public EmpleadoInstanceOf(String nom, double sld, int anno, int mes, int dia) {
		nombre = nom;
		sueldo = sld;
		GregorianCalendar fecha = new GregorianCalendar(anno, mes - 1, dia);
		altaContrato = fecha.getTime();
		id = idSiguiente;
		idSiguiente++;
	}

	public EmpleadoInstanceOf(String nom) {
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
		EmpleadoInstanceOf comparador = (EmpleadoInstanceOf) miObjeto;
		if (this.sueldo < comparador.sueldo) {
			return -1;
		} else if (this.sueldo > comparador.sueldo) {
			return 1;
		} else {
			return 0;
		}
	}
}

class JefaturaInstanceOf extends EmpleadoInstanceOf {

	private double incentivo;

	public JefaturaInstanceOf(String nom, double sld, int anno, int mes, int dia) {
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
