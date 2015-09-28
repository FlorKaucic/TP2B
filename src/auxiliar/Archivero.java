package auxiliar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;




public class Archivero {

	public Complejo[] leerArchivo(String ruta){
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		Complejo [] com = null;
		
		try{
		String linea;
		archivo = new File(ruta);
		fr = new FileReader(archivo);
		br = new BufferedReader(fr);
		int tam=0;
		if ((linea = br.readLine()) != null)
			tam = Integer.parseInt(linea);
		
		com = new Complejo[tam];
		int c = 0;
		while (c < tam && (linea = br.readLine()) != null) {
			String[] data = linea.split(" ");
			com[c] = new Complejo(Double.parseDouble(data[0]),Double.parseDouble(data[1]));
			c++;
		}
		
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fr != null)
					fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	return com;
}
	
	public boolean escribirArchivo(String vec, int tam, String ruta) {
		FileWriter fw = null;
		PrintWriter pw = null;

		try {
			fw = new FileWriter(ruta);
			pw = new PrintWriter(fw);
			pw.println(tam);
			//for (int i = 0; i < tam; i++)
				//pw.println(vec.getVec()[i].getReal() + " " + vec.getVec()[i].getIma());
			pw.println(vec);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			try {
				if (fw != null)
					fw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return true;
	}
}
