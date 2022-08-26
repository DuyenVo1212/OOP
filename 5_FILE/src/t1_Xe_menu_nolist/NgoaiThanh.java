package t1_Xe_menu_nolist;

public class NgoaiThanh extends Xe{
	private String noiDen;
	private int ngayDiDuoc;
	
	public String getNoiDen() {
		return noiDen;
	}
	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}
	public int getNgayDiDuoc() {
		return ngayDiDuoc;
	}
	public void setNgayDiDuoc(int ngayDiDuoc) {
		this.ngayDiDuoc = ngayDiDuoc;
	}
	
	public NgoaiThanh(String maSoChuyen, String hoTen, int soXe, int doanhThu, String noiDen, int ngayDiDuoc) {
		super(maSoChuyen, hoTen, soXe, doanhThu);
		this.noiDen = noiDen;
		this.ngayDiDuoc = ngayDiDuoc;
	}
	public NgoaiThanh() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return super.toString()+String.format("%15s %15d", noiDen, ngayDiDuoc);
	}
}
