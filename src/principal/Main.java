package principal;

public class Main {

	public static void main(String[] args) {
		
		/* No borres las lineas de programa que tienes en este proyecto.
		 * Añade sólo lo que te pide el enunciado de cada ejercicio.
		*/
	
	    // --------------------------------------------------------------------
		// EJERCICIO 2 (puedes abrir el hueco que necesites) ------------------

		int[]numeros = new int[5];
		char[]caracteres = new char[10];
		String[]nombres = new String[4];
				
	    // --------------------------------------------------------------------
		// EJERCICIO 3 (puedes abrir el hueco que necesites) ------------------
	
		numeros[0] = 1;
		numeros[1] = 5;
		numeros[2] = 8;
		numeros[3] = 12;
		numeros[4] = 42;
		
		caracteres[0] = 'A';
		caracteres[1] = 'B';
		caracteres[2] = 'C';
		caracteres[3] = 'D';
		caracteres[4] = 'E';
		caracteres[5] = 'F';
		caracteres[6] = 'G';
		caracteres[7] = 'H';
		caracteres[8] = 'I';
		caracteres[9] = 'J';
		
		nombres[0] = "Carmen";
		nombres[1] = "Javier";
		nombres[2] = "Pablo";
		nombres[3] = "Laura";
		
		
		// EJERCICIO 4 (puedes abrir el hueco que necesites) ------------------
		System.out.println("Comienzo del ejercicio J2.4 --------------------");
		System.out.println("Contenido del array de numeros:");


		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		

		// EJERCICIO 5 (puedes abrir el hueco que necesites) ------------------
		System.out.println("Comienzo del ejercicio J2.5 --------------------");
		System.out.println("Contenido del array de caracteres:");

		for (int k = 0; k < caracteres.length; k++) {
			System.out.println(caracteres[k]);
		}


		System.out.println("Contenido del array de nombres:");

		for (int l = 0; l < nombres.length; l++) {
			System.out.println(nombres[l]);
		}

		// EJERCICIO 6 (puedes abrir el hueco que necesites) ------------------
		System.out.println("Comienzo del ejercicio J2.6 --------------------");
		System.out.println("Nuevo contenido del array de numeros:");


        for (int n = 0; n < numeros.length; n++) {
        	numeros[n] = numeros[n] + 10;
            System.out.print(numeros[n]);
            if (n < numeros.length - 1) {
                System.out.print(",");
            }
        }

		
		// -------------------------------------------------------------------
		System.out.println("\nfin del ejercicio J2 ---------------------------");
	}

}
