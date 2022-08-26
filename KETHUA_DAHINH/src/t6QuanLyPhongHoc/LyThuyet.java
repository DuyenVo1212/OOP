package t6QuanLyPhongHoc;

public class LyThuyet extends Phong {
	private boolean coMayChieu;

	public boolean isCoMayChieu() {
		return coMayChieu;
	}

	public void setCoMayChieu(boolean coMayChieu) {
		this.coMayChieu = coMayChieu;
	}

	public LyThuyet(String maPhong, String dayNha, float dienTich, int soBongDen, boolean coMayChieu) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.coMayChieu = coMayChieu;
	}

	public LyThuyet() {
		super();
	}
	
	public static String tieuDe() {
		String str = String.format("%10s %10s %10s %15s %10s %10s",
				"Ma phong", "day nha", "dien tich", "so bong den","chat luong", "may chieu");
		return str;
	}
	
	public String kiemTraDatChuan() {
		if(coMayChieu) return "Dat Chuan";
		return "Khong dat chuan";
	}
	
	public String toString() {
		return super.toString()+String.format(" %20s", kiemTraDatChuan());
	}

	public boolean datChuan() {
		if(!coMayChieu) return false;
		if((super.getSoBongDen()/super.getDienTich()) < 1.0/10)return false;
		return true;
	}
}
