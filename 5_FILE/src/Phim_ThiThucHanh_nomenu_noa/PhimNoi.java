package Phim_ThiThucHanh_nomenu_noa;

import java.time.LocalDate;

public class PhimNoi extends Phim {
	private String theLoai;

	public String getTheLoai() {
		return theLoai;
	}

	public void setTheLoai(String theLoai) {
		this.theLoai = theLoai;
	}

	public PhimNoi(String maPhim, String tenPhim, LocalDate ngayChieu, String diaChi, int soSuatChieu, int giaSuatChieu,
			String theLoai) {
		super(maPhim, tenPhim, ngayChieu, diaChi, soSuatChieu, giaSuatChieu);
		this.theLoai = theLoai;
	}

	public PhimNoi() {
		super();
	}

	public float doanhThu() {
		if (theLoai.compareToIgnoreCase("Phim truyen") == 0) {
			return (float) (super.getGiaSuatChieu() * super.getSoSuatChieu()
					+ (0.05 * getGiaSuatChieu() * getSoSuatChieu()));
		} else
			return (float) (super.getGiaSuatChieu() * super.getSoSuatChieu());
	}

	public static String tieuDe() {
		return String.format("%10s %15s %15s %15s %10s %15s %10s %15s", "ma Phim", "ten Phim", "ngay Chieu", "dia Chi",
				"so Suat Chieu", "gia Suat Chieu", "doanhThu", "The loai");
	}

	public String toString() {
		return super.toString() + String.format(" %15s", theLoai);
	}
}
