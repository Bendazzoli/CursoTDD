package testes;

import static org.junit.Assert.*;
import numerosRomanos.ConversorDeNumeroRomano;

import org.junit.Test;

public class ConversorDeNumeroRomanoTest {

	private int converteNumeroRomano(String numeroRomano) {
		ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
		int numero = romano.converte(numeroRomano);
		return numero;
	}
	
	@Test
	public void deveEntenderOSimboloI() {
		int numero = converteNumeroRomano("I");
		assertEquals(1, numero);
	}
	
	@Test
	public void deveEntenderOSimboloV(){
		int numero = converteNumeroRomano("V");
		assertEquals(5, numero);
	}
	
	@Test
	public void deveEntenderOSimboloX(){
		int numero = converteNumeroRomano("X");
		assertEquals(10, numero);
	}
	
	@Test
	public void deveEntenderOSimboloII(){
		int numero = converteNumeroRomano("II");
		assertEquals(2, numero);
	}
	
	@Test
	public void deveEntenderOSimboloXIII(){
		int numero = converteNumeroRomano("XIII");
		assertEquals(13, numero);
	}
	
	@Test
	public void deveEntenderOSimboloIV(){
		int numero = converteNumeroRomano("IV");
		assertEquals(4, numero);
	}
	
	@Test
	public void deveEntenderOSimboloXXIX(){
		int numero = converteNumeroRomano("XXIX");
		assertEquals(29, numero);
	}
}