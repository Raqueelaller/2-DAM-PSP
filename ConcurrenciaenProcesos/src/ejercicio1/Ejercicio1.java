package ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		List<String> listaMusicos = new ArrayList<>();
		listaMusicos.add("Beyonce");
		listaMusicos.add("Bad Bunny");
		listaMusicos.add("Rihanna");
		listaMusicos.add("Lady Gaga");
		listaMusicos.add("Michael Jackson");
		listaMusicos.add("Monica Naranjo");
		listaMusicos.add("Madonna");
		listaMusicos.add("Adele");
		listaMusicos.add("Taylor Swift");
		listaMusicos.add("Karol G");
		listaMusicos.add("Anitta");
		
		for (String artista : listaMusicos) {
			
			try {
				 ProcessBuilder pb = new ProcessBuilder("CMD", "/c", "java", "-jar", "clientemusical2.jar", artista); 
				 Process p = pb.start(); 
				    
				 InputStream in = p.getInputStream();
				 BufferedReader br = new BufferedReader(new InputStreamReader(in));
				 String linea;
		     

		         while ((linea = br.readLine()) != null) {
		             System.out.println(linea);  // Mostrar en consola
		             
		         }
		         
		         int salida=p.waitFor();
		         
		         if( salida==0) {
					   System.out.println("ha sido un éxito");
					   System.out.println("la salida ha sido: "+salida);
				   }else {
					   System.out.println("lo siento, acción fracasada");
					   System.out.println("la salida ha sido: "+salida); 
				   }
			

		         // Cerrar recursos
		         
		         br.close();
				    
				}catch (IOException x ) {
					System.out.println(x.getMessage());
				}
			

	}
		
		/*for (int j = 0; j < listaMusicos.size(); j++) {
			try {
				 ProcessBuilder pb = new ProcessBuilder("CMD", "/c", "java -jar clientemusical2.jar", listaMusicos.get(j)); 
				 Process p = pb.start(); 
				    
				 InputStream in = p.getInputStream();
				 BufferedReader br = new BufferedReader(new InputStreamReader(in));
				 String linea;
		     

		         while ((linea = br.readLine()) != null) {
		             System.out.println(linea);  // Mostrar en consola
		             
		         }
		         
		         int salida = p.waitFor();
		         
		         if(salida==0) {
					   System.out.println("ha sido un éxito");
					   System.out.println("la salida ha sido: "+salida);
				   }else {
					   System.out.println("lo siento, acción fracasada");
					   System.out.println("la salida ha sido: "+salida); 
				   }
			

		         // Cerrar recursos
		         
		         br.close();
				    
				}catch (IOException x ) {
					System.out.println(x.getMessage());
				}
			
		}*/

}
}
