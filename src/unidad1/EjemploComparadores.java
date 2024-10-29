package unidad1;

public class EjemploComparadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int edad = 16;
		String  nombre = "Elisabetta";
		float nota  =4.4f;
		int numModSup =7;
		boolean traeBebida = true;
		int numAcomp = 2;
		boolean llevaZapatillas= false;
		//El valor inicial para entrar es falso, ya que por defecto
		//Nadie puede entrar a la graducación
		boolean puedeEntrarGrad =false;
		boolean gradoAprob = false;
		double renta = 19000;
		int numFamilia = 4;
		boolean padronFuera = true;
		String victimaTerrorismo = "si";
		String victimaMaltrato =  "si";
		boolean becaTrans = false;
		
		
		
		/*
		 * El alumno puede netrar en el acto de graduacion final de fp si y solo si
		 * es mayor de edad
		 * ha aprobado 8 modulos o  mas
		 * viene con bebida
		 * no trae zapatillas deportivas
		 * trae menos  de tres acompañantes
		 */
		//El operador > es cierto si el numero a la izquierda es mayor que el de la derecha
		//Estictamente, si sonn iguales es falso
		
		System.out.println("Es mayor que 18? " + (edad>18));
		System.out.println("El mayor o igual que 18? "+ (edad>=18));
		
		System.out.println("El alumno esta suspenso) " + (nota<5));
		
		//Combinamos  todas la condiciones con el operador logico y &&
		puedeEntrarGrad = edad>=18 && numModSup>=8 && traeBebida==true && llevaZapatillas!=true  && numAcomp<3;
		
		
		//Aprueba el modulo si es mayor de 17 años, y cumple una de las siguientes condiciones,
		//La nota media es mayor de 4.5 o tiene mas de 6 modulos aprobados
		
		gradoAprob = edad>17 && (nota>4.5 || numModSup>6);
		
		//El  alumno consigue la beca de transporte si cumple que su renta familiar es inferior a 20mil euros
		//la fammilia tiene entre 3 y 6 personas, y no está empadronado en otra provincia o cumple que es victima de
		//terrorismo o de maltrato
		
		//Nota 1: El operador ! (no) niega (resultado contrario) la condicion que le sigue
		//Nota 2: Para comprarar cadenas String utilizamos la funcion equals (cadena)
		//Nota 3: Con equalsIgnoreCase da igual letras en mayusculas y minusculas
		
		becaTrans = renta<20000 && (numFamilia>=3 && numFamilia<=6) && !padronFuera || (victimaTerrorismo.equalsIgnoreCase("Si")  || victimaMaltrato.equalsIgnoreCase("Si"));
	
		System.out.println("El alumno puede entrar a la graduacion? " + puedeEntrarGrad );
		System.out.println("Ha aprobado el grado? " + gradoAprob);
		System.out.println("Le conceden la ayuda de transporte? " + becaTrans);
	}

}
