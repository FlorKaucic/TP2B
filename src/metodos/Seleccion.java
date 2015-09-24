package metodos;

public class Seleccion {
	public static <T extends Comparable<T>> void ordenarPorSeleccion(T[] vec) {
		int mini;
		T aux;
		for (int i = 0; i < vec.length - 1; i++) {
			// Establezco que el mas chico es el primero de este ciclo, guardo el indice
			mini = i;
			// Lo comparo con todos, si uno es mas chico, guardo el indice
			for (int j = i + 1; j < vec.length; j++)
				if (vec[j].compareTo(vec[mini])<0)
					mini = j;
			// Si el indice es diferente al primero, los intercambio
			if (mini != i) {
				aux = vec[i];
				vec[i] = vec[mini];
				vec[mini] = aux;
			}
		}
	}
}
