package t6QuanLyPhongHoc;

import java.util.Objects;

public abstract class Phong {
	private String maPhong;
	private String dayNha;
	private float dienTich;
	private int soBongDen;
	
	public String getMaPhong() {
		return maPhong;
	}
	
	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}
	
	public String getDayNha() {
		return dayNha;
	}
	
	public void setDayNha(String dayNha) {
		this.dayNha = dayNha;
	}
	
	public float getDienTich() {
		return dienTich;
	}
	
	public void setDienTich(float dienTich) {
		this.dienTich = dienTich;
	}
	
	public int getSoBongDen() {
		return soBongDen;
	}
	
	public void setSoBongDen(int soBongDen) {
		this.soBongDen = soBongDen;
	}

	public Phong(String maPhong, String dayNha, float dienTich, int soBongDen) {
		super();
		this.maPhong = maPhong;
		this.dayNha = dayNha;
		this.dienTich = dienTich;
		this.soBongDen = soBongDen;
	}

	public Phong() {
		super();
	}
	
	public abstract boolean datChuan();
	
	public String toString() {
		return String.format("%10s %10s %10f %15d",maPhong, dayNha, dienTich, soBongDen);
	}

	public int hashCode() {
		return Objects.hash(maPhong);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Phong other = (Phong) obj;
		return Objects.equals(maPhong, other.maPhong);
	}
}
