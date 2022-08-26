package t6_KhachSan_good;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Test {
	public static void nhapMemGio(DanhSachHD dsHD) throws ParseException
	{
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Scanner scan=new Scanner(System.in);
		Gio a=new Gio();
		System.out.print("Nhap MaKh:");
		a.setMaHD(scan.next());
		System.out.print("Nhap NgayHd:");
		a.setNgayHD(formatter.parse(scan.next()));
		System.out.print("Nhap TenKh:");
		a.setTenKH(scan.next());
		System.out.print("Nhap MaPhong:");
		a.setMaPhong(scan.next());
		System.out.print("Nhap DonGia:");
		a.setDonGia(scan.nextInt());
		System.out.print("Nhap so Gio:");
		a.setSoGio(scan.nextInt());
	}
	public static void nhapMemNgay(DanhSachHD dsHD) throws ParseException
	{
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Scanner scan=new Scanner(System.in);
		Ngay a= new Ngay();
		System.out.print("Nhap MaKh:");
		a.setMaHD(scan.next());
		System.out.print("Nhap NgayHd:");
		a.setNgayHD(formatter.parse(scan.next()));
		System.out.print("Nhap TenKh:");
		a.setTenKH(scan.next());
		System.out.print("Nhap MaPhong:");
		a.setMaPhong(scan.next());
		System.out.print("Nhap DonGia:");
		a.setDonGia(scan.nextInt());
		System.out.print("Nhap So ngay:");
		a.setSoNgayThue(scan.nextInt());
	}
	public static int menu()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("\nMenu:");
		System.out.println("1. Nhap them 1 hoa don");
		System.out.println("2. Xuat DS hoa don");
		System.out.println("3. so hoa don theo ngay");
		System.out.println("4. so hoa don theo gio");
		System.out.println("5. Tong thanh tien");
		System.out.println("0. Thoat");
		System.out.print("Chon: ");
		int choose=scan.nextInt();
		return choose;
	}
	
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Gio g1=new Gio("a03", formatter.parse("20/9/2020"), "Nguyen an", "h1", 50000, 15);
		Gio g2=new Gio("h01", formatter.parse("10/9/2020"), "Nguyen binh", "b1", 40000, 6);
		Ngay n1=new Ngay("h01", formatter.parse("10/9/2021"), "Nguyen phuong", "c1", 10000, 4);
		Ngay n2=new Ngay("d01", formatter.parse("10/10/2020"), "Nguyen son", "d1", 60000, 2);
		Ngay n3=new Ngay("c01", formatter.parse("26/9/2020"), "Nguyen na", "z1", 400000, 9);
		DanhSachHD dsHD=new DanhSachHD(10);
		dsHD.add(g1); dsHD.add(n1);
		dsHD.add(g2); dsHD.add(n2);
		dsHD.add(n3);
		
		Scanner scan=new Scanner(System.in);
		int choose;
		 do
			{
				choose=menu();
				switch (choose) {
				case 0: {
					break;
				}
				case 1:{
					System.out.println("1. Hoa don thue gio");
					System.out.println("2. Hoa don thue ngay");
					System.out.print("chon: ");
					int chon=scan.nextInt();
					if(chon==2)nhapMemGio(dsHD);
					else nhapMemGio(dsHD);
					break;
				}
				case 2:{
					
					System.out.println(dsHD);
					break;
				}
				case 3:
				{
					System.out.println("So hoa don theo ngay: "+dsHD.soLuongHoaDonTheoNgay());
					break;
				}
				case 4:
				{
					System.out.println("So hoa don theo gio: "+dsHD.soLuongHoaDonTheoGio());
					break;
				}
				case 5:{
					System.out.print("Nhap thang:");
					int thang=scan.nextInt();
					System.out.print("Nhap nam:");
					int nam=scan.nextInt();
					System.out.println("Tong thanh tien cua thang "+thang+" nam "+nam+dsHD.tinhTongThanhTien(thang, nam));
					break;
				}
				
				default:
					System.out.println("sai cu phap!");
				}
				
			}while(choose!=0);
			System.out.println("Thoat thanh cong!");
	}

}
