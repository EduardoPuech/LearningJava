package primerosPasos;

public class ClaseString {
	public static void main(String[] args) { // los espacios en blanco cuentan como caracter

		// MEETODS
		String nombre, largo, corto;
		nombre = "Eduardo";
		largo = "Eduardo es una buena persona";
		char n;
		int ultimaLetra;

		System.out.println("Mi nombre es " + nombre);

		// length() Longitud -- cadena.length()
		System.out.println("Mi nombre tiene " + nombre.length() + " letras");

		// charAt(n) posicioon de un caracter en una cadena (empieza en 0)
		// --cadena.charAt(n)
		System.out.println("La tercera letra de mi nombre es " + nombre.charAt(2));

		/*
		 * substring(n, m) extraer una cadena desde x hasta siendo y la posicioon a
		 * partir de la cual ya no quiero extraer -- largo.substring(n, m);
		 */
		System.out.println("De la cuarta a la octava letras de esta frase son " + largo.substring(3, 6)); // atencioon a
																											// la
																											// diferencia
																											// entre
		System.out.println("En la cuarta empiezo y la quinta ya no la cojo: " + largo.substring(3, 4)); // posicioon
																										// (0...) y el
																										// contador
																										// tradicional
																										// (1...)*/

		// equals(cadena) compara lo que le das con lo que tiene, es booleano: devuelve
		// true o false CASE SENSITIVE
		largo.equals(nombre);
		largo.equalsIgnoreCase(nombre); // ignora mayuusculas
		System.out.println(largo.equals(nombre));

		// Variaciones
		corto = largo.substring(0, 7); // hago una cadena nueva extrayendo una parte de la larga
		n = largo.charAt(0); // creo un char n con la letra que estaa en la posicioon 0 de largo
		ultimaLetra = largo.length(); // esto me da el valor total de letras, a saber 7

		System.out.println(nombre.equals(corto)); // comparo la cadena nueva con nombre
		System.out.println(n); // imprime n
		System.out.println("La uultima letra de la cadena es " + largo.charAt((ultimaLetra - 1)));
		/*
		 * aquii, al empezar a contar de 0 tengo que restar 7-1=6 para que me de la
		 * letra que esta en la posicioon 6.
		 * 
		 * Y esto me sirve para todo tipo de longitud de la frase
		 */

		// Eduardo
		// 1234567 (nuumero de letras)
		// 0123456 (posicioon de las letras en el String)

		// Tambieen puedo alterar strings:

		corto = largo.substring(0, 7) + ", ese " + largo + " yuhu";
		System.out.println(corto);

	}
}
