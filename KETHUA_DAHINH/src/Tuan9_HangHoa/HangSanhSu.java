package Tuan9_HangHoa;

import java.time.LocalDate;

public class HangSanhSu extends HangHoa{
	private String nhaSX;
	private LocalDate ngayNhapKho;
	public HangSanhSu(String maHang, String tenHang, double donGia, int soLuongTon, String nhaSX,
			LocalDate ngayNhapKho) {
		super(maHang, tenHang, donGia, soLuongTon);
		setNhaSX(nhaSX);
		setNgayNhapKho(ngayNhapKho);
	}

	public HangSanhSu() {
		super();
		nhaSX="chưa biết";
		ngayNhapKho=LocalDate.now();
	}

	public String getNhaSX() {
		return nhaSX;
	}
	public void setNhaSX(String nhaSX) {
		if (!nhaSX.trim().isEmpty())
			this.nhaSX = nhaSX;
		else
			this.nhaSX = "chưa biết";
	}
	public LocalDate getNgayNhapKho() {
		return ngayNhapKho;
	}
	public void setNgayNhapKho(LocalDate ngayNhapKho) {
		if(ngayNhapKho.isBefore(LocalDate.now()))
			this.ngayNhapKho = ngayNhapKho;
		else
			this.ngayNhapKho = LocalDate.now();
	}

	@Override
	public String danhGia() {
		if(LocalDate.now().getYear() == ngayNhapKho.getYear())
		{
			if(soLuongTon>50 && LocalDate.now().getDayOfYear()-ngayNhapKho.getDayOfYear()>10)
				return "Khó bán";
			else
				return "Dễn bán";
		}
		return "Dế bán";
	}

	@Override
	public double tinhTienVAT() {
		return 0.1;
	}
	public static String getTieuDe() {
		return String.format("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s","Mã hàng","Tên Hàng","Đơn giá","Số lượng tồn","Nhà sản xuất",
				"Ngày nhập kho","Đánh giá","Tiền VAT");
	}
	@Override
	public String toString() {
		return String.format("%-15s%-15s%-15s%-15s%-15f", super.toString(),nhaSX,ngayNhapKho,danhGia(),tinhTienVAT());
	}
	
}

