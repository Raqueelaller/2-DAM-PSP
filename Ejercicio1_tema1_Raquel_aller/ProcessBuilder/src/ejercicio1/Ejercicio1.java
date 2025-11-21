/*
 * autora: Raquel Aller
 * Fecha: 19/09/2025
 * objetio: realizar un programa que abra aplicaciones que le pedimos al usuario por teclado
 */
package ejercicio1;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime que app quieres abrir?"); // pedimos al usuario que app quiere abrir
		String app = null;
		
		try {
			app = teclado.nextLine();
		}catch (NoSuchElementException x) {
			System.out.println("Ha ocurrido un error");
		}catch(IllegalStateException x) {
			System.out.println("Ha ocurrido un error");
		}
		
		
		   ProcessBuilder pb = new ProcessBuilder(app); //le metemos como parámetro la app que hemos metido por teclado
		    Process p = pb.start(); // iniciamos el programa anterior
		    System.out.println("el PID del programa que has abierto abrir es es: "+ p.pid()); // con esto miramos el pid del programa
			System.out.println(p.isAlive()); // con esto miramos si está activo o no
		    pb.command("calc");
		    p=pb.start();
		    System.out.println("el PID de la calculadora es: "+ p.pid());
			System.out.println(p.isAlive());
		    pb.command("notepad");
		    p=pb.start();
		    System.out.println("el PID del bloc de notas es: "+ p.pid());
			System.out.println(p.isAlive());

		    

	}

}
