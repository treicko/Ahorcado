package AhorcadoTDD;

import java.io.IOException;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		Bienvenida b = new Bienvenida();
		b.bienvenida();
		
		boolean r;
		char ch;
		
		System.out.print("Enter a character: ");

		try {
		   ch = (char) System.in.read();	
		   r=b.esEnter(ch);
		   System.out.print(r);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		boolean r1;
		
		Letra l1 = new Letra('a');
		Letra l2 = new Letra('B');
		
		r1 = l1.esIgual(l2);
		System.out.println(r1);
		
		boolean r2;
		Palabra p = new Palabra("sis");
		r2 = p.estaLetra(l1);
		System.out.println(r2);
		
		//Palabra j = new Palabra("s");
		ArrayList jugadas = new ArrayList();
		//jugadas = j.getLetras();
		jugadas.add("s");
		ArrayList palabra = new ArrayList();
		palabra = p.darOcurrencias();
		//System.out.println(palabra);
		int cont=0;
		while(cont < palabra.size())
		{
		    Letra l = (Letra)palabra.get(cont);
		    System.out.println(l.getLetra());
		    cont++;
		}
	}

}
