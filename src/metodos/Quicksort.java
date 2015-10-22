package metodos;

public class Quicksort {
	public static <O extends Comparable<O>> void ordenarPorQuicksort(O vec[], int primero, int ultimo) {
		
		O pivote = vec[(primero+ultimo)/2]; // tomamos primer elemento como pivote
		int i = primero; // i realiza la búsqueda de izquierda a derecha
		int j = ultimo; // j realiza la búsqueda de derecha a izquierda
		O aux;

		while (i < j) { // mientras no se crucen las búsquedas
			while (vec[i].compareTo(pivote) <= 0 && i < j)
				i++; // busca elemento mayor que pivote
			while (vec[j].compareTo(pivote) > 0)
				j--; // busca elemento menor que pivote
			if (i < j) { // si no se han cruzado
				aux = vec[i]; // los intercambia
				vec[i] = vec[j];
				vec[j] = aux;
			}
		}
		vec[primero] = vec[j]; // se coloca el pivote en su lugar de forma que tendremos
		vec[j] = pivote; // los menores a su izquierda y los mayores a su derecha
		if (primero < j - 1)
			ordenarPorQuicksort(vec, primero, j - 1); // ordenamos subarray izquierdo
		if (j + 1 < ultimo)
			ordenarPorQuicksort(vec, j + 1, ultimo); // ordenamos subarray derecho	
	}
}
