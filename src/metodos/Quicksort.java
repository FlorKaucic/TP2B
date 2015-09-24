package metodos;

public class Quicksort {
	public static < O extends Comparable<O> > void ordenarPorQuicksort(O vec[], int primero, int ultimo){ //aca me copie de dieguito
		int pivot = (ultimo + primero + 1)/2, //aca elijo el elemento del medio como pivot
			i=primero, j=ultimo;
		O aux;

		aux=vec[j];
		vec[j]=vec[pivot];
		vec[pivot]=aux;//cambio el elemento pivot por el ultimo
		j--;

		while(i>j)
		{
			while(vec[i].compareTo(vec[ultimo])<0)//busco un elemento mas grande que el pivot del lado izquierdo
				i++;
			while(vec[j].compareTo(vec[ultimo])>0)//busco un elemento mas chico que el pivot del lado derecho
				j--;

			if(i>=j)//verifico que no se hayan cruzado los indices
			{
				aux=vec[j];
				vec[j]=vec[i];
				vec[i]=aux;
			}
		}

		ordenarPorQuicksort(vec,primero,i-1);
		ordenarPorQuicksort(vec,i+1,ultimo);
		//recurso (programacion avanzada)
	}
}
