package Sach;

import java.time.LocalDate;
import java.util.Scanner;

class SachTK extends Sach {

	private double thue;

	public SachTK(int ma, LocalDate ngaynhap, float dongia, float tt, int sl, String nxb, Scanner in, double thue) {
		super(ma, ngaynhap, dongia, tt, sl, nxb, in);
		this.thue = thue;
	}

	public SachTK() {
		super();
		thue = 0;
		// TODO Auto-generated constructor stub
	}

	public double getThue() {
		return thue;
	}

	public void setThue(double thue) {
		this.thue = thue;
	}

	public double TTien() {
		return this.tt = this.sl * this.dongia + this.thue;

	}
}
