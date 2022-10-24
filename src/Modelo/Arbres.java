package Modelo;

public class Arbres extends Productos {
	
	public double height;
	
	public Arbres(int id, String nameProduct, double priceSale, double priceBuy, int cantidad, double height) {
		super(id, nameProduct, priceSale, priceBuy, cantidad);
		this.height = height;
	}

	@Override
	public String toString() {
		return "Arbres [height=" + height + Producto() + "]";
	}

}
