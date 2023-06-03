package extractLocalVariable;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
 * En la clase DobleRefactor
 * 
 * Selecciono el valor 2 y haciendo click con el botón derecho del ratón
 * elijo "Refactor" -> "Extract Local Variable" donde le indico el nombre "doble"
 * y le doy "OK" para finalizar.
 * 
 * Después ejecuto el test para comprobar que todo se ha realizado correctamente.
 */

public class ExtractLocalVariableTest {

	@Test
	public void test1() {
		DobleRefactor calcula = new DobleRefactor();
		double expected = 50;
		double actual = calcula.calculaDoble(25);

		assertEquals("El doble de 50: ", actual, expected, 0.01f);
	}

	@Test
	public void test2() {
		DobleRefactor calcula = new DobleRefactor();
		double expected = 66;
		double actual = calcula.calculaDoble(33);

		assertEquals("El doble de 33: ", actual, expected, 0.01f);
	}
}