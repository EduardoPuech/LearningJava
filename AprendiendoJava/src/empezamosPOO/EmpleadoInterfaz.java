package empezamosPOO;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Arrays;// Con esto fuerzo la necesidad de interfaz. De esta clase voy a usar el meetodo
						// sort(Object[]a) que me obliga a que los elementos del array (clase Empleadosis)
						// utilicen la interfaz "Comparable".

public class EmpleadoInterfaz {
	public static void main(String[] args) {

		Jefaturas jefeRRHH = new Jefaturas("Alfonso", 40000, 2005, 11, 27);
		jefeRRHH.setIncentivo(2570);
		Empleadosis[] misEmpleados = new Empleadosis[6];
		misEmpleados[0] = new Empleadosis("Cesar de Echagüe", 25000, 2010, 03, 16);
		misEmpleados[1] = new Empleadosis("Leonor de Acevedo", 25000, 2008, 01, 16);
		misEmpleados[2] = new Empleadosis("Lupe de Torres", 26000, 2012, 02, 17);
		misEmpleados[3] = new Empleadosis("Paca");
		misEmpleados[4] = jefeRRHH;
		misEmpleados[5] = new Jefaturas("Maria", 60000, 2000, 07, 15);
		Jefaturas jefaFinanzas = (Jefaturas) misEmpleados[5];
		jefaFinanzas.setIncentivo(1500);

		for (Empleadosis aumento : misEmpleados) {
			aumento.subidaSueldo(10);
		}

		// uso el sort para ordenarlos de menor a mayor por sueldo
		Arrays.sort(misEmpleados);

		for (Empleadosis impresion : misEmpleados) {
			System.out.println("Nombre: " + impresion.getNombre() + " -Sueldo actual: " + impresion.getSueldo()
					+ " -Anno de entrada en la empresa: " + impresion.getAltaContrato() + " -Id de empleado: "
					+ impresion.getId());
		}

//		System.out.println("El siguiente id seriia: " + Empleadoses.getSiguienteId());
	}
}

// tengo que cambiarle el nombre para que no coincida con el de las otras tre clases (EmpleadoUnaFuente y EmpleadoSobrecarga y EmpleadoHerenciaPolimorfismo)
class Empleadosis implements Comparable {

	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private static int idSiguiente = 1;
	private int id;

	public Empleadosis(String nom, double sld, int anno, int mes, int dia) {
		nombre = nom;
		sueldo = sld;
		GregorianCalendar fecha = new GregorianCalendar(anno, mes - 1, dia);
		altaContrato = fecha.getTime();
		id = idSiguiente;
		idSiguiente++;
	}

	public Empleadosis(String nom) {
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

	// aquii sobreescribo el meetodo compareTo de la interfaz por exigencias de la
	// sintaxis de java. Por la definicioon de este meetodo el argumento es de tipo
	// object, aunque esto deriva en la necesidad de hacer un casting.
	public int compareTo(Object miObjeto) {
		Empleadosis comparador = (Empleadosis) miObjeto;
		if (this.sueldo < comparador.sueldo) {
			return -1;
		} else if (this.sueldo > comparador.sueldo) {
			return 1;
		} else { // caso de que sean iguales.
			return 0;
		}
	}
}

class Jefaturas extends Empleadosis {

	private double incentivo;

	public Jefaturas(String nom, double sld, int anno, int mes, int dia) {
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
