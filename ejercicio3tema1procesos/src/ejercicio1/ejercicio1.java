package ejercicio1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ejercicio1 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try {
		 ProcessBuilder pb = new ProcessBuilder("CMD", "/c", "DIR"); //le metemos como parámetro la ruta
		 Process p = pb.start(); // iniciamos lo dicho anteriormente
		    
		 InputStream in = p.getInputStream();
		 BufferedReader br = new BufferedReader(new InputStreamReader(in));
		 String linea;
     

         while ((linea = br.readLine()) != null) {
             System.out.println(linea);  // Mostrar en consola
             
         }

         // Cerrar recursos
         
         br.close();
		    
		}catch (IOException x ) {
			System.out.println(x.getMessage());
		}
		    
	}

}
