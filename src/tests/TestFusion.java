package tests;

import metodos.Fusion;

public class TestFusion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub}				
		Integer[] enteros = { 3, 1, 4, 2, 8, 0, 5, 7, 6, 9, 5, 3};
		enteros = Fusion.ordenarPorFusion(enteros);
		for (int i = 0; i < enteros.length; i++)
			System.out.println(i + ": " + enteros[i]);	
	}

}
