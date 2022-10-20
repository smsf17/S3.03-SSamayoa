
public class Flores extends Productos{
	
	public String color;
	
	public Flores(int id, String nameProduct, double priceSale, double priceBuy, int cantidad, String color) {
		super(id, nameProduct, priceSale, priceBuy, cantidad);
		this.color = color;
	}

	@Override
	public String toString() {
		return "Flores [color=" + color + Producto() + "]";
	}
	
	
}
