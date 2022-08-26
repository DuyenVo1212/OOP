package t6_KhachSan_good;

import java.util.Date;

public class Ngay extends HoaDon {
	private int soNgayThue;

	public int getSoNgayThue() {
		return soNgayThue;
	}

	public void setSoNgayThue(int soNgayThue) {
		this.soNgayThue = soNgayThue;
	}

	public Ngay() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ngay(String maHD, Date ngayHD, String tenKH, String maPhong, int donGia, int soNgayThue) {
		super(maHD, ngayHD, tenKH, maPhong, donGia);
		this.soNgayThue = soNgayThue;
		// TODO Auto-generated constructor stub
	}

	@Override
	public float thanhTien() {
		if (soNgayThue <= 7)
			return soNgayThue * getDonGia();
		return (float) (7 * getDonGia() + (soNgayThue - 7) * getDonGia() * 0.8);
	}

	@Override
	public String toString() {
		return super.toString() + String.format("%10d", soNgayThue);
	}

}
