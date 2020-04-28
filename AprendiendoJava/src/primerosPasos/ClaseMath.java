package primerosPasos;

public class ClaseMath {
	
	public static void main(String[] args) {
		
		int a;
		float d;
		double e,f, g, h;
		
	 // Math.sqrt(n) Clase.metodo(variable o constante necesaria)
		
		a = 7;
		
		double raiz = Math.sqrt(a);
		
		System.out.println(raiz);
	
	
	 // Math.round(n) redondear
		
		d = 7.21F;
		e = 7.21;
		f = 7.21;
		
		int redondeo = Math.round(d); 		//le doy un float y me devuelve un int
		double redondeo2 = Math.round(e);	//le doy un double y me devuelve un long
		
		//para simplificar puedo hacer refundicioon
		
		int redondeo3 = (int)Math.round(f); //este meetodo me pide un double y me devuelve un long y yo quiero un entero.
											//convierto ese long en un int.
		
		System.out.println(redondeo);
		System.out.println(redondeo2);
		System.out.println(redondeo3);
	
		
	 // Math.pow(base double, exponente double) y da resultado double (potencias)
		
		g = 3.1; h = 5;
		
		double potencia = Math.pow(g, h); // me acepta como parametros int...
		
		System.out.println(potencia);
		
		//puedo hacer refundicion,
		
		g = 3.1; h = 5;
		
		int potencia2 = (int)Math.pow(g,h);
		
		System.out.println(g + " elevado a " + h + " es igual a " + potencia2 + " si me quedo solo con la parte entera");
		
	
	/*
	 * Math.sin(aangulo), Math.cos, Math.tan (trigonometria)
	 *
	 * Math.round(decimal) redondea
	 *
	 * Math.PI  (constante pi)
	 */
	
	}

}
