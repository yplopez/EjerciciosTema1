package prueba;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Declaración de variables
		
	double precio;
	
	double iva=1.21;
	
	//instrucciones
	
	Scanner sc = new Scanner (System.in);
	System.out.println("Digita el precio del artículo");
	
	precio = sc.nextDouble();
	
	System.out.println("El valor a pagar con IVA incluido es de " + precio * iva + "€");
	
	//cierre
	
    sc.close();
	}

}
