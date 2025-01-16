package unidad3;

import java.util.Arrays;

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
	 * Recibe un array y devuelve la suma
	 * 
	 * @param listaNumeros lista de numeros en double
	 * @return
	 */
	public static double suma(double listaNumeros[]) {
		double sumatorio = 0;
		// Recorremos todos los numeros del array los vamos sumando
		for (int i = 0; i < listaNumeros.length; i++) {
			// Vamos usmando los numeros de la variable
			sumatorio = sumatorio + listaNumeros[i];
		}

		return sumatorio;
	}

	/**
	 * Recibe un array y devuelve la suma resolviendolo de forma recursiva
	 * 
	 * @param listaNumeros lista de numeros en double
	 * @return
	 */
	public static double sumaRecursiva(double listaNumeros[]) {

		// Si solo hay un numero lo devolvemos
		if (listaNumeros.length == 1)
			return listaNumeros[0];
		else {
			// Si hay mas de un numero devolvemos la suam del primer numero
			// Mas la sumaRecursiva del array a partir de este numero
			double primero = listaNumeros[0];
			// Primero partimos el array
			listaNumeros = Arrays.copyOfRange(listaNumeros, 1, listaNumeros.length);

			// System.out.println("Array cortado " + Arrays.toString(listaNumeros));

			return primero + sumaRecursiva(listaNumeros);
		}

	}

	/**
	 * El factorial de un numero consiste en multiplicar todos los numeros Entre 1 y
	 * dicho numero. Por ejemplo el factorial de 5 seria: 5!=1*2*3*4*5
	 * 
	 * @param num
	 * @return el factorial
	 */
	public static double factorial(int num) {
		double factorial = 1;

		for (int i = 1; i <= num; i++) {
			factorial = factorial * i;
		}

		return factorial;
	}

	/**
	 * El factorial de un numero consiste en multiplicar todos los numeros Entre 1 y
	 * dicho numero. Por ejemplo el factorial de 5 seria: 5!=1*2*3*4*5
	 * 
	 * Para resolver el factorial de los 5 primeros numeros se podira poner asi
	 * 5!=4!*5 4!=3!*4 3!=2!*3 2!=1!*2 1!=1 este ultimo ya no requiere utilizar una
	 * version reducida del problema Es el caso base
	 * 
	 * 
	 * @param num
	 * @return el factorial
	 */
	public static double factorialRecursivo(int num) {
		// Caso base
		if (num == 1)
			return 1;
		else
			// Si no es caso base se llama a la funcion con un caso mas pequeño
			return num * factorialRecursivo(num - 1);

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