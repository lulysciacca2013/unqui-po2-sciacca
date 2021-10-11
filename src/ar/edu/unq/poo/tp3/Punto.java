package ar.edu.unq.poo.tp3;

import java.util.Objects;

public class Punto {

	private int x;
	private int y;

	public Punto() {
		this.setXY(0, 0);
	}

	public Punto(int x, int y) {
		super();
		this.setXY(x, y);

	}

	public void setXY(int x, int y) {
		this.setX(x);
		this.setY(y);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
