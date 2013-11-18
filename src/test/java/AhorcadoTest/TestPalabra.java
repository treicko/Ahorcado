package AhorcadoTest;

import static org.junit.Assert.*;

import org.junit.Test;

import AhorcadoTDD.Letra;
import AhorcadoTDD.Palabra;

public class TestPalabra {
//ojala suba
	@Test
	public void devuelveTrueSiLaLetraSeEncuentraEnElVector() {
		Palabra p = new Palabra("Ingenieria");
		Letra l = new Letra('i');
		assertEquals(true,p.estaLetra(l));
	}

}
