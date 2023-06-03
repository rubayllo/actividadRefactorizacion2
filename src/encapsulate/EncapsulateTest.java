package encapsulate;

/*
 * En la clase AlumnoRefactor
 * 
 * Por un lado selecciono el nombre del atributo "nombre" haciendo doble click
 * y una vez seleccionado hago click con el botón derecho del ratón donde elijo
 * "Refactor" -> "Encapsulate Field", quedarán seleccionados sus getters y setters
 * para que pueda ser obtenido o modificado desde un método y acepto.
 * 
 * Realizo la misma secuencia para el atributo nota.
 * 
 * Para el métod mayorIgual5 lo selecciono haciendo doble click sobre su nombre y
 * una vez seleccionado  hago click con el botón derecho del ratón donde elijo
 * "Refactor" -> "Change Method Signature" y en el apartado "Access Modifier" selecciono
 * privado "Private" y acepto.
 * 
 * Una vez realizado estos pasos pruebo que todo esté correcto ejecutando el test JUnit
 */

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class EncapsulateTest {

	@Test
	public void test1() {
		AlumnoRefactor calcula = new AlumnoRefactor("Pedro", 5);
		boolean actual = calcula.estaAprobado();

		assertTrue("Pedro con nota 5 : ", actual);
	}

	@Test
	public void test2() {
		AlumnoRefactor calcula = new AlumnoRefactor("Jaime", 3);
		boolean actual = calcula.estaAprobado();

		assertFalse("Jaime con nota 3 : ", actual);
	}
}