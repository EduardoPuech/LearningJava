package primerosPasos;

public class InformacionJava {

	public static void main(String[] args) {

		// ACCESOS DIRECTOS

		// Autotabulacioon = Ctrl + Shift + F.
		// Autocompletar = Ctrl + barra espaciadora,
		// Autoimportar = Ctrl + Shift + O.
		// Comentar una linea ya escrita = Ctrl + /
		// Deshacer = Ctrl + Z
		// Rehacer = Ctrl + Y
		// Cambio de nombre = F2
		// Ejecutar = CTRL + F11

		/*
		 * PACKAGE
		 * 
		 * Los paquetes sirven para organizar los archivos de tipo java que van a formar
		 * un uunico programa, por decirlo de alguna manera, son carpetas dentro de los
		 * proyectos.
		 */

		/*
		 * COSAS A RECORDAR
		 * 
		 * Java es un legunaje de programacioon orientada a objetos. Estos objetos tiene
		 * propiedades (descripcioon fiisica) y meetodos (quee es capaz de
		 * hacer/utilidad). ejemplo: coche; propiedades: colores... meetodo: girar,
		 * acelerar... la Console de java tambieen es un objeto y por lo tanto tambieen
		 * tienes sus meetodos System.out.println(ting) es un meetodo de la consola
		 * 
		 * Java es un lenguaje que diferencia entre mayuusculas y no mayuusculas
		 * 
		 * public es un modificador de acceso
		 * 
		 * class significa que todo lo que estaa dentro de {} estaa en esa clase, en
		 * java TODO tiene que estar dentro de AL MENOS una clase
		 * 
		 * las {} delimitan bloques de coodigo, clases, meetodos, bucles... y van
		 * SIEMPRE en pareja. Puede haber unas dentro de otras y se utiliza la sangriia
		 * para saber quee llaves van dentro de otras, como cosa uutil.
		 * 
		 * Los comentarios son muyyyyyyy uutiles.
		 */

		/*
		 * INSTRUCCIONES
		 * 
		 * Primero se crea un proyecto. Segundo se crea una clase. (atencioon a crear la
		 * clase seleccionando el proyecto en el que quiero que se cree) (ambas cosas
		 * sin caraacteres extrannos y con la primera letra en mayuuscula).
		 * 
		 * En java todas las sentencias terminan en punto y coma.
		 */

		/*
		 * TIPOS DE ARCHIVO
		 * 
		 * El archivo que creo cuando se crea la clase estaa en la carpeta src del
		 * projecto. El archivo que hay en la carpeta bin *.class es el archivo de tipo
		 * java que cualquiera con una maquina virutal java puede ejecutar Si tengo que
		 * crear la clase con un editor de texto tengo que llamar al archivo igual que a
		 * la clase y con extensioon *.java
		 */

		/*
		 * COMPILACIOON Y EJECUCIOON Y FLUJOS DE EJECUCIOON
		 * 
		 * De arriba a abajo
		 * 
		 * Los flujos de ejecucioon sirven para alterar el orden de la misma: dando
		 * saltos (condicional -> if o switch) o repitiendo (bucle)
		 */
		int entero = 35;
		System.out./* <--esto es la consola */println(entero);
		entero = 67;
		System.out.println(entero);

		/*
		 * Errores
		 * 
		 * Tiempo de compilacioon: la sintaaxis estaa mal Tiempo de ejecucioon: la
		 * sintaaxis estaa bien pero el programa estaa mal escrito
		 */

		/*
		 * TIPOS DE CLASES
		 * 
		 * Propias
		 * 
		 * las que creo yo como programador
		 * 
		 * Predefinidas
		 * 
		 * te vienen ya construidas y las puedes usar cuando quieras String (cadenas de
		 * caracteres), Math (operaciones complejas), Array, Thread (programacioon
		 * concurrente)...
		 * 
		 * Biblioteca de clases o API de java (banco donde estaan todas las clases
		 * predeterminadas. Se accede a travees del navegador
		 * https://docs.oracle.com/javase/8/docs/api/
		 * 
		 */

		/*
		 * Refundicioon
		 * 
		 * convertir un tipo de dato en otro int a = (int)Math.round(b); el (int) es la
		 * conversioon se suele utilizar para optimizar uso de memoria
		 * 
		 */
		double a = 7.8;
		int refundicion;

		refundicion = (int) a;

		System.out.println(refundicion);

	}
}