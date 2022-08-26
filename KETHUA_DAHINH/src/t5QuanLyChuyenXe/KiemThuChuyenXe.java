package t5QuanLyChuyenXe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class KiemThuChuyenXe {
	
	public static String tieuDe1() {
		String s="";
		s+=String.format("%8s%10s%8s%10s%10s%10s","Mã Xe","Họ tên TX","Số Xe","Doanh Thu","Số KM","Số Tuyến");
		return s;
	}
	
	public static String tieuDe2() {
		String s="";
		s+=String.format("%8s%10s%8s%10s%20s%10s","Mã Xe","Họ tên TX","Số Xe","Doanh Thu","Nơi đến","Số ngày");
		return s;
	}
	
	public static void xuat(ArrayList<ChuyenXe> dsCx) {
		System.out.println("Nội Thành");
		System.out.println(tieuDe1());
		for(ChuyenXe cx : dsCx)
			if(cx instanceof ChuyenXeNoiThanh)
				System.out.println(cx);
		System.out.println("Ngoại Thành");
		System.out.println(tieuDe2());
		for(ChuyenXe cx : dsCx)
			if(cx instanceof ChuyenXeNgoaiThanh)
				System.out.println(cx);
	}
	
	public static ChuyenXe SuaXe(DanhSachChuyenXe ds) {
		String maXe,hoTenTX,soXe,soTuyen,noiDen;
		double doanhThu;
		Scanner input = new Scanner(System.in);
		System.out.println("Nhập mã cần sửa");
		maXe = input.nextLine();
		
		ChuyenXe tim = ds.timXe(maXe);
		if(tim!=null) {
			System.out.println("Thông tin trước khi sửa");
			System.out.println(tim);
			tim.setMaXe(maXe);
			System.out.println("Nhập họ tên tài xế");
			hoTenTX = input.nextLine();
			tim.setHoTenTX(hoTenTX);
			System.out.println("Nhập số xe");
			soXe = input.nextLine();
			tim.setSoXe(soXe);
			System.out.println("Nhập doanh thu");
			doanhThu = input.nextDouble();
			tim.setDoanhThu(doanhThu);
			return tim;			
		}
		return null;
	}
	
	public static void menu() {
		System.out.println("CHƯƠNG TRÌNH QUẢN LÝ CHUYẾN XE");
		System.out.println("1.Nhập danh sách chuyến xe");
		System.out.println("2.Xuất danh sách chuyến xe");
		System.out.println("3.Hiển thị doanh thu");
		System.out.println("4.Xóa Chuyến xe");
		System.out.println("5.Sửa Chuyến xe");
		System.out.println("6.Tìm Bá Đạo");
		System.out.println("7.Sắp Xếp");
		System.out.println("8.Sắp xếp theo tên");
		System.out.println("9.Sắp xếp ...");
		System.out.println("0. Thoát chương trình");
		System.out.println("Hãy nhập lựa chọn");
		
	}
	
	public static ChuyenXe themChuyenXe() {
		ChuyenXe x =null;
		String maXe,hoTenTX,soXe,soTuyen,noiDen;
		double doanhThu;
		int soKM,soNgay,loaiXe;
		Scanner scn = new Scanner(System.in);
		try {
			System.out.println("Nhập mã chuyến xe:");
			maXe = scn.nextLine();
			System.out.println("Nhập vào họ tên tài xế:");
			hoTenTX= scn.nextLine();
			System.out.println("Nhập vào số xe:");
			soXe = scn.nextLine();
			System.out.println("Nhập doanh thu:");
			doanhThu= scn.nextDouble();
			System.out.println("Bạn muốn thêm:");
			System.out.println("Nhập 1 nếu muốn thêm nội thành");
			System.out.println("Nhập 2 nếu muốn thêm nội thành");
			loaiXe= scn.nextInt();
			switch(loaiXe) {
			case 1:// nội thành
					System.out.println("Nhập số Km");
					soKM = scn.nextInt();
					System.out.println("Nhập số tuyến");
					scn.nextLine();
					soTuyen= scn.nextLine();
					x = new ChuyenXeNoiThanh( maXe, hoTenTX, soXe, doanhThu, soKM, soTuyen);
					break;
			case 2://ngoại thành
				System.out.println("Nhập nơi đến");
				scn.nextLine();
				noiDen= scn.nextLine();
				System.out.println("Nhập số ngày ");
				soNgay= scn.nextInt();
				x = new ChuyenXeNgoaiThanh( maXe, hoTenTX, soXe, doanhThu, noiDen, soNgay);
				break;
			}
			
		}
		catch (InputMismatchException e1) {
			System.out.println("Lỗi nhập liệu");
		}
		catch (ArrayIndexOutOfBoundsException e2) {
			System.out.println("Vượt kích thước mảng");
		}
		catch (Exception e) {
			System.out.println("Bị lỗi: " + e.getMessage());
		}
		finally {
			return x;
		}
	}
	
	public static void nhapCung(DanhSachChuyenXe dsCx) {
		
		ChuyenXe cx= new ChuyenXeNoiThanh("002", "Nguyễn Lương Đạt", "29732", 500000, 1500, "TP.HCM-HN");
		dsCx.themCX(cx);
		
		ChuyenXe cx1= new ChuyenXeNoiThanh("001", "Lý Huy Vân", "29103", 1000000, 500, "TP.HCM-BD");
		dsCx.themCX(cx1);
		
		
		ChuyenXe cx3= new ChuyenXeNgoaiThanh("004", "Vô Oschos", "15323", 2000000, "Đồng Nai", 4);
		dsCx.themCX(cx3);
		
		ChuyenXe cx2= new ChuyenXeNgoaiThanh("003", "Trương Công", "29323", 4000000, "TP.HCM", 14);
		dsCx.themCX(cx2);
	}
	
	public static void main(String[] args) {
		ChuyenXe cx= new ChuyenXe();
		DanhSachChuyenXe dsCx = new DanhSachChuyenXe();
		Scanner input = new Scanner(System.in);
		String maXe,hoTenTX,soXe,soTuyen,noiDen;
		double doanhThu;
		int soKM,soNgay;
		menu();
		int choise = -1;
		choise = input.nextInt();
		if(choise==0) {
			System.out.println("Xin Cảm Ơn");
		}
		while(choise!=0) {
			switch(choise) {
			case 1:
				nhapCung(dsCx);
				dsCx.themCX(themChuyenXe());
				break;
			case 2: 
				xuat(dsCx.getAllCX());
				break;
			case 3: 
				System.out.println("Doanh Thu Chuyến Xe Nội Thành" +dsCx.tongDThuNoiThanh());
				System.out.println("Doanh Thu Chuyến Xe Ngoại Thành" +dsCx.tongDThuNgoaiThanh());
				break;
			case 4: 
				String hoi="";
				Scanner Xa = new Scanner(System.in);
				System.out.println("Nhap vao ma xe muon xoa");
				String ma1 = Xa.nextLine();
				ChuyenXe Xe1 = dsCx.timXe(ma1);
				if(Xe1!=null) {
					System.out.println("Bạn có muốn xóa Y/N? nhấn Y để xóa");
					hoi = Xa.nextLine();
					if(hoi.equalsIgnoreCase("y")) {
						dsCx.xoa(Xe1);
						System.out.println("Đã xóa, hơ lửa để lấy lại dữ liệu");
					}
				}
				break;
			case 5: 
				ChuyenXe x = SuaXe(dsCx);
				dsCx.Sua(x);
			case 6:
				System.out.println("nhập tên TX cần tìm");
				input.nextLine();
				hoTenTX = input.nextLine();
				int tim=dsCx.TimBaDao(hoTenTX);
				System.out.println("a"+tim);
				break;
			case 7: 
				Collections.sort(dsCx.getAllCX());
				break;
			case 8: 
				dsCx.SapXepSoNguyen();
				break;
			case 9:
				dsCx.SapXep_Tenvs_DT();
			default: 
				System.out.println("Lựa chọn sai");
				break;
			}
			menu();
			choise = input.nextInt();
			if(choise ==0) {
				System.out.println("Xin Cảm Ơn");
				break;
			}
		}
	}
}
