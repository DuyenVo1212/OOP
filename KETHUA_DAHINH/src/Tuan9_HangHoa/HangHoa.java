package Tuan9_HangHoa;

import java.text.DecimalFormat;
import java.util.Objects;

public abstract class HangHoa implements Comparable<HangHoa>{
	protected String maHang;
	protected String tenHang;
	protected double donGia;
	protected int soLuongTon;

	public HangHoa(String maHang, String tenHang, double donGia, int soLuongTon) {
		super();
		setMaHang(maHang);
		setTenHang(tenHang);
		setDonGia(donGia);
		setSoLuongTon(soLuongTon);
	}

	public HangHoa() {
		this("chưa biết", "chưa biết", 0, 0);
	}

	public String getMaHang() {
		return maHang;
	}

	public void setMaHang(String maHang) {
		if (!maHang.trim().isEmpty())
			this.maHang = maHang;
		else
			this.maHang = "chưa biết";
	}

	public String getTenHang() {
		return tenHang;
	}

	public void setTenHang(String tenHang) {
		if (!tenHang.trim().isEmpty())
			this.tenHang = tenHang;
		else
			this.tenHang = "chưa biết";
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		if (donGia >= 0)
			this.donGia = donGia;
		else
			this.donGia = 0;
	}

	public int getSoLuongTon() {
		return soLuongTon;
	}

	public void setSoLuongTon(int soLuongTon) {
		if (soLuongTon >= 0)
			this.soLuongTon = soLuongTon;
		else
			this.soLuongTon = 0;
	}

   public	abstract String danhGia();

	public abstract double tinhTienVAT();

	@Override
	public int hashCode() {
		return Objects.hash(maHang);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HangHoa other = (HangHoa) obj;
		return Objects.equals(maHang, other.maHang);
	}
	@Override
	public int compareTo(HangHoa o) {
		if(this.soLuongTon>o.soLuongTon) return 1;
		if(this.soLuongTon<o.soLuongTon) return -1;
		return 0;
	}
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.00");
		return String.format("%-15s%-15s%-15s%-15d", maHang, tenHang, df.format(donGia), soLuongTon);
	}

}


