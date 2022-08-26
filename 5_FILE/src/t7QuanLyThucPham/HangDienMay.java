package t7QuanLyThucPham;

public class HangDienMay extends HangHoa{
	private int timeBaoHanh;
	private double congSuatKW;
	
	public int getTimeBaoHanh() {
		return timeBaoHanh;
	}
	
	public void setTimeBaoHanh(int timeBaoHanh) {
		if(timeBaoHanh >= 0) {
			this.timeBaoHanh = timeBaoHanh;
		} else {
			this.timeBaoHanh = 0;
		}
	} 
	
	public double getCongSuatKW() {
		return congSuatKW;
	}
	
	public void setCongSuatKW(double congSuatKW) {
		if(congSuatKW > 0) {
			this.congSuatKW = congSuatKW;
		} else {
			this.congSuatKW = 0;
		}
	}

	public HangDienMay(String tenHang, String maHang, int soLuongTon, double donGia, int timeBaoHanh, double congSuatKW) {
		super(tenHang, maHang, soLuongTon, donGia);
		this.timeBaoHanh = timeBaoHanh;
		this.congSuatKW = congSuatKW;
	}

	public HangDienMay() {
		super();
	}
	
	public double tinhTienVAT() {
		return getDonGia() * getSoLuongTon() * 0.1;
	}
	
	public static String tieuDe() {
		String str = String.format("%15s %10s %15s %10s %15s %10s", "Ten hang", "Ma hang", "so luong ton", "gia","thoi gian bh", "cong suat");
		return str;
	}
	
	public String toString() {
		return super.toString() + String.format("%15d %10.2f", timeBaoHanh, congSuatKW);
	}
	
	public String danhGiaHangHoa() {
		if(super.getSoLuongTon() < 3)
			return "Ban duoc";
		else
			return "Khong danh gia";
	}
}
