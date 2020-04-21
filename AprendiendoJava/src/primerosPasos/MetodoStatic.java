package primerosPasos;

public class MetodoStatic { // https://www.youtube.com/watch?v=V0wIZ-OglsY&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=38

	// Utilizo el coodigo sin comentarios de ConceptoFinalStatic

	// El concepto del static para los meetodos es la misma que para las variables.
	// los meetodos static no pueden acceder a las variables de clase a no ser que
	// la variable tambieen sea static.
	// no actuan sobre objetos
	// hay que dar el NombreClase.meetodo para usarlos (clase Math es un buen ejemplo)

	public static void main(String[] args) { // el meetodo main es STATIC porque ya que todo programa de java al empezar
												// a ejecutarse empieza por eel. Como a la hora de empezar no existe
												// nada, el que se encarga de construir los objetos... es el main, main
												// tiene que ser public y static para que se pueda llamar desde otras
												// clases y lo puedan usar todas las clases. Si solo fuese public se le
												// podriia llamar pero no usar.
		// a su vez, el meetodo main recibe un array de tipo String con nombre args

		Empleados empleado1 = new Empleados("Carlos");
		Empleados empleado2 = new Empleados("Ana");
		Empleados empleado3 = new Empleados("Cristina");
		Empleados empleado4 = new Empleados("Pedro");
		empleado1.setSeccion("Informaatica");
		System.out.println(empleado1.getEmpleado() + "\n" + empleado2.getEmpleado() + "\n" + empleado3.getEmpleado()
				+ "\n" + empleado4.getEmpleado());
		System.out.println(Empleados.getSiguienteId()); // al ser static se utiliza el nombre de la clase
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
