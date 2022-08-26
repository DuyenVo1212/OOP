package Xe;

public class NoiThanh extends ChuyenXe{
	private double soTuyen;
	private double soKm;
	public double getSoTuyen() {
		return soTuyen;
	}
	public void setSoTuyen(double soTuyen) {
		this.soTuyen = soTuyen;
	}
	public double getSoKm() {
		return soKm;
	}
	public void setSoKm(double soKm) {
		this.soKm = soKm;
	}
	public NoiThanh() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NoiThanh(String maSC, String hoTen, String soXe,double soTuyen, double soKm, double doanhthu) {
		super(maSC, hoTen, soXe, doanhthu);
		this.soTuyen = soTuyen;
		this.soKm = soKm;
	}
	
	
	public String toString() {
		return super.toString() + String.format("%10s %10s", soTuyen,soKm);
	}
	
}
