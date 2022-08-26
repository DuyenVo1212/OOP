package Tuan8_NhaDat_menu;

import java.util.Date;

public class Nha extends NhaDat {
	private String address;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Nha() {
		super();
		this.address = "";
		// TODO Auto-generated constructor stub
	}

	public Nha(String ma, Date ngayGD, int donGia, String loai, int dienTich, String address) {
		super(ma, ngayGD, donGia, loai, dienTich);
		this.address = address;
		// TODO Auto-generated constructor stub
	}

	/**
	 * "cao cap", "thuong"
	 */
	@Override
	public float thanhTien() {
		if (super.getLoai().compareToIgnoreCase("thuong") == 0)
			return (float) (super.getDienTich() * super.getDonGia() * 1.5);
		return getDienTich() * getDonGia();
	}

	@Override
	public String toString() {
		return super.toString() + "   " + this.address;
	}
}
