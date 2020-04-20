package primerosPasos;

public class ConceptoFinal {

	/*
	 * Aquii voy a demostrar y explicar la utilizacioon del FINAL, para lo cual voy
	 * a empezar creando una clase Empleado parecida a la de EmpleadoUnaFuente. De
	 * hecho tambieen voy a usar solo un fichero fuente
	 */

	public static void main(String[] args) {

		Empleado empleado1 = new Empleado("Carlos"); // creo el objeto empleado
		System.out.println(empleado1.getEmpleado()); // veo las caracteriisticas predeterminadas
		empleado1.setSeccion("Informaatica"); // lo muevo a un nuevo departamento
		System.out.println(empleado1.getEmpleado()); // vuelvo a ver las caracteriisticas
	}

}

// va a crear un empleado con un nombre y una seccioon a la que pertenece dentro de la empresa.
class Empleado {

	// creo las variables (encapsuladas)
	private String nombre;
	private String seccion;

	// creo el constructor, tomando como presupuesto que todos los empleados entran
	// al mismo departemento, con lo cual seccioon no es un paraametro.
	public Empleado(String nom) {
		nombre = nom;
		seccion = "Administracioon";
	}

	// setter que puede cambiar la seccioon a la que pertenece un trabajador
	public void setSeccion(String nuevaSeccion) {
		seccion = nuevaSeccion;
	}

	// getter del constructor
	public String getEmpleado() {
		return "El empleado se llama: " + nombre + " y pertenece a la seccioon: " + seccion;
	}

}
