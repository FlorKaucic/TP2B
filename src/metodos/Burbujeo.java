package metodos;

public class Burbujeo {
	public static < O extends Comparable <O>> void ordenarPorBurbujeo(O [] vec) {
		O aux;
		for (int i = 0; i < vec.length; i++) {

			for (int j = 0; j < vec.length-1; j++) {
				if (vec[j].compareTo(vec[j + 1]) > 0) {
					aux = vec[j];
					vec[j] = vec[j + 1];
					vec[j + 1] = aux;
				}
			}

	}
}
}
