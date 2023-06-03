package extractConstant;

/*
 * En la clase PVPRefactor
 * 
 * Selecciono el valo 21 y haciendo click con el botón derecho del ratón
 * elijo "Refactor" -> "Extract Constant" donde le indico el nombre "iva"
 * y le doy "OK" para finalizar.
 * 
 * Después ejecuto el test para comprobar que todo se ha realizado correctamente.
 */

public class PVP {
	public double calculaPVP(double precio) {
		double impuestos = (precio * 21) / 100;
		return precio + impuestos;
	}
}
