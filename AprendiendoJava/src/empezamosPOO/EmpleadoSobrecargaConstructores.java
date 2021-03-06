package empezamosPOO;

import java.util.Date;
import java.util.GregorianCalendar;

public class EmpleadoSobrecargaConstructores { // https://www.youtube.com/watch?v=_ZWcobe9afw&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=39

	// Utilizo el coodigo sin comentarios de EmpleadoUnaFuente

	/*
	 * La sobrecarga de constructores implica que una misma clase puede tener varios
	 * constructores. En caso de querer utilizarlo, la condicioon es que cada
	 * constructor tenga distinto nuumero (y tipo) de argumentos.
	 * 
	 * Esto puede ser uutil cuando quiero dar a los objetos de la clase distintos
	 * estados iniciales.
	 * 
	 * El this the un constructor me sirve para utilizar la tipologiia de otro a la
	 * hora de rellenar los valores. El this sabe a quee otro constructor hace
	 * referencia en caso de que haya maas de dos seguun el nuumero de paraametros
	 * introducidos.
	 * 
	 * Existe ademaas una cosa en java que se llama el CONSTRUCTOR POR DEFECTO. Si
	 * construyes una clase sin constructor entra en juego el constructor por
	 * defecto, que no recibe argumentos. Los valores los metes a base de setters.
	 * 
	 * Igual que hay sobrecarga de Constructores hay sobrecarga de Meetodos: el
	 * criterio es el mismo, mientras el nuumero de argumentos recibidos sea
	 * distinto nos vale.
	 */

	public static void main(String[] args) {

		EmpleadoSobrecarga[] misEmpleadoSobrecarga = new EmpleadoSobrecarga[4];
		misEmpleadoSobrecarga[0] = new EmpleadoSobrecarga("Cesar de Echag�e", 25000, 2010, 03, 16);
		misEmpleadoSobrecarga[1] = new EmpleadoSobrecarga("Leonor de Acevedo", 24000, 2008, 01, 16);
		misEmpleadoSobrecarga[2] = new EmpleadoSobrecarga("Lupe de Torres", 26000, 2012, 02, 17);
		misEmpleadoSobrecarga[3] = new EmpleadoSobrecarga("Paca");

		for (EmpleadoSobrecarga aumento : misEmpleadoSobrecarga) {
			aumento.subidaSueldo(15);
		}

		for (EmpleadoSobrecarga impresion : misEmpleadoSobrecarga) {
			System.out.println("Nombre: " + impresion.getNombre() + "\nSueldo actual: " + impresion.getSueldo()
					+ "\nAnno de entrada en la empresa: " + impresion.getAltaContrato());
		}
	}
}

class EmpleadoSobrecarga {
	// este seriia el primer constructor para el primer tipo de estado inicial
	public EmpleadoSobrecarga(String nom, double sld, int anno, int mes, int dia) {
		nombre = nom;
		sueldo = sld;
		GregorianCalendar fecha = new GregorianCalendar(anno, mes - 1, dia);
		altaContrato = fecha.getTime();
	}

	// este seriia el segundo (por ejemplo si desconozco el sueldo de alguno de los
	// EmpleadoSobrecarga o la fecha de alta, solo conozco el nombre

//	public EmpleadoSobrecarga (String nom) { // este devolveriia el nombre, en la seccioon sueldo un 0 (valor prederminado de int)
//									// y en la seccioon altaContrato devolveriia null (valor predeterminado de la clase Date.
//		nombre = nom;
//	}

	public EmpleadoSobrecarga(String nom) {
		this(nom, 20000, 2000, 01, 01); // ademaas voy a dar unos valores predeterminados para todo empleado: el THIS
										// llama al otro constructor para la "tipificacioon" de coomo rellenar esos
										// valores predeterminados.
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
