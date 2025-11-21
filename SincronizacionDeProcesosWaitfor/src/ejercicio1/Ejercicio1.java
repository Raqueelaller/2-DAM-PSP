package ejercicio1;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
	
		
		   ProcessBuilder pb = new ProcessBuilder(args); //le metemos como parámetro la app que hemos metido por teclado
		    Process p=null; // iniciamos el programa anterior
		   try {
			   p= pb.start();
		   }catch(NullPointerException x) {
			   System.out.println(x.getMessage());
		   }catch(IndexOutOfBoundsException x) {
			   System.out.println(x.getMessage());
		   }catch(UnsupportedOperationException x) {
			   System.out.println(x.getMessage());
		   }catch(IOException x) {
			   System.out.println(x.getMessage());
		   }
		   
		   if( p.waitFor()==0) {
			   System.out.println("ha sido un éxito");
			   System.out.println("la salida ha sido: "+p.waitFor());
		   }else {
			   System.out.println("lo siento, acción fracasada");
			   System.out.println("la salida ha sido: "+p.waitFor()); 
		   }
		   
	}

}
