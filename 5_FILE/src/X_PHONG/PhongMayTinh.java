package X_PHONG;

public class PhongMayTinh extends PhongHoc {
	// Thuộc tính riêng
	private int soLuongMayTinh;
	private final double CHUANPM = 1.5;

	// Constructor
	public PhongMayTinh() {
		super();
		
	}

	public PhongMayTinh(String dayNha, String maPhong, double dienTich, int soBongDen, int soLuongMayTinh) {
		super(dayNha, maPhong, dienTich, soBongDen);
		this.soLuongMayTinh = soLuongMayTinh;
	}

	//Setter & Getter
	public int getSoLuongMayTinh() {
		return soLuongMayTinh;
	}

	public void setSoLuongMayTinh(int soLuongMayTinh) {
		this.soLuongMayTinh = soLuongMayTinh;
	}

	// Hàm kiểm tra Phòng có đạt chuẩn hay không
	public boolean phongMayDatChuan() {
		return (getDienTich() / getSoLuongMayTinh() <= CHUANPM) ? true : false;
	}

	// Hiện thực phương thức datChuan()
	@Override
	boolean datChuan() {
		return phongMayDatChuan() && duSang() ? true : false;
	}

	@Override
	public String toString() {
		String cpm=phongMayDatChuan() ? "�?ạt chuẩn phòng máy": "Không đạt chuẩn phòng máy";
		return super.toString() + String.format("%-50s%-2d " ,cpm, getSoLuongMayTinh()) + "Máy tính";
	}
	
}
