package t3_GD_menu_noa_thay;

class GiaoDichVang extends GiaoDich {
	private String LoaiVang;

	public GiaoDichVang() {
		super();
		this.LoaiVang = "";
	}

	public GiaoDichVang(int ma, int sl, String ngay, double dgia, double ttien, String lvang) {
		super(ma, sl, ngay, dgia, ttien);
		this.LoaiVang = lvang;
	}

	public String getLoaiVang() {
		return LoaiVang;
	}

	public void setLoaiVang(String loaiVang) {
		LoaiVang = loaiVang;
	}

	public void nhap() {
		super.nhap();
		System.out.println("Loai Vang: ");
		LoaiVang = in.next();
	}

	public double ThanhTien() {
		return SoLuong*DonGia;
	}
	public String toString() {
		return super.toString() + String.format("%10s %10f", getLoaiVang(), ThanhTien());
	}
}
