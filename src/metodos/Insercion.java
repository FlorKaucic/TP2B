package metodos;

public class Insercion {
	public static < I extends Comparable <I>> void ordenarPorInsercionSinCentinela(I [] vec)  {
		I aux;
		int j;
		int i;
		for (i = 1; i < vec.length; i++)
		{
			aux = vec[i];
			j = i - 1;
			while ( (vec[j].compareTo(aux)==1) && (j >= 0) )
			{
				vec[j + 1] = vec[j];
				j--;
			}
				vec[j + 1] = aux;
		}	
	}
}
