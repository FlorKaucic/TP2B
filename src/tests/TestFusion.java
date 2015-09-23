package tests;

import metodos.Fusion;

public class TestFusion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] vector = { 1, 2, 3 };
		Integer[] nuevo = Fusion.ordenarPorFusion(vector);
		for (int i = 0; i < nuevo.length; i++) 
			System.out.println(i+": "+nuevo[i]);
	}

}
