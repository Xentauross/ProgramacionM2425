package unidad3;

public class EjemploUsoPersonaje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Hemos creado una clase denominada Personaje Las variables de una clase se
		 * denominan objetos Para crear un objeto utilizamos la palabra reservada new La
		 * clsae es fichero java donde declaramos las variables y funcione que los
		 * objetos puesden utilizar Un objeto es como una variable de esa clase que
		 * puede guardar datos y ejecutar las funciones
		 */
		// Creamos un arma
		// Para poder usar un objeto primero hay que crearlo
		// Se utiliza la prabra reservada new para indicar qeu lo creamos
		// Cuando lo creamos realmente se llama a una fucnion de la clase arma
		// que se denomina constructor
		Arma arcoGelido = new Arma();
		
		Arma lanzaPicas = new Arma("Lanza Picas", "multiples a la vez", 0, 20, 0, 3);

		// arcoGelido.nombre = "Frozen";

		String nombre;

		// Creamos un personaje con new y el nombre de la clase
		Personaje aragorn = new Personaje();
		// Para acceder a las variables mienbre de la clase se utiliza el .
		aragorn.fuerza = 13;

		System.out.println("El personaje tiene " + aragorn.inteligencia + " puntos de inteligencia");

		System.out.println("El personaje tiene " + aragorn.puntosVida + " puntos de vida");
		aragorn.recibirDanio(0);
		System.out.println("El personaje tiene " + aragorn.puntosVida + " puntos de vida");

		System.out.println("Tirada de ataque de aragorn: " + aragorn.tiradaAtaque());

		System.out.println("Descripcion del arma: " + arcoGelido.getDescripcion());

		arcoGelido.setDescripcion("Congela los higadillos");

		System.out.println("Descripcion del arma: " + arcoGelido.getDescripcion());

		System.out.println("Datos del arma " + arcoGelido);

	}

}
