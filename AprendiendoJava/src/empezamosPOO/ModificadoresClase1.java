package empezamosPOO;

public class ModificadoresClase1 {

	/*
	 * Todo esto es igual para campos de clase (variables) y para meetodos.
	 * 
	 * Tampoco he creado constructor asii que tiene el constructor por defecto
	 * (public clase1mod(){})
	 * 
	 * 
	 */

	private int miVariable = 5; // esta no la puedo ver desde Clase2 ni si quiera en el mismo paquete.
	public int miVariable2 = 7;
	protected int miVariable3 = 9;
	int miVariable4 = 11;

	String miMetodo() {
		return "El valor de miVariable2 es: " + miVariable2;
	}

}
