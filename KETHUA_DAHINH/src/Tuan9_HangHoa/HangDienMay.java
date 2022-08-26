package Tuan9_HangHoa;

public class HangDienMay extends HangHoa{
	private int thoiGianBH;
	private double congSuat;
	public HangDienMay(String maHang, String tenHang, double donGia, int soLuongTon, int thoiGianBH, double congSuat) {
		super(maHang, tenHang, donGia, soLuongTon);
		setThoiGianBH(thoiGianBH);
		setCongSuat(congSuat);
	}
	public HangDienMay() {
		super();
		thoiGianBH=0;
		congSuat=0;
	}
	public int getThoiGianBH() {
		return thoiGianBH;
	}
	public void setThoiGianBH(int thoiGianBH)  {
		if (thoiGianBH >= 0)
			this.thoiGianBH = thoiGianBH;
		else
			this.thoiGianBH = 0;
	}
	public double getCongSuat() {
		return congSuat;
	}
	public void setCongSuat(double congSuat) {
		if (congSuat >= 0)
			this.congSuat = congSuat;
		else
			this.congSuat = 0;
	}
	@Override
	public String danhGia() {
		if(soLuongTon<3)
			return "Bán được";
		else
			return "Khó bán";
	}
	@Override
	public double tinhTienVAT() {
		return donGia*0.1;
	}
	public static String getTieuDe() {
		return String.format("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s","Mã hàng","Tên Hàng","Đơn giá","Số lượng tồn","Thời Gian BH",
				"Công suất","Đánh giá","Tiền VAT");
	}
	@Override
	public String toString() {
		return String.format("%-15s%-15s%-15s%-15s%-15s", super.toString(),thoiGianBH,congSuat,danhGia(),tinhTienVAT());
	}

}


