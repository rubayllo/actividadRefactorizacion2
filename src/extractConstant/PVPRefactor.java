package extractConstant;

/*
 * -> Refactor/Extract Constant
 * Crea un atributo privado y constante IVA para sustituir el valor 21
 * Luego ejecuta el Test JUnit para comprobar que es correcto 
 */

/*
 * Selecciono el valo 21 y haciendo click con el botón derecho del ratón
 * elijo "Refactor" -> "Extract Constant" donde le indico el nombre "iva"
 * y le doy "OK" para finalizar.
 * 
 * Después ejecuto el test para comprobar que todo se ha realizado correctamente.
 */

public class PVPRefactor {
	private static final int iva = 21;

	public double calculaPVP(double precio) {
		double impuestos = (precio * iva) / 100;
		return precio + impuestos;
	}
}
