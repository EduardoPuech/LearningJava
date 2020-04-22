package empezamosPOO;

import java.util.Date;
import java.util.GregorianCalendar;

public class EmpleadoHerenciaPolimorfismo { // https://www.youtube.com/watch?v=3g_3cbH97cs&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=42
											// https://www.youtube.com/watch?v=sdJgcMaazmI&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=43

	/*
	 * Utilizo el coodigo de EmpleadoSobrecargaConstrucotores con los annadidos del
	 * static
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
					+ "\nAnno de entrada en la empresa: " + impresion.getAltaContrato() + "\nId de empleado: " + impresion.getId());
		}
		
		System.out.println("El siguiente id seriia: " + Empleadoses.getSiguienteId());
	}
}

// tengo que cambiarle el nombre para que no coincida con el de las otras dos clases (EmpleadoUnaFuente y EmpleadoSobrecarga)
class Empleadoses {

	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private static int idSiguiente = 1;
	private int id;
	
	public Empleadoses(String nom, double sld, int anno, int mes, int dia) {
		nombre = nom;
		sueldo = sld;
		GregorianCalendar fecha = new GregorianCalendar(anno, mes - 1, dia);
		altaContrato = fecha.getTime();
		id = idSiguiente;
		idSiguiente++;
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
	
	public int getId() {
		return id;
	}
	
	public static String getSiguienteId() {
		return "El id siguiente seriia: " + idSiguiente;
	}
}

class Jefatura extends Empleadoses {

	private double incentivo;

	public Jefatura(String nom, double sld, int anno, int mes, int dia) { // el constructor de la clase Empleado recibe
																			// argumentos, por lo tanto si quiero
																			// utilizarlo en la subclase tambieen tengo
																			// que darle argumentos (el mismo nuumero
																			// que en Empleado).
		super(nom, sld, anno, mes, dia); // Como teniia dos constructores, en funcioon de cuaantos argumentos pase estoy
											// llamando a un constructor o a otro.
	}

	// este meetodo annade el incentivo que diferencia los objetos de tipo empleado
	// y los de tipo jefe, a su vez, el sueldo de la calse empleado no puede aceptar
	// el annadido del incentivo, por lo tanto tengo que sobreescribir el metodo
	// setSueldo para que acepte el modelo de la clase jefe.
	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}

	// este meetodo es el que me va a permitir obtener el sueldo de un objeto de
	// la clase jefe. Puedo utilizar "sobrecarga" (sobreescritura) de meetodos ya
	// que estoy en dos clases distintas, pero este solo se puede utilizar en
	// Jefatura.
	public double getSueldo() { // el triaangulo verde avisa de la sobreescritura del meetodo
		double sueldoJefe = super.getSueldo(); // creo una variable que almacene el sueldo del objeto, ESTE GETSUELDO ES
												// DE LA CLASE PADRE.
		sueldoJefe = sueldoJefe + incentivo; // actualizo el sueldo sumaandole el incentivo || puedo hacerlo
												// directamente en el return.
		return sueldoJefe; // imprimo el nuevo sueldo
	}
}
