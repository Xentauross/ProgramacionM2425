package unidad3;

public class Jefe extends Empleado {

	/**************************
	 * VARIABLES MIEMBRO
	 ***************************/
	private double gastoTarjeta;
	private String consejo;
	private String sede;

	/**************************************************************
	 * CONSTRUCTORES
	 *************************************************************/
	// Constructor vacio
	public Jefe() {
		super();
		this.gastoTarjeta = Math.random() * 1000;
		this.consejo = "";
		this.sede = "";
	}

	/**
	 * Constructor con parametros
	 * 
	 * @param gastoTarjeta
	 * @param consejo
	 * @param sede
	 */
	public Jefe(double gastoTarjeta, String consejo, String sede) {
		// Llamamos al constructor
		super(id, nombre, edad, ingresos, puesto);
		this.gastoTarjeta = gastoTarjeta;
		this.consejo = consejo;
		this.sede = sede;
	}

	/**************************************************************
	 * GETTERS Y SETTERS DE LA CLASE
	 *************************************************************/

	public double getGastoTarjeta() {
		return gastoTarjeta;
	}

	public void setGastoTarjeta(double gastoTarjeta) {
		this.gastoTarjeta = gastoTarjeta;
	}

	public String getConsejo() {
		return consejo;
	}

	public void setConsejo(String consejo) {
		this.consejo = consejo;
	}

	public String getSede() {
		return sede;
	}

	public void setSede(String sede) {
		this.sede = sede;
	}

	/**************************************************************
	 * TO STRING
	 *************************************************************/
	@Override
	public String toString() {
		return "Jefe: " + "\n**************************" + "\nGasto Tarjeta: " + "<" + gastoTarjeta + ">"
				+ "\nConsejo: " + "<" + consejo + ">" + "\nSede: " + "<" + sede + ">"
				+ "\n****************************";
	}

}