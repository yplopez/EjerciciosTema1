package prueba;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Declaro variables
		
		int añoActual;
		int añoNacimiento;
		
		
		// Instrucciones
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println("En qué año estamos?");
		añoActual = sc.nextInt();
		
		System.out.println("En qué año naciste?");
		añoNacimiento = sc.nextInt();
				
		int edad = añoActual - añoNacimiento;
		System.out.println("Entonces tu edad es " + edad + " años");
		
		//Cierre
		sc.close();

	}

}
