package pushDown;

/*
 * En la clase Vehiculo selecciono su nombre y hago click con el boton derecho del ratón,
 * donde selecciono "Refactor" -> "Push Down...", una vez allí selecciono los atributos 
 * "plate", "insurance" y el método "Arrancar" Y pulso "Next", quito la selección de la clase "Bicicleta" y
 * dejo seleccionadas las clase "Moto" y "Coche" y le doy a OK.
 * 
 * Después realizo el test para comprobar que los resultados son correctos.
 */


public class Coche extends Vehiculo {
	private String maletero;
	private boolean abiertoMaletero;
	protected String plate;
	protected Seguro insurance;
	

	public boolean estaAbiertoMaletero() {
		return abiertoMaletero;
	}


	public String arrancar() {
		return "Brummm, brummm";
	}
}