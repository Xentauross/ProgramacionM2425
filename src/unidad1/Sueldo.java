package unidad1;

import java.util.Scanner;

public class Sueldo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float sueldoBruto;
		// Representa el % que te retiene hacienda
		float hacienda;

		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Cuanto cobras?");
		sueldoBruto = teclado.nextFloat();

		System.out.println("¿Cuanto te retiene hacienda?");
		hacienda = teclado.nextFloat();

		teclado.close();

		// calculamos el porcentaje que retiene hacienda
		float haciendaP = hacienda / 100;
		// calculamos la rentencion de hacienda
		float haciendaRetiene = sueldoBruto * haciendaP;
		//sacamos el sueldo neto
		float sueldoNeto = sueldoBruto - haciendaRetiene;
	
		

		System.out.println("Cobras " + sueldoBruto + " pero hacienda se lleva " + haciendaRetiene
				+ " por lo cual te quedan unos miseros " + sueldoNeto);

	}

}