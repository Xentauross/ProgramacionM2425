package unidad3;

public class EjemploUsoObjeto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Hemos creado una clase denominada Personaje Las variables de una clase se
		 * denominan objetos Para crear un objeto utilizamos la palabra reservada new La
		 * clsae es fichero java donde declaramos las variables y funcione que los
		 * objetos puesden utilizar Un objeto es como una variable de esa clase que
		 * puede guardar datos y ejecutar las funciones
		 */

		// Creamos un personaje con new y el nombre de la clase
		Personaje aragorn = new Personaje();
		// Para acceder a las variables mienbre de la clase se utiliza el .
		aragorn.fuerza = 13;

		System.out.println("El personaje tiene " + aragorn.inteligencia + " puntos de inteligencia");

		System.out.println("El personaje tiene " + aragorn.puntosVida + " puntos de vida");
		aragorn.recibirDanio(0);
		System.out.println("El personaje tiene " + aragorn.puntosVida + " puntos de vida");
	}

}
