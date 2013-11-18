package AhorcadoTDD;

import java.io.IOException;

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
		Palabra p = new Palabra("Ingenieria");
		r2 = p.estaLetra(l1);
		System.out.println(r2);
	}

}
