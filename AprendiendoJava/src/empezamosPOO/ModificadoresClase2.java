package empezamosPOO;

import teoriaModificadores.ModificadoresClase3;

public class ModificadoresClase2 {

	public static void main(String[] args) {

		ModificadoresClase1 miObjeto = new ModificadoresClase1();
		ModificadoresClase3 miObjeto2 = new ModificadoresClase3(); // tengo que importar.
//		miObjeto2.miVariable1 no puedo acceder a esto porque es private (solo en la propia clase)
//		miObjeto2.miVariable2 si puedo acceder a esto porque es puublico (en todos lados)
//		miOvjeto2.miVariable3 si puedo accedera a esto porque es protected (sii en subclase aunque sea paquete diferente)
//		miObjeto2.miVariable4 no puedo acceder a esto porque es por defecto (no en subclase si es en paquete diferente)

	}
}
