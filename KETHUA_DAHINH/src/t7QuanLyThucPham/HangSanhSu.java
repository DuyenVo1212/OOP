package t7QuanLyThucPham;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class HangSanhSu extends HangHoa {
	private LocalDate ngayNhapKho;
	private String nhaSanXuat;
	
	public LocalDate getNgayNhapKho() {
		return ngayNhapKho;
	}
	
	public void setNgayNhapKho(LocalDate ngayNhapKho) {
		this.ngayNhapKho = ngayNhapKho;
	}
	
	public String getNhaSanXuat() {
		return nhaSanXuat;
	}
	
	public void setNhaSanXuat(String nhaSanXuat) {
		this.nhaSanXuat = nhaSanXuat;
	}

	public HangSanhSu(String tenHang, String maHang, int soLuongTon, double donGia, LocalDate ngayNhapKho,
			String nhaSanXuat) {
		super(tenHang, maHang, soLuongTon, donGia);
		this.ngayNhapKho = ngayNhapKho;
		this.nhaSanXuat = nhaSanXuat;
	}

	public HangSanhSu() {
		super();
	}
	
	public double tinhTienVAT() {
		return getDonGia() * getSoLuongTon() * 0.1;
	}
	
	public static String tieuDe() {
		String str = String.format("%15s %10s %15s %10s %15s %15s", "Ten hang", "Ma hang", "so luong ton", "gia","ngay nhap kho", "nha sx");
		return str;
	}
	
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return super.toString() + String.format("%15s %15s", dtf.format(ngayNhapKho), nhaSanXuat);
	}
	
	public String danhGiaHangHoa() {
		Period ngay = Period.between(ngayNhapKho, LocalDate.now());
		int day = ngay.getDays();
		int month = ngay.getMonths();
		int year = ngay.getYears();
		int thoiGianLuuKho = day + month * 30 + year * 365;
		if(super.getSoLuongTon() > 50 && thoiGianLuuKho > 10)
			return "Ban cham";
		else
			return "Khong danh gia";
	}
}
