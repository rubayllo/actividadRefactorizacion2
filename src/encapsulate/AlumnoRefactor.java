package encapsulate;

/*
 *->  Refactor / Encapsulate Field
 * Los atributos nombre y nota deben ser privados
 * El método mayorIgual5 debe ser privado
 * Luego ejecuta el Test JUnit para comprobar que es correcto 
 */
public class AlumnoRefactor {
	String nombre;
	int nota;

	public AlumnoRefactor(String nombre, int nota) {
		this.nombre = nombre;
		this.nota = nota;
	}

	public boolean estaAprobado() {
		return mayorIgual5();
	}

	public boolean mayorIgual5() {
		return nota >= 5;
	}
}
