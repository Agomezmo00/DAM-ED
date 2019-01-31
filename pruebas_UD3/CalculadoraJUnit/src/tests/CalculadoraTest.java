package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import code.Calculadora;

public class CalculadoraTest {

	@Test
	public void testSuma() {
		Calculadora cal = new Calculadora(4, 5);
		int resultado = cal.suma();
		assertEquals(9, resultado);
		
	}

	@Test
	public void testResta() {
		fail("Not yet implemented");
	}

	@Test
	public void testProducto() {
		fail("Not yet implemented");
	}

	@Test
	public void testDivision() {
		fail("Not yet implemented");
	}

}
