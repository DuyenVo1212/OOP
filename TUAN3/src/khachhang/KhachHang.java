package khachhang;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class KhachHang {
	
//	Date date = new Date();
//	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	protected int MaKH, SoLuong;
	protected double DonGia, ThanhTien;
	protected String  HoTenKH;
	protected LocalDate ngayHD;
	int ngay,thang,nam;
	Scanner in = new Scanner(System.in);

	protected KhachHang() {
		this.MaKH = 0;
		this.DonGia = 0;
		this.ngayHD = null;
		this.HoTenKH = "";
		this.SoLuong = 0;
	}

	protected KhachHang(int ma, double dgia, LocalDate ngayHD, String hoten, int sl, double ttien) {
		this.MaKH = ma;
		this.DonGia = dgia;
		this.ngayHD = ngayHD;
		this.HoTenKH = hoten;
		this.SoLuong = sl;
		this.ThanhTien = ttien;
	}

	protected int getMaKH() {
		return MaKH;
	}

	protected void setMaKH(int maKH) {
		MaKH = maKH;
	}

	protected double getDonGia() {
		return DonGia;
	}

	protected void setDonGia(double donGia) {
		DonGia = donGia;
	}

	public LocalDate getNgayHD() {
		return ngayHD;
	}

	public void setNgayHD(LocalDate ngayHD) {
		this.ngayHD = ngayHD;
	}

	protected String getHoTenKH() {
		return HoTenKH;
	}

	protected void setHoTenKH(String hoTenKH) {
		HoTenKH = hoTenKH;
	}

	protected int getSoLuong() {
		return SoLuong;
	}

	protected void setSoLuong(int sl) {
		SoLuong = sl;
	}

	protected double getThanhTien() {
		return ThanhTien;
	}

	protected void setThanhTien(double thanhTien) {
		ThanhTien = thanhTien;
	}

	protected void nhap() {
		System.out.println("Nhap Ma Khach Hang: ");
		MaKH = in.nextInt();
		in.nextLine();
		System.out.println("Ho va Ten Khach Hang: ");
		HoTenKH = in.nextLine();
		System.out.println("Ngay Lap Hoa Don: ");
//		aa.setngayHD(formatter.parse(in.next()));
		System.out.print("Nhap ngay: ");
		ngay = in.nextInt();
		System.out.print("Nhap thang: ");
		thang = in.nextInt();
		System.out.print("Nhap nam: ");
		nam = in.nextInt();
		System.out.println("So Luong(KW): ");
		SoLuong = in.nextInt();
		System.out.println("Don Gia: ");
		DonGia = in.nextDouble();
	}

	@Override
	public String toString() {
		return String.format("%5d %5s %10s %5d %5f",
				MaKH, HoTenKH, LocalDate.of(nam,thang,ngay), SoLuong, DonGia);
	}

	
	
}