package primerosPasos;

public class InformacionJava {

	public static void main(String[] args) {

		// ACCESOS DIRECTOS

		// Autotabulacioon = Ctrl + º; Lo cambie desde el original: Ctrl + Shift + F.
		// Autocompletar = Ctrl + barra espaciadora,
		// Autoimportar = Ctrl + Shift + O.
		// Comentar una linea ya escrita = Ctrl + /
		// Deshacer = Ctrl + Z
		// Rehacer = Ctrl + Y
		// Cambio de nombre = F2
		// Ejecutar = CTRL + F11
		// Eliminar una linea de coodigo = Ctrl + D
		// Pasar de una clase abierta a otra = Ctrl + Page Up/Down

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
		 * ERRORES
		 * 
		 * Tiempo de compilacioon: la sintaaxis estaa mal
		 * 
		 * Tiempo de ejecucioon: la sintaaxis estaa bien pero el programa estaa mal
		 * escrito
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
		 * CASTING O REFUNDICIOON
		 * 
		 * convertir un tipo de dato en otro int a = (int)Math.round(b); el (int) es la
		 * conversioon se suele utilizar para optimizar uso de memoria
		 * 
		 */
		double a = 7.8;
		int refundicion;

		refundicion = (int) a;

		System.out.println(refundicion);

		/*
		 * SOBRECARGA
		 * 
		 * La sobrecarga es la existencia de maas de un constructor en una clase. Se
		 * utiliza para iniciar objetos de manera distinta. Al utilizar el constructor,
		 * para usar uno u otro lo que hay que hacer es dar el nuumero de argumentos que
		 * pide cada uno.
		 */

		/*
		 * HERENCIA (extends, super();)
		 * 
		 * El concepto de la herencia en POO es muy parecido a la vida real: cuando hay
		 * un clase dentro de otra la inferior (hija/subclase) puede usar todos los
		 * meetodosb y caracteriisticas de la superior (padre/superclase). "Anidable"
		 * tantas veces como se haya programado.
		 * 
		 * Es, ni maas ni menos, reutilizar el coodigo ya escrito.
		 * 
		 * NO SE PUEDE HEREDAR DE MAAS DE UNA CLASE.
		 * 
		 * La regla de utilizacioon de la herencia consiste en responder a la premisa
		 * baasica: ¿subclase ES SIEMPRE UN superclase?... a nuestro teermino de clases.
		 * 
		 * Una clase y un meetodo tambieen pueden ser final. Cuando una clase es final,
		 * acaba con el concepto de la herencia: no se permite hacer subclases de esa
		 * clase. Puede ser subclase de alguien pero no superclase de nadie.
		 * 
		 * Voy a llamar herencia indirecta a herencia de segunda, tercera o mayor
		 * generacioon.
		 * 
		 * TODAS LAS CLASES, DE MANERA PREDETERMINADA POR JAVA HEREDAN DE LA CLASE
		 * OBJECT Y ES POR ESTO QUE SIEMPRE PUEDEN UTILIZAR TODO SU ARSENAL.
		 * https://docs.oracle.com/javase/8/docs/api/
		 */

		/*
		 * POLIMORFISMO Y PRINCIPIO DE SUSTITUCIOON
		 * 
		 * Las variables objeto en java son polimoorficas.
		 * 
		 * El principio de sustitucioon quiere decir que podemos utilizar un objeto de
		 * una subclase siempre que el programa espere un objeto de la superclase
		 * (herencia). || Un objeto se puede comportar de diferente forma dependiendo
		 * del contexto.
		 * 
		 * El Enlazado Dinaamico es el proceso automaatico por el cual el interprete de
		 * java/maaquina virtual/compilador sabe, en un caso de polimorfismo, a quee
		 * clase estaa haciendo referencia en cada momento en el tiempo de ejecucioon.
		 */

		/*
		 * ABSTRACTO
		 * 
		 * Su funcioon es crear un patroon de disenno. Cuando necesito un meetodo que
		 * exista en todas las subclases pero que dependiendo de cada una de ellas tenga
		 * que ser de una manera u otra lo declaro abstracto y fuerzo lo que explico
		 * despuees.
		 * 
		 * Meetodos, clases... cuando una clase tiene un (o maas de uno) meetodo
		 * abstracto pasa a ser automaaticamente una clase abstracta.
		 * 
		 * abstract class nombreClase{...}
		 * 
		 * Un meetodo abstracto (public abstract tipoDato nombreMeetodo ()); No tiene
		 * llaves. Es una especie de meetodo geneerico, esto es, en caso de herencia,
		 * todas las clases que hereden (directa o indirectamente) de ella ESTAAN
		 * OBLIGADAS a sobreescribir ese meetodo (public tipoDato nombreMeetod(){...}
		 * Loogicamente seraan distintos en cada caso porque para eso estaa la
		 * abstraccioon.
		 */

		/*
		 * INTERFACES
		 * 
		 * Una interfaz es un conjunto de directrices (directriz +=- meetodo) que tiene
		 * que cumplir una clase (se parecen, aunque no lo son, a lo que es una clase
		 * abstracta). Establecen un comportamiento.
		 * 
		 * Una clase ClaseEjemplo implementa (parecido a la herencia) una Interfaz.
		 * 
		 * Hay interfaces predefinidas (en la API) y propias (propias de cada
		 * programador).
		 * 
		 * Una interfaz SOLO contiene meetodos abstractos y constantes. NO se puede
		 * instanciar nada (no se puede usar new NombreInstancia). Todos los meetodos
		 * son public abstract (de hecho son por defecto, si no lo pones se asume) y
		 * solo se difinen, que es lo mismo que: no se implementan. Sii pueden tener
		 * constantes pero no pueden tener variables.
		 * 
		 * Intenta de alguna manera ser una herramienta para subsanar las limitaciones
		 * que se derivan de la herencia simple. Un ejemplo de esto es el hecho de que
		 * no hay liimite de interfaces.
		 * 
		 * Class nombreClase (extends Superclase) implements Interfaz
		 * 
		 * Si bien es cierto que las interfaces no se pueden instanciar, SII ACEPTAN EL
		 * PRINCIPIO DE SUSTITUCIOON. Luego Coche c = new Coche(); (clase coche) bien;
		 * Comparable ejemplo = new Comparable(); (instancia comparable) no se puede.
		 * Comparable ejemplo = new Empleado (...); PRINCIPIO DE SUSTITUCIOON: sii
		 * puedo. La interfaz actuua como una superclase en este caso.
		 * 
		 * A la hora de programar una interfaz, lo importante es pensar quee es aquello
		 * que hace especial a una clase que la diferencia de las otras y que SIEMPRE
		 * (yo decido) va a tener que hacer. De esta manera lo que consigo es una guiia
		 * a la hora de programar que hace que si se me olvida programar alguna funcioon
		 * en la clase en la que estoy trabajando Java me lo recuerde dando un error ya
		 * que no estoy cumpliendo el: todos los meetodos de la interfaz se tienen que
		 * sobreescribir en la clase.
		 * 
		 * E.g.: todos los jefes tienen que tomar decisiones y tengo 3 tipos de jefes
		 * (por lo tanto tres clases distintas de jefes). Si hago una interfaz que
		 * fuerce la creacioon de un meetodo tomarDecisiones y todas las clases de tipo
		 * jefe implementan esa interfaz no se me va a olvidar programar ese meetodo ya
		 * que el propio compilardor me daraa un error.
		 * 
		 * Para crear una interfaz hago click en nuevo y en vez de pinchar en class
		 * pincho en Interface: public interface nombreInterfaz{...}
		 * 
		 * Las interfaces pueden heredar, con la condicioon de que la clase que las
		 * implemente cumpla con que todos los meetodos acumulados sean definidos. Esto
		 * sirve para ahorrar implementar 8 en vez de 1 oo para que una caracteriistica
		 * que queramos tener en varias y se puedan asociar sea maas eficiente.
		 */

		/*
		 * CLASES INTERNAS O INNER CLASS
		 * 
		 * Una clase interna es (sorpresa) una clase dentro de otra. Algo como los
		 * bucles o ifs anidados.
		 * 
		 * Sintaxis: public class Clase 1{class Clase2{coodigo Clase2}coodigo Clase1}
		 * 
		 * Esto sirve para: - Acceder a campos privados de una clase desde otra. -
		 * -Ocultar una clase a otras del mismo paquete. - Crear clases anoonimas (muy
		 * uutiles en eventos y retrollamadas). - Cuando solo una clase debe poder
		 * acceder a los campos de clase (variables) de otra.
		 * 
		 * CLASES INTERNAS LOCALES: una clase dentro de un meetodo. Esto puede resultar
		 * uutil cuando solo se va a utilizar o INSTANCIAR UNA UUNICA VEZ y sirve para
		 * simplificar maas el coodigo: no hay que crear una clase entera con getter y
		 * setter para un uunico uso. El aambito queda restringido a ese meetodo: estaan
		 * maas encapsuladas (siempre es buena la encapsulacioon) y asii nadie que no
		 * deba tocarlas puede hacerlo, o lo que es lo mismo, maas seguridad/estabilidad
		 * y simplificacioon en el coodigo.
		 * 
		 * Cuando una clase interna es local no lleva ninguun modificador de acceso.
		 * Puede acceder a los campos de la clase externa.
		 */
	}
}