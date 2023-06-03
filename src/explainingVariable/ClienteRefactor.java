package explainingVariable;

/*
 * Primer selecciono el código "(edad >= 18 && edad <= 65)" y luego 
 * con el botón derecho "Refactor" -> "Extract Local Variable"
 * el nombre que le doy es "esEdadLaboral".
 * 
 * Segundo selecciono el código "(salario - (salario * 0.5f)) < 1200f" y luego 
 * con el botón derecho "Refactor" -> "Extract Local Variable"
 * el nombre que le doy es "esSalarioBajo".
 *
 * Tercero selecciono el código "cantidadTotal * 0.5 < 500" y luego 
 * con el botón derecho "Refactor" -> "Extract Local Variable"
 * el nombre que le doy es "esPocaCantidad".
 * 
 * Y ejecuto el test para comprobar que todo ha ido bien
 */

class ClienteRefactor {
	private int edad;
	private float salario;

	public ClienteRefactor(int edad, float salario) {
		this.edad = edad;
		this.salario = salario;
	}

	public float calculaDescuento(float cantidadTotal) {
		boolean esEdadLaboral = edad >= 18 && edad <= 65;
		boolean esSalarioBajo = (salario - (salario * 0.5f)) < 1200f;
		boolean esPocaCantidad = cantidadTotal * 0.5 < 500;
		if (esEdadLaboral && esSalarioBajo && esPocaCantidad) {
			return cantidadTotal * 0.9f;
		} else {
			return cantidadTotal;
		}
	}

}
