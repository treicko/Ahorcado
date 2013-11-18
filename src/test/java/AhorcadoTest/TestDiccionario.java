package AhorcadoTest;

import static org.junit.Assert.*;

import org.junit.Test;

import AhorcadoTDD.Diccionario;

public class TestDiccionario {

	@Test
	public void MensajeDeErrorSiElDiccionarioNoTieneNingunaPalabra()
	{
		Diccionario diccionario = new Diccionario();
		assertEquals("vacio",diccionario.LeerPalabra());
	}

}
