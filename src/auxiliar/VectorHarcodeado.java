package auxiliar;

import java.util.Random;
import metodos.Seleccion;

public class VectorHarcodeado {
	Complejo[] vector;
	int dim;

	public VectorHarcodeado(int n) {
		this.vector = new Complejo[n];
		dim = n;
		Random randomDouble = new Random();
		for (int i = 0; i < n; i++) {
			vector[i] = new Complejo(randomDouble.nextDouble() * 20 - 10, randomDouble.nextDouble() * 20 - 10);
		}
	}
	
	public Complejo [] getVec(){
		return vector;
	}

	public void ordenar(){
		Seleccion.ordenarPorSeleccion(vector);
	}
	
	public void invertir(){
		Complejo aux = new Complejo();
		int cant = vector.length;
		for(int i = 0; i<cant;i++){
			aux.clone(vector[i]);
			vector[i].clone(vector[cant-i]);
			vector[cant-i].clone(aux);
		}
			
	}
	public String getVectorOrdenado() {
		Seleccion.ordenarPorSeleccion(vector);
		StringBuffer cadena = new StringBuffer();
		//cadena.append("Complejo[] vector1 = new Complejo[" + dim + "];");
		for (int i = 0; i < dim; i++) {
			cadena.append(vector[i].getReal() + " " + vector[i].getIma()+"\n");
		}
		return cadena.toString();
	}

	public String getVectorOrdenInverso() {
		StringBuffer cadena = new StringBuffer();
		//cadena.append("Complejo[] vector2 = new Complejo[" + dim + "];");
		for (int i = dim - 1; i >= 0; i--) {
			cadena.append(vector[i].getReal() + " " + vector[i].getIma()+"\n");
		}
		return cadena.toString();
	}

	public String getVectorOrdenRandom() {
		StringBuffer cadena = new StringBuffer();
		//cadena.append("Complejo[] vector3 = new Complejo[" + dim + "];");
		for (int i = 0; i < dim; i++) {
			cadena.append(vector[i].getReal() + " " + vector[i].getIma()+"\n");
		}
		return cadena.toString();
	}
}
