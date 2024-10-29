package unidad2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class EjemploCondicionales3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Vamos a comprobar si un alumno ha sacado el carnet de conducir Para ello
		 * leera de teclado los siguientes datos edad, numFallosExamen, tasapagada,
		 * fechaExamenPractico, numGolpes, jamón El programa debera de comprobar si
		 * tiene derecho a carnet para ello debera tener mas de 18 años y menos de 4
		 * fallos en el examen y la tasa pagada en caso de cumplirlo se le pedira la
		 * fecha del examen practico y los golpes Si la fecha es anterior a la actual o
		 * tiene menos de dos golpes tambien aprueba En todo caso tambien tiene carnet
		 * si ha regalado un jamón
		 */
		int edad = 0;
		int numFallosEx = 0;
		boolean tasaPagada = false;
		String sTasaPagada = "";
		LocalDate fechaExamen;
		String sFechaExamen = "";
		int numGolpes = 0;
		boolean jamon = false;
		boolean tieneCarnet = true;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Has regalado un jamon? (true/false)");
		jamon = teclado.nextBoolean();

		if (jamon)

			System.out.println("Tienes tu carnet de Conducir");

		else {

			System.out.println("Cuantos años tienes ? ");
			edad = teclado.nextInt();
			System.out.println("Cuantas preguntas fallastes ? ");
			numFallosEx = teclado.nextInt();
			System.out.println("Has pagado las tasas (S/N)");

			// Leemos como String si hemos pagado la tasa
			sTasaPagada = teclado.next();

			/*
			 * Operador ternario se la condicion es cierta, asigana el valor que viene
			 * despues de la ? Si es falsa asigana el valor del final
			 */
			tasaPagada = sTasaPagada.equalsIgnoreCase("S") ? true : false;

			/*
			 * El operador terniario anterior es igual a este if if
			 * (sTasaPagada.equalsIgnoreCase("S")) tasaPagada = true, else tasaPagada =
			 * false
			 */

			if (edad >= 18 && numFallosEx < 4 && tasaPagada == true) {
				/*
				 * Para leer la fecha de treclado hay que leerla como un String Pero puede tener
				 * muchisimos formatos
				 */

				System.out.println("Introduce la fecha del examen (dd/MM/yyyy)");
				sFechaExamen = teclado.next();
				// Creamos el formato en el cual se va a interpretar a la fecha
				DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				// El parse cambia el String de tipo de dato a fecha
				// Utilizamos el formto que hemos definido antes

				fechaExamen = LocalDate.parse(sFechaExamen, formateador);

				System.out.println("Cuantos golpes pegaste en el practico ? ");
				numGolpes = teclado.nextInt();

				// Fecha actual
				LocalDate hoy = LocalDate.now();

				// Ultima comprobacion menos de dos golpes y fecha anterior a la actual
				if (numGolpes < 2 || fechaExamen.isBefore(hoy)) {
					System.out.println();

					tieneCarnet = true;
				}

			}

		}

		// Si tieneel carnet le sacamos un mensaje por pantalla
		if (tieneCarnet)
			System.out.println("Felicidades, puedes pasa a recoger el carnet en un plazo aproximado de 4 a 20 dias");
		else
			System.out.println("Try again, insert coin");
		teclado.close();

	}

}
