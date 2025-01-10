package unidad3;

public class calculadora {

	/**
	 * Funcion que suma dos numeros la funcion es estatica para poder llamar a la
	 * función Sin tener que rear una clase
	 * 
	 * @param a
	 * @param b
	 * @return devuelve la suma de a y b
	 */
	public static int suma(int a, int b) {
		int resultado = a + b;
		return resultado;
	}

	/**
	 * La funcion recibe un string de numeros y suma todas sus cifras
	 * 
	 * @param numeros
	 * @return Devuelve la suma de las cigras del string o 0 si hay elementos no
	 *         numericos
	 */
	public static int suma(String numeros) {
		// Variable que va a almacenar la suma de todos los numeros
		int sumatorio = 0;

		// Vamos recorriendo todas las posiciones de la cadena
		for (int i = 0; i < numeros.length(); i++) {
			// Guardamos el caracter de la posion i actual
			// el 0 vale 48 al restarlo nos da el valor numero real del caracter
			char numero = numeros.charAt(i);

			int num = Character.valueOf(numero) - 48;

			// Si es un numeor valido lo sumamos
			if (num < 0 || num > 9)
				return 0;
			else
				sumatorio += num;
		}

		return sumatorio;
	}
}
