package pushDown;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PushDownTest {

/*
 * En la clase Vehiculo selecciono su nombre y hago click con el boton derecho del ratón,
 * donde selecciono "Refactor" -> "Push Down...", una vez allí selecciono los atributos 
 * "plate", "insurance" y el método "Arrancar" Y pulso "Next", quito la selección de la clase "Bicicleta" y
 * dejo seleccionadas las clase "Moto" y "Coche" y le doy a OK.
 * 
 * Después realizo el test para comprobar que los resultados son correctos.
 */


	@Test
	public void test1() {
		Vehiculo calcula = new Coche();
		String expected = "Brummm, brummm";
		String actual = ((Coche) calcula).arrancar();

		assertEquals("Arrancar el coche :", actual, expected);
	}

	@Test
	public void test2() {
		Vehiculo calcula = new Moto();
		String expected = "Brummm, brummm";
		String actual = ((Moto) calcula).arrancar();

		assertEquals("Arrancar la moto :", actual, expected);
	}
}