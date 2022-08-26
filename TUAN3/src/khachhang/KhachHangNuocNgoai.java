package khachhang;

import java.time.LocalDate;

class KhachHangNuocNgoai extends KhachHang {
	private String QuocTich;

	public KhachHangNuocNgoai() {
		super();
		this.QuocTich = "";
	}

	public KhachHangNuocNgoai(int ma, double dgia, LocalDate ngayHD, String hoten, int sl, double ttien, String qt) {
		super(ma, dgia, ngayHD, hoten, sl, ttien);
		this.QuocTich = qt;
	}

	public String getQuocTich() {
		return QuocTich;
	}

	public void setQuocTich(String quocTich) {
		QuocTich = quocTich;
	}

	public void nhap() {
		super.nhap();
		System.out.println("Quoc Tich: ");
		QuocTich = in.next();
	}

	public double TTien() {
		return this.ThanhTien = this.SoLuong * this.DonGia;
	}

	public String toString() {
		return "Khach Hang Nuoc Ngoai: " + super.toString() + ", QuocTich: " + QuocTich + ", ThanhTien: " + ThanhTien;
	}
}