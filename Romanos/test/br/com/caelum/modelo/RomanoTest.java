package br.com.caelum.modelo;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RomanoTest {

	private Romano romano;

	@Before
	public void setUp() {
		this.romano = new Romano();

	}

	public int converteParaInteiro(String x) {
		return Integer.parseInt(x);
	}

	@Test(expected = RuntimeException.class)
	public void deveLancarExcepcaoQuandoOnumeroInteiroDadoE0() {

		romano.setNumeroInteiro("0");
		romano.converteInteiroEmRomano();

	}

	@Test
	public void deveConverteInteiroEmRomanoQuandoOInteiroE1() {

		romano.setNumeroInteiro("1");
		romano.converteInteiroEmRomano();
		Assert.assertEquals("I", romano.getNumeroRomano());
	}

	@Test(expected = RuntimeException.class)
	public void deveLancarExcepcaoQuandoOnumeroDadoE1SimboloQueNaoSejaUmNumeroInteiro() {

		romano.setNumeroInteiro("");

		romano.converteInteiroEmRomano();
	}

}
