package prueba;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Declaro variables
		
		String nombre;
		String direccion;
		int telefono;

		Scanner scanner = new Scanner(System.in);
		
		//Instrucciones
		
		System.out.println("Escriba su nombre");
		nombre = scanner.nextLine();
		System.out.println("Escriba su dirección");
		direccion = scanner.nextLine();
		System.out.println("Digite su número de teléfono");
		telefono = scanner.nextInt();
		
		System.out.println("Nombre: " + nombre);
		System.out.println("Dirección: " + direccion);
		System.out.println("Teléfono: " + telefono);
		
		
		
		
		
	}

}
