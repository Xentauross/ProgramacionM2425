package unidad2;

import java.util.Scanner;

public class EjemploBucles3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crear un programa que genere un número aleatorio entre 1 y 50
		// Y nos de 5 intentos de adivinarlo
		// Nos dara pistas, si es superior o inferior lo dira y si esta a menos de 2
		// posiciones
		// dira " caliente, caliente"

		int numGenerado = (int) (Math.random() * 50) + 1;
		int num = -1;
		// int numIntentos=5;

		Scanner teclado = new Scanner(System.in);

		// Repetimos el numero de intentos
		for (int numIntentos = 5; numIntentos > 0; numIntentos--) {
			System.out.print("intento numero " + numIntentos + ":");
			num = teclado.nextInt();

			if (num == numGenerado) {
				System.out.println("Felicidades, has acertado");
				numIntentos = 0;
			} else {
				/*
				 * Para ver si esta cerca, haemos el valor absoluto (pasa a positivo si es
				 * negativo) Y comprobamos que la distancia entre los numero es menos de 3, es
				 * decir 2 o 1
				 */
				if (Math.abs(num - numGenerado) < 3) {
					System.out.println("Caliente, caliente");
				}

				// Vamos a decirle si el número buscado es mayor o menor
				if (num > numGenerado)
					System.out.println("El número que buscas es Menor");
				else
					System.out.println("El número que buscas es Mayor");
			}
		}

		teclado.close();

	}

}
