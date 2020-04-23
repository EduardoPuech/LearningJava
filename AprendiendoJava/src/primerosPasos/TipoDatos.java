package primerosPasos;

public class TipoDatos { // https://www.youtube.com/watch?v=OS1F6VNA6hs&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=5

	public static void main(String[] args) {

		// DATOS PRIMITIVOS (int, byte...)
		// VARIABLES (un espacio de memoria RAM donde se almacena un valor que puede o
		// CAMPOS DE CLASE
		// cambiar (duh). (entero, bit, corto...)

		// NUUMEROS ENTEROS

		byte bit; // 1 byte, desde -128 hasta 127
		short corto; // 4 bytes, desde -32.786 hasta 32.767
		int entero; // 32 bytes, puede ir desde -2^31..2^31 (-2.147.483.648 hasta 2.147.483.647)
		long largo; // 64 bytes, sufijo L un potojo de nuumeros (4232L)
		final int troll = 234;

		// NUUMEROS DECIMALES o de coma flotante
		float flotante; // 4 bytes, de 6 a 7 cifras decimales significativas (aprox), con sufijo f 3.21F
		double decimal; // 64 bytes, tiene el doble (15) de precisioon.

		// LETRAS
		char caracter; // Una letra entre comilla simple (botoncito de la interrogacioon sin shift) y
						// se pronuncia car

		// VALORES LOOGICOS
		boolean verdaderoFalso; // Representa el valor de verdadero y falso

		// String no es un dato primitivo es una clase, una "variable objeto". String es
		// una cadena de caracteres
		String cadenaCaracteres;

		/*
		 * INICIO DE VARIABLE dar un valor a una variable (nombre de variable = valor;)
		 * Si una variable no estaa iniciada no se puede utilizar (en java) puede ser
		 * declaracioon e iniciacioon en la misma sentencia: int entero = 5; o
		 * declaracioon (declaring) y luegoo iniciacioon (initialization): int entero;
		 * entero = 5; dentro del metodo main
		 */

		bit = 8;
		corto = 8 + 7;
		entero = 8 + 7 + 9;
		// troll = troll + 7; al ser constante no es posible asignarle un cambio de
		// valor
		cadenaCaracteres = "Caca"; // el inicio de la variable objeto se llama instanciar o ejemplarizar.

		System.out.println(bit);

		/*
		 * OPERADORES
		 * 
		 * Aritmeeticos suma: + resta: - multiplicacioon: * divisioon: /
		 * 
		 * Loogicos, Relacionales y Booleanos
		 * 
		 * mayor que: > menor que: < mayor o menor que:<> distinto: != igual que: == y
		 * loogico: && o loogico: ||
		 * 
		 * Incremento y decremento
		 * 
		 * incremento: ++ (incrementa en 1 al valor al que se le aplica) decremento: --
		 * incremento alternativo: += nº decremento alternativo: -=
		 * 
		 * Concatenaciones
		 * 
		 * + (une o concatena, se diferencia de la suma por contexto y sintaaxis)
		 * 
		 */

		/*
		 * MODIFICADORES: https://www.youtube.com/watch?v=eQWnegzD6ug&list=
		 * PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=47
		 * 
		 * 
		 * De acceso: PUBLIC (se puede usar desde la propia clase, el mismo paquete,
		 * subclases tanto dentro como fuera del propio paquete y clases tanto dentro
		 * como fuera del propio paquete). PRIVATE (se puede usar desde la propia clase,
		 * no se puede usar en el mismo paquete, ni subclases tanto dentro como fuera
		 * del propio paquete, ni otras clases tanto dentro como fuera del propio
		 * paquete). PROTECTED (se puede usar desde la propia clase, el mismo paquete,
		 * subclases tanto dentro como fuera del propio paquete pero no se puede usar
		 * desde otra clase que no sea subclase y estee en otro paquete) y el
		 * MODIFICADOR POR DEFECTO: no poner nada (se puede usar desde la propia clase,
		 * el mismo paquete, subclases dentro del propio paquete y no se puede usar en
		 * subclases fuera del paquete, ni clases tanto dentro como fuera del propio
		 * paquete).
		 * 
		 * aambito: static. Tanto para variables como para meetodos (hace que se pueda,
		 * o no, utilizar en toda la clase). No se pueden crear meetodos que llamen a la
		 * variable estaatica, hay que utilizar el nombre de la clase: Clase.variable++;
		 * 
		 * "alterabilidad": final (variable o constante)
		 */

	}
}
