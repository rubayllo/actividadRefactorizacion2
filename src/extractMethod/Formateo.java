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
public class Formateo {

	public String calculaTexto(String texto) {
		String res = "";

		// Primero se eliminan todos los espacios y se ponen en mayúsculas
		String txt1 = "";
		txt1 = texto.replace(" ", "");
		res = txt1.toUpperCase();

		// Después se eliminan las vocales
		String txt2 = "";
		for (int i = 0; i < res.length(); i++) {
			if (!"AEIOU".contains(String.valueOf(res.charAt(i)))) {
				txt2 += res.charAt(i);
			}
		}
		res = txt2;

		// Finalmente se eliminan todos los caracteres no alfabéticos
		String txt3 = "";
		for (int i = 0; i < res.length(); i++) {
			if (Character.isAlphabetic(res.charAt(i))) {
				txt3 += res.charAt(i);
			}
		}
		res = txt3;

		return res;
	}
}