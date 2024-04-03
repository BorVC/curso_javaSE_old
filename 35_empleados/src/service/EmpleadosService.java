package service;

import java.util.Collection;
import java.util.HashMap;

public class EmpleadosService {
	//HashMap
	HashMap<Integer,String>empleados = new HashMap<Integer,String>();
	
	//Métodos
	//Nuevo empleado
	public boolean  nuevo(int codigo,String empleado ) {
		//variable boolean en caso de no poder guardar al empleado
		if(!empleados.containsKey(empleado)) {
		empleados.put(codigo, empleado);
		return true;
		}
		return false;
	}
	
	//Buscar empleado
	public String buscar(int codigo) {
		//Variable guarda nombre del empelado
		String empleado = "";
		empleados.get(codigo);
		return empleado;
	}
	
	//Eliminar empleado
	public String eliminar(int clave, String valor) {	
		return empleados.remove(clave);
	}
	
	//Mostrar nombre todos
	public String [] mostrarEmpleados() {
		Collection <String> datos = empleados.values();
		return datos.toArray(new String[0]);//Se le pasa un array vacio q rellenará con los datos
	}
	

}
