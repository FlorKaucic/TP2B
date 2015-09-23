package metodos;

public class Fusion {
	public static <T extends Comparable<T>> void ordenarPorFusion(T[] vec) {
		fusion(vec, 0, vec.length);
	}

	private static <T extends Comparable<T>> void fusion(T[] vec, int ini, int fin) {
		int dim = fin - ini;
		// Si la dimension es menor o igual a 1 salgo de la funcion
		if (dim <= 1)
			return;
		
		// Sino
				
		int mitad = ini + (dim / 2);
		
		// Uso recursividad para evaluar la primera y segunda mitad por separado
		fusion(vec, ini, mitad);
		fusion(vec, mitad, fin);

		// Creo un vector auxiliar para acomodar ahi las dos mitades ordenadas por separado
		@SuppressWarnings("unchecked")
		T[] aux = (T[]) (new Comparable[dim]);

		// Relleno el vector auxiliar
		for (int a = 0; a < (mitad - ini); a++)
			aux[a] = vec[a + ini];
		// La parte derecha se pone en orden inverso
		for (int b = 0; b < (fin - mitad); b++)
			aux[b + dim / 2] = vec[fin - (b + 1)];

		// Variables para recorrer el auxiliar y el vector original
		int i = 0, j = aux.length - 1, k = ini;

		// Comparo y ordeno las dos mitades ubicadas en el vector auxiliar
		// A medida que las voy ubicando en el vector original
		while (i < j) {
			if (aux[i].compareTo(aux[j]) < 0) {
				vec[k] = aux[i];
				i++;
			} else {
				vec[k] = aux[j];
				j--;
			}
			k++;
		}
		// Cuando i = j tengo que ubicar el ultimo elemento en el vector original
		vec[k] = aux[i];
	}
}