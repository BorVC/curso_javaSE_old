package principal;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PruebaLectura {

	public static void main(String[] args) {
		String ruta="C:\\Users\\manana\\Desktop\\BORJA_MANANA\\temp\\dias.txt";
		try (FileReader fr = new FileReader(ruta);
				BufferedReader bf = new BufferedReader(fr);){
			//Mostrar todo lo qu hay en el arhivo
			/*//Variable
			String linea = bf.readLine();
			while(linea != null) {
				System.out.println(linea);
				linea  = bf.readLine();
			}*/
			//Abreviado
			//Variable
			String linea;
			while((linea = bf.readLine())!= null){
				System.out.println(linea);
			}
		}catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}

	}

}
