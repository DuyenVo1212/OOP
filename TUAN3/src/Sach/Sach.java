package Sach;

import java.time.LocalDate;
import java.util.Scanner;

public class Sach {
	protected int ma;
	protected LocalDate ngaynhap;
	protected int sl;
	protected String nxb;
	Scanner in = new Scanner(System.in);
	protected float dongia;
	double tt;

	public Sach(int ma, LocalDate ngaynhap, float dongia, float tt, int sl, String nxb, Scanner in) {
		super();
		this.ma = ma;
		this.ngaynhap = ngaynhap;
		this.dongia = dongia;
		this.tt = tt;
		this.sl = sl;
		this.nxb = nxb;
		this.in = in;
	}

	public Sach() {
		super();
		ma = 0;
		ngaynhap = null;
		dongia = 0;
		sl = 0;
		nxb = "";
		tt = 0;
		// TODO Auto-generated constructor stub
	}

	public int getMa() {
		return ma;
	}

	public void setMa(int ma) {
		this.ma = ma;
	}

	public LocalDate getNgaynhap() {
		return ngaynhap;
	}

	public double getTt() {
		return tt;
	}

	public void setTt(float tt) {
		this.tt = tt;
	}

	public void setNgaynhap(LocalDate ngaynhap) {
		this.ngaynhap = ngaynhap;
	}

	public float getDongia() {
		return dongia;
	}

	public void setDongia(float dongia) {
		this.dongia = dongia;
	}

	public int getSl() {
		return sl;
	}

	public void setSl(int sl) {
		this.sl = sl;
	}

	public String getNxb() {
		return nxb;
	}

	public void setNxb(String nxb) {
		this.nxb = nxb;
	}

	public Scanner getIn() {
		return in;
	}

	public void setIn(Scanner in) {
		this.in = in;
	}

	protected void nhap() {
		in.nextLine();
		System.out.println("Ma sach: ");
		ma = in.nextInt();
		System.out.println("Ngay nhap: ");
		// ngaynhap=in.
		System.out.println("Don Gia: ");
		dongia = in.nextFloat();
		System.out.println("So Luong: ");
		sl = in.nextInt();
	}

	@Override
	public String toString() {
		return "Sach [ma=" + ma + ", ngaynhap=" + ngaynhap + ", sl=" + sl + ", nxb=" + nxb + ", in=" + in + ", dongia="
				+ dongia + ", tt=" + tt + "]";
	}

}
