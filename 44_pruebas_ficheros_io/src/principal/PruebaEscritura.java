package principal;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PruebaEscritura {

	public static void main(String[] args) {
		//Ruta absoluta
		String ruta = "C:\\Users\\manana\\Desktop\\BORJA_MANANA\\temp\\dias.txt";
		//Ruta reativa. En este caso es la carpeta del propio proyecto
		//String ruta = "dias.txt";
		try {
		FileOutputStream fos  =new FileOutputStream(ruta,true);
		//Objeto PrintStream
		PrintStream out = new PrintStream(fos);
		out.println("lunes");
		out.println("martes");
		out.println("miercoles");
		out.println("jueves");
		out.println("viernes");
		System.out.println("Información almacenada en el fichero");
		//Cerrar el objeto
		fos.close();
		out.close();
		}
		catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}

	}

}
