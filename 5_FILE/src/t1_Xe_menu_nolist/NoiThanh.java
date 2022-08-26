package t1_Xe_menu_nolist;

public class NoiThanh extends Xe {
	private int soTuyen;
	private int soKm;
	
	public int getSoTuyen() {
		return soTuyen;
	}
	public void setSoTuyen(int soTuyen) {
		this.soTuyen = soTuyen;
	}
	public int getSoKm() {
		return soKm;
	}
	public void setSoKm(int soKm) {
		this.soKm = soKm;
	}
	
	public NoiThanh(String maSoChuyen, String hoTen, int soXe, int doanhThu, int soTuyen, int soKm) {
		super(maSoChuyen, hoTen, soXe, doanhThu);
		this.soTuyen = soTuyen;
		this.soKm = soKm;
	}
	public NoiThanh() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return  super.toString()+String.format("%15d %15d", soTuyen, soKm);
	}
}
