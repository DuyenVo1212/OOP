package Tuan9_HangHoa;

import java.time.LocalDate;

public class HangThucPham extends HangHoa {
	private String nhaCungCap;
	private LocalDate ngaySX;
	private LocalDate ngayHH;

	public HangThucPham() {
		super();
		nhaCungCap = "chưa biết";
		ngaySX = LocalDate.now();
		ngayHH = LocalDate.now();

	}

	public HangThucPham(String maHang, String tenHang, double donGia, int soLuongTon, String nhaCungCap,
			LocalDate ngaySX, LocalDate ngayHH) {
		super(maHang, tenHang, donGia, soLuongTon);
		setNhaCungCap(nhaCungCap);
		setNgaySX(ngaySX);
		setNgayHH(ngayHH);
	}

	public String getNhaCungCap() {
		return nhaCungCap;
	}

	public void setNhaCungCap(String nhaCungCap) {
		if (!nhaCungCap.trim().isEmpty())
			this.nhaCungCap = nhaCungCap;
		else
			this.nhaCungCap = "chưa biết";
	}

	public LocalDate getNgaySX() {
		return ngaySX;
	}

	public void setNgaySX(LocalDate ngaySX) {
		if (ngaySX.isBefore(LocalDate.now()))
			this.ngaySX = ngaySX;
		else
			this.ngaySX = LocalDate.now();
	}

	public LocalDate getNgayHH() {
		return ngayHH;
	}

	public void setNgayHH(LocalDate ngayHH) {
		if (ngayHH.isAfter(ngaySX))
			this.ngayHH = ngayHH;
		else
			this.ngayHH = ngaySX;
	}

	@Override
	public String danhGia() {
		if(soLuongTon>0 && ngayHH.isBefore(LocalDate.now()))
			return "Khó bán";
		else
			return "Dễ bán";
	}

	@Override
	public double tinhTienVAT() {
		return 0.05;
	}
	public static String getTieuDe() {
		return String.format("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s","Mã hàng","Tên Hàng","Đơn giá","Số lượng tồn","Nhà cung cấp",
				"Ngày sản xuất","Ngày hết hạn","Đánh giá","Tiền VAT");
	}
	@Override
	public String toString() {
		return String.format("%-15s%-15s%-15s%-15s%-15s%-15f",super.toString(),nhaCungCap,ngaySX,ngayHH,danhGia(),tinhTienVAT());
	}



}

