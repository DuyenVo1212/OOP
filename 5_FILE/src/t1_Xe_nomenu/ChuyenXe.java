package t1_Xe_nomenu;

public class ChuyenXe {
	protected String maSC;
	protected String hoTen;
	protected String soXe;
	protected double doanhthu;
	public String getMaSC() {
		return maSC;
	}
	public void setMaSC(String maSC) {
		this.maSC = maSC;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getSoXe() {
		return soXe;
	}
	public void setSoXe(String soXe) {
		this.soXe = soXe;
	}
	public double getDoanhthu() {
		return doanhthu;
	}
	public void setDoanhthu(double doanhthu) {
		this.doanhthu = doanhthu;
	}
	public ChuyenXe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ChuyenXe(String maSC, String hoTen, String soXe, double doanhthu) {
		super();
		this.maSC = maSC;
		this.hoTen = hoTen;
		this.soXe = soXe;
		this.doanhthu = doanhthu;
	}
	@Override
	public String toString() {
		return String.format("%10s %10s %10s %10s", 
							maSC, hoTen, soXe, doanhthu);
	}
	
}
