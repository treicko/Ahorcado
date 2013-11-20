package AhorcadoTDD;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Diccionario {
	
	public Diccionario()
	{
		
	}
	
	public Boolean AniadirPalabra(String palabra) {
		
		FileWriter fichero = null;
        PrintWriter pw = null;
	      
        boolean resp = false;
        if(ValidarPalabra(palabra))
        {
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
		
		boolean resp = false;
		File fichero = new File("diccionario.txt");
		if (fichero.delete())
		{
			try {
				  // A partir del objeto File creamos el fichero f�sicamente
				  if (fichero.createNewFile())
				    resp = true;
				  else
				    resp = false;
				} catch (IOException ioe) {
				  ioe.printStackTrace();
				}
		}	 
		return resp;
	}

	public String ObtenerPalabra() {
		
		  File archivo = null;
	      FileReader fr = null;
	      BufferedReader br = null;
	      
	      ArrayList<String> ListaPalabras = new ArrayList<String>();
	 
	      try 
	      {
	         archivo = new File ("diccionario.txt");
	         fr = new FileReader (archivo);
	         br = new BufferedReader(fr);
	         String linea = "";
	         while((linea = br.readLine())!=null)
	        	 ListaPalabras.add(linea);
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
		
		return GetPalabra(ListaPalabras);
	}

	private String GetPalabra(ArrayList<String> listaPalabras) {
		int random = (int)(Math.random()*(listaPalabras.size()-1-0+1)+0);
		return listaPalabras.get(random);
	}

	public boolean ValidarPalabra(String palabra) {
		boolean resp = true;
		int a = palabra.indexOf(' ');
		if(a>0)
			resp = false;
		return resp;
	}
}

