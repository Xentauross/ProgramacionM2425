package unidad2;

import java.util.Scanner;

public class examenVPA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creamos las variables
		String nombre = "";
		double precio = 0;
		String categoria = "";
		int stock = 0;
		String plataforma = "";
		int puntuacion = 0;
		int cantidadLeer = 0;

		// Variables del tratamiento
		double mediaPrecio = 0;
		double maxPrecio = Integer.MIN_VALUE;
		double minPrecio = Integer.MAX_VALUE;
		String juegoMax = "";
		String juegoMin = "";
		int sumaStock = 0;
		String[] listaJuegosSwitch;
		String[] listaJuegosStock;

		// Creamos el Scanner
		Scanner teclado = new Scanner(System.in);

		System.out.print("Ingrese la cantidad de videojuegos: ");
		cantidadLeer = teclado.nextInt();
		teclado.nextLine(); // Consumir el salto de línea

		// Inicializamos los arrays
		// El tamaño de elementos del array como máximo sera el número de juegos
		// Ya que pueden cumplir todas la condicion
		listaJuegosSwitch = new String[cantidadLeer];
		listaJuegosStock = new String[cantidadLeer];

		/******************************************************
		 * INTRODUCCION DE DATOS *
		 ******************************************************/

		for (int i = 0; i < cantidadLeer; i++) {
			System.out.println("Videojuego " + (i + 1) + ":");

			// Leer los datos de cada videojuego
			System.out.print("Introduce el nombre: ");
			nombre = teclado.next();

			System.out.print("Intoruce el precio: ");
			precio = teclado.nextDouble();
			teclado.nextLine(); // Consumir el salto de línea

			// Validacion de la categoria
			// Mientras no sea ninguna de las 4 categoria validas
			// le hacemos repertir indefinidamente que ponga la categoria
			do {
				System.out.println("Introduce la categoria del juego (Aventura, Plataformas, Terror o Shooter)");
				categoria = teclado.next();
			} while (!categoria.equalsIgnoreCase("Aventura") && !categoria.equalsIgnoreCase("Plataformas")
					&& !categoria.equalsIgnoreCase("Terror") && !categoria.equalsIgnoreCase("Shooter"));

			System.out.println("Introduce el stock del videojuego");
			stock = teclado.nextInt();
			teclado.nextLine(); // Consumir el salto de línea

			// Validacion de la plataforma
			// Mientras no sea ninguna de las 4 plataforma validas
			// le hacemos repertir indefinidamente que ponga la plataforma
			do {
				System.out.println("Introduce la plataforma del juego (switch, xbox, playstation, pc)");
				plataforma = teclado.next();
			} while (!plataforma.equalsIgnoreCase("switch") && !plataforma.equalsIgnoreCase("xbox")
					&& !plataforma.equalsIgnoreCase("playstation") && !plataforma.equalsIgnoreCase("pc"));

			// Validamos la puntuación que esté entre 1 y 10
			do {
				System.out.println("Introduce la puntuación del juego (Entre 1 y 10)");
				puntuacion = teclado.nextInt();
			} while (puntuacion < 1 || puntuacion > 10);

			/****************************************************************************
			 * TRATAMIENTO DE DATOS *
			 ****************************************************************************/

			//

			// Para calcular la media vamos sumando todo los precios de los juegos
			mediaPrecio = mediaPrecio + precio;

			// Para calcular el precio maximo vamos comparando todos los precios
			// de los juegos y si es mayor que nuestro máximo
			// pasará a ser el nuevo máximo
			if (precio > maxPrecio) {
				maxPrecio = precio;
				juegoMax = nombre;
			}

			// Para el minimo es lo mismo
			if (precio < minPrecio) {
				minPrecio = precio;
				juegoMin = nombre;
			}

			// Mostrar el nombre de los juegos de switch que sean de categoría aventura
			// o aquellos cuya puntuación sea superior a 9 y cuesten mas de 39 euros
			if (plataforma.equalsIgnoreCase("switch") && (categoria.equalsIgnoreCase("Aventura") || puntuacion > 9)
					&& precio > 39) {
				listaJuegosSwitch[i] = nombre;
			}

			// Mostrará el Stock total de juegos de playstation
			if (plataforma.equalsIgnoreCase("playstation"))
				sumaStock += stock;

			// Cuando el nombre un producto empieze por z y tenga stock inferior a 10 y
			// puntuación
			// superior a 6, guardará su nombre en un array y mostrará al final la lista de
			// productos.
			if ((Character.toUpperCase(nombre.charAt(0)) == 'Z') && stock < 10 && puntuacion > 6) {
				listaJuegosStock[i] = nombre;
			}
		}
		// Una vez hemos acabado el bucle tenemos todos los precios sumados
		// los dividimos entre la cantida de juegos para sacar la media
		mediaPrecio = mediaPrecio / cantidadLeer;

		// Aqui sacamos por pantalla todos los resultados
		System.out.println("El precio maximo es " + maxPrecio);
		System.out.println("El juego de precio maximo es " + juegoMax);
		System.out.println("El precio minimo es " + minPrecio);
		System.out.println("El juego de precio minimo es " + juegoMin);
		System.out.println("El media de precios " + mediaPrecio);

		System.out.println("LISTA DE JUEGOS SWITCH CONDICION 3");
		for (int i = 0; i < listaJuegosSwitch.length; i++) {
			if (listaJuegosSwitch[i] != null)
				System.out.println(listaJuegosSwitch[i]);
		}

		System.out.println("La suma  de stock de playstation es " + sumaStock);

		System.out.println("LISTA DE JUEGOS STOCK CONDICION 5");
		for (int i = 0; i < listaJuegosStock.length; i++) {
			if (listaJuegosStock[i] != null)
				System.out.println(listaJuegosStock[i]);
		}

		teclado.close();

	}

}
