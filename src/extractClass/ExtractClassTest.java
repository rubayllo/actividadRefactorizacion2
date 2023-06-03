package extractClass;

/*
 * -> Refactor/Extract Class
 * Crea la clase TarjetaCredito con todos los métodos y atributos
 * propios de las tarjetas de crédito
 * Luego ejecuta el Test JUnit para comprobar que es correcto
 */

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/*
 * En la clase ClienteRedactor
 * 
 * Selecciono el nombre de la clase "ClienteRefactor" y con el botón derecho
 * del ratón selecciono "Refactor" -> "Extract Class" allí elijo los atributos 
 * que utilizaré en la nueva clase y a la clase nueva le doy el nombre
 * "TarjetaCredito", creando getters y setters. Acepto y realizo el test.
 */

public class ExtractClassTest {

	@Test
	public void test1() {
		ClienteRefactor calcula = new ClienteRefactor("Marcos", "1234567890");
		boolean actual = calcula.esValidoDni();

		assertTrue("Pedro con dni 1234567890 : ", actual);
	}

	@Test
	public void test2() {
		ClienteRefactor calcula = new ClienteRefactor("Daniela", "invalido");
		boolean actual = calcula.esValidoDni();

		assertFalse("Daniela con dni invalido : ", actual);
	}
}