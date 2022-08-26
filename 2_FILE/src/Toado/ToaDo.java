package Toado;

public class ToaDo {
	private int x;
	private int y;

	public ToaDo(int x, int y) {
		setX(x);
		setY(y);
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
	public String toString() {
		return String.format("(%s,%s)", x,y);
	}
}
