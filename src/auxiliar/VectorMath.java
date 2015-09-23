package auxiliar;

public class VectorMath implements Comparable<VectorMath> {
	double[] vec = null;
	int dim;

	public VectorMath(int dimension) {
		this.dim = dimension;
		this.vec = new double[dimension];
	}

	public VectorMath() {
		this.dim = 0;
		this.vec = null;
	}

	public int getDim() {
		return this.dim;
	}

	public double getValue(int i) {
		return this.vec[i];
	}

	public void setValue(int i, double value) {
		this.vec[i] = value;
	}

	public VectorMath multiplicar(double real) {
		VectorMath aux = new VectorMath(this.dim);
		for (int i = 0; i < this.dim; i++)
			aux.vec[i] = this.vec[i] * real;
		return aux;
	}

	public double normaDos() {
		double norma2 = 0;
		for (int i = 0; i < this.dim; i++)
			norma2 += this.vec[i] * this.vec[i];
		return norma2;
	}

	public VectorMath clone() {
		VectorMath aux = new VectorMath(this.dim);
		for (int i = 0; i < this.dim; i++)
			aux.vec[i] = this.vec[i];
		return aux;
	}

	@Override
	public String toString() {
		StringBuffer cadena = new StringBuffer();
		cadena.append("\n");
		for (int i = 0; i < this.dim; i++) {
			cadena.append(this.vec[i]+"\t");
		}
		cadena.append("\nNorma: "+this.normaDos());
		return cadena.toString();
	}

	@Override
	public int compareTo(VectorMath o) {
		if (this.normaDos() > o.normaDos())
			return 1;
		if (this.normaDos() < o.normaDos())
			return -1;
		return 0;
	}

}