package Sach;

import java.time.LocalDate;
import java.util.Scanner;

public class SachGK extends Sach {
	private String ttrang;

	public SachGK() {
		super();
		ttrang = "";
		// TODO Auto-generated constructor stub
	}

	public SachGK(int ma, LocalDate ngaynhap, float dongia, float tt, int sl, String nxb, Scanner in) {
		super(ma, ngaynhap, dongia, tt, sl, nxb, in);
		// TODO Auto-generated constructor stub
	}

	public String getTtrang() {
		return ttrang;
	}

	public void setTtrang(String ttrang) {
		this.ttrang = ttrang;
	}

	public void nhap() {
		super.nhap();
		System.out.println("Tinh trang sach: ");
		ttrang = in.nextLine();
	}

	public double TTien() {
		if (ttrang == "moi")
			return this.tt = this.dongia * this.sl;
		else
			return this.tt = this.dongia * this.sl * 50 / 100;
	}

	@Override
	public String toString() {
		return "Sach GK: " + super.toString() + ", Tinh trang: " + ttrang + ", ThanhTien: " + tt;
	}

}
