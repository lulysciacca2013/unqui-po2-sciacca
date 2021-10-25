package ar.edu.unq.poo.supermercado;

public class ProductoPrimeraNecesidad extends Producto {
	

	public ProductoPrimeraNecesidad(String nomb, double pre, boolean escuid) {
		super(nomb,pre,escuid);
		this.setNombre(nomb);
		this.setPrecio(pre);
		this.setEsPrecioCuidado(escuid);
		
	}
	
	
	
	public void calcularPrecio(int descuento) {
	     this.precio =this.getPrecio()-(this.getPrecio() * descuento/100); 
	}

	

}
