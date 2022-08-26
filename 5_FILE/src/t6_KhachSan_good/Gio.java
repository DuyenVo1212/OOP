package t6_KhachSan_good;

import java.util.Date;

public class Gio extends HoaDon {
	private int soGio;

	public int getSoGio() {
		return soGio;
	}

	public void setSoGio(int soGio) {
		this.soGio = soGio;
	}

	public Gio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gio(String maHD, Date ngayHD, String tenKH, String maPhong, int donGia, int soGio) {
		super(maHD, ngayHD, tenKH, maPhong, donGia);
		this.soGio = soGio;
		// TODO Auto-generated constructor stub
	}

	@Override
	public float thanhTien() {
		if (soGio <= 24)
			return soGio * getDonGia();
		if (soGio > 24 && soGio < 30)
			return 24 * getDonGia();
		return -1;
	}

	@Override
	public String toString() {
		return super.toString() + String.format("%10d", soGio);
	}
}
