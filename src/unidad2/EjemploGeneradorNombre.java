package unidad2;

public class EjemploGeneradorNombre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crear un programa que escriba por pantalla un nombre creado aleatoriamente
		// debe cumplir, un tamaño aleatorio entre 6 y 12 letras
		// las letras deven de estar en mayusculas
		// para generar cada letra generamos un numero y con su código ascii lo pasamos
		// a letra
		// Investirgar funciones ord chr o algo asi que pasa de ascii a char
		// No pueden ir mas de dos volcales juntas ni mas dos consonantes

		// Generamos el tamaño de la palabra es un numero entre 6 y 12
		// si le damos de base 6, cómo mínimo tendrá ese valor
		// Luego generamos un número aleatorio entre 0 y 6
		int tamPalabra = 6 + (int) (Math.random() * 7);
		String nombre = "";
		int numVocales = 0, numConsonantes = 0;

		int i = 0;
		while (i < tamPalabra) {
			// Generamos una lentre entre 97 y 122
			char letra = (char) (97 + (int) (Math.random() * 26));

			// Comprobamos si es una vocal y lo contabilizamos
			if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
				numVocales++;
				numConsonantes = 0;
			} else {
				numConsonantes++;
				numVocales = 0;
			}
			// Añadimos la letra a la palabra si y solo si no es una tercera vocal o tercera
			// consonante
			if (numVocales < 3 && numConsonantes < 3)
				// Vamos añadiendo las letras al nombre
				nombre += letra;
			// Pasamos al siguiente elemento
			i++;

		}
		System.out.println("El nombre agraciado es: " + nombre);

		// PARTE 2 SACAR EL NÚMERO DE VOCALES DE LA PALABRA GENERADA
		// Para acceder a una letra de un string se utiliza charAt(pos)
		// Por ejemplo la tercera posicion del nombre seria nombre.charAt(2)
		// La longitud de un string es con el metodo .length()

		// Leer un numero por teclado y decir si es primom o no, un numero es primo si
		// solo le divide el uno o el mismo

	}

}
