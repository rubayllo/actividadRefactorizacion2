package rename;

/*
 * Primero selecciono el nombre de la variable "z" y haciendo click con el botón derecho del ratón
 * elijo "Refactor" -> "Rename" donde le indico el nombre "area" y pulso "enter" para refactorizar
 * 
 * Segundo selecciono el nombre de la variable "x" y haciendo click con el botón derecho del ratón
 * elijo "Refactor" -> "Rename" donde le indico el nombre "base" y pulso "enter" para refactorizar
 * 
 * Tercero selecciono el nombre de la variable "y" y haciendo click con el botón derecho del ratón
 * elijo "Refactor" -> "Rename" donde le indico el nombre "altura" y pulso "enter" para refactorizar 
 * 
 * Después ejecuto el test para comprobar que todo se ha realizado correctamente.
 */

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RenameTest {
   
	@Test
	public void test1() {
		ClienteRefactor calcula = new ClienteRefactor();
		double expected = 10;
		double actual = calcula.areaFinal(5d,2d);
    		
		assertEquals("Área del rectángulo de 5x2: ", actual, expected, 0.01f);
	}
  
	@Test
	public void test2() {
		ClienteRefactor calcula = new ClienteRefactor();
		double expected = 6;
		double actual = calcula.areaFinal(2d,3d);
    		
		assertEquals("Área del rectángulo de 2x3: ", actual, expected, 0.01f);
	}
}