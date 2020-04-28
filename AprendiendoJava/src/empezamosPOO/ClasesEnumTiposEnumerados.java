package empezamosPOO;

import java.util.Scanner;

public class ClasesEnumTiposEnumerados {

	/*
	 * Esto sirve para acotar la cantidad de valores que se pueden
	 * almacenar en una variable.
	 * 
	 * Un tipo enumerado no se puede declarar dentro del main
	 */

	// una manera de hacerlo
	enum Tallas { // creo una clase de tipo enum
		PEQUENNA("S"), MEDIANA("M"), GRANDE("G"), MUY_GRANDE("MG");

		private Tallas(String abreviatura) { // y un constructor de tipo enum que funciona de setter
			this.abreviatura = abreviatura;
		}

		public String getAbreviatura() {
			return abreviatura;
		}

		private String abreviatura;
	}

	// otra manera de hacerlo
	enum Talla { // instanciando objeto
		SMALL, MEDIUM, LARGE, EXTRA_LARGE
	}; // instancia de la clase ENUM

	public static void main(String[] args) {
//		String talla;
//		talla = "Pequenna";
//		talla = "Mediana";
//		talla = "Grande";
//		talla = "MuyGrande";
//		talla = "Azul"; // esto no tiene sentido, como solo quiero las cuatro anteriores uso ENUM
		Talla s = Talla.SMALL;
		Talla m = Talla.MEDIUM;
		Talla g = Talla.LARGE;
		Talla mg = Talla.EXTRA_LARGE;
//		Talla r = Talla.Enorme; // da error porque no cumple los parametros previamente introducidos.

		Scanner input = new Scanner(System.in);
		System.out.println("Escribe la talla deseada Pequenna, Mediana, Grande, MuyGrande");
		String entrada = input.nextLine().toUpperCase(); // por si acaso lo escribe en minuusculas.
		Tallas laTalla = Enum.valueOf(Tallas.class, entrada); // utilizando un meetodo de la clase Enum que devuelve el
																// nombre de la constante enumerada a la que pertenece
																// el texto introducido, que estaa almacenado en
																// entrada, detectamos a quee tipo pertenece el String.
																// LUEGO EN laTalla ESTOY ALMACENANDO EL VALOR DE
																// entrada. ¿Es una especie de casting?
		System.out.println("Talla: " + laTalla);
		System.out.println("Abreviatura: " + laTalla.getAbreviatura());
	}
}
