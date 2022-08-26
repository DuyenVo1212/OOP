package t1_Xe_menu_full;

public class ChuyenXeNoiThanh extends ChuyenXe {
	private int soKM;
	private String soTuyen;
	
	public int getSoKM() {
		return soKM;
	}
	
	public void setSoKM(int soKM) {
		this.soKM = soKM;
	}
	
	public String getSoTuyen() {
		return soTuyen;
	}
	
	public void setSoTuyen(String soTuyen) {
		this.soTuyen = soTuyen;
	}

	public ChuyenXeNoiThanh() {
		super();
	}
	
	public ChuyenXeNoiThanh(String maXe, String hoTenTX, String soXe, double doanhThu) {
		super(maXe, hoTenTX, soXe, doanhThu);
	}
	
	public ChuyenXeNoiThanh(String maXe, String hoTenTX, String soXe, double doanhThu, int soKM, String soTuyen) {
		super(maXe, hoTenTX, soXe, doanhThu);
		this.soKM = soKM;
		this.soTuyen = soTuyen;
	}
	
	public String toString() {
		return super.toString() + String.format("%10d %10s", getSoKM(), getSoTuyen());
	}
}
