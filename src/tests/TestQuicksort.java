package tests;

import java.util.Random;

import auxiliar.Complejo;
import metodos.Quicksort;


public class TestQuicksort {

	public static void main(String[] args) {
		int cant = 10;
		Complejo [] c = new Complejo[cant];
		Random randomDouble = new Random();
			/*	
		for (int i = 0; i < cant; i++){
			c[i]=new Complejo(randomDouble.nextDouble() * 20 - 10, randomDouble.nextDouble() * 20 - 10);
			System.out.println(c[i]);
		}*/
		/*for (int i = 0; i < cant; i++){
			c[i]=new Complejo(i, i);
			System.out.println(c[i]);
		}*/
		for (int i = 0; i < cant; i++){
			c[i]=new Complejo(cant-i, cant-i);
			System.out.println(c[i]);
		}
		long tIni = System.currentTimeMillis();
		
		Quicksort.ordenarPorQuicksort(c, 0, cant-1);
		
		long tFin = System.currentTimeMillis();
		
		System.out.println("Vector ordenado:");
		for (Complejo com :c)
			System.out.println(com + "\t" + com.modulo());
		System.out.println("Tiempo de resolucion para el vector: " + (tFin - tIni));
	}

	}


