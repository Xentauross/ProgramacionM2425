package unidad2;

import java.util.Scanner;

public class EjemplosCondicionales4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escribir un programa ne java que lea dos numeros y una operacion la operacion
		 * podra ser suma, resta, multiplicacion, division y potencia se conrrespondera
		 * a los caracteres +,-, *, /, y ^
		 */

		Scanner teclado = new Scanner(System.in);

		int num1 = 0, num2 = 0;
		double resultado = 0;
		char operacion = ' ';

		System.out.println("Dime el primer numero: ");
		num1 = teclado.nextInt();

		System.out.println("Sime el segundo numero: ");
		num2 = teclado.nextInt();

		System.out.println("Dime el operador que quieras utilizar (+,-,*,/,^): ");
		operacion = teclado.next().charAt(0);
		// Cerramos el programa
		teclado.close();

		switch (operacion) {
		case '+':
			resultado = num1 + num2;
			break;
		// El break hace que no ejecute el siguiente case
		// Si no hay break hace que se ejecute el siguiente case
		case '-':
			resultado = num1 - num2;
			break;
		case '*':
			resultado = num1 * num2;
			break;
		case '/':
			resultado = num1 / num2;
			break;
		case '^':
			resultado = Math.pow(num1, num2);
			break;
		default:
			System.out.println("El operador no es valido");
			return;
		// El return finaliza la funicion principal
		// En este caso el main, por el cual es el programa principal.
		}

		// Sacamos por pantalla el resultado

		System.out.println("El resultado es: " + resultado);

		// Vamos a generar una nota aleatoria y que saque por pantalla si es un
		// insuficiente un suficiente...
		int nota = (int) (Math.random() * 11 + 1);
		System.out.println("Mi nota es: " + nota);

		switch (nota) {

		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("Estas suspenso");
			break;
		case 5:
			System.out.println("Estas aprobado");
			break;
		case 6:
			System.out.println("Tienes un bien");
			break;
		case 7:
		case 8:
			System.out.println("Tienes un notable");
			break;
		case 9:
		case 10:
			System.out.println("Tienes un  sobresaliente");
			break;
		case 11:
			System.out.println("Eres un alien");
		}
	}

}
