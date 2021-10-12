package ar.edu.unq.poo.tp3;

import java.time.LocalDate;
import java.util.Date;

public class Persona {
	private String nombre; 
	private LocalDate fechaNacimiento; // como es LocalDate se debe cargar fecha -->  LocalDate.of(yyyy,MM,dd)
	
	
    public Persona() {
		
	}
    //static Persona p = new Persona("lucrecia", LocalDate.of(1998, 12, 07));
    //static Persona per= new Persona("lucrecia", LocalDate.of(1992, 04, 07));
    
	
	public Persona(String nombre,LocalDate fechaNacimiento ) { //como es LocalDate se debe cargar fecha -->  LocalDate.of(yyyy,MM,dd)
		this.setNombre(nombre);
		this.setFechaNacimiento(fechaNacimiento);
		this.esEdad();
		
	}
	
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}



	public int esEdad() {
		
		
		int edad;
        
	    LocalDate hoy = LocalDate.now() ; 
	    
	    edad = hoy.getYear()-this.fechaNacimiento.getYear();
	    		
	    return edad;
	    
	}
	
	public boolean menorQue(Persona persona) {
		if(this.esEdad()< persona.esEdad()) {
			return true;
		}
		return false;
		
	}
	
	/*public static void main(String[] args) {
		
		 System.out.println(p.menorQue(per));
	}*/
	
}
