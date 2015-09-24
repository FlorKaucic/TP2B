package metodos;

public class Seleccion {
	public static <T extends Comparable<T>> void ordenarPorSeleccion(T[] vec) {
		int minIndex;
		T aux;
		for (int i = 0; i < vec.length - 1; i++) {
			minIndex = i;
			for (int j = i + 1; j < vec.length; j++)
				if (vec[j].compareTo(vec[minIndex])<0)
					minIndex = j;
			if (minIndex != i) {
				aux = vec[i];
				vec[i] = vec[minIndex];
				vec[minIndex] = aux;
			}
		}
	}
}
