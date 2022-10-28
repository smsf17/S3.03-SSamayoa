package View;

import java.util.Scanner;

import Controller.Store;
import View.Floristeria;

public class Floristeria {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean programaActivo = true;
		Store tienda = new Store();
		
		do {
			System.out.println("****** Introduzca el la operación ******");
			System.out.println("			1. Comprar producto");
			System.out.println("			2. Vender producto");
			System.out.println("			3. Total € de Stock");
			System.out.println("			4. Imprimir lista Stock");
			System.out.println("			5. Salir");
				int opcion = scn.nextInt();
				
			if (opcion == 1) {
				tienda.purchase();
			}else if (opcion == 2) {
				tienda.sale();
			}else if (opcion == 3) {
				tienda.sumaStock();
			}else if (opcion == 4) {
				tienda.imprimirStock();
			}else if (opcion == 5) {
				programaActivo = false;
			}
			
       
		} while (programaActivo);
	
	} 

}
