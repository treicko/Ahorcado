package AhorcadoTest;

import static org.junit.Assert.*;

import org.junit.Test;

import AhorcadoTDD.Letra;
import AhorcadoTDD.Palabra;

public class TestPalabra {
	
	@Test
	public void devuelveTrueSiLaLetraSeEncuentraEnElVector() {
		Palabra p = new Palabra("Ingenieria");
		Letra l = new Letra('i');
		assertEquals(true,p.estaLetra(l));
	}
	
	@Test
	public void DevuelveLaMismaLongitudDeLaPalabraMostradaConEspacio()
	{
		String palabra = "arbol";
		String esperado = "_ _ _ _ _";
		Palabra p = new Palabra();
		assertTrue(esperado.equals(p.OcultarPalabra(palabra)));
	}
	
	@Test
	public void DadaUnaLetraDeVuelveTrueSiEstaLaLetraEnLaPalabra()
	{
		Palabra p = new Palabra();
		String palabra = "arbol";
		String palabra2 = "casa";
		char c = 'r';
		char c2 = 'x';
		assertEquals(false, p.EstaLetraEnPalabra(palabra2, c2));
		assertEquals(true, p.EstaLetraEnPalabra(palabra, c));
	}

}
