package t1_Xe_nomenu;

public class NgoaiThanh extends ChuyenXe{
	private String noiDen;
	private double soNgay;
	public String getNoiDen() {
		return noiDen;
	}
	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}
	public double getSoNgay() {
		return soNgay;
	}
	public void setSoNgay(double soNgay) {
		this.soNgay = soNgay;
	}
	public NgoaiThanh() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NgoaiThanh(String maSC, String hoTen, String soXe, String noiDen, double soNgay, double doanhthu) {
		super(maSC, hoTen, soXe, doanhthu);
		this.noiDen = noiDen;
		this.soNgay = soNgay;
	}
	public NgoaiThanh(String noiDen, double soNgay) {
		super();
		this.noiDen = noiDen;
		this.soNgay = soNgay;
	}
	public String toString() {
		return super.toString() + String.format("%10s %10s", noiDen, soNgay);
	}
}
