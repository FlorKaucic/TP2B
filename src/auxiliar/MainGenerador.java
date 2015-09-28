package auxiliar;

public class MainGenerador {

	public static void main(String[] args) {
		int n = 500; // aca le cambian el valor para los distintos n que midan
		VectorHarcodeado vec = new VectorHarcodeado(n);
		Archivero archRandom = new Archivero();
		
		archRandom.escribirArchivo(vec.getVectorOrdenRandom(), n, "Lotes//Random"+n+".in");
		archRandom.escribirArchivo(vec.getVectorOrdenado(), n, "Lotes//Ordenada"+n+".in");
		archRandom.escribirArchivo(vec.getVectorOrdenInverso(), n, "Lotes//Inversa"+n+".in");
		
		
		//vec.ordenar();
		//archRandom.escribirArchivo(vec, n, "SalidaOrdenada.in");
		
		//vec.invertir();
		//archRandom.escribirArchivo(vec, n, "SalidaInversa.in");
		
		
		
		
	//	System.out.println(vec.getVectorOrdenRandom());
		//System.out.println(vec.getVectorOrdenado());
		//System.out.println(vec.getVectorOrdenInverso());

	}

}
