package prueba;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Declaro las variables
		
		int nota1;
		int nota2;
		
		double media;
		
		//Instrucciones
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Digita la primera nota");
		nota1 = sc.nextInt();
		System.out.println("Ok, ahora digita la segunda nota");
		nota2 = sc.nextInt();
		
		
		
		media = (double)(nota1 + nota2)/2;
		System.out.println("La media obtenida fue:  " + media);
		
		//cierre
		sc.close();
	}

}
