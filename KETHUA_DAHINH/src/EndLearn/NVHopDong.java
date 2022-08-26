package EndLearn;

import java.time.LocalDate;

public class NVHopDong extends NhanVien{
	private int snCong;

	public int getSnCong() {
		return snCong;
	}

	public void setSnCong(int snCong) {
		if(snCong >= 0 && snCong <= 30)
			this.snCong = snCong;
	}

	public NVHopDong(String maNV, String hoTen, LocalDate ngayLam, int snCong) {
		super(maNV, hoTen, ngayLam);
		this.snCong = snCong;
	}

	public NVHopDong() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public double TinhLuong() {
		if(snCong >= 20) {
			return snCong * 200000;
		} else if(snCong >= 15) {
			return snCong * 150000;
		}
		return snCong * 100000;
	}
	public String toString() {
		return super.toString() + String.format("%-10s %-10.2f", snCong, TinhLuong());
	}
}
