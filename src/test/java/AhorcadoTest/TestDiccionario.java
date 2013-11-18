package AhorcadoTest;

import static org.junit.Assert.*;

import org.junit.Test;

import AhorcadoTDD.Diccionario;

public class TestDiccionario {

	@Test
	public void AniadirLetraAUnArchivoVacio()
	{
		Diccionario diccionario = new Diccionario();
		assertEquals(true,diccionario.AniadirPalabra("arbol"));
	}
	

}
