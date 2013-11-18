package AhorcadoTest;

import static org.junit.Assert.*;

import org.junit.Test;

import AhorcadoTDD.Diccionario;

public class TestDiccionario {

	@Test
	public void AniadirLetraAUnArchivoVacio()
	{
		Diccionario diccionario = new Diccionario();
		assertEquals(true,diccionario.AniadirPalabra("papayon"));
	}
	
	@Test
	public void AniadirLetraAlFinalDeUnArchivo()
	{
		Diccionario diccionario = new Diccionario();
		String palabra = "chuleta";
		diccionario.AniadirPalabra(palabra);
		assertEquals(palabra,diccionario.LeerUltimaPalabraDelDiccionario());
	}
	
}
