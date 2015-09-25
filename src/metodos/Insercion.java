package metodos;

public class Insercion {
	public static < I extends Comparable <I>> void ordenarPorInsercionSinCentinela(I [] vec)  {
		I aux;
		int j;
		for (int i = 1; i < vec.length; i++)
		{
			aux = vec[i];
			j = i - 1;
			while ( (j >= 0) && (vec[j].compareTo(aux)==1)) //cambie el orden de las condiciones, sino se sale del vector
			{
				vec[j + 1] = vec[j];
				j--;
			}
				vec[j + 1] = aux;
				
		}	
	}
	public static <I extends Comparable <I>> void ordenarPorInsercionConCentinela(I[] vec) {
		I aux;
		int j;
		for (j = 0; j < vec.length-1; j++) {
			if (vec[j].compareTo(vec[j + 1]) > 0) {
				aux = vec[j];
				vec[j] = vec[j + 1];
				vec[j + 1] = aux;
			}
		}
		j = 0;
		for (int i = 1; i < vec.length; i++)
		{
			aux = vec[i];
			j = i - 1;
			while ( j>=0 && vec[j].compareTo(aux)==1 )
			{
				vec[j + 1] = vec[j];
				j--; //si no hago esto, se sale del vector cuando j=0, al hacer la verificacion del while
			}
				vec[j + 1] = aux;
		}	
	}
}
