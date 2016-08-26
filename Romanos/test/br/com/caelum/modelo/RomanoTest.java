package br.com.caelum.modelo;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RomanoTest {

	private Romano romano;

	@Before
	public void setUp(){
		this.romano=new Romano();
		
	}
	
	
	@Test(expected=RuntimeException.class)
	public void naoDeveAceitarConverterParaRomanoSemNenhumInteiroDaodo() {
		
	
		
		romano.setNumeroInteiro(0);

		romano.converteInteiroEmRomano();
		
	}
	
	@Test
	public void converteInteiroEmRomanoTestQuandoOInteiroE1() {

		romano.setNumeroInteiro(1);
		romano.converteInteiroEmRomano();
		Assert.assertEquals("I", romano.getNumeroRomano());
	}
	


	
	

}
