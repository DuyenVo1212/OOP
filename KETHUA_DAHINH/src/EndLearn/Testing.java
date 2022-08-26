package EndLearn;

import java.time.LocalDate;
import java.util.Scanner;

public class Testing {

	public static ListNhanVien ls = new ListNhanVien();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ls.AddNhanVien(new NVBienChe("BC1", "Toan", LocalDate.of(2020, 7, 8), 3.3, "Co"));
		ls.AddNhanVien(new NVBienChe("BC2", "Van", LocalDate.of(2020, 7, 8), 3.3, "Khong"));
		ls.AddNhanVien(new NVBienChe("BC3", "Nguyen", LocalDate.of(2020, 7, 8), 3.3, "Khong"));
		ls.AddNhanVien(new NVHopDong("HD1", "Han", LocalDate.of(2020, 7, 8), 25));
		ls.AddNhanVien(new NVHopDong("HD2", "Mai", LocalDate.of(2020, 7, 8), 10));
		ls.AddNhanVien(new NVHopDong("HD3", "Duc", LocalDate.of(2020, 7, 8), 16));
		Menu();
	}
	public static void Menu() {
		@SuppressWarnings({ "resource" })
		Scanner sc = new Scanner(System.in);
		int luachon;
		do {
			System.out.println("------------------MENU------------------");
			System.out.println("0. Thoat");
			System.out.println("1. Them nhan vien");
			System.out.println("2. Xuat nhan vien");
			System.out.println("3. Tong tien luong theo thang");
			System.out.println("4. Edit so ngay cong theo ma nhan vien");
			System.out.println("------------------END-------------------");
			System.out.print("Nhap lua chon: ");
			luachon = sc.nextInt();
			switch(luachon) {
				case 0: break;
				case 1:
					int them;
					System.out.println("1. Them nhan vien bien che");
					System.out.println("2. Them nhan vien hop dong");
					System.out.print("Nhap lua chon: ");
					them = sc.nextInt();
					if(them == 1) {
						ls.AddNhanVien(AddNVBienChe());
					} else if(them == 2) {
						ls.AddNhanVien(AddNVHopDong());
					} else {
						break;
					}
					break;
				case 2:
					ls.XuatNhanVien();
					break;
				case 3:
					int thang;
					System.out.print("Nhap vao so thang can tinh luong: ");
					thang = sc.nextInt();
					ls.TongTienLuong(thang);
					break;
				case 4:
					int snc;
					String maNV;
					System.out.print("Nhap so ngay can sua: ");
					snc = sc.nextInt();
					System.out.println("Nhap maNV can sua: ");
					maNV = sc.nextLine();
					ls.EditSoNGayCong(maNV, snc);
					break;
				case 5:
					System.out.println("Nhan vien khong hoan thanh");
					ls.NhanVienKhongHoanThanh();
				default:
					break;
			}
		}
		while(luachon != 0);
		
	}
	public static NVBienChe AddNVBienChe() {
		String maNV, hoTen, trangThai;
		int ngay, thang, nam;
		double heSo;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma nhan vien: ");
		maNV = sc.nextLine();
		System.out.println("Nhap ho ten: ");
		hoTen = sc.nextLine();	
		System.out.println("Nhap ngay thang nam: ");
		System.out.print("Nhap ngay: ");
		ngay = sc.nextInt();
		System.out.print("Nhap thang: ");
		thang = sc.nextInt();
		System.out.print("Nhap nam: ");
		nam = sc.nextInt();
		System.out.println("Nhap he so luong: ");
		heSo =  sc.nextDouble();
		System.out.println("Nhap trang thai(Co/Khong): ");
		trangThai = sc.nextLine();
		NVBienChe nv = new NVBienChe(maNV, hoTen, LocalDate.of(nam, thang, ngay), heSo, trangThai);
		return nv;
	}
	public static NVHopDong AddNVHopDong() {
		String maNV, hoTen;
		int ngay, thang, nam;
		int ngayCong;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma nhan vien: ");
		maNV = sc.nextLine();
		System.out.println("Nhap ho ten: ");
		hoTen = sc.nextLine();	
		System.out.println("Nhap ngay thang nam: ");
		System.out.print("Nhap ngay: ");
		ngay = sc.nextInt();
		System.out.print("Nhap thang: ");
		thang = sc.nextInt();
		System.out.print("Nhap nam: ");
		nam = sc.nextInt();
		System.out.println("Nhap ngay cong: ");
		ngayCong =  sc.nextInt();
		NVHopDong nv = new NVHopDong(maNV, hoTen, LocalDate.of(nam, thang, ngay), ngayCong);
		return nv;
	}
}
