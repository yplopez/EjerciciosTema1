package prueba;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Declaracion de las variables
		
		String nombre;
		int edad;
		
		Scanner scanner = new Scanner(System.in);
		
		//Doy instrucciones
		
		System.out.println("Digita tu nombre");
		nombre = scanner.nextLine();
		System.out.println("Ahora escribe tu edad");
		edad = scanner.nextInt();
		
		System.out.println("Hola " + nombre + ", tienes " + edad + " años, ¡qué mayor eres!");

		scanner.close();
	}

}
