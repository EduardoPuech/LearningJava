package empezamosPOO;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Arrays;// Con esto fuerzo la necesidad de interfaz. De esta clase voy a usar el meetodo
						// sort(Object[]a) que me obliga a que los elementos del array (clase EmpleadoInterfazPre)
						// utilicen la interfaz "Comparable".

public class EmpleadoInterfazPredefinida {
	public static void main(String[] args) {

		JefaturaInterfazPre jefeRRHH = new JefaturaInterfazPre("Alfonso", 40000, 2005, 11, 27);
		jefeRRHH.setIncentivo(2570);
		EmpleadoInterfazPre[] misEmpleados = new EmpleadoInterfazPre[6];
		misEmpleados[0] = new EmpleadoInterfazPre("Cesar de Echagüe", 25000, 2010, 03, 16);
		misEmpleados[1] = new EmpleadoInterfazPre("Leonor de Acevedo", 25000, 2008, 01, 16);
		misEmpleados[2] = new EmpleadoInterfazPre("Lupe de Torres", 26000, 2012, 02, 17);
		misEmpleados[3] = new EmpleadoInterfazPre("Paca");
		misEmpleados[4] = jefeRRHH;
		misEmpleados[5] = new JefaturaInterfazPre("Maria", 60000, 2000, 07, 15);
		JefaturaInterfazPre jefaFinanzas = (JefaturaInterfazPre) misEmpleados[5];
		jefaFinanzas.setIncentivo(1500);

		for (EmpleadoInterfazPre aumento : misEmpleados) {
			aumento.subidaSueldo(10);
		}

		// uso el sort para ordenarlos de menor a mayor por sueldo
		Arrays.sort(misEmpleados);

		for (EmpleadoInterfazPre impresion : misEmpleados) {
			System.out.println("Nombre: " + impresion.getNombre() + " -Sueldo actual: " + impresion.getSueldo()
					+ " -Anno de entrada en la empresa: " + impresion.getAltaContrato() + " -Id de empleado: "
					+ impresion.getId());
		}

//		System.out.println("El siguiente id seriia: " + Empleadoses.getSiguienteId());
	}
}

// tengo que cambiarle el nombre para que no coincida con el de las otras tre clases (EmpleadoUnaFuente y EmpleadoSobrecarga y EmpleadoHerenciaPolimorfismo)
class EmpleadoInterfazPre implements Comparable {

	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private static int idSiguiente = 1;
	private int id;

	public EmpleadoInterfazPre(String nom, double sld, int anno, int mes, int dia) {
		nombre = nom;
		sueldo = sld;
		GregorianCalendar fecha = new GregorianCalendar(anno, mes - 1, dia);
		altaContrato = fecha.getTime();
		id = idSiguiente;
		idSiguiente++;
	}

	public EmpleadoInterfazPre(String nom) {
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
	// sintaxis de java.
	public int compareTo(Object miObjeto) { // Por la definicioon de este meetodo el argumento es de tipo object, aunque
											// esto deriva en la necesidad de hacer un casting.
		EmpleadoInterfazPre comparador = (EmpleadoInterfazPre) miObjeto; // casting del argumento al tipo de objeto que yo he creado
															// para poder extraer la caracteriistica que quiero.
		if (this.sueldo < comparador.sueldo) { // una vez que he sacado esa caracteriistica (sueldo en este caso pero
												// puedo poner cualquier cosa) comparo el que estoy comparando con el
												// del siguiente.
			return -1; // requiere este valor por la documentacioon de la api en caso de ser menor
		} else if (this.sueldo > comparador.sueldo) {
			return 1; // en caso de ser mayor requiere este
		} else { // caso de que sean iguales.
			return 0;
		}
	}
}

class JefaturaInterfazPre extends EmpleadoInterfazPre {

	private double incentivo;

	public JefaturaInterfazPre(String nom, double sld, int anno, int mes, int dia) {
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
