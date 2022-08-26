package Phim_ThiThucHanh_nomenu_noa;

import java.time.LocalDate;

public class PhimNgoai extends Phim {
	private float thue;

	public float getThue() {
		return thue;
	}

	public void setThue(float thue) {
		this.thue = thue;
	}

	public PhimNgoai(String maPhim, String tenPhim, LocalDate ngayChieu, String diaChi, int soSuatChieu,
			int giaSuatChieu, float thue) {
		super(maPhim, tenPhim, ngayChieu, diaChi, soSuatChieu, giaSuatChieu);
		this.thue = thue;
	}

	public PhimNgoai() {
		super();
	}

	public float doanhThu() {
		return getGiaSuatChieu() * getSoSuatChieu() + thue / 100 * getGiaSuatChieu() * getSoSuatChieu();
	}

	public static String tieuDe() {
		return String.format("%10s %15s %15s %15s %10s %15s %10s %15s", "ma Phim", "ten Phim", "ngay Chieu", "dia Chi",
				"so Suat Chieu", "gia Suat Chieu", "doanhThu", "Thue (%)");
	}

	public String toString() {
		return super.toString() + String.format(" %15s", thue);
	}
}
