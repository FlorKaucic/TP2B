package metodos;

public class Shell {
	public static  < O extends Comparable<O> > void ordenarPorShell(O [] matriz) {
		int salto, i, f;
		O aux;
		for (salto = matriz.length / 2; salto != 0; salto /= 2) {
			f = 1;
			while (f == 1) { // Mientras se intercambie algún elemento
				f = 0;
				for (i = salto; i < matriz.length; i++) // se da una pasada
					if ((matriz[i - salto]).compareTo(matriz[i]) >0) { // y si están desordenados
						aux = matriz[i]; // se reordenan
						matriz[i] = matriz[i - salto];
						matriz[i - salto] = aux;
						f = 1; // y se marca como cambio.
					}
			}
		}
	}
}
