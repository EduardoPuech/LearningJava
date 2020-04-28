package primerosPasos;

import java.util.*;

public class CondicionIf {

	public static void main(String[] args) {

		// El if y el switch es lo que se conoce como un flujo de ejecucioon condicional, esto es,
		// alteracioon del orden de ejecucioon del codigo
		// 
		// if (condicion) {
		// 	coodigo a ejecutar si o solo si se cumple la condicion
		// }
		// else		(atencion que no lleva ni punto y coma ni na
		//  coodigo a ejectuar
		//
		// puede no llevar else, por ejemplo cuando quiero aportar informacioon extra dada la condicioon
		// pero que el resto del programa siga igual
		// puede ir acompañado de tantos else if como sean necesarios -> ejemplo de las puertas
		
		// switch (valor a evaluar) { (uutil cuando hay muchas condiciones fijas)
		// 	case valor1
		// 		codigo a ejecutar
		// 		break
		// 	case valor2
		// 		codigo a ejecutar
		// 		break
		// }
		//
		// puede ir acompannado de un default
		
		//TODO: dada una edad confirmar si es o no mayor de edad.
		
		final int mayorEdad = 18; //lo creo asii para repasar
		Scanner input = new Scanner(System.in);	// entrada por consola de la informacioon
		
		System.out.println("¿Cuaantos años tiene?"); // inicio de programa en consola
		
		int edad = input.nextInt(); // no meto nada en el parentesis, ese valor es el que entra por consola
		
		if (edad >= mayorEdad) { // condicioon para que se ejecute lo que estaa dentro
			System.out.println("Disfrute de las copichuelas");
		} else {
			System.out.println("Vuelve cuando tengas barba");
		}
		
		//Acceso a club por tres puertas
		
		Scanner inputPuerta = new Scanner(System.in);
		
		System.out.println("En funcioon de su edad entraraa por una puerta u otra");
		
		int edadPuerta = inputPuerta.nextInt();
		
		if (edadPuerta < 14) {
			System.out.println("Utilice la puerta de la derecha");	
		} else if (edadPuerta < 21 /*&& edadPuerta >= 14*/) { 	// no hace falta la segunda condicioon ya que al no cumplirse el primer if salta
																// directamente al segundo
			System.out.println("Utilice la puerta del centro");
		} else {
			System.out.println("Utilice la puerta de la izquierda");
		}
	}
}
