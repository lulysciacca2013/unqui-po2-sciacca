package ar.edu.unq.poo.tp3;

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;

public class Rectangulo extends Punto {  // 
	private int ancho;
	private int alto;

	public Rectangulo() {
		this.posicion();
		
	}
	
	
	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public void dibujarRectangulo(Graphics p) {
		
		if (this.getAncho()== this.getAlto()) {
			p.setColor(Color.RED);
			p.drawString("Dibujando un Cuadrado", 15, 15);
			
			}
		else {
	
			p.setColor(Color.BLACK);
			p.drawString("Dibujando un Rectángulo", 15, 15);
			}	
			
		p.setColor(Color.BLUE);
			p.drawRect(this.getX(),this.getY(),  this.getAncho(), this.getAlto());
			p.fillRect(this.getX(),this.getY(), this.getAncho(), this.getAlto());
		
			//
	} 
	
	public int area(int a, int b) {
		return a * b;
		
	}
	
	public int perimetro (int a, int b) {
		return (a + b) * 2;
		
	}
	 public void posicion() {
		 if(this.getAncho()< this.getAlto()) {
			 System.out.println("El rectangulo es Vertical");
		 }
		 else if (this.getAncho()> this.getAlto())  {
			 System.out.println("El rectangulo es horizontal");
		 }
		 else {
			 System.out.println("Es un cuadrado");
		 }
	 }
	
}
