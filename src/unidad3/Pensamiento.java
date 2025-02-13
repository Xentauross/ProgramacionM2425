package unidad3;

import java.util.ArrayList;

public class Pensamiento {
	
	//Creamos las constantes para categorias
	public static final String SOCIAL = "Social";
	public static final String RACIONAL = "Racional";
	public static final String AUTOMATICO = "Automatico";
	public static final String PRIMARIO = "Primario";
	
	//Creamos las cosntantes para tipo
	public static final String PURO = "Puro";
	public static final String GENERADO_RECUERDO = "Generado recuerdo";
	public static final String GENERADO_EMOCION = "Generado emocion";
	public static final String MIXTO = "Mixto";
	
	
	//Creamos las variables miembro
	private String nombre;
	private String descripcion;
	private int importancia; //Tendra un rango del 1-10
	private String categoria;
	private String tipo;
	private boolean activo;
	
	//Creamos los ArrayList para recuerdo y emocion
	ArrayList<Recuerdo> listaRecuerdo;
	ArrayList<Emocion> listaEmocion;
	

	/**************************************************************
	 * CONSTRUCTORES
	 *************************************************************/
	
	//Constructor vacio
	public Pensamiento() {
		super();
		this.nombre = "";
		this.descripcion = "";
		if (importancia>=1 || importancia<=10);
		this.importancia = 0;
		this.categoria = "";
		this.tipo = "";
		this.activo = true;
		this.listaRecuerdo = null;
		this.listaEmocion = null;
	}
	
	//Constructor con parametros
	public Pensamiento(String nombre, String descripcion, int importancia, String categoria, String tipo,
			boolean activo, ArrayList<Recuerdo> listaRecuerdo, ArrayList<Emocion> listaEmocion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.importancia = importancia;
		this.categoria = categoria;
		this.tipo = tipo;
		this.activo = activo;
		this.listaRecuerdo = listaRecuerdo;
		this.listaEmocion = listaEmocion;
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

	public int getImportancia() {
		return importancia;
	}

	public void setImportancia(int importancia) {
		this.importancia = importancia;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public ArrayList<Recuerdo> getListaRecuerdo() {
		return listaRecuerdo;
	}

	public void setListaRecuerdo(ArrayList<Recuerdo> listaRecuerdo) {
		this.listaRecuerdo = listaRecuerdo;
	}

	public ArrayList<Emocion> getListaEmocion() {
		return listaEmocion;
	}

	public void setListaEmocion(ArrayList<Emocion> listaEmocion) {
		this.listaEmocion = listaEmocion;
	}

	@Override
	public String toString() {
		return "-Pensamiento- \nNombre: " + nombre + "\nDescripcion: " + descripcion + "\nImportancia: " + importancia
				+ "\nCategoria: " + categoria + "\nTipo: " + tipo + "\nActivo: " + activo + "\nListaRecuerdo: "
				+ listaRecuerdo + "\nListaEmocion: " + listaEmocion;
	}
		
	/**************************************************************
	 * FUNCIONES
	 *************************************************************/
	/*
	 * Se definirán las siguientes constantes para el resultado de la función (VALIDO, RECUERDO_INVALIDO, EMOCION_INVALIDA, DEMASIADO_EMOCIONAL, PRIMARIO_EMOCIONAL, AUTOMATICO)
	 * Comprobará en tres fases si es valido o hay que reconstruirlo:
	 */

public static final int VALIDO = 0;
public static final int RECUERDO_INVALIDO = 1;
public static final int EMOCION_INVALIDA = 2;
public static final int DEMASIADO_EMOCIONAL = 3;
public static final int PRIMARIO_EMOCIONAL = 4;
public static final int AUTOMATIC = 5;

/**
 * Valida la integridad del pensamiento según reglas predefinidas.
 * @return Código de resultado indicando el estado de validación.
 */
	public int esValido() {
		/*
		 * Primera Fase:Comprobará si todos los recuerdos asociados son fieles y las emociones asociadas son fiables. 
		 * Utilizará bucles para recorrer las listas y condiciones para validar. 
		 * Dependiendo del tipo de pensamiento comprobará sólo recuerdos (GENERADO_RECUERDO), sólo emociones (GENERADO_EMOCION), 
		 * las dos listas (MIXTO) o nada (PURO)
		 */
		if(tipo==GENERADO_RECUERDO || tipo==MIXTO) {
			for (Recuerdo recuerdo : listaRecuerdo){
				if(!recuerdo.esFiel());
					return RECUERDO_INVALIDO;
			}
		}
		if(tipo==GENERADO_EMOCION || tipo==MIXTO) {
			for(Emocion emocion : listaEmocion) {
				if(!emocion.esFiable());
				return EMOCION_INVALIDA;
			}
		}
		/*
		 * Segunda Fase: El pensamiento no es válido si es primario y generado por una emoción.
		 *  Tampoco será válido si es automático y generado por una emoción o mixto ni si es SOCIAL y generado por alguna emoción.
		 */
		if(categoria==PRIMARIO && tipo==GENERADO_EMOCION) {
			return PRIMARIO_EMOCIONAL;
		}
		if((categoria==AUTOMATICO && (tipo==GENERADO_EMOCION || tipo==MIXTO)) || (categoria==SOCIAL && tipo==GENERADO_EMOCION)) {
			return AUTOMATIC;
		}
		//Tercera Fase: Si la importancia es mayor o igual a 8, las emociones no pueden intervenir.
		if(importancia>=8 && listaEmocion!=null) {
		return DEMASIADO_EMOCIONAL;
		}
		
		return VALIDO;
	}
	
	// Códigos para tipo de análisis
    public static final int TIPO_EMOCION = 1;
    public static final int TIPO_RECUERDO = 2;
    /**
     * Analiza la calidad de emociones o recuerdos asociados.
     * @param tipo Tipo de análisis (TIPO_EMOCION o TIPO_RECUERDO)
     * @return Arreglo con [total elementos, porcentaje fiables/positivos]
     */
	public int[] analizar(int tipo) {
		
	    int total = 0;               // Total de emociones o recuerdos
	    int fiablesPositivos = 0;    // Contador de emociones positivas o recuerdos fiables

	    // Si el tipo es emociones
	    if (tipo == TIPO_EMOCION) {
	        total = listaEmocion.size();  // Cantidad total de emociones
	        for (Emocion e : listaEmocion) {  
	            if (e.esPositivo()) {       // Si la emoción es positiva...
	                fiablesPositivos++;      // Sumamos 1 al contador.
	            }
	        }
	    } 
	    
	    // Si el tipo es recuerdos
	    else if (tipo == TIPO_RECUERDO) {
	        total = listaRecuerdo.size();  // Cantidad total de recuerdos
	        for (Recuerdo r : listaRecuerdo) {  
	            if (r.esFiel()) {           // Si el recuerdo es fiable...
	                fiablesPositivos++;      // Sumamos 1 al contador.
	            }
	        }
	    } 
	    
	    // Si el tipo no es válido
	    else {
	    	return new int[]{0, 0};
	    }

	    // Calcular porcentaje y retornar resultados
	    int porcentaje = (fiablesPositivos * 100) / total;
	    return new int[]{total, porcentaje};
	}
	
	//agregarRecuerdo y agregarEmocion: Permitirán añadir recuerdos y emociones al pensamiento de forma controlada.
	/**
	 * Agrega un recuerdo a la lista asociada.
	 * @param recuerdo Recuerdo a agregar.
	 */
	public void agregarRecuerdo(Recuerdo recuerdo) {
	    listaRecuerdo.add(recuerdo);
	}
	/**
	 * Agrega una emoción a la lista asociada.
	 * @param emocion Emoción a agregar.
	 */
	public void agregarEmocion(Emocion emocion) {
		listaEmocion.add(emocion);
	}

	//eliminarRecuerdo y eliminarEmocion: Permitirán eliminar un pensamiento o recuerdo en particular,
	//habrá dos funciones sobrecargadas para cada caso, pudiendo recibir el índice a eliminar o el objeto a eliminar.
	/**
	 * Elimina un recuerdo por índice.
	 * @param indice Posición del recuerdo a eliminar.
	 */
	public void eliminarRecuerdo(int indice) {
	    if (indice >= 0 && indice < listaRecuerdo.size()) {
	        listaRecuerdo.remove(indice);
	    }
	}
	/**
	 * Elimina un recuerdo específico.
	 * @param recuerdo Recuerdo a eliminar.
	 */
	public void eliminarRecuerdo(Recuerdo recuerdo) {
	    listaRecuerdo.remove(recuerdo);
	}
	/**
	 * Elimina una emoción por índice.
	 * @param indice Posición de la emoción a eliminar.
	 */
	public void eliminarEmocion(int indice) {
	    if (indice >= 0 && indice < listaEmocion.size()) {
	        listaEmocion.remove(indice);
	    }
	}
	/**
	 * Elimina una emoción específica usando recursión.
	 * @param emocion Emoción a eliminar.
	 * @param posActual Posición inicial para la búsqueda.
	 */
	public void eliminarEmocion(Emocion emocion, int posActual) {
	    if (posActual < listaEmocion.size()) {
	        if (listaEmocion.get(posActual).equals(emocion)) {
	            listaEmocion.remove(posActual);
	        } else {
	            eliminarEmocion(emocion, posActual + 1);
	        }
	    }
	}
	/**
	 * Muestra un resumen detallado del pensamiento, incluyendo análisis de recuerdos y emociones.
	 */
	public void mostrarResumen() {
	    // Mostrar información sobre los recuerdos
	    System.out.println("Resumen del Pensamiento:");
	    System.out.println("------------------------");
	    System.out.println("Recuerdos:");
	    if (listaRecuerdo.isEmpty()) {
	        System.out.println("No hay recuerdos en este pensamiento.");
	    } else {
	        for (Recuerdo recuerdo : listaRecuerdo) {
	            System.out.println("Recuerdo fiel: " + (recuerdo.esFiel() ? "Sí" : "No"));
	        }
	    }

	    // Mostrar información sobre las emociones
	    System.out.println("\nEmociones:");
	    if (listaEmocion.isEmpty()) {
	        System.out.println("No hay emociones en este pensamiento.");
	    } else {
	        for (Emocion emocion : listaEmocion) {
	            System.out.println("Emoción positiva: " + (emocion.esPositivo() ? "Sí" : "No"));
	        }
	    }

	    // Mostrar datos del análisis
	    int[] resultadoEmociones = analizar(TIPO_EMOCION);
	    int[] resultadoRecuerdos = analizar(TIPO_RECUERDO);

	    System.out.println("\nAnálisis de Emociones:");
	    System.out.println("Total de emociones: " + resultadoEmociones[0]);
	    System.out.println("Porcentaje de emociones positivas: " + resultadoEmociones[1] + "%");

	    System.out.println("\nAnálisis de Recuerdos:");
	    System.out.println("Total de recuerdos: " + resultadoRecuerdos[0]);
	    System.out.println("Porcentaje de recuerdos fieles: " + resultadoRecuerdos[1] + "%");

	}

}
