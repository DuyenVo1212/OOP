package Tuan8_NhaDat_menu;

import java.util.Date;

public class Dat extends NhaDat {
	public Dat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dat(String ma, Date ngayGD, int donGia, String loai, int dienTich) {
		super(ma, ngayGD, donGia, loai, dienTich);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float thanhTien() {

		if (super.getLoai().compareToIgnoreCase("A") == 0)
			return (float) (super.getDienTich() * super.getDonGia() * 1.5);
		else
			return getDienTich() * getDonGia();

	}

	@Override
	public String toString() {
		return super.toString();
	}
}
