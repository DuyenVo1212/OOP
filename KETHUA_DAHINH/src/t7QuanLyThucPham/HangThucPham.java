package t7QuanLyThucPham;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HangThucPham extends HangHoa {
	private LocalDate ngaySanXuat;
	private LocalDate ngayHetHan;
	private String nhaCungCap;
	
	public LocalDate getNgaySanXuat() {
		return ngaySanXuat;
	}
	
	public void setNgaySanXuat(LocalDate ngaySanXuat) {
		if (ngaySanXuat.isBefore(LocalDate.now())) {
			this.ngaySanXuat = ngaySanXuat;
		} else
			this.ngaySanXuat = LocalDate.now();
	}
	
	public LocalDate getNgayHetHan() {
		return ngayHetHan;
	}
	
	public void setNgayHetHan(LocalDate ngayHetHan) {
		if (ngayHetHan.isAfter(ngaySanXuat)) {
			this.ngayHetHan = ngayHetHan;
		} else
			this.ngayHetHan = ngaySanXuat;
	}
	
	public String getNhaCungCap() {
		return nhaCungCap;
	}
	
	public void setNhaCungCap(String nhaCungCap) {
		this.nhaCungCap = nhaCungCap;
	}

	public HangThucPham(String tenHang, String maHang, int soLuongTon, double donGia, LocalDate ngaySanXuat, LocalDate ngayHetHan, String nhaCungCap) {
		super(tenHang, maHang, soLuongTon, donGia);
		this.ngaySanXuat = ngaySanXuat;
		this.ngayHetHan = ngayHetHan;
		this.nhaCungCap = nhaCungCap;
	}

	public HangThucPham(String tenHang, String maHang, int soLuongTon, double donGia, String nhaCungCap) {
		super(tenHang, maHang, soLuongTon, donGia);
		this.ngaySanXuat = LocalDate.now();
		this.ngayHetHan = LocalDate.now();
		this.nhaCungCap = nhaCungCap;
	}

	public HangThucPham() {
		super();
	}

	public double tinhTienVAT() {
		return getDonGia() * getSoLuongTon() * 0.05;
	}
	
	public static String tieuDe() {
		String str = String.format("%15s %10s %15s %10s %15s %15s %10s", "Ten hang", "Ma hang", "so luong ton", "gia","ngaySX", "ngayHH","NhaCC");
		return str;
	}
	
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return super.toString() + String.format("%15s %15s %10s", dtf.format(ngaySanXuat),dtf.format(ngayHetHan),nhaCungCap);
	}
	
	public String danhGiaHangHoa() {
		if(super.getSoLuongTon() > 0 && ngayHetHan.isBefore(LocalDate.now()))
		{
			return "Kho ban";
		}
		else {
			return "Khong danh gia";
		}
	}
}

