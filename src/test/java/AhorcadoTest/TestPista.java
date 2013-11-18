package AhorcadoTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPista {

	public class TestPistas {

		@Test// pistas disponibles tienen que estar en la clase juego cuando creemos un nivel deberiamos crear un juego con los parametros
		public void CantidaPistasBasico() {
			int pistasDisponibles=6;
			int pistasUsadas=6;
			assertEquals(pistasDisponibles,pistasUsadas);
		}
		@Test
		public void CantidadPistasMedio() {
			int pistasDisponibles=4;
			int pistasUsadas=4;
			assertEquals(pistasDisponibles,pistasUsadas);
		}
		@Test
		public void CantidadPistasAvanzado() {
			int pistasDisponibles=2;
			int pistasUsadas=2;
			assertEquals(pistasDisponibles,pistasUsadas);
		}
		@Test
		public void mostrarCantidadPistas(){
			String mensaje="Cantidad de pistas diponibles:"+5;
			assertEquals(mensaje,"Cantidad de pistas diponibles:"+5);
		}
		@Test
		public void mostrarpistaIncrementada()
		{
			int auxiliarpistas=6;
			String mensaje="Cantidad de pistas diponibles:"+7;
			assertEquals(mensaje,"Cantidad de pistas diponibles:"+incrementarpista(auxiliarpistas));
		}
		@Test
		public void mostrarDescripcionlvl1()
		{
			int pistasDisponibles=4;
			String mensaje="En este nivel tienes"+pistasDisponibles+" fallos o pistas ="+pistasDisponibles+"cada ves que uses una pista se descontara un fallo";
			System.out.print(mensaje);
			assertEquals(mensaje,"En este nivel tienes4 fallos o pistas =4cada ves que uses una pista se descontara un fallo");
		}
		private int incrementarpista(int auxiliarpistas) {
			
			// TODO Auto-generated method stub
			return auxiliarpistas+1;
		}
	}

}
