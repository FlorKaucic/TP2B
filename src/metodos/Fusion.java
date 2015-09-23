package metodos;

public class Fusion {
	public static <T extends Comparable<T>> T[] ordenarPorFusion(T[] vec) {
		return fusion(vec, 0, vec.length, 0);
	}

	private static <T extends Comparable<T>> T[] fusion(T[] vec, int ini, int fin, int p) {
		int dim = fin - ini;
		
		if (dim > 1) {
			int mitad = ini + (dim / 2);

			fusion(vec, ini, mitad, p + 1);
			fusion(vec, mitad, fin, p + 1);

			@SuppressWarnings("unchecked")
			T[] aux = (T[]) (new Comparable[dim]);
			
			for (int a = 0; a < (mitad - ini); a++)
				aux[a] = vec[a + ini];

			for (int b = 0; b < (fin - mitad); b++)
				aux[b+dim/2] = vec[fin - (b + 1)];

			int i = 0, j = aux.length-1, k = ini;

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
			vec[k] = aux[i];
		}

		return vec;
	}
}