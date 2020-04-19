package primerosPasos;

public class Operadores {
	
	/*
	 * OPERADORES
	 * 
	 * Aritmeeticos
	 * suma: +
	 * resta: -
	 * multiplicacioon: *
	 * divisioon: / ----------->	Para que te de resultados decimales tienes que operar con al menos una de las variables o nuumeros en
	 * 								formato decimal. Si metes ambos int te daraa resultado numero.0: no te saca el decimal.
	 * 
	 * Loogicos, Relacionales y Booleanos
	 * 
	 * mayor que: >
	 * menor que: <
	 * mayor o menor que:<>
	 * distinto: !=
	 * igual que: ==
	 * y loogico: &&
	 * o loogico: ||
	 * 
	 * Incremento y decremento
	 * 
	 * incremento: ++ (incrementa en 1 al valor al que se le aplica)
	 * decremento: --
	 * incremento alternativo: += nº
	 * decremento alternativo: -=
	 * 
	 * Concatenaciones
	 * 
	 * + (une o concatena, se diferencia de la suma por contexto y sintaaxis)
	 * 
	 */
	
	public static void main(String[] args){
		
		int a = 5;
		int b;
		
		b =7;
		
		int c = b + a;	//Suma
		int d = c - a;
		int e = d * c;
		// int a,b,c,d,e; es lo mesmo, todos int
		double f = 9.0/8.0;	//utilizo double porque puede saltar resultado decimal
		
		
		System.out.println("c= " + c);
		
		c++;	//incrementa 1 el valor de c
		System.out.println("c= " + c);
		
		c+=6;	//incrementa el nuumero n (en este caso) el valor de c
		System.out.println("c'= " + c);
		
		c-=5;	//decremento
		System.out.println("c''= " + c);
		
		System.out.println("d= " + d);
		System.out.println("e= " + e);
		System.out.println("f= " + f);
		
		
		// CONCATENADOR +
		
		final double pasoPulgada = 2.54;
		double cm;
		cm = 7;
		
		double resultado = cm / pasoPulgada;
		
		
		System.out.println("En " + cm + " cm hay " + resultado + " pulgadas");
		
	}

}
