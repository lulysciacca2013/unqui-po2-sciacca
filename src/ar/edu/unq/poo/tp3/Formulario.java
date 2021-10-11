package ar.edu.unq.poo.tp3;

import javax.swing.JPanel;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Formulario extends javax.swing.JFrame{

	public Formulario() {
		AreaDeDibujo area = new AreaDeDibujo();
		add(area);
		setSize(500, 500);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		Formulario form = new Formulario();
	}

}
