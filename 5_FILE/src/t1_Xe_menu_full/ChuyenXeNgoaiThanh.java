package t1_Xe_menu_full;

public class ChuyenXeNgoaiThanh extends ChuyenXe {
	private String noiDen;
	private int soNgay;
	
	public String getNoiDen() {
		return noiDen;
	}
	
	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}
	
	public int getSoNgay() {
		return soNgay;
	}
	
	public void setSoNgay(int soNgay) {
		this.soNgay = soNgay;
	}

	public ChuyenXeNgoaiThanh() {
		super();
	}

	public ChuyenXeNgoaiThanh(String maXe, String hoTenTX, String soXe, double doanhThu) {
		super(maXe, hoTenTX, soXe, doanhThu);
	}

	public ChuyenXeNgoaiThanh(String maXe, String hoTenTX, String soXe, double doanhThu, String noiDen, int soNgay) {
		super(maXe, hoTenTX, soXe, doanhThu);
		this.noiDen = noiDen;
		this.soNgay = soNgay;
	}

	public String toString() {
		return super.toString() + String.format("%20s %10d", noiDen, soNgay);
	}
}