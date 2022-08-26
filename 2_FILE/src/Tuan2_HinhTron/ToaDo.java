package Tuan2_HinhTron;

public class ToaDo {
	private String ten;
	private float x;
	private float y;
	
	public ToaDo(String ten, float x, float y) {
		super();
		this.ten = ten;
		this.x = x;
		this.y = y;
	}
	public ToaDo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "ToaDo [ten=" + ten + ", x=" + x + ", y=" + y + "]";
	}
	
}
