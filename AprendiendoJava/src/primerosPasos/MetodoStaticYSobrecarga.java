package primerosPasos;

public class MetodoStaticYSobrecarga { // https://www.youtube.com/watch?v=V0wIZ-OglsY&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=38

	// Utilizo el coodigo sin comentarios de ConceptoFinalStatic

	// El concepto del static para los meetodos es la misma que para las variables.

	public static void main(String[] args) {

		Empleados empleado1 = new Empleados("Carlos");
		Empleados empleado2 = new Empleados("Ana");
		Empleados empleado3 = new Empleados("Cristina");
		Empleados empleado4 = new Empleados("Pedro");
		empleado1.setSeccion("Informaatica");
		System.out.println(empleado1.getEmpleado() + "\n" + empleado2.getEmpleado() + "\n" + empleado3.getEmpleado()
				+ "\n" + empleado4.getEmpleado());
		System.out.println(Empleados.getSiguienteId());
	}

}

class Empleados {

	private final String nombre;
	private String seccion;
	private int id;
	private static int idSiguiente = 1;

	public Empleados(String nom) {
		nombre = nom;
		seccion = "Administracioon";
		id = idSiguiente;
		idSiguiente++;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	public String getEmpleado() {
		return "El empleado se llama: " + nombre + ", pertenece a la seccioon: " + seccion + " y su Id es: " + id;
	}

	// nuevo coodigo

	public static String getSiguienteId() {
		return "El id siguiente seriia: " + idSiguiente;
	}

}
