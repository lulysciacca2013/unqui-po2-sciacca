package ar.edu.unq.poo.tp3;

import java.time.LocalDate;
import java.util.Date;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
	
class PersonaTestCase {
	private Persona per1;
	private Persona per2;
	
	@BeforeEach
	void setUp() throws Exception {
		
		per1= new Persona ("lucrecia", LocalDate.of(1998, 12, 07));
		per2= new Persona ("laura", LocalDate.of(1992, 04, 07));
	}

	@Test
	void testEsEdad() {
		
		int edad = per1.esEdad();
		assertEquals(edad,23);
	}

	@Test
	void testMenorQue() {
		
		assertEquals(true,per1.menorQue(per2));
	}

	
}
