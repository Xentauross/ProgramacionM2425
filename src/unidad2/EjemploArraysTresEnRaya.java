package unidad2;

import java.util.Scanner;

public class EjemploArraysTresEnRaya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char tablero[][] = { { '_', '_', '_' }, { '_', '_', '_' }, { '_', '_', '_' } };

		String ganador = "";
		Scanner teclado = new Scanner(System.in);
		String jugada = "";
		int jugadaXPosx = 0;
		int jugadaXPosy = 0;
		int jugadaOPosx = 0;
		int jugadaOPosy = 0;

		int cantX = 0;
		int cantO = 0;

		// Mientras no haya un ganador les vamos pieidno que pongan fichas
		while (ganador.equals("")) {

			// Mostramos por pantalla el tablero
			for (int i = 0; i < tablero.length; i++) {
				// Dibujo cada fila del tablero
				for (int j = 0; j < tablero[i].length; j++)
					System.out.print(tablero[i][j] + " ");

				// Despues de cada fila doy un enter
				System.out.println();
			}

			// TURNO DEL JUGADOR X
			// Reseteo las posiciones del jugadorX a unas incorrectas
			// Para que le pregunte por las de este turno
			// jugadaXPosx= -1;
			// jugadaXPosy= -1;
			// while(jugadaXPosy < 0 || jugadaXPosy >2||jugadaXPosx < 0||jugadaXPosx>2)
			do {
				System.out.println("Jugador X: Posicion a poner tu ficha (xy):");
				jugada = teclado.next();

				// Normalmente para convertir un numero de String a int
				// se usa la funcion Integer.parseInt
				// Asignamos las posiciones a sus variables
				jugadaXPosx = Character.getNumericValue(jugada.charAt(0));
				jugadaXPosy = Character.getNumericValue(jugada.charAt(1));
			} while (jugadaXPosy < 0 || jugadaXPosy > 2 || jugadaXPosx < 0 || jugadaXPosx > 2
					|| tablero[jugadaXPosy][jugadaXPosx] != '_');
			// Posicionamos la ficha en su lugar
			tablero[jugadaXPosy][jugadaXPosx] = 'X';

			// TURNO DEL JUGADOR O
			// Reseteo las posiciones del jugadorX a unas incorrectas
			// Para que le pregunte por las de este turno
			// jugadaXPosx= -1;
			// jugadaXPosy= -1;
			// while(jugadaXPosy < 0 || jugadaXPosy >2||jugadaXPosx < 0||jugadaXPosx>2)
			do {
				System.out.println("Jugador O: Posicion a poner tu ficha (xy):");
				jugada = teclado.next();

				// Normalmente para convertir un numero de String a int
				// se usa la funcion Integer.parseInt
				// Asignamos las posiciones a sus variables
				jugadaOPosx = Character.getNumericValue(jugada.charAt(0));
				jugadaOPosy = Character.getNumericValue(jugada.charAt(1));
			} while (jugadaOPosy < 0 || jugadaOPosy > 2 || jugadaOPosx < 0 || jugadaOPosx > 2
					|| tablero[jugadaOPosy][jugadaOPosx] != '_');
			// Posicionamos la ficha en su lugar
			tablero[jugadaOPosy][jugadaOPosx] = 'O';

			// COMPROBACION DE QUIEN HA GANADO

			// Primero comprobamos las filas
			// Para cada fila
			for (int y = 0; y <= 2; y++) {
				// Reseteamos la cantidad de X encontradas para cada fila
				cantX = 0;
				// Vamos contando las X de cada fila
				for (int x = 0; x <= 2; x++) {
					if (tablero[x][y] == 'X')
						cantX++;
				}
				// Si hay tres X ha ganado jugadorX
				if (cantX == 3)
					ganador = "Jugador X";
			}
			// Comprobamos las columnas
			// Para cada columna
			for (int x = 0; x <= 2; x++) {
				// Reseteamos la cantidad de X encontradas para cada columna
				cantX = 0;
				// Vamos contando las X de cada fila
				for (int y = 0; y <= 2; y++) {
					if (tablero[x][y] == 'X')
						cantX++;
				}
				// Si hay tres X ha ganado jugadorX
				if (cantX == 3)
					ganador = "Jugador X";

			}

			// Comprobamos las diagonales
			if (tablero[0][0] == 'X' && tablero[1][1] == 'X' && tablero[2][2] == 'X')
				ganador = "Jugador X";

			if (tablero[0][2] == 'X' && tablero[1][1] == 'X' && tablero[2][0] == 'X')
				ganador = "Jugador X";

			if (ganador == "") {
				// Primero comprobamos las filas
				// Para cada fila
				for (int y = 0; y <= 2; y++) {
					// Reseteamos la cantidad de O encontradas para cada fila
					cantO = 0;
					// Vamos contando las O de cada fila
					for (int x = 0; x <= 2; x++) {
						if (tablero[x][y] == 'X')
							cantO++;
					}
					// Si hay tres O ha ganado jugadorO
					if (cantX == 3)
						ganador = "Jugador O";
				}
				// Comprobamos las columnas
				// Para cada columna
				for (int x = 0; x <= 2; x++) {
					// Reseteamos la cantidad de O encontradas para cada columna
					cantO = 0;
					// Vamos contando las O de cada fila
					for (int y = 0; y <= 2; y++) {
						if (tablero[x][y] == 'X')
							cantO++;
					}
					// Si hay tres O ha ganado jugadorO
					if (cantO == 3)
						ganador = "Jugador O";

				}

				// Comprobamos las diagonales
				if (tablero[0][0] == 'O' && tablero[1][1] == 'O' && tablero[2][2] == 'O')
					ganador = "Jugador O";

				if (tablero[0][2] == 'O' && tablero[1][1] == 'O' && tablero[2][0] == 'O')
					ganador = "Jugador O";
			}

		}
		System.out.println("Has ganado: " + ganador);
		teclado.close();
	}
}
