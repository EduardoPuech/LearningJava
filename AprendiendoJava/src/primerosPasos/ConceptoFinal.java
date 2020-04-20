package primerosPasos;

public class ConceptoFinal { // https://www.youtube.com/watch?v=tZekQAcSY8o&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=36

	/*
	 * Aquii voy a demostrar y explicar la utilizacioon del FINAL, para lo cual voy
	 * a empezar creando una clase Empleado parecida a la de EmpleadoUnaFuente. De
	 * hecho tambieen voy a usar solo un fichero fuente.
	 */

	public static void main(String[] args) {

		Empleado empleado1 = new Empleado("Carlos"); // creo el objeto empleado
		Empleado empleado2 = new Empleado("Ana"); // creo el objeto empleado
		System.out.println(empleado1.getEmpleado()); // veo las caracteriisticas predeterminadas
		System.out.println(empleado2.getEmpleado());
		empleado1.setSeccion("Informaatica"); // lo muevo a un nuevo departamento
//	empleado2.setNombre("Fernanda"); // al dejar de funcionar el meetodo ya no puedo usarlo
//	ahora bien, un empleado no se puede cambiar el nombre, aunque el coodigo lo
//	permita y exista un meetodo que lo haga no deberiia poder hacerse. Para esto
//	es para lo que sirve el final:-------------------------------------------->
		System.out.println(empleado1.getEmpleado()); // vuelvo a ver las caracteriisticas
	}

}

// va a crear un empleado con un nombre y una seccioon a la que pertenece dentro de la empresa.
class Empleado {

	// creo las variables (encapsuladas)
//	---------------------------------> y por lo tanto tengo que declarar la
//	variable nombre como constante: final
	private final String nombre;
	private String seccion;

	// creo el constructor, tomando como presupuesto que todos los empleados entran
	// al mismo departemento, con lo cual seccioon no es un paraametro.
	public Empleado(String nom) {
		nombre = nom;
		seccion = "Administracioon";
	}

	// setter que puede cambiar la seccioon a la que pertenece un trabajador
	public void setSeccion(String seccion) {
		this.seccion = seccion; // el this representa la de clase.
		// this.variableDeClase = argumentos;
	}

	// tambien puedo crear un setter para cambiar el nombre despuees de haber creado
//	 el objeto; como he definido nombre como final este meetodo da error porque
//	 intenta cambiar el valor de una constante
//	public void setNombre(String nombre) {
//		this.nombre = nombre;
//	}

	// getter del constructor
	public String getEmpleado() {
		return "El empleado se llama: " + nombre + " y pertenece a la seccioon: " + seccion;
	}

}
