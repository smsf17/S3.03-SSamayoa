package Modelo;

public class Producto {
private static int idProducto = 1;
	
	private int id;
	private String nameProduct;
	private double priceSale;
	private double priceBuy;
	private int cantidad;
	
	public Producto(int id, String nameProduct, double priceSale, double priceBuy, int cantidad) {
		
		this.id = idProducto++;
		this.nameProduct = nameProduct;
		this.priceSale = priceSale;
		this.priceBuy = priceBuy;
		this.cantidad = cantidad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public double getPriceSale() {
		return priceSale;
	}

	public void setPriceSale(double priceSale) {
		this.priceSale = priceSale;
	}

	public double getPriceBuy() {
		return priceBuy;
	}

	public void setPriceBuy(double priceBuy) {
		this.priceBuy = priceBuy;
	}
	

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public void restarCantidad(int cantidadSolicitada) {
		this.cantidad -= cantidadSolicitada;
	}
	
	public void sumarCantidad(int nuevaCantidad) {
		this.cantidad += nuevaCantidad;
	}

	public String Producto() {
		return "Productos [id=" + id + ", nameProduct=" + nameProduct + ", price for Sale=" + priceSale + ", price we Buy="
				+ priceBuy + cantidad + "]";
	}

}
