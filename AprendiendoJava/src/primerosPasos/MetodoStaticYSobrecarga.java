package primerosPasos;

public class MetodoStaticYSobrecarga { // https://www.youtube.com/watch?v=V0wIZ-OglsY&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=38

	
	//Utilizo el coodigo sin comentarios de ConceptoFinalStatic
	
	public static void main(String[] args) {

		Empleados empleado1 = new Empleados("Carlos");
		Empleados empleado2 = new Empleados("Ana");
		Empleados empleado3 = new Empleados("Cristina");
		Empleados empleado4 = new Empleados("Pedro");
		empleado1.setSeccion("Informaatica");
		System.out.println(empleado1.getEmpleado());
		System.out.println(empleado2.getEmpleado());
		System.out.println(empleado3.getEmpleado());
		System.out.println(empleado4.getEmpleado());
	}

}

class Empleados {

	private final String nombre;
	private String seccion;
	private int id;
	private static int idCreciente = 1;

	public Empleados(String nom) {
		nombre = nom;
		seccion = "Administracioon";
		id = idCreciente;
		idCreciente++;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	public String getEmpleado() {
		return "El empleado se llama: " + nombre + ", pertenece a la seccioon: " + seccion + " y su Id es: " + id;
	}

}
