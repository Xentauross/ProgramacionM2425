package unidad3;

public class Ciclistas {

	/********************************************
	 * VARIABLES ESTATICAS *
	 *******************************************/
	public static final int ESPE_MONTAÑA = 1;
	public static final int ESPE_CONTRARELOJ = 2;
	public static final int ESPE_TODOTERRENO = 3;
	/********************************************
	 * VARIABLES MIEMBRO *
	 *******************************************/
	private int identificador;
	private String nombre;
	private int edad;
	private String modeloBici;
	private float peso;
	private int posicion;
	private int especialidad;

	/********************************************
	 * CONSTRUCTORES *
	 *******************************************/
	/*
	 * Tendrá un constructor vacío que generará los valores numéricos aleatoriamente
	 * y pondrá a “” las cadenas de texto y otro constructor que recibirá todos los
	 * parámetros y se los asignará a los atributos de la clase.
	 */
	public Ciclistas() {
		super();

		this.identificador = (int) (Math.random() * 20);
		this.nombre = " ";
		this.edad = (int) (Math.random() * 20);
		this.modeloBici = "";
		this.peso = (int) (Math.random() * 20);
		this.posicion = (int) (Math.random() * 20);
		this.especialidad = (int) (Math.random() * 3);
	}

	public Ciclistas(int identificador, String nombre, int edad, String modeloBici, float peso, int posicion,
			int especialidad) {
		super();
		this.identificador = identificador;
		this.nombre = nombre;
		this.edad = edad;
		this.modeloBici = modeloBici;
		this.peso = peso;
		this.posicion = posicion;
		this.especialidad = especialidad;
	}

	/********************************************
	 * METODOS O FUNCIONES *
	 *******************************************/

	/********************************************
	 * GETTERS AND SETTERS *
	 *******************************************/
	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

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

	public String getModeloBici() {
		return modeloBici;
	}

	public void setModeloBici(String modeloBici) {
		this.modeloBici = modeloBici;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	public int getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(int especialidad) {
		this.especialidad = especialidad;
	}

	/*
	 * Tendrá un método toString que mostrará devolverá una cadena formateada con
	 * los contenidos de los atributos de la clase de la siguiente manera:
	 * Ciclista:*************************************************************
	 * Nombre:<Nombre> ………………
	 * ************************************************************ Donde los campos
	 * entre < > son los valores de los atributos de la clase.
	 */
	@Override
	public String toString() {
		return "\n**********************************************" + "Ciclistas: \nidentificador=" + identificador
				+ "\nnombre=" + nombre + "\nedad=" + edad + "\nmodeloBici=" + modeloBici + "\npeso=" + peso
				+ "\nposicion=" + posicion + "\nespecialidad=" + especialidad
				+ "\n*******************************************************";
	}

	public static void remove(int indice) {
		// TODO Auto-generated method stub

	}

	public static int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}