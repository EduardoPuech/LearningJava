package empezamosPOO;

public class POOBasics { // https://www.youtube.com/watch?v=XmUz5WJmJVU&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=27

	/*
	 * Los lenguajes de programacioon orientada a objetos (POO) son una segunda
	 * "gama" de lenguajes de programacioon que mepezoo a aparecer en la decada de
	 * los sesenta con la intencioon de sustituir a los ya anticuados lenguajes de
	 * programacioon orientada a procedimientos (POP), por entonces casi obsoletos.
	 * Actualemente casi todo lo que se hace es POO y desde luego si se empieza de
	 * cero la mejor idea es usar POO.
	 * 
	 * POP teniia tres problema: el primero es que cuando el coodigo era muy
	 * complejo acababa siendo demasiado largo y en caso de que hubiese un fallo era
	 * muy difiicil encontrarlo. El segundo es que si un programador distinto del
	 * original teniia que corregir, alterar o incluso simplemente annadir coodigo
	 * era una homeerico. El tercero es que si se queriia reutilizar el coodigo de
	 * un programa anterior era casi imposible. (Fortraan, Cobol, Basic...)
	 * 
	 * Desventajas en lista:
	 */
//	  Unidades de coodigo muy largas
//	  Coodigo difiicil de descifrar
//	  Poco reutilizable
//	  En caso de un fallo, gran posibilidad de que todo se fuese a la mierda
//	  Coodigo espagueti frecuente
//	  Difiicil de depurar

	/*
	 * Ante esta situacioon se decidioo desarrollar un nuevo paradigma de
	 * programacioon, la POO.
	 * 
	 * En un intento de simplificar todo lo maaximo posible se intentoo dar al
	 * coodigo el mismo comportamiento que los objetos de la vida real, de ahii
	 * "objetos". Observar un objeto real (mesa, coche, maaquina...) y darle las
	 * estado (parado, en movimiento...), propiedades (azul, berlina...) y
	 * comportamientos (arrancar, frenar...) de la vida real para que el ser humano
	 * que las programa cuando se efrente a problemas en el coodigo o a la hora de
	 * pensarlo fuese maas sencillo o "intuitivo".
	 * 
	 * Ventajas:
	 */
//	 PROGRAMA dividido en partes, moodulos, clases. Puedo crear el motor, las
//	 rueda... y luego juntar todo eso para crear un coche. 
//	 REUTILIZABLE y herencia. Por lo tanto cuando quiera alterar el coche no
//	 necesito alterar todo o crearlo de nuevo, solo cambiar el "moodulo" que me
//	 interesa cambiar (resumido: utilizar las caracteriisticas de un objeto en
//	 otro).
//	 SI hay alguun fallo no funciona esa parte del coodigo. El resto del programa
//	 sigue tranquilamente. Si te estalla una rueda el motor no de rompe. Conocido
//	 como tratamiento de excepciones.
//	 ENCAPSULAMIENTO. Una cosa que no estee relacionada con otra de aunque
//	 pertenezca a un mismo total no depende de ello: la caja de cambios y el
//	 limpia parabrisas son del coche pero son completamente independientes. No
//	 necesito de uno para el otro, no necesito que uno sepa del otro, si reutilizo
//	 uno no necesito reutilizar el otro.

	/*
	 * Un ejemplo de algo programado con POP o POO: un equipo de muusica: En caso de
	 * utilizar POP hago un boombox, si no funciona la pantalla, el ecualizador, si
	 * quiero moverlo, si quiero utilizar un solo altavoz... no puedo.
	 * 
	 * Si creo un sistema de sonido con reproductor y altavoces externos puedo:
	 * mover los altavoces, si se estropea algo cambiar solo esa pieza...
	 */

	/*
	 * Una CLASE es un modelo donde se redactan las caracteriisticas comunes de un
	 * grupo de objetos
	 * 
	 * Un OBJETO es un ejemplar que pertenece a una clase, las cosas que se
	 * construyen a partir de una clase.
	 * 
	 * Un objeto tiene PROPIEDADES (alto, ancho, color...), tienen un
	 * COMPORTAMIENTO: quee son capaces de hacer (arrancar, frenar, girar...).
	 * 
	 * En un POO podemos crear una clase coche que establece las caractariisticas
	 * comunes de todos los objetos que cumplen unos paraametros baasicos de
	 * similitud (cosas en comuun) y crear objetos a partir de ello cada uno con su
	 * comportamiento y propiedades individuales.
	 * 
	 * Poniendo un ejemplo en pseudocoodigo
	 */
//	Propiedades; 
//	Seat.color = "rojor";
//	Seat.velocidadMaxima = 300;
//	...
//	Comportamiento:
//	Seat.arranca();
//	Seat.acelera();
	/*
	 * Conocido como la NOMENCLATURA DEL PUNTO: para acceder o cambiar a la
	 * informacioon de una clase/objeto tengo que poner:
	 * 
	 * nombre(objeto).propiedad(a amodificar) = valor de la propiedad;
	 * 
	 * Si solo quiero el valor nombre.propiedad;
	 * 
	 * Cuando quiero acceder al comportamiento de un objeto:
	 * 
	 * nombre(objeto).meetodo();
	 * 
	 */

	/*
	 * MODULARIZACIOON
	 * 
	 * Dividir las cosas en muultiples clases para luego formar un total, de manera
	 * que si una falla las demaas sigan funcionand.
	 * 
	 * En un proyecto con varias clases solo una de ellas, la considerada como
	 * principal, tiene el meetodo MAIN. Es donde comienza la ejecucioon del
	 * programa.
	 * 
	 * Esto funciona con el operador NEW que instancia las cosas. Cuando en la clase
	 * principal tengo algo de otra clase, el new hace que el orden de ejecucion
	 * vaya a esa otra clase, al CONSTRUCTOR.
	 * 
	 * El CONSTRUCTOR es la asigacioon de las caracteriisticas prederminadas para
	 * todos los objetos de la clase correspondiente.
	 * 
	 * Una manera alternativa es modular todo en el mismo archivo, lo escribo todo
	 * como si fuesen varias clases pero sin crear distintos archivos. En caso de
	 * hacerse asii, siempre tiene que haber una clase principal de tipo public (que
	 * suele ser la que da nombre al archivo) y el meetodo main estaa dentro de esa
	 * clase.
	 * 
	 * ENCAPSULARIZACIOON
	 * 
	 * Encapsular consiste en asegurarse de que cada meetodo de cada clase se haga
	 * desde su clase correspondiente, esto es, que no pueda modificar de manera
	 * negativa algo de la clase Coche desde la clase UsoCoche: cambiar el nuumero
	 * de ruedas..
	 * 
	 * Para encapsular se añade un modificador de acceso delante del dato deseado
	 * (private, protected, public, ¿?). Al encapsular un dato este pasa a no ser
	 * visible desde otra clase diferente.
	 * 
	 * Importante-> no todos los datos deben ser encapsulados.
	 */

	/*
	 * MEETODOS GETTERS Y SETTERS
	 * 
	 * Son el canal predeterminado para la interactuacioon entre dos clases del
	 * mismo programa (saber informacioon, en una circunstancia adecuada editar las
	 * variables de forma segura...).
	 * 
	 * SETTER (o definidores):
	 * 
	 * Son los encargados de definir (modificar) el valor de una propiedad.
	 * 
	 * Sintaxis: public void nombreMetodo(){coodigo} (recomendable usar set o get en
	 * el nombre del meetodo para seguir un orden)
	 * 
	 * Void significa que el meetodo no devuelve ninguun valor (no lleva return).
	 * 
	 * Por lo tanto: con el constructor inicializo todas las propiedades que van a
	 * ser comunes para todos los objetos iguales y con el setter altero las que son
	 * especiificas de cada uno.
	 * 
	 * 
	 * GETTER (o captadores):
	 * 
	 * Es el encargado de proporcionar el valor de una propiedad.
	 * 
	 * Sintaaxis: public datoADevolver nombreMetodo(){coodigo + return}
	 * 
	 * 
	 * Se puede hacer un uunico meetodo Setter+getter, no recomendado en POO
	 */

	/*
	 * PASO DE PARAAMETROS
	 * 
	 * A la vez que llamas a un meetodo le pasas junto con la llamada un paraametro
	 * o valor para que ese meetodo recoja el valor y opere con él.
	 * 
	 * Esto se consigue en la sintaaxis del meetodo setter: declaras una variable en
	 * los pareentesis
	 * 
	 * THIS
	 * 
	 * El operador this sirve para, dentro de una clase, si hay dos cosas con el
	 * mismo nombre, id est, una variable de la clase y un argumento de un
	 * meetodo(vease un setter) se aannade un this.variableClase para
	 * difierenciarlas.
	 */

	/*
	 * HERENCIA https://www.youtube.com/watch?v=UfF2pqCewqo&list=
	 * PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=34
	 * 
	 * La herencia es una caracteriistica muy potente de la POO mediante la cual
	 * podemos construir una clase que herede de otra, esto es, hay una clase padre
	 * y una hija, y la hija heredea todos los meetodos de la padre. Un ejemplo es
	 * en EmpleadoUnaFuente el uso de GregorianCalendar y Date, que son de Calendar
	 * y esta a su vez de Object, por lo tanto Greg tiene los meetodos de
	 * Greg+Calendar+Object. Calendar tiene un meetodo getTime() que devuelve un
	 * objeto de tipo Date y por eso los puedo juntar.
	 */
}
