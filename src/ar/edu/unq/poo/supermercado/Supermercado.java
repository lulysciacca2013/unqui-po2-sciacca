package ar.edu.unq.poo.supermercado;

import java.util.ArrayList;

public class Supermercado {
	
	private String nombreSuper;
	private String direccion;
	private ArrayList<Producto> s = new ArrayList<Producto>();

	public Supermercado(String nombre, String dire) {
		this.setNombreSuper(nombre);
		this.setDireccion(dire);
	}

	public String getNombreSuper() {
		return nombreSuper;
	}

	public void setNombreSuper(String nombreSuper) {
		this.nombreSuper = nombreSuper;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	
	public ArrayList<Producto> getS() {
		return s;
	}

	public void setS(ArrayList<Producto> s) {
		this.s = s;
	}

	public void agregarProducto(Producto prod) {
		s.add(prod);
				
	}
	
	public int getCantidadDeProductos() {
		return s.size();			
		
	}
	
	public double getPrecioTotal() {
		double precioTotal=0;
		for (int i=0; i< s.size();i++) {
			precioTotal= precioTotal + s.get(i).getPrecio();
		}
		return precioTotal;
	}

	
}
