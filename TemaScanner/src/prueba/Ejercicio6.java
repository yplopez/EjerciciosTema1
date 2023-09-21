package prueba;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Declaro las variables
		
		int numero1;
		int numero2;
		
		int suma;
		int resta;
		int producto;
		int cociente;
		
		Scanner operaciones = new Scanner (System.in);
		
		//Escribo las instrucciones
		
		System.out.println("Digite un número");
		numero1 = operaciones.nextInt();
		System.out.println("Digite otro número");
		numero2 = operaciones.nextInt();
		
		suma = numero1 + numero2;
		resta = numero1 - numero2;
		producto = numero1 * numero2;
		cociente = numero1 / numero2;
		
		System.out.println("La suma de " + numero1 + "+" + numero2 + " es igual a " + suma + ".");
		System.out.println("La resta de " + numero1 + "-" + numero2 + " es igual a " + resta + "." );
		System.out.println("El producto de " + numero1 + "*" + numero2 + " es igual a " + producto + "." );
		System.out.println("El cociente de " + numero1 + "/" + numero2 + " es igual a " + cociente + "." );
		
		
		//cierre
		operaciones.close();
	}

}
