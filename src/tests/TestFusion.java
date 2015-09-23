package tests;

import java.util.Random;

import auxiliar.Complejo;
import metodos.Fusion;

public class TestFusion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub}				
		Integer[] enteros = { 3, 1, 4, 2, 8, 0, 5, 7, 6, 9, 5, 3};
		Fusion.ordenarPorFusion(enteros);
		for (int i = 0; i < enteros.length; i++)
			System.out.println(i + ": " + enteros[i]);	
		
		int cant = 1500;
		
		
		Complejo [] c = new Complejo[cant];
		Random randomDouble = new Random();
				
		System.out.println("Complejos random");
		for (int i = 0; i < cant; i++){
			c[i]=new Complejo(randomDouble.nextDouble() * 20 - 10, randomDouble.nextDouble() * 20 - 10);
			System.out.println(c[i] + " Modulo:"+c[i].modulo());
		}
		Fusion.ordenarPorFusion(c);
		System.out.println("Ordenados");
		for (int i = 0; i < c.length; i++)
			System.out.println(i + ": " + c[i] + " Modulo:"+c[i].modulo());	
		
		
		
		System.out.println("Complejos i i");
		for (int i = 0; i < cant; i++){
			c[i]=new Complejo(i, i);
			System.out.println(c[i] + " Modulo:"+c[i].modulo());
		}
		Fusion.ordenarPorFusion(c);
		System.out.println("Ordenados");
		for (int i = 0; i < c.length; i++)
			System.out.println(i + ": " + c[i] + " Modulo:"+c[i].modulo());	
		
		

		System.out.println("Complejos i i al reves");
		for (int i = 0; i < cant; i++){
			c[i]=new Complejo(cant-i, cant-i);
			System.out.println(c[i] + " Modulo:"+c[i].modulo());
		}
		Fusion.ordenarPorFusion(c);
		System.out.println("Ordenados");
		for (int i = 0; i < c.length; i++)
			System.out.println(i + ": " + c[i] + " Modulo:"+c[i].modulo());	
		
	}

}
