package AhorcadoTDD;

import java.util.ArrayList;

public class Juego {
   
	//Vector de letras jugadas por el usuario
	private ArrayList _JUGADAS;
	
	private Palabra _ACTUAL;
	
	public void iniciarJuego(String palabra)
	{
		//recibo una palabra al azar del diccionario
		_ACTUAL = (new Palabra(palabra));
		
		//inicializar el vector de letras jugadas
		_JUGADAS = new ArrayList();
	}
	
	public boolean jugarLetra(Letra letra)
	{
		//agregar la letra a las jugadas
		_JUGADAS.add(letra);
		
		//revisar si la letra pertenece a la palabra
		boolean pertenece = _ACTUAL.estaLetra(letra);
		
		//Si la letra no pertenece a la palabra 
		if(!pertenece)
		{
			return pertenece;
		}
		else{
			return pertenece;
		}
	}
	
	public Palabra darPalabraActual()
	{
		return _ACTUAL;
	}
	
	public ArrayList darJugadas()
	{
		return _JUGADAS;
	}
	
	public ArrayList darOcurrencias()
	{
		return _ACTUAL.darOcurrencias(_JUGADAS);
	}
	
}
