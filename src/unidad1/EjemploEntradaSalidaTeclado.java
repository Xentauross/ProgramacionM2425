package unidad1;

import java.util.Scanner;

public class EjemploEntradaSalidaTeclado {

	/**
	 * Comentario javadoc
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Comentario de una linea
		String nombre ="";
		int edad =23;
		float sueldo = 1300.4f;
		//El numero de telefono es un String ya que existe la posibilidad de que se introduzca
		//un caracter no numerico
		String telefono = "(980) 633422";
		
		
		//Los valores boolean pueden  ser true o false
		//Se les  puede asignar una expresión logica que la evalua como true o false
		boolean esHombre = true;
		boolean esMayorEdad = true;
		
		char sexo = 'p';
		String dni = "45852413L";
		String numEmpleado = "663e";
		String ram = "2Gb";
		
		//Creamos un objeto de tipo teclado para poder leer por la terminal
		Scanner teclado = new Scanner(System.in);
		
		//Mensaje para leer el teclado
		System.out.println("¿Tu nombre cual ser? "+ nombre);
		
		//Leemos el nombre del teclado
		nombre=teclado.next();
		
		System.out.println("Cuántos años  tienes ? ");
		//Leemos un entero que es la edad de teclado
		//Para eso utilizamos nextint
		edad= teclado.nextInt();
	
		//Leemos el sueldo
		System.out.println("Cuánto cobras al mes? ");
		//Leemos un float utilizamos nextfloat
		sueldo= teclado.nextFloat();
		
		//Leemos el sexo
		System.out.println("Sexo (M/F): ");
		sexo =  teclado.next().charAt(0);
		
		esMayorEdad = (edad>=18);
		
		
		teclado.close();
		
		System.out.println("El alumno  es mayor de edad? " + esMayorEdad);
		
		//Mostramos el nombre del alumno
		System.out.println("El nombre del alumno es " + nombre + " y cobra " + sueldo + " ,y su sexo es " + sexo);
		

		/*
		 * Comentario de muchas lineas
		 */
	}

}