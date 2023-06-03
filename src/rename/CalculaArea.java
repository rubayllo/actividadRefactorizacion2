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

public class CalculaArea {
	public double areaFinal(double x, double y) {
		double w = x * y;
		return w;
	}
}