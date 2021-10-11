package ar.edu.unq.poo.tp3;

import javax.swing.JPanel;
import java.awt.Graphics;


public class AreaDeDibujo extends javax.swing.JPanel {
	Rectangulo r ;
	
	public AreaDeDibujo() {
		
		r = new Rectangulo();
				
	}
	
	public void EnviarOrdenadasXY(int x, int y) {
		r.setXY(x, y);
	}
	
	public void EnviarAnchoYAlto(int ancho, int alto) {
		r.setAncho(ancho);
		r.setAlto(alto);
	}
	
	@Override
	
	public void paint (Graphics g) {
		super.paint(getGraphics());
		r.dibujarRectangulo(g);
	}
	
	public void Actualizar() {
		repaint();
	}

}
