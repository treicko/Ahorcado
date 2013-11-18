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
	
	@Test
	public void DevuelveFalseSiLaPalabraAIngresarYaSeEncuentraEnElDiccionario()
	{
		Diccionario diccionario = new Diccionario();
		String palabra = "macarron";
		diccionario.AniadirPalabra(palabra);
		assertEquals(false,diccionario.AniadirPalabra(palabra));
	}
}
