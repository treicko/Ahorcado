package AhorcadoTDD;

import java.io.FileWriter;
import java.io.PrintWriter;

public class Diccionario {
	
	public Boolean AniadirPalabra(String palabra) {
		
		FileWriter fichero = null;
        PrintWriter pw = null;
        boolean resp = false;
        try
        {
            fichero = new FileWriter("diccionario.txt");
            pw = new PrintWriter(fichero);
            pw.println(palabra);
            resp = true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
		
		return resp;
	}
}

