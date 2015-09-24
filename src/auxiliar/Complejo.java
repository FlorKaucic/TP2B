package auxiliar;


public class Complejo implements Comparable<Complejo> {
	private double real;
	private double ima;

	public Complejo(double real, double ima) {
		this.real = real;
		this.ima = ima;
	}

	public Complejo() {
		this(0, 0);
	}

	public int compareTo(Complejo c) {
		if (this.modulo() > c.modulo())
			return 1;
		if (this.modulo() < c.modulo())
			return -1;

		if (this.real > c.real)
			return 1;
		if (this.real < c.real)
			return -1;

		if (this.ima > c.ima)
			return 1;
		if (this.ima < c.ima)
			return -1;

		return 0;
	}

	public String toString() {
		// sobreescribo el toString de la clase padre object
		return "real: " + real + " " + "ima: " + " " + ima;
	}

	public double modulo() {
		return Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.ima, 2));
	}

	
	
}
