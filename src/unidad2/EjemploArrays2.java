package unidad2;

public class EjemploArrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creamos un array de 10 numeros
		int listaNumeros[] = new int[10];

		// Rescorremos todas las posicines del array y le vamos insertando numeros
		for (int i = 0; i < listaNumeros.length; i++) {
			listaNumeros[i] = (int) (Math.random() * 10.0) + 1;
			System.out.println("Número en pos  " + i + " es " + listaNumeros[i]);
		}

		// queremos sacar el numero mayor y menor de todos los que hay en el array
		int maxNum = Integer.MIN_VALUE;
		int minNum = Integer.MAX_VALUE;

		// Recorremos todas las posicines del array y buscando max y min
		for (int i = 0; i < listaNumeros.length; i++) {
			/*
			 * Si el numero actual es mayor que nuestro maximo hasta ahora Este numeor es el
			 * nuevo maximo
			 */
			if (listaNumeros[i] > maxNum) {
				maxNum = listaNumeros[i];
			}
			/*
			 * igual pra el mininmo, en caso de que el atual sea menor que nuestro minimo
			 * temporal
			 */
			if (listaNumeros[i] < minNum) {
				minNum = listaNumeros[i];
			}

			// Vamos a guardar el número acutal
			int numABuscar = listaNumeros[i];
			int cantRep = 0;

			// Recorremos todas las posicines del array y buscando max y min
			for (int j = 0; j < listaNumeros.length; j++) {
				// Si el numero en la posicion j del array es el numero a buscar
				// Es que hay un numero igaul al buscado y incremento la cantidad de repetidos
				if (listaNumeros[j] == numABuscar) {
					// Incrementamos la cantidad de numeros encontrados
					cantRep++;
				}
			}
			// Si hemos encontrado mas de una repeticion lo sacamos por pantalla
			if (cantRep > 1) {
				System.out.println("El número " + numABuscar + " se repite " + (cantRep - 1) + " veces.");
			}
		}

		// Mostramos el máximo y el mínimo
		System.out.println("El máximo es " + maxNum);
		System.out.println("El mínimo es " + minNum);
	}

}
