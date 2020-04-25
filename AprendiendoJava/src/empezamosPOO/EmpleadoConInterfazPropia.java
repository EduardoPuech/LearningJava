package empezamosPOO;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class EmpleadoConInterfazPropia {
	public static void main(String[] args) {

		JefaturaInterfazPropia jefeRRHH = new JefaturaInterfazPropia("Alfonso", 40000, 2005, 11, 27);
		jefeRRHH.estableceIncentivo(2570);
		EmpleadoInterfazPropia[] misEmpleados = new EmpleadoInterfazPropia[6];
		misEmpleados[0] = new EmpleadoInterfazPropia("Cesar de Echagüe", 25000, 2010, 03, 16);
		misEmpleados[1] = new EmpleadoInterfazPropia("Leonor de Acevedo", 25000, 2008, 01, 16);
		misEmpleados[2] = new EmpleadoInterfazPropia("Lupe de Torres", 26000, 2012, 02, 17);
		misEmpleados[3] = new EmpleadoInterfazPropia("Paca");
		misEmpleados[4] = jefeRRHH;
		misEmpleados[5] = new JefaturaInterfazPropia("Maria", 60000, 2000, 07, 15);
		JefaturaInterfazPropia jefaFinanzas = (JefaturaInterfazPropia) misEmpleados[5];
		jefaFinanzas.estableceIncentivo(1500);

		System.out.println(jefaFinanzas.tomarDecisiones("Hoy hay vacaciones"));
//		misEmpleados.tomarDecisiones("No hay vacaciones"); // da error porque la clase Empleado no implementa Jefe luego no le hemos creado el meetodo tomarDecisiones.
//		Ahora bien: si meto Jefes en Empleado e intento utilizar tomarDecisiones sii va a funcionar ya que Jefatura hereda Empleado y por lo tanto todos sus meetodos
//		estaan ahii. Aun asii, como no tiene sentido que el empleado pueda tomar decisiones es por eso por lo que se implementa en Jefatura y no en Empleado.

		System.out.println("El bonus de " + misEmpleados[2].getNombre() + " es de " + misEmpleados[2].set_bonus(1000));

		System.out.println("El bonus de " + jefeRRHH.getNombre() + " es de " + jefeRRHH.set_bonus(2000));

		for (EmpleadoInterfazPropia aumento : misEmpleados) {
			aumento.subidaSueldo(10);
		}

		Arrays.sort(misEmpleados);

		for (EmpleadoInterfazPropia impresion : misEmpleados) {
			System.out.println("Nombre: " + impresion.getNombre() + " -Sueldo actual: " + impresion.getSueldo()
					+ " -Anno de entrada en la empresa: " + impresion.getAltaContrato() + " -Id de empleado: "
					+ impresion.getId());
		}
	}
}


class EmpleadoInterfazPropia implements Comparable, Trabajadores {

	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private static int idSiguiente = 1;
	private int id;

	public EmpleadoInterfazPropia(String nom, double sld, int anno, int mes, int dia) {
		nombre = nom;
		sueldo = sld;
		GregorianCalendar fecha = new GregorianCalendar(anno, mes - 1, dia);
		altaContrato = fecha.getTime();
		id = idSiguiente;
		idSiguiente++;
	}

	public EmpleadoInterfazPropia(String nom) {
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
		EmpleadoInterfazPropia comparador = (EmpleadoInterfazPropia) miObjeto;
		if (this.sueldo < comparador.sueldo) {
			return -1;
		} else if (this.sueldo > comparador.sueldo) {
			return 1;
		} else {
			return 0;
		}
	}

	public double set_bonus(double bonus) {
		return Trabajadores.bonusBase + bonus;
	}
}


class JefaturaInterfazPropia extends EmpleadoInterfazPropia implements Jefes { // implemento la interfaz y
																				// automaaticamente me pide que
																				// desarrolle todos los meetodos de la
																				// misma.

	private double incentivo;

	public JefaturaInterfazPropia(String nom, double sld, int anno, int mes, int dia) {
		super(nom, sld, anno, mes, dia);
	}

	public void estableceIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}

	public double getSueldo() {
		double sueldoJefe = super.getSueldo();
		sueldoJefe = sueldoJefe + incentivo;
		return sueldoJefe;
	}

	public String tomarDecisiones(String decision) {
		return "Un miembro de la direcciioon ha tomado la decisioon de: " + decision;
	}

	// este es el meetodo del bonus que viene de la herencia de Trabajadores en la
	// interfaz Jefes.
	public double set_bonus(double bonus) {
		double prima = 2000;
		return Trabajadores.bonusBase + bonus + prima;
//				los 1500 de la interfaz + el argumento pasado por paraametro + la prima-> una prima extra para los jefes.
	}
}
