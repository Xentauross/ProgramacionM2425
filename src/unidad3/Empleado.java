package unidad3;

public class Empleado {

	// Creamos las diferentes constantes para tipo
	public static final int PUESTO_JEFE = 0;
	public static final int PUESTO_RRHH = 1;
	public static final int PUESTO_ADMIN = 2;
	public static final int PUESTO_VENTAS = 3;

	/**************************
	 * VARIABLES MIEMBRO
	 ***************************/

	protected int id;
	private String nombre;
	private int edad;
	private double ingresos;
	public int puesto;

	/**************************************************************
	 * CONSTRUCTORES
	 *************************************************************/
	// Constructor vacio
	public Empleado() {
		super();
		this.id = (int) (Math.random() * 100);
		this.nombre = "";
		this.edad = (int) (Math.random() * 70);
		this.ingresos = Math.random() * 2000;
		this.puesto = (int) (Math.random() * 3);
	}

	/**
	 * Constructor con parametros
	 * 
	 * @param id
	 * @param nombre
	 * @param edad
	 * @param ingresos
	 * @param puesto
	 */
	public Empleado(int id, String nombre, int edad, double ingresos, int puesto) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.ingresos = ingresos;
		this.puesto = puesto;
	}

	/**************************************************************
	 * GETTERS Y SETTERS DE LA CLASE
	 *************************************************************/
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getIngresos() {
		return ingresos;
	}

	public void setIngresos(double ingresos) {
		this.ingresos = ingresos;
	}

	/**************************************************************
	 * TO STRING
	 *************************************************************/

	@Override
	public String toString() {
		return "Empleado: " + "\n************************************" + "\nID: " + id + ">" + "\nNombre: " + "<"
				+ nombre + ">" + "\nEdad: " + "<" + edad + ">" + "\nIngresos: " + "<" + ingresos + ">" + "\nPuesto: "
				+ "<" + puesto + ">" + "\n***************************************";
	}

}
