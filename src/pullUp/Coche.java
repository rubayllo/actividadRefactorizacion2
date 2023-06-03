package pullUp;

/*
 * -> Refactor/Pull up
 * Sube al vehículo el atributo matrícula y el método arrancar
 * Luego ejecuta el Test JUnit para comprobar que es correcto 
 */

/*
 * Primero: Selecciono el nombre de la subclase "Coche" y con el botón derecho elijo
 * "Refactor" -> "Pull up", una vez allí selecciono el atributo "matrícula" y
 * el método "arrancar" y le doy  finalizar
 * 
 * Segundo: Selecciono el nombre de la subclase "Moto" y con el botón derecho elijo
 * "Refactor" -> "Pull up", una vez allí selecciono el atributo "matrícula" y
 * el método "arrancar" y le doy  finalizar. En este segundo caso como ya
 * se han creado el atributo y el método anteriormente al
 * hacer la migración desde la clase Coche eclipse nos dirá que va a ver un error
 * porque se van a crear atributos y métodos duplicados en la clase Vehículo. En vez de finalizar
 * pulsaremos sobre next y quitaremos la selección de la clase Vehículo para que no se
 * dupliquen y ahora si damos a finalizar.
 * 
 * Finalmente realizo el test para comprobar que todo es correcto
 */

public class Coche extends Vehiculo {
	private String maletero;
	private boolean abiertoMaletero;

	public boolean isTrunkOpen() {
		return abiertoMaletero;
	}
}