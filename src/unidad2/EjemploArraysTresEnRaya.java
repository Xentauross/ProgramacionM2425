package unidad2;

public class EjemploArraysTresEnRaya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char tablero[][] = { { '_', '_', '_' }, { '_', '_', '_' }, { '_', '_', '_' } };

		String ganador = "";

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
			// Turno jugador 1
			System.out.println("Jugador 1: Posicion a poner tu ficha (xy):");
		}
	}

}
