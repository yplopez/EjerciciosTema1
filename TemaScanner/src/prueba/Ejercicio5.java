package prueba;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Declaro la variable
		
		double radio;
		
		//instrucciones
		
		Scanner vlr = new Scanner (System.in);
		System.out.println("Digite el número del radio");
		radio = vlr.nextDouble();
		
		double longitud = 2*Math.PI*radio;
		double area = Math.PI*Math.pow(radio, 2);
		
		System.out.println("La longitud de la circunferencia es: " + longitud + " metros.");
		System.out.println("El area corresponde a " + area + " metros cuadrados.");
		
		//cierre
		vlr.close();
		
		

	}

}
