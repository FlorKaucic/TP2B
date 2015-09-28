package metodos;

public class Insercion {
	public static <I extends Comparable<I>> void ordenarPorInsercionSinCentinela(I[] vec) {
		I aux;
		int j;
		for (int i = 1; i < vec.length; i++) {
			aux = vec[i];
			j = i - 1;
			while ((j >= 0) && (vec[j].compareTo(aux) == 1)) 
			{
				vec[j + 1] = vec[j];
				j--;
			}
			vec[j + 1] = aux;

		}
	}

	public static <I extends Comparable<I>> void ordenarPorInsercionConCentinela(I[] vec) {
		I aux;
		int j=0, min=0;
		
		for (j = 0; j < vec.length; j++)
			if (vec[j].compareTo(vec[min]) < 0)
				min=j;
		
		aux = vec[0];
		vec[0] = vec[min];
		vec[min] = aux;
		
		//j=0;
		for (int i = 1; i < vec.length; i++) {
			aux = vec[i];
			j = i - 1;
			while (vec[j].compareTo(aux) == 1) {
				vec[j + 1] = vec[j];
				j--;
			}
			vec[j + 1] = aux;
		}
	}
}
