package pushDown;

/*
 * -> Refactor/Push down
 * Pasa el seguro y la matricula al Coche y a la Moto
 * Pasa el método arrancar al Coche y a la Moto
 * 
 */

/*
 * En la clase Vehiculo selecciono su nombre y hago click con el boton derecho del ratón,
 * donde selecciono "Refactor" -> "Push Down...", una vez allí selecciono los atributos 
 * "plate", "insurance" y el método "Arrancar" Y pulso "Next", quito la selección de la clase "Bicicleta" y
 * dejo seleccionadas las clase "Moto" y "Coche" y le doy a OK.
 * 
 * Después realizo el test para comprobar que los resultados son correctos.
 */

public class Vehiculo {
	protected String name;
}