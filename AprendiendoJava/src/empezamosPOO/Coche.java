package empezamosPOO;

public class Coche { // poner el private es lo que se conoce como encapsulacioon. Esto impide que
						// otra clase del mismo programa edite de manera indebida estas variables y eso
						// haga que el programa se estropee
	private int ruedas; // todos los coches tienen ruedas, 4 (int)
	private int largo; // puedo ponerlo como double, pero como lo voy a poner en cm lo declar int
	private int ancho;
	private int motor; // entero porque voy a especificar los mm3
	private int pesoPlataforma; // en kilos
	private int pesoTotalCoche;
	private String color; // otro de los usos de en encapsulado es para los setters, asegura que la
							// variable se pueda modificar con el setter pero nunca con el constructor, es
							// una manera de protegerlo, porque solo puedes cambiar uno a uno, no puedes de
							// repente cambiar todos los objetos con una sola linea.
	private boolean asientosCuero;
	private boolean climatizador; // los creo de tipo boolean para poder hacer meetodo que calcule el
									// precio final de manera maas sencilla
	/*
	 * Para definir los valores de estas variables utilizo un MEETODO CONSTRUCTOR,
	 * es un meetodo especial que se encarga de dar un estado inicial a nuestro
	 * objeto.
	 */

	// Creacioon de un meetodo CONSTRUCTOR:
	// public nombreClase(estoVacio){ //siempre el nombre de la clase.
	// }
	public Coche() { // El constructor es el lugar en el que se establece el estado inicial del
						// objeto de la clase para cuando vaya a ser utilizado por otras clases
		ruedas = 4;
		largo = 400;
		ancho = 180;
		motor = 1600;
		pesoPlataforma = 500;
	}

	public String getConstructor() { // getter constructor
		return "La plataforma del vehiiculo tiene " + ruedas + " ruedas, es " + largo + " cm de largo y " + ancho
				+ " de ancho. \nTiene un motor de " + motor + " cm cuubicos y el peso total de la plataforma es de "
				+ pesoPlataforma + " kilos";
	}

	// GETTER
	// largo es de tipo int, luego puedo poner que me devuelva un valor de tipo int,
	// pero puedo pedirle que me devuelva una frase que incluya informacioon sobre
	// el dato que estoy pidiendo, para eso pongo tipo String
	public String getLargo() {
		// todo getter tiene que ir acompannado de un return
		return "El largo del coche es " + largo + " cm"; // aquii sii puedo usar largo porque aunque sea private estaa
															// dentro de esta clase
	}

	// SETTER y getter de color
	// El setter es el que me permite alterar las propiedades de los objetos que sii
	// quiero poder cambiar
	public void setColor(String colorCoche) { // Si creo una variable en los pareentesis hago que cada coche puede tener
												// si propio color porque seriia "dinaamico". El tipo de variable tiene
												// que ser igual que la variable para la que hago el setter.
		color = colorCoche; // con esto inicializo la variable "dinaamica"
//		color = "azul"; Si lo declaro aquii seriia lo mismo que el constructor, todos obtendriian este valor.
	}

	public String getColor() {
		return "El color del coche es " + color;
	}

	// set y get para los asientos de cuero
	public void setAsientosCuero(String asientosCuero) {
		// el this es para diferenciar el this.asientosCuero variable de clase con el
		// asientosCuero argumento de meetodo
		if (asientosCuero.equalsIgnoreCase("si")) {
			this.asientosCuero = true;
		} else {
			this.asientosCuero = false;
		}
	}

	public String getAsientos() {
		if (asientosCuero == true) { // aquii no hay argumento asientos cuero luego no hay lugar a confusioon, por lo
										// tanto la variable de clase no necesita el this.
			return "El coche tiene asientos de cuero";
		} else { // al ser un getter, SIEMPRE tiene que ocurrir algo luego siempre tiene que
					// haber un else
			return "El coche no tiene asientos de cuero";
		}
	}

	// Setter y getter para el climatizador

	public void setClimatizador(String climatizador) {
		if (climatizador.equalsIgnoreCase("si")) {
			this.climatizador = true;
		} else {
			this.climatizador = false;
		}
	}

	public String getClimatizador() {
		if (climatizador) { // al ser una variable booleana no hace falta poner == true. Auun asii voy a
									// dejarlo en la otra por cuestiones didaacticas
			return "El coche tiene climatizador";
		} else {
			return "El coche no tiene climatizador";
		}
	}

	// setter+getter unido para el pesoTotalCoche
	public String setGetPesoCoche() { // esto es un setter y getter a la vez
		// es setter porque le damos valor a una variable de CLASE y es getter porque
		// tiene return
		// RECORDAR QUE ES POCO RECOMENDABLE
		int pesoCarroceria = 500;
		pesoTotalCoche = pesoPlataforma + pesoCarroceria;
		if (asientosCuero == true) {
			pesoTotalCoche = pesoTotalCoche + 50;
		}
		if (climatizador == true) {
			pesoTotalCoche = pesoTotalCoche + 20;
		}
		return "El peso del coche es " + pesoTotalCoche;
	}

	// getter del precio del coche
	public int getPrecioCoche() { // solo es getter porque no cogemos ninguna variable de clase. El hecho de que
									// haya operaciones dentro no pasa nada
		int precioFinal = 10000;
		if (asientosCuero == true) {
			precioFinal += 2000;
		}
		if (climatizador == true) {
			precioFinal += 1500;
		}
		return precioFinal;
	}

}
