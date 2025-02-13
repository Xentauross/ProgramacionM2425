package unidad3;

import java.util.ArrayList;

public class pruebaPensamiento {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

    // 1. PRUEBAS DE RECUERDOS
	// Creamos 4 recuerdos con diferentes niveles de precisión	Recuerdo r1 = new Recuerdo(null, 1, 95);	Recuerdo r2 = new Recuerdo(null, 3, 75);	Recuerdo r3 = new Recuerdo(null, 5, 55);	Recuerdo r4 = new Recuerdo(null, 5, 45);

    // Probamos el método esFiel() - Deberían ser fieles si superan el 50% de precisión	System.out.println("Recuerdo 1 es fiel: " + r1.esFiel()); // true (95 > 90)	System.out.println("Recuerdo 2 es fiel: " + r2.esFiel()); // true (75 > 70)	System.out.println("Recuerdo 3 es fiel: " + r3.esFiel()); // true (55 > 50)	System.out.println("Recuerdo 4 es fiel: " + r4.esFiel()); // false (45 < 50)
		    
/**********************************************************************************/
    // 2. CREACIÓN DE PENSAMIENTO COMPLETO
    // Listas para almacenar recuerdos y emociones
		ArrayList <Recuerdo> listaRecuerdos = new ArrayList<Recuerdo>();
		ArrayList <Emocion> listaEmociones = new ArrayList<Emocion>();
        // Creamos un pensamiento de ejemplo
		Pensamiento ejemploPensamiento = new Pensamiento("jamon", "de bellota", 9, "", "", true, listaRecuerdos, listaEmociones);

        // 3. CREACIÓN DE COMPONENTES
        // Creamos un recuerdo relacionado con jamon
		Recuerdo recuerdo1 = new Recuerdo("jamon", 9, 57); 
        // Creamos una emoción (Alegría) vinculada al recuerdo anterior
		Emocion emocion1 = new Emocion("Alegria", "de bellota", 7,"","", recuerdo1, true);

        // 4. ASOCIACIÓN DE COMPONENTES
        // Agregamos el recuerdo y emoción al pensamiento
		ejemploPensamiento.agregarRecuerdo(recuerdo1);
		ejemploPensamiento.agregarEmocion(emocion1);
		
        // 5. ANÁLISIS DEL PENSAMIENTO
        // Mostramos un resumen con estadísticas del pensamiento
		ejemploPensamiento.mostrarResumen();
		       
	}
}
