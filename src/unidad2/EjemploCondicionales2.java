package unidad2;

public class EjemploCondicionales2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Escribe un programa que lea una nota y nos diga
		// si es un insuficiente, suficiente, bien, notable, sobresaliente o matricula

		float nota = (float) (Math.random() * 10);

		System.out.println("Tu nota es " + nota);

		// Si ha sacado menos de 5 ha suspendido
		if (nota < 5) {
			System.out.println("Ha suspendido");
			System.out.println("Lo siento mucho pisha");
		} else

		// Si estamos dentro implica que la nota es mayor o igual a 5
		// Si ademas es menor de 6 implica que es un suficiente
		if (nota < 6) {
			System.out.println("Tienes un suficiente poyita");
		} else if (nota < 7) {
			System.out.println("Tienes un bien pichón");
		} else if (nota < 9) {
			System.out.println("Tienes un notable máquina");

		} else if (nota < 10) {
			System.out.println("Tienes un sobresaliente te como los huevos");

		}

	}

}
