package Modelo;

public class Decoracio extends Producto{
	
	/*public enum Material{
		Plastic, Fusta
	}*/
	
	public String Material;

	public Decoracio(int id, String nameProduct, double priceSale, double priceBuy, int cantidad, String Material) {
		super(id, nameProduct, priceSale, priceBuy, cantidad);
		this.Material = Material;
	}

	@Override
	public String toString() {
		return "Decoracio [type=" + Material + Producto() + "]";
	}

}
