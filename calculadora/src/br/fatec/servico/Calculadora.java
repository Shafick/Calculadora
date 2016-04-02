package br.fatec.servico;

public class Calculadora {

	public int soma(String input)
	{
		String[] vetorNumeros = input.split(",");
		
		int resultado = 0;
		
		for (String string : vetorNumeros) {
			resultado += Integer.parseInt(string);
		}		
		
		return resultado;
		
	}
	
}
