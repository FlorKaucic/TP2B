package tests;
import metodos.Shell;

public class TestShell {

	public static void main(String[] args) {
		Integer [] v = new Integer[6];
		v[0]=5;
		v[1]=6;
		v[2]=9;
		v[3]=3;
		v[4]=1;
		v[5]=4;
		
		Shell.ordenarPorShell(v);
		for (Integer i :v)
			System.out.println(i);
		
	}

}
