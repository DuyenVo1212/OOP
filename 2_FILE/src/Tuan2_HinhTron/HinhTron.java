package Tuan2_HinhTron;

public class HinhTron {
	private ToaDo tam;
	private double banKinh;
	
	public HinhTron(ToaDo tam, double banKinh) {
		super();
		this.tam = tam;
		this.banKinh = banKinh;
	}
	public HinhTron() {
		
	}
	public ToaDo getTam() {
		return tam;
	}
	public void setTam(ToaDo tam) {
		this.tam = tam;
	}
	public double getBanKinh() {
		return banKinh;
	}
	public void setBanKinh(double banKinh) {
		this.banKinh = banKinh;
	}
	public double tinhChuVi() {
		return this.banKinh*Math.PI*2;
	}
	public double tinhDienTich()
	{
		return this.banKinh*this.banKinh*Math.PI;
	}
	@Override
	public String toString() {
		return "HinhTron [tam=" + tam + ", banKinh=" + banKinh + ", tinhChuVi()=" + tinhChuVi() + ", tinhDienTich()="
				+ tinhDienTich() + "]";
	}
	
}
