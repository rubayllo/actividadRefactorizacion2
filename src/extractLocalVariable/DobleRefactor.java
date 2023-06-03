package extractLocalVariable;

/*
 * -> Refactor/Extract Local Variable
 * Crea una variable local "doble" con el valor de 2
 * Luego ejecuta el Test JUnit para comprobar que es correcto 
 */


/*
 * Selecciono el valor 2 y haciendo click con el botón derecho del ratón
 * elijo "Refactor" -> "Extract Local Variable" donde le indico el nombre "doble"
 * y le doy "OK" para finalizar.
 * 
 * Después ejecuto el test para comprobar que todo se ha realizado correctamente.
 */


public class DobleRefactor {
	public int calculaDoble(int valor) {
		int doble = 2;
		return doble * valor;
	}
}
