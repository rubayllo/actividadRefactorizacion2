package rename;
/*
 * -> Refactor/Rename
 * Cambia el nombre de las variables x, y, z para que indiquen
 * el area, la base y la altura del rectángulo
 * Luego ejecuta el Test JUnit para comprobar que es correcto 
 */

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

public class ClienteRefactor {
	public double areaFinal(double base, double altura) {
		double area = base * altura;
		return area;
	}
}