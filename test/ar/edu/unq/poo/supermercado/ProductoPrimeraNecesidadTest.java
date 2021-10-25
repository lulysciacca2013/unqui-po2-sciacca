package ar.edu.unq.poo.supermercado;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8, false);
	}
	
	@Test
	public void testCalcularPrecio() {
		leche.calcularPrecio(11);
		assertEquals(7.12, leche.getPrecio());
	}
}

