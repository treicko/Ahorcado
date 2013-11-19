package AhorcadoTDD;

public class Pistas {

	public int pistasDisponibles = 4;
	public int pistasPorNivel=pistasDisponibles;
	public int posicionDeLaPista;

	public int incrementarpista(int auxiliarpistas) {
		// TODO Auto-generated method stub
					return auxiliarpistas+1;
	}

	public char BuscarLetra(int a,String palabra) {
		char letra=' ';
		int cont=0;
		while(cont<palabra.length()){
			if(palabra.charAt(cont)==palabra.charAt(a))
				letra=palabra.charAt(a);
			cont++;
		}
		return letra;
		
	}

	public String mensajePistasMedio() {
		// TODO Auto-generated method stub
		String resp = "cantidad de pistas es de 4";
		return  resp;
	}
	public String mensajePistasAvanzado() {
		// TODO Auto-generated method stub
		String resp = "cantidad de pistas es de 2";
		return  resp;
	}
	public String mensajePistasBasico() {
		// TODO Auto-generated method stub
		String resp = "cantidad de pistas es de 6";
		return  resp;
	}
	

}
