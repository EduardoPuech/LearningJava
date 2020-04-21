package empezamosPOO;

// Eel reutiliza UsoCoche cambiandole el nombre, yo creo una nueva
public class UsoVehiculo {

	public static void main(String[] args) {
		Coche miCoche1 = new Coche(); // creo un coche
		miCoche1.setColor("Aamarillo"); // uso uno de los setters
		FurgonetaHerencia miFurgoneta1 = new FurgonetaHerencia(600, 3); // creo una furgoneta, que me exige darle dos
																		// paraametros.
		miFurgoneta1.setColor("Annil"); // Utilizo un meetodo de Coche en Furgoneta
		miFurgoneta1.setAsientosCuero("si");
		miFurgoneta1.setClimatizador("si");
		System.out.println(miCoche1.getConstructor() + "\n" + miCoche1.getColor());
		System.out.println(miFurgoneta1.getConstructor() + "\n" + miFurgoneta1.getFurgoneta() + "\n" + miFurgoneta1.getClimatizador() + "\n"
				+ miFurgoneta1.getAsientos());
	}

}
