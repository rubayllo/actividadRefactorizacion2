package pushDown;

/*
 * -> Refactor/Push down
 * Pasa el seguro y la matricula al Coche y a la Moto
 * Pasa el método arrancar al Coche y a la Moto
 * 
 */
public class Vehiculo {
	protected String name;
	protected String plate;
	protected Seguro insurance;

	public String arrancar() {
		return "Brummm, brummm";
	}
}