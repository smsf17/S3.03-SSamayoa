package Modelo;

public class Arbre extends Producto {
	
	public double height;
	
	public Arbre(int id, String nameProduct, double priceSale, double priceBuy, int cantidad, double height) {
		super(id, nameProduct, priceSale, priceBuy, cantidad);
		this.height = height;
	}

	@Override
	public String toString() {
		return "Arbre [height=" + height + Producto() + "]";
	}

}
