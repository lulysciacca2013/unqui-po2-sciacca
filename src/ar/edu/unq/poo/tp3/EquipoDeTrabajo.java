package ar.edu.unq.poo.tp3;

import java.util.ArrayList;

public class EquipoDeTrabajo {
	private String nombreEquipo;
	private ArrayList <PersonaE> personal = new ArrayList<PersonaE>();

	public EquipoDeTrabajo() {
		
	}
	
	public EquipoDeTrabajo(String nombreEquipo,ArrayList<PersonaE> personal ) {
		this.setNombreEquipo(nombreEquipo);
		this.setPersonal( personal);
		this.promedio( personal);
		
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public ArrayList<PersonaE> getPersonal() {
		return personal;
	}

	public void setPersonal(ArrayList<PersonaE> personal) {
		this.personal = personal;
	}
	
	public int promedio(ArrayList<PersonaE> personal) {
		int suma=0;
		
		for (int i=0; i< personal.size(); i++) {
			suma= suma + personal.get(i).getEdad();
			
		}
		
		if (personal.size()!=0) {
			return suma/personal.size();
		}
		
		else {
			return 0;
		}	
		
	}

}
