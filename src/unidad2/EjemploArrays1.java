package unidad2;

public class EjemploArrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Para definir un array simplemente hay que poner [] déspues
		double listaAltura[] = { 200, 185, 190, 230, 170, 180, 200, 234, 780, 10 };
		String listaNombres[] = { "Pepito", "Juanjo", "Antonio", "Pollito", "Eulalio", "Pepito1", "Juanjo1", "Antonio1",
				"Pollito1", "Eulalio1" };
		// Tenemos depues la cantidad de jugadores
		int cantidadJugadores = 10;

		// Generamos las alturas entre 150 y 230
		for (int i = 0; i < 10; i++) {
			// Vamos rellenado el array con alturas aleatorias
			double altura = 150 + (int) (Math.random() * 80.0);

			// Ponemos la altrua genenrada dentro de la posicion i del array
			listaAltura[i] = altura;

			// Sacamos por pantalla la altura del jugador actual
			System.out.println("Altura del jugador " + i + ":" + altura);
		}

		// Mostramos con to.string todos los elementos de array de alturas que hemos
		// creado
		System.out.println("Lista de alturas:\n" + listaAltura.toString());

		// Para definir el tamaño de un array
		// el tipo de dato y las posiciones que va a tener
		// listaAltura = new double[cantidadJugadores];
		// listaNombres = new String[cantidadJugadores];

		// Para asignar valores a una posicion en particular de un array tilizamos []
		// con el
		// numero de la posicion en la que queremos guardar el dato
		// listaAltura[2] = 205.1;
		// listaNombres[2] = "Juanjo";

		System.out.println("Nombre jugador 2: " + listaNombres[2] + " Altura de jugador 2: " + listaAltura[2]);

		// Forma de limitar la cantidad de decimales a 2 por salida formateada
		System.out.printf("La altura es %.2f", listaAltura[2]);

		// Sacar la media de las alturas de los jugadores
		double mediaAltura = 0;
		int i = 0;
		// Mientras no lleguemos al último elemento seguimos sumando
		// COn length volvemos a ver la cantidad de elementos que hay almacenados en
		// este array
		while (i < listaAltura.length) {
			// Vamos sumando cada altura en la variable que definimos
			mediaAltura = mediaAltura + listaAltura[i];
			// Pasamos al siguiente elemento
			i++;
		}

		System.out.println("La media de las alturas es " + (mediaAltura / listaAltura.length));
	}

}
