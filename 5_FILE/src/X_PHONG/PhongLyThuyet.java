package X_PHONG;

public class PhongLyThuyet extends PhongHoc {
	// Thuộc tính riêng
	private boolean mayChieu;
	
	// Constructor
	public PhongLyThuyet() {
		super();
	}

	public PhongLyThuyet(String dayNha, String maPhong, double dienTich, int soBongDen, boolean mayChieu) {
		super(dayNha, maPhong, dienTich, soBongDen);
		this.mayChieu = mayChieu;
	}

	// Setter
	public void setMayChieu(boolean mayChieu) {
		this.mayChieu = mayChieu;
	}
	
	// Kiểm tra có Máy chiếu hay không
	public boolean isMayChieu() {
		return mayChieu;
	}
	
	// Hiện thực phương thức datChuan()
	@Override
	boolean datChuan() {
		return isMayChieu() && duSang() ? true : false;
	}

	@Override
	public String toString() {
		String mc = mayChieu ? "Có máy chiếu(PLT)" : "Không máy chiếu(PLT)";
		return super.toString() + String.format("%-20s", mc);
	}
	
}
