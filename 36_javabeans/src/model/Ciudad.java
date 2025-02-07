package model;

public class Ciudad {
	private String nombre;
	private int poblacion;
	private double temperatura;
	
	//Constructor
	public Ciudad (String nombre,int poblacion,double temperatura) {
		this.nombre = nombre;
		this.poblacion = poblacion;
		this.temperatura = temperatura;
	}
	//Constructor vacio
	public Ciudad() {
		
	}
	
	//Constructo(sobrecarga de constructores)
	public Ciudad(String nombre,int poblacion) {
		this.nombre = nombre;
		this.poblacion = poblacion;
	}
	
	//gettres y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}
	public double getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	
	

}
