package unidad3;

/*
 * La clase arma sirve para guardar las caracteristicas de un arma
 * La podrán llevar los personajes del juego
 */
public class Arma {

	// Nombre del arma, es importante elegir algo que de miedo al enemigo
	private String nombre = "";
	// Descripcion del arma
	private String descripcion = "Arma  por defecto, no hace pupa";
	// Efecto que inflinge
	private int efecto = 0;

	private int ataqueFisico = 0;
	private int ataqueMagico = 0;
	private double peso = 10;
	private int clasePermitida[];

	/***************************************************************
	 * CONTRUCTORES DE LA CLASE
	 ****************************************************************/

	public Arma() {
		System.out.println("Se ha credado un Arma");
		this.peso = Math.random() * 5;
		this.ataqueFisico = (int) (Math.random() * 18) + 2;
		this.efecto = (int) (Math.random() * 5);
		this.descripcion = "Arma por defecto, no hace pupa";
	}

	/**
	 * Contructor que recive todos los datos del objeto y los asigna a las variables
	 * miembro
	 * 
	 * @param nombre
	 * @param descripcion
	 * @param efecto(0-    nada, 1- veneno,2-quemadura,3-estreñimiento,
	 *                     4-congelación)
	 * @param ataqueFisico
	 * @param ataqueMagico
	 * @param peso
	 */

	public Arma(String nombre, String descripcion, int efecto, int ataqueFisico, int ataqueMagico, double peso) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.efecto = efecto;
		this.ataqueFisico = ataqueFisico;
		this.ataqueMagico = ataqueMagico;
		this.peso = peso;
	}

	/**************************************************************
	 * GETTERS Y SETTERS DE LA CLASE
	 *************************************************************/
	public String getNombre() {
		return this.nombre;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String valorDescripcion) {
		this.descripcion = valorDescripcion;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setataqueFisico(int ataqueFisico) {
		this.ataqueFisico = ataqueFisico;
	}

	public void setataqueMagico(int ataqueMagico) {
		this.ataqueMagico = ataqueMagico;
	}

	public int getEfecto() {
		return efecto;
	}

}
