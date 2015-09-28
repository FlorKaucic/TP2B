package main;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import auxiliar.Complejo;
import metodos.*;
import auxiliar.Archivero;

public class Main {

	public static void main(String[] args) {
		// BORRAR ESTO DESPUES:
		// Para la doc coordinamos con Diego en usar CANT = 500, 1000, 2000, 3000, 4000, 5000
		// Y hacer en el grafico una curva para cada caso de entrada (ordenada, aleatoria, en orden inverso)
		// Para testear el tiempo solo tienen que ir cambiando el valor de CANT
		// y comentar todos los sorts que no sean el que testean
		
		// CAMBIAR ESTE VALOR
		int cant = 5000;
		
		Date tIni, tFin;
				
		Complejo [] c = new Complejo[cant];
		
		Archivero arch = new Archivero();
		

		// Pueden ir comentando de a partes para evaluar un solo caso
		// Y comentar/descomentar los prints
		
		c = arch.leerArchivo("Lotes//Inversa"+cant+".in");
		//c = arch.leerArchivo("Lotes//Ordenada"+cant+".in");
		//c = arch.leerArchivo("Lotes//Random"+cant+".in");
		
		
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
		Shell.ordenarPorShell(c);
//		Quicksort.ordenarPorQuickSort(c);
//		Insercion.ordenarPorInsercionConCentinela(c);
//		Insercion.ordenarPorInsercionSinCentinela(c);
//		Seleccion.ordenarPorSeleccion(c);
//		Burbujeo.ordenarPorBurbujeo(c);
		tFin = Calendar.getInstance().getTime();
		
		System.out.println("\nOrdenados:");
		for (int i = 0; i < c.length; i++)
			System.out.println(i + ": " + c[i] + " Modulo:"+c[i].modulo());	
		System.out.println("\n\nTiempo de resolucion: " + (tFin.getTime() - tIni.getTime()));
		
	}
}

