package t6QuanLyPhongHoc;

public class MayTinh extends Phong {
	private int soLuongMT;

	public int getSoLuongMT() {
		return soLuongMT;
	}

	public void setSoLuongMT(int soLuongMT) {
		this.soLuongMT = soLuongMT;
	}

	public MayTinh(String maPhong, String dayNha, float dienTich, int soBongDen, int soLuongMT) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.soLuongMT = soLuongMT;
	}

	public MayTinh() {
		super();
	}
	
	public boolean datChuan() {
		if((soLuongMT/super.getDienTich()) < 1/1.5) return false;
		if((super.getSoBongDen()/super.getDienTich()) < 1.0/10)return false;
		return true;
	}

	public static String tieuDe() {
		String str = String.format("%10s %10s %10s %15s %10s %15s",
				"Ma phong", "day nha", "dien tich", "so bong den","chat luong", "so may tinh");
		return str;
	}
	
	public String toString() {
		return super.toString() + String.format(" %20d",soLuongMT );
	}
}
