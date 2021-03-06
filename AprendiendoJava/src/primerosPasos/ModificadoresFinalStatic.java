package primerosPasos;

public class ModificadoresFinalStatic {

	/*
	 * Aquii voy a demostrar y explicar la utilizacioon de FINAL y de STATIC, para
	 * lo cual voy a empezar creando una clase EmpleadoFinalStatic parecida a la de
	 * EmpleadoFinalStaticUnaFuente. De hecho tambieen voy a usar solo un fichero fuente.
	 * 
	 * https://www.youtube.com/watch?v=tZekQAcSY8o&list=
	 * PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=36
	 * 
	 * FINAL lo utilizo para declarar constantes, cosas dentro de la clase que no
	 * quiero que sean alteradas a lo largo de la ejecucioon del programa.
	 * 
	 * Para este voy a annadir el uso de un Id uunico para cada EmpleadoFinalStatic
	 * 
	 * https://www.youtube.com/watch?v=QIV7FfXa-zY&list=
	 * PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=37
	 * 
	 * Una clase y un meetodo tambieen pueden ser final. Cuando una clase es final,
	 * acaba con el concepto de la herencia: no se permite hacer subclases de esa
	 * clase. Puede ser subclase de alguien pero no superclase de nadie.
	 * 
	 * 
	 * STATIC (///) altera el aambito, tanto de una variable como de un meetodo:
	 * hace que se pueda usar en toda la clase: en vez de que cada EmpleadoFinalStatic tenga un
	 * id, el propio programa tiene un id y por lo tanto cada vez que
	 * 
	 * 
	 */

	public static void main(String[] args) {

		EmpleadoFinalStatic empleadoFinalStatic1 = new EmpleadoFinalStatic("Carlos"); // creo el objeto EmpleadoFinalStatic
		EmpleadoFinalStatic empleadoFinalStatic2 = new EmpleadoFinalStatic("Ana"); // creo el objeto EmpleadoFinalStatic
		EmpleadoFinalStatic empleadoFinalStatic3 = new EmpleadoFinalStatic("Cristina");
		EmpleadoFinalStatic empleadoFinalStatic4 = new EmpleadoFinalStatic("Pedro");
//		System.out.println(EmpleadoFinalStatic1.getEmpleadoFinalStatic()); // veo las caracteriisticas predeterminadas
		empleadoFinalStatic1.setSeccion("Informaatica"); // lo muevo a un nuevo departamento
//	EmpleadoFinalStatic2.setNombre("Fernanda"); // al dejar de funcionar el meetodo ya no puedo usarlo
//	ahora bien, un EmpleadoFinalStatic no se puede cambiar el nombre, aunque el coodigo lo
//	permita y exista un meetodo que lo haga no deberiia poder hacerse. Para esto
//	es para lo que sirve el final:-------------------------------------------->
		System.out.println(empleadoFinalStatic1.getEmpleadoFinalStatic()); // vuelvo a ver las caracteriisticas
///		EmpleadoFinalStatic.id++; // tiene que estar despuees del primero para que haga la actualizacioon a partir
///						// de este, si hubiese un tercero lo pondriia tambieen entre el segundo y el
///						// tercero
		System.out.println(empleadoFinalStatic2.getEmpleadoFinalStatic());
		System.out.println(empleadoFinalStatic3.getEmpleadoFinalStatic());
		System.out.println(empleadoFinalStatic4.getEmpleadoFinalStatic());
	}

}

// va a crear un EmpleadoFinalStatic con un nombre y una seccioon a la que pertenece dentro de la empresa.
class EmpleadoFinalStatic {

	// creo las variables (encapsuladas)
//	---------------------------------> y por lo tanto tengo que declarar la
//	variable nombre como constante: final
	private final String nombre;
	private String seccion;
///	public static int id;
	private int id;
	private static int idCreciente = 1;

	// creo el constructor, tomando como presupuesto que todos los EmpleadoFinalStatics entran
	// al mismo departemento, con lo cual seccioon no es un paraametro.
	public EmpleadoFinalStatic(String nom) {
		nombre = nom;
		seccion = "Administracioon";
///		id = 1; // inicio la variable static en el constructor
		id = idCreciente;
		idCreciente++;
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
	public String getEmpleadoFinalStatic() {
		return "El EmpleadoFinalStatic se llama: " + nombre + ", pertenece a la seccioon: " + seccion + " y su Id es: " + id;
	}

}
