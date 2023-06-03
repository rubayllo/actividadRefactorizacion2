package encapsulate;

/*
 *->  Refactor / Encapsulate Field
 * Los atributos nombre y nota deben ser privados
 * El método mayorIgual5 debe ser privado
 * Luego ejecuta el Test JUnit para comprobar que es correcto 
 */


/*
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

public class AlumnoRefactor {
	private String nombre;
	private int nota;

	public AlumnoRefactor(String nombre, int nota) {
		this.setNombre(nombre);
		this.setNota(nota);
	}

	public boolean estaAprobado() {
		return mayorIgual5();
	}

	private boolean mayorIgual5() {
		return getNota() >= 5;
	}

	String getNombre() {
		return nombre;
	}

	void setNombre(String nombre) {
		this.nombre = nombre;
	}

	int getNota() {
		return nota;
	}

	void setNota(int nota) {
		this.nota = nota;
	}
}
