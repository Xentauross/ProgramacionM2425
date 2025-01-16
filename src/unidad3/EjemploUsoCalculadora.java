package unidad3;

public class EjemploUsoCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(calculadora.suma(3, 4));

		System.out.println(calculadora.suma("123"));

		double[] numeros = { 2.0, 4.0, 5.0, 12.0 };
		System.out.println(calculadora.suma(numeros));

		System.out.println(calculadora.sumaRecursiva(numeros));

		System.out.println(calculadora.factorial(5));

		System.out.println(calculadora.factorialRecursivo(5));
	}

}
