package metodos;

public class Quicksort {
	public static < O extends Comparable<O> > void ordenarPorQuicksort(O vec[], int izq, int der){ //aca me copie de dieguito
		
		O pivote = vec[izq], // tomamos primer elemento como pivote
				aux;
		int i = izq; // i realiza la búsqueda de izquierda a derecha
		int j = der; // j realiza la búsqueda de derecha a izquierda
		

		while (i < j) { // mientras no se crucen las búsquedas
			while (vec[i].compareTo(pivote) < 0 && i < j)
				i++; // busca elemento mayor que pivote
			while (vec[j].compareTo(pivote) >= 0)
				j--; // busca elemento menor que pivote
			if (i < j) { // si no se han cruzado
				aux = vec[i]; // los intercambia
				vec[i] = vec[j];
				vec[j] = aux;
			}
		}
		vec[izq] = vec[j]; // se coloca el pivote en su lugar de forma que tendremos
		vec[j] = pivote; // los menores a su izquierda y los mayores a su derecha
		if (izq < j - 1)
			ordenarPorQuicksort(vec, izq, j - 1); // ordenamos subarray izquierdo
		if (j + 1 < der)
			ordenarPorQuicksort(vec, j + 1, der); // ordenamos subarray derecho



		
	}
}
