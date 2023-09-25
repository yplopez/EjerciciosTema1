package prueba;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// Declarar las variables
		
		double valor;
		double euro = 166;
		
		//Instrucciones
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Digita la cantidad de pesetas a convertir en €: ");
		
		valor = sc.nextDouble();
		
		System.out.println("El valor corresponde a " + valor / euro + " € ");
		
		//cierre
		
		sc.close()
		
		

	}

} 
