package unidad3;

import java.util.ArrayList;

public class Personaje {

	// Variables miembro de la clase
	// Todos los objetos que creemos las tendrán

	// Por defecto si no ponemos nada las variables son publicas
	// Pueden ser
	/*
	 * public publicas private privada protected protegidas, solo las clases hijas
	 * pueden usarlas
	 */
	private int fuerza;
	private int inteligencia;
	private int carisma;
	public int clase;
	// Si las ponemos privadas no serán accesibles directamente desde el objeto
	private int puntosVida;
	private int puntosPoder;

	// int listaNumeros[] = new int[10];

	// Para definir un arraylist hay que decir el tipo de objeto que va a almacenar
	// entre <>
	// Al contrario que con un array normal, no hace falta definir el tamaño, segun
	// añadimos elementos al arraylist va haciendos mas grande
	private ArrayList<Arma> armas = new ArrayList<Arma>();
	public String getpuntosVida;

	// ArrayList<Integer> listaNumeros = new ArrayList<Integer>();

	/*
	 * Constructor principal
	 */
	public Personaje() {
		System.out.println("Generando el personaje...");

		// utilizamoss this para señalar que la variable es miembro de la clase
		// por si hubiera otra variable con el mismo nombre
		this.fuerza = (int) (Math.random() * 20);
		this.inteligencia = (int) (Math.random() * 20);
		this.carisma = (int) (Math.random() * 20);
		this.puntosVida = (int) (Math.random() * 20);
		this.puntosPoder = (int) (Math.random() * 20);
	}

	/**
	 * Esta funcion ejecuta una tirada de ataque que se calcula con un dado de 20
	 * mas la fuerza
	 * 
	 * @return
	 */

	public int tiradaAtaque() {
		// Ejecutamos la tirada de ataque
		return this.fuerza + (int) (Math.random() * 21);
	}

	// Funciones

	// Las fuciones al decclarse deben de fenir si son publicas/privadas/protegidas
	// y el tipo de dato que devuelven
	// En estrecaso no quiero que devuelca nada asi que pondgo void

	public void recibirDanio(int danio) {
		this.puntosVida = this.puntosVida - danio;
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	public int getCarisma() {
		return carisma;
	}

	public void setCarisma(int carisma) {
		this.carisma = carisma;
	}

	public int getClase() {
		return clase;
	}

	public void setClase(int clase) {
		this.clase = clase;
	}

	public int getPuntosVida() {
		return puntosVida;
	}

	public void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
	}

	public int getPuntosPoder() {
		return puntosPoder;
	}

	public void setPuntosPoder(int puntosPoder) {
		this.puntosPoder = puntosPoder;
	}

	public ArrayList<Arma> getArmas() {
		return armas;
	}

	public void setArmas(ArrayList<Arma> armas) {
		this.armas = armas;
	}

	/**
	 * Recibe un arma y la añade a la lista de armas del personaje
	 * 
	 * @param armaRecibida objeto de tipo arma que añade al personaje
	 */
	public void addArma(Arma armaRecibida) {
		// Añadimos con add el arma recibida
		// En la ultima posicion del arraylist de armas
		this.armas.add(2, armaRecibida);
	}

	/**
	 * La funcion devuelve la primera arma de la lista de armas que se suppone la
	 * principal Si la lista de armas está vacia devuelve null
	 * 
	 * @return Devuelve el arma principal del personaje o null si no tiene armas
	 */
	public Arma armaPrincipal() {
		// Solo cogemos el arma de la posicion 0 si en la lista de armas
		// hay al menos 1 arma
		if (armas.size() >= 1)
			return this.armas.get(0);

		return null;
	}

}
