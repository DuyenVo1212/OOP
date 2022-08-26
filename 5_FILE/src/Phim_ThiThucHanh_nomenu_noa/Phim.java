package Phim_ThiThucHanh_nomenu_noa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public abstract class Phim {
	private String maPhim;
	private String tenPhim;
	private LocalDate ngayChieu;
	private String diaChi;
	private int soSuatChieu;
	private int giaSuatChieu;

	public String getMaPhim() {
		return maPhim;
	}

	public void setMaPhim(String maPhim) {
		this.maPhim = maPhim;
	}

	public String getTenPhim() {
		return tenPhim;
	}

	public void setTenPhim(String tenPhim) {
		this.tenPhim = tenPhim;
	}

	public LocalDate getNgayChieu() {
		return ngayChieu;
	}

	public void setNgayChieu(LocalDate ngayChieu) {
		this.ngayChieu = ngayChieu;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public int getSoSuatChieu() {
		return soSuatChieu;
	}

	public void setSoSuatChieu(int soSuatChieu) {
		this.soSuatChieu = soSuatChieu;
	}

	public int getGiaSuatChieu() {
		return giaSuatChieu;
	}

	public void setGiaSuatChieu(int giaSuatChieu) {
		this.giaSuatChieu = giaSuatChieu;
	}

	public Phim(String maPhim, String tenPhim, LocalDate ngayChieu, String diaChi, int soSuatChieu, int giaSuatChieu) {
		super();
		this.maPhim = maPhim;
		this.tenPhim = tenPhim;
		this.ngayChieu = ngayChieu;
		this.diaChi = diaChi;
		this.soSuatChieu = soSuatChieu;
		this.giaSuatChieu = giaSuatChieu;
	}

	public Phim() {
		super();
	}

	public abstract float doanhThu();

	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("%10s %15s %15s %15s %10d %15d %10.0f", maPhim, tenPhim, dtf.format(ngayChieu), diaChi,
				soSuatChieu, giaSuatChieu, doanhThu());
	}

	public int hashCode() {
		return Objects.hash(maPhim);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Phim other = (Phim) obj;
		return Objects.equals(maPhim, other.maPhim);
	}
}
