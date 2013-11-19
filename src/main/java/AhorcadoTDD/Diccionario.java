package AhorcadoTDD;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Diccionario {
	
	public Diccionario()
	{
		
	}
	
	public Boolean AniadirPalabra(String palabra) {
		
		FileWriter fichero = null;
        PrintWriter pw = null;
	      
        boolean resp = false;
        try
        {
            if(!BuscarPalabraEnDiccionario(palabra))
            {
            	fichero = new FileWriter("diccionario.txt", true);
            	pw = new PrintWriter(fichero);
                pw.println(palabra.toLowerCase());
                resp = true;
            }
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

	private boolean BuscarPalabraEnDiccionario(String palabra) {
		
	  File archivo = null;
      FileReader fr = null;
      BufferedReader br = null; 
      boolean ExistePalabra = false;
 
      try 
      {
         archivo = new File ("diccionario.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
         String linea = "";
         
         while((linea = br.readLine())!=null)
        	 if(palabra.toLowerCase().equals(linea))
        	 {
        		 ExistePalabra = true;
        	 }
      }catch (Exception e) {
          e.printStackTrace();
      } finally {
         try {
         if (null != fr)
        	 fr.close();
         } catch (Exception e2) {
            e2.printStackTrace();
         }
      }
	  return ExistePalabra;
	}

	public String LeerUltimaPalabraDelDiccionario() {
		
		  File archivo = null;
	      FileReader fr = null;
	      BufferedReader br = null;
	      String Palabra = "";
	 
	      try 
	      {
	         archivo = new File ("diccionario.txt");
	         fr = new FileReader (archivo);
	         br = new BufferedReader(fr);
	         String linea = "";
	         while((linea = br.readLine())!=null)
	        	 Palabra = linea;
	      }
	      catch(Exception e)
	      {
	         e.printStackTrace();
	      }
	      finally
	      {
	          try
	          {                    
	             if( null != fr )  
	                fr.close();               
	          }
	          catch (Exception e2)
	          { 
	             e2.printStackTrace();
	          }
	      }
		
		return Palabra;
	}

	public boolean BorrarContenido() {
		
		FileWriter fichero = null;
        PrintWriter pw = null;
	      
        boolean resp = false;
        try
        {
            	fichero = new FileWriter("diccionario.txt");
            	pw = new PrintWriter(fichero);
                pw.println("");
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

