package principal;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class GuardaCursosFichero {

	public static void main(String[] args) {
		String [] cursos = {
				"Java básico",
				"Python para principaiantes",
				"Java EE en Web",
				"JavaScript en Front",
				"POO con Java",
				"Python y Django",
				"Desarrollo Web con ASP.NET",
				"Aplicaciones Web con Python"
		};
		
		//Solicitar por teclado la introduccion de un nombre y guardaremos en 
		//un fichero todos los cursos q contengan el curso
		Scanner scn = new Scanner(System.in);
		System.out.println("Introduce una palabra para buscar ");
		String ruta="C:\\Users\\manana\\Desktop\\BORJA_MANANA\\temp\\resultadoBusqueda.txt";
		try (PrintStream out = new PrintStream(ruta)){
			out.println(buscar(cursos,scn.nextLine()));
			System.out.println("Datos introducidos correctamente");
		}
		catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		

	}
	
	//Función buscar palabra en elementos array
	static String buscar(String [] array,String palabra) {
		//Variable guarda los cursos en los q e encuentre la palabra
		StringBuilder cursos = new StringBuilder();
		for(String curso : array) {
			if(curso.contains(palabra)) {
				cursos.append(curso + ",");
			}
		}
		return cursos.toString();
	}

}
