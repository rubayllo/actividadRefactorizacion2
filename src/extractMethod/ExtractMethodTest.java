package extractMethod;

/*
 * En la clase FormateoRefactor.
 * 
 * -> Refactor / Extract Method
 * Crea tres métodos con buenos nombres para los tres pasos
 * que se dan a la hora de formatear el texto
 */

/*
 * Para el primer methodo selecciono la parte del código que quiero extraer
 * que en este caso se encuentra entre los comentarios "Primero se eliminan..."
 * y "Despueés se eliminan las vocales". Haciendo click con el botón derecho del 
 * ratón selecciono "Extract Method" y le daré el nombre de método 
 * "eliminarEspaciosPonerMayusculas" y lo hago de uso privado ene este caso.
 * 
 * Para el segundo método realizo la misma secuencia anterior en este caso
 * entre los comentarios "Después se eliminan las vocales" y "Finalmente se eliminan..."
 * El nombre de esta variable va a ser "eliminarVocales" y también de uso privado.
 * 
 * Para el tercer método realizo la misma secuencia anterior en este caso
 * entre los comentarios "Finalmente se eliminan..." y el "Return res"
 * El nombre de esta variable va a ser "eliminarCharsNoAlfabeticos" y también de uso privado.
 * 
 * Acto seguido ejecuto el test
 */

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExtractMethodTest {

	@Test
	public void test1() {
		FormateoRefactor calcula = new FormateoRefactor();
		String expected = "HLMGS";
		String actual = calcula.calculaTexto("---Hola amigos. ");

		assertEquals("---Hola amigos. :", actual, expected);
	}

	@Test
	public void test2() {
		FormateoRefactor calcula = new FormateoRefactor();
		String expected = "SLBNSLML";
		String actual = calcula.calculaTexto("¿Sale bien, sale mal? ");

		assertEquals("¿Sale bien, sale mal? :", actual, expected);
	}
}