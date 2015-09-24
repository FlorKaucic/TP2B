package metodos;

public class Insercion {
	public static < I extends Comparable <I>> void ordenarPorInsercionSinCentinela(I [] vec)  {
		I aux;
		int posAux=0;
		int i=0;
		while(i<vec.length)
		{
			aux = vec[i+1];
			for(int j=i;j>0;j--)
				vec[j+1]=vec[j];
			vec[0] = aux;
			i++;
		}
			
	}
}
