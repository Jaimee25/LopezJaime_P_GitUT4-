package Lopez_Jaime_JUnit_Calc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

	@Test
	public void testSumaBien() {
		Calculadora calc = new Calculadora();
		assertEquals (6,calc.suma(3, 3), 0);
	}
	
	@Test
	public void testSumaMal() {
		Calculadora calc = new Calculadora();
		assertEquals (5,calc.suma(3, 3), 0);
	}
	
	@Test
	public void testCaracteresBien() {
		Calculadora calc = new Calculadora();
		//Metodo assertTrue
		assertTrue(calc.contieneCaracter("@@%"));
	}
	
	@Test
	public void testCaracteresMal() {
		Calculadora calc = new Calculadora();
		//Metodo assertTrue
		assertTrue(calc.contieneCaracter("LSD"));
	}

}
