package br.com.caelum.modelo;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class RomanoTest {

	
	
	@Test(expected=RuntimeException.class)
	public void naoDeveAceitarConverterParaRomanoSemNenhumInteiroDaodo() {
		
	
		Romano romano= new Romano();
		
		romano.setNumeroInteiro(0);

		romano.converteInteiroEmRomano();
		
	}
	
	
	

	
	
/*	
	@Test
	public void converteInteiroEmRomanoTestQuandoOInteiroE1() {
		
		Romano romano= new Romano();
		
		romano.setNumeroInteiro(1);
Assert.assertEquals("I", romano.converteInteiroEmRomano() );		
	}
	*/

	
	
	

}
