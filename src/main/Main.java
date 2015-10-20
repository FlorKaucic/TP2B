package main;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import auxiliar.Complejo;
import metodos.*;
import auxiliar.Archivero;

public class Main {

	public static void main(String[] args) {
				
		// CAMBIAR ESTE VALOR
		int cant = 1000;
		
		Date tIni, tFin;
				
		Complejo [] c = new Complejo[cant];
		
		Archivero arch = new Archivero();
		

	
		
		//c = arch.leerArchivo("Lotes//Inversa"+cant+".in");
		//c = arch.leerArchivo("Lotes//Ordenada"+cant+".in");
		c = arch.leerArchivo("Lotes//Random"+cant+".in");
		
		
	// Nuevo caso
	
	/*System.out.println("\n\n\nComplejos ordenados:");
		for (int i = 0; i < cant; i++){
			c[i]=new Complejo(i, i);
			System.out.println(c[i] + " Modulo:"+c[i].modulo());
		}*/

		// Nuevo caso
	/*
		System.out.println("\n\n\nComplejos en orden inverso:");
		for (int i = 0; i < cant; i++){
			c[i]=new Complejo(cant-i, cant-i);
			System.out.println(c[i] + " Modulo:"+c[i].modulo());
		}
*/
		// Nuevo caso
		
		/*
		Random randomDouble = new Random();
		
		System.out.println("\n\n\nComplejos random:");
		for (int i = 0; i < cant; i++){
			c[i]=new Complejo(randomDouble.nextDouble() * 20 - 10, randomDouble.nextDouble() * 20 - 10);
		System.out.println(c[i] + " Modulo:"+c[i].modulo());
		}*/
		
		
		tIni = Calendar.getInstance().getTime();
//		Fusion.ordenarPorFusion(c);
//		Shell.ordenarPorShell(c);
		Quicksort.ordenarPorQuicksort(c, 0, cant-1);
//		Insercion.ordenarPorInsercionConCentinela(c);
//		Insercion.ordenarPorInsercionSinCentinela(c);
//		Seleccion.ordenarPorSeleccion(c);
//		Burbujeo.ordenarPorBurbujeo(c);
		tFin = Calendar.getInstance().getTime();
		
		
		
		//arch.escribirArchivo(Complejo.getVector(c), cant, "Salidas//Ordenada"+cant+".out");
		//arch.escribirArchivo(Complejo.getVector(c), cant, "Salidas//Inversa"+cant+".out");
		arch.escribirArchivo(Complejo.getVector(c), cant, "Salidas//Random"+cant+".out");
		
		System.out.println("\nOrdenados:");
		for (int i = 0; i < c.length; i++)
			System.out.println(i + ": " + c[i] + " Modulo:"+c[i].modulo());	
		System.out.println("\n\nTiempo de resolucion: " + (tFin.getTime() - tIni.getTime()));
		
		
		
	}
}

