package ar.edu.unq.poo.supermercado;

public class Producto {
	private String nombre;
	public double precio;
	private boolean esPrecioCuidado= false;
	

	public Producto(String nomb, double pre, boolean escuid) {
		this.setNombre(nomb);
		this.setPrecio(pre);
		this.setEsPrecioCuidado(escuid);
		
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean getEsPrecioCuidado() {
		return esPrecioCuidado;
	}

	public void setEsPrecioCuidado(boolean esPrecioCuidado) {
		this.esPrecioCuidado = esPrecioCuidado;
	}
	
	public void aumentarPrecio(double importe) {
		this.precio= this.precio + importe;
		
	}

}
