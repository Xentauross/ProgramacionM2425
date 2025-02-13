package unidad3;

public class Main {

	public static void main(String[] args) {
		// Crear un equipo ciclista
		EquipoCiclista equipo = new EquipoCiclista("EQUIPO123", "Los Rápidos", 4, new Ciclistas[4]);

		// Mostrar los detalles del equipo
		System.out.println("Equipo: " + equipo.getNombreEquipo());
		System.out.println("Número de ciclistas en el equipo: " + equipo.numCiclistas());
		System.out.println("Peso máximo de los ciclistas: " + equipo.maxPeso() + " kg\n");

		// Crear algunos ciclistas
		Ciclistas ciclista1 = new Ciclistas(1, "Juan Pérez", 30, "Bici1", 68.5f, 2, Ciclistas.ESPE_MONTAÑA);
		Ciclistas ciclista2 = new Ciclistas(2, "Carlos Díaz", 28, "Bici2", 75.2f, 4, Ciclistas.ESPE_CONTRARELOJ);
		Ciclistas ciclista3 = new Ciclistas(3, "María Gómez", 35, "Bici3", 60.0f, 1, Ciclistas.ESPE_TODOTERRENO);
		Ciclistas ciclista4 = new Ciclistas(4, "Ana Sánchez", 29, "Bici4", 62.3f, 3, Ciclistas.ESPE_MONTAÑA);

		// Añadir los ciclistas al equipo
		equipo.anadirCiclista(ciclista1);
		equipo.anadirCiclista(ciclista2);
		equipo.anadirCiclista(ciclista3);
		equipo.anadirCiclista(ciclista4);

		// Ver los detalles de cada ciclista en el equipo
		System.out.println("Detalles de los ciclistas del equipo:");
		for (int i = 0; i < equipo.numCiclistas(); i++) {
			System.out.println(equipo.getCiclistas()[i].toString());
		}

		// Buscar un ciclista por nombre
		String nombreBuscar = "Carlos Díaz";
		Ciclistas ciclistaBuscado = equipo.buscarCiclista(nombreBuscar);
		if (ciclistaBuscado != null) {
			System.out.println("\nCiclista encontrado: ");
			System.out.println(ciclistaBuscado.toString());
		} else {
			System.out.println("\nCiclista con el nombre " + nombreBuscar + " no encontrado.");
		}

		// Contar cuántos ciclistas hay de la especialidad "montaña"
		int numMontana = equipo.numCiclistas();
		System.out.println("\nNúmero de ciclistas en la especialidad 'montaña': " + numMontana);
	}
}
