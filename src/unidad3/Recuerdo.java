package unidad3;

public class Recuerdo {

	//Creamos las variables miembro
	private String nombre;
	private int duracion;//Tiempo de 1-5min
	private int fidelidad;//Porcentaje de 1 a 100
	

	/**************************************************************
	 * CONSTRUCTORES
	 *************************************************************/
	
	//Constructor vacio
	public Recuerdo() {
		super();
		this.nombre = "";
		if (duracion>=1 || duracion<=5);
		this.duracion = 0;
		if (fidelidad>=1 || fidelidad<=100)
		this.fidelidad = 0;
	}
	
	//Constructor con parametros
	public Recuerdo(String nombre, int duracion, int fidelidad) {
		super();
		this.nombre = nombre;
		this.duracion = duracion;
		this.fidelidad = fidelidad;
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

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getFidelidad() {
		return fidelidad;
	}

	public void setFidelidad(int fidelidad) {
		this.fidelidad = fidelidad;
	}
	
	@Override
	public String toString() {
		return "-Recuerdo- \nNombre: " + nombre + "\nDuracion: " + duracion + "\nFidelidad: " + fidelidad ;
	}
	
	/**************************************************************
	 * FUNCIONES
	 *************************************************************/
	public boolean esFiel() {
		
		if (fidelidad<50) {
		 return false;
		}
		if (duracion==1) 
		{
			return fidelidad > 90;
		}
		else if (duracion==2) 
		{
			return fidelidad > 80;
		}
		else if (duracion==3)
		{
			return fidelidad > 70;
		}
		else if (duracion==4)
		{
			return fidelidad > 60;
		}
		else if (duracion==5)
		{
			return fidelidad >= 50;
		}
		//Si el valor de la duracion no está entre 1-5 devolvera false
		return false;
		
		//Simplificado la duracion de es fiel
		//int[] rango = {90,80,70,60,50};
		//return fidelidad > rango[duracion -1];

	}
	
}
