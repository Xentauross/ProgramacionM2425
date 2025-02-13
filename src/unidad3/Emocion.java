package unidad3;

public class Emocion {

	//Creamos las diferentes constantes para tipo
	public static final String ENVIDIA = "Envidia";
	public static final String PENA = "Pena";
	public static final String ALEGRIA = "Alegria";
	public static final String ASCO = "Asco";
	public static final String PLACER = "Placer";
	public static final String AMOR = "Amor";
	public static final String ODIO = "Odio";
	public static final String VERGUENZA = "Verguenza";
	
	//Creamos las diferntes constantes para origen
	public static final String VISUAL = "Visual";
	public static final String MEMORIA = "Memoria";
	public static final String OLFATO = "Olfato";
	public static final String TACTIL = "Tactil";
	public static final String GENERADA = "Generada";
	
	
	//Creamos las variables miembros
	private String nombre;
	private String descripcion;
	private int intensidad;//Rango de 1-10
	private String tipo;
	private String origen;
	private Recuerdo recuerdo;
	private boolean activa;
	

	/**************************************************************
	 * CONSTRUCTORES
	 *************************************************************/
	
	
	//Constructor vacio
	public Emocion() {
		super();
		this.nombre = "" ;
		this.descripcion = "";
		if (intensidad>=1 || intensidad<=10);
		this.intensidad = 0;
		this.tipo = "";
		this.origen = "";
		this.recuerdo = null;
		this.activa = true;
	}

	//Constructor con parametros
	public Emocion(String nombre, String descripcion, int intensidad, String tipo, String origen, Recuerdo recuerdo,
			boolean activa) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.intensidad = intensidad;
		this.tipo = tipo;
		this.origen = origen;
		this.recuerdo = recuerdo;
		this.activa = activa;
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getIntensidad() {
		return intensidad;
	}

	public void setIntensidad(int intensidad) {
		this.intensidad = intensidad;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public Recuerdo getRecuerdo() {
		return recuerdo;
	}

	public void setRecuerdo(Recuerdo recuerdo) {
		this.recuerdo = recuerdo;
	}

	public boolean isActiva() {
		return activa;
	}

	public void setActiva(boolean activa) {
		this.activa = activa;
	}

	@Override
	public String toString() {
		return "-Emocion- \nNombre: " + nombre + "\nDescripcion: " + descripcion + "\nIntensidad: " + intensidad + "\nTipo: "
				+ tipo + "\nOrigen: " + origen + "\nRecuerdo: " + recuerdo + "\nActiva: " + activa;
	}
	
	/**************************************************************
	 * FUNCIONES
	 *************************************************************/
	//Devolverá true si es una emoción de tipo alegria, amor o placer y no es generada.
	public boolean esPositivo() {
		return (tipo == ALEGRIA || tipo == AMOR || tipo == PLACER) && origen != GENERADA;
	}
	
	// Una emoción será fiable si no es generada ni ocurre que su origen es la memoria y el recuerdo no es fiel.  
	public boolean esFiable() {
		return origen != GENERADA && origen == MEMORIA && !recuerdo.esFiel();
		
	}
	
	
}
