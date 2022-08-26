package NhanVien_ck_nomenu;

import java.time.LocalDate;

public class HopDong extends NhanVien{
	private int soNgayCong;
	
	@Override
	public double thanhTien() {
		// TODO Auto-generated method stub
		double tien = 0;
		if(soNgayCong <= 15)
			tien = 100000*soNgayCong;
		else
			if(soNgayCong <= 20)
				tien = 150000*soNgayCong;
			else
				tien = 200000*soNgayCong;
		return tien;
	}

	public int getSoNgayCong() {
		return soNgayCong;
	}

	public void setSoNgayCong(int soNgayCong) {
		this.soNgayCong = soNgayCong;
	}

	public HopDong(String maNV, String hoTen, LocalDate ngayVaoLam, int soNgayCong) {
		super(maNV, hoTen, ngayVaoLam);
		this.soNgayCong = soNgayCong;
	}

	public HopDong() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return super.toString() + String.format("%-10s %-10s", soNgayCong, thanhTien());
	}
}
