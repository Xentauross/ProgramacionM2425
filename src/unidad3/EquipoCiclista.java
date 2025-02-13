package unidad3;

public class EquipoCiclista {

	/**************************
	 * VARIABLES MIEMBRO
	 ***************************/
	// Está compuesto por los siguientes atributos miembro, los cuales el alumno
	// deberá seleccionar un tipo adecuado al dato:
	// Identificador, puede tener números y letras
	// Nombre del equipo
	// Número de Ciclistas
	// Array de Ciclistas

	private String identificador = "";
	public String nombreEquipo = "";
	private int numCiclistas = 0;
	private Ciclistas ciclistas[];

	/****************************
	 * CONSTRUCTORES
	 *****************************/

	// Tendrá un constructor vacío que generará los valores numéricos aleatoriamente
	// y pondrá a “” las cadenas de texto
	public EquipoCiclista() {
		super();
		this.numCiclistas = (int) (Math.random() * 20);
		this.identificador = "";
		this.nombreEquipo = "";
		// Tenemos que decirle la cantidad de elementos que hay en ese array
		// Y despues hacer que rellene cada una de las posiciones por valores aleatorios
		// Para ello utilizaremos un for que vaya recorriendo las posiciones del array
		// de ciclistas
		// Y en cada posicion ir poniendo un nuevo valor random

		this.ciclistas = new Ciclistas[4];
		for (int i = 0; i < ciclistas.length; i++) {
			ciclistas[i] = new Ciclistas();
		}
	}

	// y otro constructor que recibirá todos los parámetros y se los asignará a los
	// atributos de la clase.
	public EquipoCiclista(String identificador, String nombreEquipo, int numCiclistas, Ciclistas[] ciclistas) {
		super();
		this.identificador = identificador;
		this.nombreEquipo = nombreEquipo;
		this.numCiclistas = numCiclistas;
		this.ciclistas = ciclistas;
	}

	/**************************************
	 * GETTERS Y SETTERS
	 ***************************************/
	// Se deberán crear todas las variables privadas excepto el nombre del equipo,
	// que será pública, // y todas deberán de tener sus métodos de acceso get y
	// set.
	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public int getNumCiclistas() {
		return numCiclistas;
	}

	public void setNumCiclistas(int numCiclistas) {
		this.numCiclistas = numCiclistas;
	}

	public Ciclistas[] getCiclistas() {
		return ciclistas;
	}

	public void setCiclistas(Ciclistas[] ciclistas) {
		this.ciclistas = ciclistas;
	}

	/*************************************
	 * METODOS
	 *************************************/
	// int numCiclistas() (0,75 puntos) devolverá la cantidad de ciclistas.

	public int numCiclistas() {
		return numCiclistas;
	}

	// float maxPeso() (0,75 puntos): Devolverá el peso máximo de los ciclistas de
	// los ciclistas
	public float maxPeso() {
		float maxPeso = 0; // Empezamos con 0, porque buscamos el peso más grande

		// Recorremos la lista de ciclistas uno por uno
		for (int i = 0; i < ciclistas.length; i++) {
			// Comparamos el peso actual con el mayor que tenemos hasta ahora
			maxPeso = Math.max(maxPeso, ciclistas[i].getPeso());
		}

		return maxPeso; // Devolvemos el peso más grande encontrado
	}

	// int numCiclistas(String especialidad) (1 puntos): Devolverá la cantidad de
	// ciclistas de la especialidad indicada.

	public int numCiclistas(String especialidad) {
		int nummontana = 0; // Contador para los ciclistas de especialidad montaña
		int numcontrareloj = 0; // Contador para los ciclistas de especialidad contrarreloj
		int numtodoterreno = 0; // Contador para los ciclistas de especialidad todoterreno

		// Recorremos todos los ciclistas
		for (int i = 0; i < ciclistas.length; i++) {
			// Comprobamos si el ciclista tiene la especialidad montaña (1)
			if (ciclistas[i].getEspecialidad() == 1) {
				nummontana++; // Si es montaña, aumentamos el contador de montaña
				return nummontana;
			}
			// Comprobamos si el ciclista tiene la especialidad contrarreloj (2)
			else if (ciclistas[i].getEspecialidad() == 2) {
				numcontrareloj++; // Si es contrarreloj, aumentamos el contador de contrarreloj
				return numcontrareloj;
			}
			// Comprobamos si el ciclista tiene la especialidad todoterreno (3)
			else if (ciclistas[i].getEspecialidad() == 3) {
				numtodoterreno++; // Si es todoterreno, aumentamos el contador de todoterreno
				return numtodoterreno;
			}
		}

		return 0;
	}

	/*
	 * Ciclista buscarCiclista(String nombre) (1,5 puntos)Buscará en el array de
	 * ciclistas un ciclista con el nombre que recibe cómo parámetro. Devolverá el
	 * ciclista o -1 si no lo encuentra.
	 */
	public Ciclistas buscarCiclista(String nombre) {
		// Recorremos todos los ciclistas
		for (int i = 0; i < ciclistas.length; i++) {
			// Comprobamos si el nombre del ciclista es igual al que buscamos
			// Usamos .equals porque compara el contenido de las cadenas, no la dirección de
			// memoria
			if (ciclistas[i].getNombre().equals(nombre)) {
				return ciclistas[i]; // Si lo encontramos, devolvemos el ciclista
			}
		}

		// Si no encontramos el ciclista, devolvemos null (nada)
		return null;
	}
	/*
	 * int anadirCiclista(Ciclista cicli) (2 puntos) Si el número de ciclistas del
	 * equipo es mayor que la cantidad de elementos del array, creará un array con
	 * una posición más, copiara todos los ciclistas del array original al nuevo y
	 * pondrá el ciclista recibido como parámetro en la última posición. Después
	 * asignará el nuevo array como array del equipo. Devolverá 0 si va todo bien y
	 * -1 si ocurre cualquier fallo.
	 */

	public int anadirCiclista(Ciclistas cicli) {
		// Comprobamos si el número de ciclistas es mayor o igual que el tamaño del
		// array
		if (numCiclistas >= ciclistas.length) {
			// Si es así, necesitamos aumentar el tamaño del array
			Ciclistas[] nuevoArray = new Ciclistas[numCiclistas + 1]; // Creamos un nuevo array con una posición más

			// Copiamos los ciclistas del array antiguo al nuevo
			for (int i = 0; i < ciclistas.length; i++) {
				nuevoArray[i] = ciclistas[i]; // Copiamos cada ciclista
			}

			// Ahora asignamos el nuevo array al array ciclistas
			ciclistas = nuevoArray;
		}

		// Añadimos el nuevo ciclista al final del array
		ciclistas[numCiclistas] = cicli;

		// Aumentamos el contador de ciclistas
		numCiclistas++;

		// Devolvemos 0 si todo ha ido bien
		return 0;
	}

	public void eliminarCiclistas(int indice) {
		if (indice >= 0 && indice < Ciclistas.size()) {
			Ciclistas.remove(indice); // elimina a un ciclista
		}
	}

}