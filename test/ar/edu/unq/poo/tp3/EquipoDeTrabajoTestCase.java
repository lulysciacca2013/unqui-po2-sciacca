package ar.edu.unq.poo.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquipoDeTrabajoTestCase {
	private EquipoDeTrabajo equipo;
	private ArrayList<PersonaE> perso;
	private PersonaE pers1;
	private PersonaE pers2;
	private PersonaE pers3;
	private PersonaE pers4;
	private PersonaE pers5;
	
	@BeforeEach
	void setUp() throws Exception {
		
		pers1= new PersonaE("Lucia","Perez",10);
		pers2= new PersonaE("Juan","Lopez",10);
		pers3= new PersonaE("Manuel","Paz",10);
		pers4= new PersonaE("Luca","Sans",10);
		pers5= new PersonaE("Jose","Gonzalez",60);
		
		perso= new ArrayList<PersonaE>();
		
		perso.add(pers1);
		perso.add(pers2);
		perso.add(pers3);
		perso.add(pers4);
		perso.add(pers5);
		
		equipo = new EquipoDeTrabajo ("Lucero",perso);
		System.out.println(this.pers5.getApellido());
		
	}

	@Test
	void testPromedio() {
		
		int prome= equipo.promedio(perso);
		assertEquals(prome,20 );
		
		
	}

	
		
}
