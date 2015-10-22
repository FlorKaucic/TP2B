package metodos;

public class Burbujeo {
	public static < O extends Comparable <O>> void ordenarPorBurbujeo(O [] vec) {
		O aux;
		int f=1, i=0;
		while(i < vec.length && f==1) {
				f = 0;
			for (int j = 0; j < vec.length-1; j++) {
				if (vec[j].compareTo(vec[j + 1]) > 0) {
					aux = vec[j];
					vec[j] = vec[j + 1];
					vec[j + 1] = aux;
					f=1;
				}
			}

	}
}
	
	
}
