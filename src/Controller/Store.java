package Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Modelo.Arbre;
import Modelo.Decoracio;
import Modelo.Flor;
import Modelo.Producto;

public class Store implements Operation {

protected List<Producto> products = new ArrayList<Producto>();
	
	@Override
	public void purchase() {
		Scanner scn = new Scanner(System.in);
        System.out.println("Introduzca el id del producto: ");
        int idSolicitado = scn.nextInt();
        int opcion = 0;
        Producto solicitada = null;
        
        for (Producto prod: products)
        
        if (prod.getId() == idSolicitado)
			solicitada = prod;
        	if (solicitada != null){
        	System.out.println("Cuantos nuevos productos agrega: ");
        	int nuevacantidad = scn.nextInt();
        	solicitada.sumarCantidad(nuevacantidad);
        }else {
        	System.out.println("Id producto: " + idSolicitado);
            int nuevoId = idSolicitado;
            System.out.println("Nombre del producto: ");
            String nombre = scn.nextLine();
            System.out.println("Precio de venta: ");
            double pVenta = scn.nextDouble();
            System.out.println("Precio de compra: ");
            double pCompra = scn.nextDouble();
            System.out.println("Cuantos productos se han comprado: ");
        	int ncantidad = scn.nextInt();
            
	            System.out.println("****** Introduzca el tipo de producto ******");
	            System.out.println("			1. Flores");
	            System.out.println("			2. Arbres");
	            System.out.println("			3. Decoracio");
	            opcion = scn.nextInt();
	       

           switch(opcion){
           		case 1: System.out.println("Introduzca el color de la flor: ");
           				String nColor = scn.nextLine();
           				Producto flor = new Flor(nuevoId, nombre, pVenta, pCompra, ncantidad, nColor);
           				products.add(flor);
           				System.out.println("Cuantos productos se han comprado: ");
                        break;
                case 2: System.out.println("Introduzca el tamaño del arbol: ");
   						double nTamano = scn.nextDouble();
   						Producto arbol = new Arbre(nuevoId, nombre, pVenta, pCompra, ncantidad, nTamano);
   						products.add(arbol);
   						break;
                case 3: System.out.println("Introduzca el material (Plastic / Fusta): ");
                		String nmaterial = scn.nextLine();
   						Producto decoracion = new Decoracio(nuevoId, nombre, pVenta, pCompra, ncantidad, nmaterial);
   						products.add(decoracion);
						break;
           }
        }
	}

	@Override
	public void sale() {
		Scanner scn = new Scanner(System.in);
		Producto solicitada = null;
		
		System.out.println ("Id de producto solicitado: ");
		int idSolicitado = scn.nextInt();
		System.out.println ("Cantidad producto solicitado: ");
		int cantidadSolicitada = scn.nextInt();
		
		for (Producto prod:products) 
			if (prod.getId()== idSolicitado)
				solicitada = prod;
		if (solicitada == null)
			System.out.println("Producto no encontrado: " + idSolicitado);
		else {
			if (solicitada.getCantidad()>= cantidadSolicitada) {
				System.out.println("id producto: " + solicitada.getId() + " " + solicitada.getNameProduct() + " precio unitario: "
					+ solicitada.getPriceSale() + "€  Cantidad compra: " + cantidadSolicitada + " Total compra " + solicitada.getPriceSale()*cantidadSolicitada + "€");
					solicitada.restarCantidad(cantidadSolicitada);
			}
			else if (solicitada.getCantidad()== 0) {
				System.out.println("No hay disponibilidad del producto.");
				}
			else {
				double importeVenta = solicitada.getPriceSale() * solicitada.getCantidad();
				System.out.println("No hay existencias suficientes para la cantidad solicitada");
				System.out.println("Disponemos de:" + solicitada.getCantidad() + " unidades y seria un total de: " + importeVenta);
					solicitada.restarCantidad(cantidadSolicitada);
				}
				
		}

	}

	@Override
	public void sumaStock() {
		double total = 0d;
		for (Producto prod:products) 
			total += prod.getPriceBuy() * prod.getCantidad();
		
		System.out.println("El total en almacen es de: " +total + "€");

	}

	@Override
	public void imprimirStock() {
		for (Producto prod:products) 
			System.out.println(prod.toString());
		
	}

}
