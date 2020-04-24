package empezamosPOO;

public interface Jefes extends Trabajadores { // https://www.youtube.com/watch?v=59Tpg7XbIEo&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=50

	/*
	 * los modificadores public abstract estaan por defecto en una interfaz, de
	 * todas maneras intentaree acordarme de ponerlos
	 * 
	 * Las interfaces tambieen pueden heredar, por ejemplo para establecer
	 * jerarquias y para en vez de tener que implementar tres interfaces que con una
	 * que acarrea las anteriores sea suficiente. Esto significa que en la clase
	 * implementada tengo que poner los MEETODOS DE TODAS las interfaces acumuladas.
	 */

	public abstract String tomarDecisiones(String decision); // los meetodos de una interfaz se definen, NUNCA se
																// desarrollan.

}
