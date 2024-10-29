package unidad1;

public class EjemploMensajeInicial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Definición de variables
		// Primero el tipo de dato y después el nombre (indentificador)
		// Solo se pueden definir una vez dentro del mmismo bloque de código
		int numHijos = 12;
		String nombre = "Adulis";
		String apellidos=  "Garcia";
		String mensaje;
		char escalera = 'B';
		float pi;
		double calculoInfinito; 
		
		int numero1 = 100;
		double numero2 = 2345534.3;
		
		numero1 = (int) numero2;
		
		System.out.println("El numero 1 es "+ numero1);
		System.out.println("El numero 2 es "+ numero2);
		
		System.out.println("El maximo valor entero es "+ Integer.MAX_VALUE);

		apellidos = " Garcia Perez";
		pi = 3.14159f;
		calculoInfinito = 242156546415616554.054646;
		
		// Esto es un comentario de linea
		/*
		 * Esto es un comentario de muchas lineas
		 *
		 */
		
		System.out.println("Mi nombre es " + nombre);
		
		nombre= "Victor Pablo";
		
		System.out.println("Mi nombre es " + nombre);
		
		nombre= nombre + " Galvan Florez";
		
		System.out.println("Mi nombre es " + nombre);
		
		nombre= "Paco";
		nombre= nombre + apellidos;
		
		System.out.println(nombre);
		
		mensaje= nombre + " tiene " + numHijos + " hijos";
		
		System.out.println(mensaje);
		
		//Para concatenar (unir o juntar) varias variables o valores se utiliza
		// el operador "+" dependiendo del tipo de valor hara una cosa u otra
		
		
		//para asignar un valor a una variable utilizamos el operador =
		//a la izquierda va la variable y a la derecha el valor que se le da

		System.out.print("Primer Mensaje");

	}

}