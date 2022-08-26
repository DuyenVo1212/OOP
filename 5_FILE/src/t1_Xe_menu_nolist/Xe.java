package t1_Xe_menu_nolist;

public class Xe {
	protected String maSoChuyen;
	protected String hoTen;
	protected int soXe;
	protected int doanhThu;
	
	protected String getMaSoChuyen() {
		return maSoChuyen;
	}
	protected void setMaSoChuyen(String maSoChuyen) {
		this.maSoChuyen = maSoChuyen;
	}
	protected String getHoTen() {
		return hoTen;
	}
	protected void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	protected int getSoXe() {
		return soXe;
	}
	protected void setSoXe(int soXe) {
		this.soXe = soXe;
	}
	protected int getDoanhThu() {
		return doanhThu;
	}
	protected void setDoanhThu(int doanhThu) {
		this.doanhThu = doanhThu;
	}
	protected Xe(String maSoChuyen, String hoTen, int soXe, int doanhThu) {
		super();
		this.maSoChuyen = maSoChuyen;
		this.hoTen = hoTen;
		this.soXe = soXe;
		this.doanhThu = doanhThu;
	}
	
	protected Xe() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return String.format("%10s %10s %10d %10d", maSoChuyen, hoTen, soXe, doanhThu);
	}
}
