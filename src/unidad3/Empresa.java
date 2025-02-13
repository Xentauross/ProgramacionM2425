package unidad3;

import java.util.Arrays;

public class Empresa {

	// Creamos las diferentes constantes para tipo
	public static final String TECNOLOGICA = "Tecnologia";
	public static final String AGRICULTURA = "Agricultura";
	public static final String FABRICACION = "Fabricacion";

	/**************************
	 * VARIABLES MIEMBRO
	 ***************************/
	private String id = "";
	private String nombre = "";
	private String direccion = "";
	private String tipo = "";
	public String web = "";
	private double ingresosAnuales;
	private double gastosEmpleados;
	private Empleado[] listaEmpleado;

	/**************************************************************
	 * CONSTRUCTORES
	 *************************************************************/

	// Constructor vacio
	public Empresa() {
		super();
		this.id = "";
		this.nombre = "";
		this.direccion = "";
		this.tipo = "";
		this.web = "";
		this.ingresosAnuales = Math.random() * 10000;
		this.gastosEmpleados = Math.random() * 10000;
		this.listaEmpleado = null;
	}

	/**
	 * Constructor con parametros
	 * 
	 * @param id
	 * @param nombre
	 * @param direccion
	 * @param tipo
	 * @param web
	 * @param ingresosAnuales
	 * @param gastosEmpleados
	 * @param empleado
	 */
	public Empresa(String id, String nombre, String direccion, String tipo, String web, double ingresosAnuales,
			double gastosEmpleados, Empleado[] listaEmpleado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.tipo = tipo;
		this.web = web;
		this.ingresosAnuales = ingresosAnuales;
		this.gastosEmpleados = gastosEmpleados;
		this.listaEmpleado = listaEmpleado;
	}

	/**************************************************************
	 * GETTERS Y SETTERS DE LA CLASE
	 *************************************************************/

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public double getIngresosAnuales() {
		return ingresosAnuales;
	}

	public void setIngresosAnuales(double ingresosAnuales) {
		this.ingresosAnuales = ingresosAnuales;
	}

	public double getGastosEmpleados() {
		return gastosEmpleados;
	}

	public void setGastosEmpleados(double gastosEmpleados) {
		this.gastosEmpleados = gastosEmpleados;
	}

	public Empleado[] getEmpleado() {
		return listaEmpleado;
	}

	public void setEmpleado(Empleado[] empleado) {
		this.listaEmpleado = empleado;
	}

	/**************************************************************
	 * TO STRING
	 *************************************************************/

	@Override
	public String toString() {
		return "Empresa: " + "\n**********************************" + "\nID: " + "<" + id + ">" + "\nNombre: " + "<"
				+ nombre + ">" + "\nDireccion: " + direccion + "\nTipo: " + "<" + tipo + ">" + "\nWeb=" + web
				+ "\nIngresos Anuales: " + "<" + ingresosAnuales + ">" + "\n Gastos Empleados: " + "<" + gastosEmpleados
				+ ">" + "\nEmpleado: " + "<" + Arrays.toString(listaEmpleado) + ">"
				+ "\n****************************************";
	}

	/**************************************************************
	 * FUNCIONES
	 *************************************************************/
	// int numEmpleados(): Devolverá la cantidad de personas de la empresa,
	// es decir la longitud del array de Personas.(1 punto)
	public int numEmpleados() {
		return this.listaEmpleado.length;
	}

	/*
	 * Empleado empleadoMasCaro(int puesto) devolverá el empleado que más cobra
	 * dentro del tipo introducido. Si se introduce -1 en tipo, devolverá el que más
	 * cobra de todos (2 puntos).
	 */
	public Empleado empleadoMasCaro(int puesto) {

		double sueldoMaximo = Double.MIN_VALUE;

		for (int i = 0; i < listaEmpleado.length; i++) {
			if (listaEmpleado[i].getIngresos() > gastosEmpleados) {
				sueldoMaximo++;

			}
		}
		return;
	}

	/*
	 * boolean asignarJefeEquipo(String nombre) Buscará en el array de empleados el
	 * que tenga el nombre introducido cómo parámetro. Si no existe se devolverá
	 * falso. Si existe y su puesto ya es “jefe de equipo” también devolverá falso.
	 * En caso de que no sea jefe de equipo le asignara ese puesto y devolverá
	 * true.(2 puntos)
	 */
	public boolean asignarJefeEquipo(String nombre) {
		boolean encontrado = false;

		for (int i = 0; i < listaEmpleado.length; i++) {

			// Si el nombre esta en nuestra lista
			// entramos en el if
			if (nombre.equalsIgnoreCase(listaEmpleado[i].getNombre())) {
				// Si hay una personas con el nombre
				// buscado se ha si no la encontrado
				encontrado = false;

				return true;
			}
		}
	}

	/*
	 * void] sumaIngresos(int edad): Sumará los sueldos de todos los empleados con
	 * una edad inferior a la introducida y asigna suma a la variable
	 * gastosEmpleados, también sumará el gasto de la tarjeta de los jefes. (2
	 * puntos)
	 */
	public void sumaIngresos(int edad) {

		// Recorro todas los empleados
		// Y voy sumando sus ingresos y filtro por una edad inferior
		for (int i = 0; i < listaEmpleado.length; i++) {
			if (edad < listaEmpleado[1].getEdad())
				gastosEmpleados = gastosEmpleados + listaEmpleado[i].getIngresos();
		}
	}
}
