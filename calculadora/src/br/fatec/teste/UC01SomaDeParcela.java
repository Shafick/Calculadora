package br.fatec.teste;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.fatec.servico.Calculadora;

public class UC01SomaDeParcela {

	static Calculadora _calc;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		_calc = new Calculadora();
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
	}

	@Test
	public void CT01UC01SomaParcelaComSucesso() 
	{
		assertEquals("Resulta", 5, _calc.soma("3,2"));
	}
	
	@Test (expected = NumberFormatException.class)
	public void CT02UC01SomaDeParcelasComDadosInvalidos()
	{
		assertEquals("Resulta", 5, _calc.soma("x,2"));		
	}

}
