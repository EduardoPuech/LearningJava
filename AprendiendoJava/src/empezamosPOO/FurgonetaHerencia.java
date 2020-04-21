package empezamosPOO;

public class FurgonetaHerencia extends Coche { // https://www.youtube.com/watch?v=rEOFpdI3HY0&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=41
//public class FurgonetaHerencia extends Coche extends UsoCoche { //NO SE PUEDE

	/*
	 * HERENCIA
	 * 
	 * public class Subclase extends Superclase
	 * 
	 * En el constructor: super();
	 * 
	 * NO se puede heredar de maas de una clase.
	 * 
	 * La regla de utilizacioon de la herencia consiste en responder a la premisa
	 * baasica: es un... a nuestro teermino de clases.
	 */

	private int capacidadCarga; // propiedad extra de la furgoneta que no tiene el coche
	private int plazasExtra;

	public FurgonetaHerencia(int capacidadCarga, int plazasExtra) {
		super(); // esto LLAMA AL CONSTRUCTOR de la clase padre
		this.capacidadCarga = capacidadCarga; // annadimos las caracteriisticas propias de Furgoneta
		this.plazasExtra = plazasExtra;
	}

	public String getFurgoneta() {
		return "La capacidad de carga es: " + capacidadCarga + " y tiene " + plazasExtra + " plazas extra.";
	}
}
