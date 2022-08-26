package TienDien;

import java.time.LocalDate;

public class NuocNgoai extends KhanhHang{
	private String quocTich;

	public String getQuocTich() {
		return quocTich;
	}

	public void setQuocTich(String quocTich) {
		this.quocTich = quocTich;
	}

	public NuocNgoai(String maKH, String hoTen, LocalDate ngayLap, double soKW, double donGia, String quocTich) {
		super(maKH, hoTen, ngayLap, soKW, donGia);
		this.quocTich = quocTich;
	}

	public NuocNgoai() {
		super();
		// TODO Auto-generated constructor stub
	}
	public double ThanhTien() {
		return soKW*donGia;
	}
	public String toString() {
		return super.toString() + String.format("%-10s %-10s", quocTich, ThanhTien());
	}
}
