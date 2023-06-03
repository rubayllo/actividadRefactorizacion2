package convertLocalField;

/*
 * -> Refactor / Convert Local Variable to Field...
 * Seleccionad la variable local kilometros y convertirla en Atributo
 * Elegid la opción de inicializarla en el constructor
 */

/*
 * Para convertir la variable kilometros en un atributo he procedido
 * a seleccionar el nombre de la variable haciendo doble clik sobre el
 * nombre y después con el botón derecho del ratón se abre el menú
 * donde selecciono "Refactor" -> "Convert Local Variable to Field"
 * para terminar la voy a hacer de tipo privado "Private" y la inicializo
 * como "Currente Method"
 */

public class Coche {

	private int kilometros;

	public void conducir (int distancia) {
		kilometros = 0;
		kilometros += distancia;
	}
	
}
