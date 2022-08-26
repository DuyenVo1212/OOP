package X_HANGHOA;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
public class KiemThuHH {
	static DanhSachHangHoa dsHH= new DanhSachHangHoa();
	static HangHoa hhoa;
	static Scanner sc = new Scanner(System.in);
	static DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	static void line()
	{
		System.out.println("=============================================================================================");
	}
	
	// Chuyển String thành Date
	static Date stringToDate(String s)  
	{
		Date date= new Date();
		try {
			date = df.parse(s);
		}
		catch(ParseException e) {
			System.out.println("[THÔNG BÁO] Nhập định dạng Date sai!");
		}
		return date;
	}
	// Tiêu đ�?
	static void tieuDe()
	{
		
		String tieuDe1= String.format("%-30s%-30s%-30s%-30s%-30s%-30s",
				"Mã Hàng","Tên Hàng","Đơn Giá","SL tồn","Mức Buôn Bán","Thành Tiền");
		String tieuDe2= String.format("\n%-30s%-30s%-30s%-30s%-30s%-30s%-30s","Nhà cung cấp","Ngày Sản Xuất","Ngày Hết Hạn","Nhà Sản Xuất","Ngày Nhập Kho","Th�?i gian BH","Công suất" );
		System.out.println(tieuDe1+tieuDe2);
	}
	
	// <=======================Tất tần tật các loại Menu=======================>
	static void Menu() {
		System.out.println("\t*********************************************************");
		System.out.println("\t*\t Chương trình quản lí Hàng hóa\t\t\t*");
		System.out.println("\t*\t 1. Thêm một Hàng hóa\t\t\t\t*");
		System.out.println("\t*\t 2. Xóa một Hàng hóa\t\t\t\t*");
		System.out.println("\t*\t 3. Sửa một Hàng hóa\t\t\t\t*");
		System.out.println("\t*\t 4. Xuất thông tin theo tùy chọn \t\t*");
		System.out.println("\t*\t 5. Sắp xếp theo tùy chọn\t\t\t*");
		System.out.println("\t*\t 6. Thoát\t\t\t\t\t*");
		System.out.println("\t*********************************************************");
	}
	static void MenuXuatThongTin()
	{
		System.out.println("\t*********************************************************");
		System.out.println("\t*\t 1. Xuất tất cả thông tin trong Danh Sách\t*");
		System.out.println("\t*\t 2. Xuất thông tin Hàng Thực Phẩm\t\t*");
		System.out.println("\t*\t 3. Xuất thông tin Hàng Sành Sứ\t\t\t*");
		System.out.println("\t*\t 4. Xuất thông tin Hàng Điện Máy\t\t*");
		System.out.println("\t*\t 5. Xuất thông tin Hàng hóa khó bán\t\t*");
		System.out.println("\t*\t [Phím khác]. Quay về Menu chính\t\t*");
		System.out.println("\t*********************************************************");
	}
	static void MenuSuaHTP()
	{
		System.out.println("\t*********************************************************");
		System.out.println("\t*\t 1. Nhập Tên Hàng\t\t\t\t*");
		System.out.println("\t*\t 2. Nhập Đơn Giá\t\t\t\t*");
		System.out.println("\t*\t 3. Nhập Số Lượng Tồn\t\t\t\t*");
		System.out.println("\t*\t 4. Nhập Nhà Cung Cấp\t\t\t\t*");
		System.out.println("\t*\t 5. Nhập Ngày Sản Xuất\t\t\t\t*");
		System.out.println("\t*\t 6. Nhập Ngày Hết Hạn\t\t\t\t*");
		System.out.println("\t*\t [Phím khác]. Quay về Menu chính\t\t*");
		System.out.println("\t*********************************************************");
	}
	static void MenuSuaHSS()
	{
		System.out.println("\t*********************************************************");
		System.out.println("\t*\t 1. Nhập Tên Hàng\t\t\t\t*");
		System.out.println("\t*\t 2. Nhập Đơn Giá\t\t\t\t*");
		System.out.println("\t*\t 3. Nhập Số Lượng Tồn\t\t\t\t*");
		System.out.println("\t*\t 4. Nhập Nhà Sản Xuất\t\t\t\t*");
		System.out.println("\t*\t 5. Nhập Ngày Nhập Kho\t\t\t\t*");
		System.out.println("\t*\t [Phím khác]. Quay về Menu chính\t\t*");
		System.out.println("\t*********************************************************");
	}
	static void MenuSuaHDM()
	{
		System.out.println("\t*********************************************************");
		System.out.println("\t*\t 1. Nhập Tên Hàng\t\t\t\t*");
		System.out.println("\t*\t 2. Nhập Đơn Giá\t\t\t\t*");
		System.out.println("\t*\t 3. Nhập Số Lượng Tồn\t\t\t\t*");
		System.out.println("\t*\t 4. Nhập Thời Gian Bảo Hành\t\t\t*");
		System.out.println("\t*\t 5. Nhập Công Suất\t\t\t\t*");
		System.out.println("\t*\t [Phím khác]. Quay về Menu chính\t\t*");
		System.out.println("\t*********************************************************");
	}
	static void MenuSapXep()
	{
		System.out.println("\t*********************************************************");
		System.out.println("\t*\t 1. Sắp xếp theo tên Hàng Hóa tăng dần\t\t*");
		System.out.println("\t*\t 2. Sắp xếp theo Số lượng tồn giảm dần\t\t*");
		System.out.println("\t*\t 3. Sắp xếp theo Thành tiền và Tên Hàng Hóa\t*");
		System.out.println("\t*\t [Phím khác]. Quay về Menu chính\t\t*");
		System.out.println("\t*********************************************************");
	}
	// <=======================1. Nhập cứng=======================>
	static void nhapCung() throws Exception
	{
		HangHoa hhoa1= new HangThucPham("HH01","Gạo Khang Dân",9500, 100,"Nguyen Cong Manh",stringToDate("22/01/2021"),stringToDate("22/12/2021"));
		dsHH.themVao(hhoa1);
		HangHoa hhoa2= new HangThucPham("HH02","Gạo Xi Dẻo",11000, 100,"Tam Quan",stringToDate("08/11/2020"),stringToDate("08/10/2021"));
		dsHH.themVao(hhoa2);
		HangHoa hhoa3= new HangSanhSu("HH03", "Chén bát", 25000,55,"Cung Dinh",stringToDate("18/12/2020"));
		dsHH.themVao(hhoa3);
		HangHoa hhoa4= new HangSanhSu("HH04", "Ấm tách", 25000,25,"Quoc Bao",stringToDate("19/08/2021"));
		dsHH.themVao(hhoa4);
		HangHoa hhoa5= new HangDienMay("HH05","Tủ lạnh", 33000000, 2, 12,0.12);
		dsHH.themVao(hhoa5);
		HangHoa hhoa6= new HangDienMay("HH06","Máy Giặt", 25000000, 5, 12,0.1);
		dsHH.themVao(hhoa6);
		
	} 
	// <=======================2. Thêm một Hàng Hóa=======================>
	static HangHoa nhapMem()
	{
		String maHang="", tenHang="", nhaCungCap="", nhaSanXuat="";
		Date ngaySanXuat, ngayHetHan, ngayNhapKho;
		double donGia, congSuat;
		int soLuongTon, thoiGianBaoHanh;
		int luachon=0;
		try {
			do
			{
				System.out.print("Nhập Mã Hàng Hóa: ");
				maHang=sc.nextLine();
				if(dsHH.timKiem(maHang)!=null)
				{
					System.out.println("Hàng hóa này đã tồn tại! Vui lòng nhập lại!");
				}
				else 
				{
					sc.nextLine();
					System.out.print("Nhập Tên Hàng: ");
					tenHang=sc.nextLine();
			        System.out.print("Nhập Đơn Giá: ");
			        donGia=sc.nextDouble();
			        System.out.print("Nhập Số Lượng Tồn: ");
			        soLuongTon=sc.nextInt();
			        
			        System.out.print("\nNhấn [1] chọn nhập Hàng Thực Phẩm.\nNhấn [2] chọn nhập Hàng Sành Sứ."
			        		+ "\nNhấn [Số khác] chọn nhập Hàng Điện Máy.\nBạn chọn: ");
					luachon=sc.nextInt();
					if (luachon==1)
					{
						sc.nextLine();
						System.out.print("Nhập Nhà Cung Cấp: ");
						nhaCungCap=sc.nextLine();
						System.out.print("Nhập Ngày Sản Xuất: ");
						ngaySanXuat = df.parse(sc.nextLine());
						System.out.print("Nhập Ngày Hết Hạn: ");
						ngayHetHan = df.parse(sc.nextLine());
						hhoa= new HangThucPham(maHang,tenHang, donGia,soLuongTon,nhaCungCap,ngaySanXuat, ngayHetHan);
					}
					else if (luachon==2)
					{
						sc.nextLine();
						System.out.print("Nhập Nhà Sản Xuất: ");
						nhaSanXuat=sc.nextLine();
						System.out.print("Nhập Ngày Nhập Kho: ");
						ngayNhapKho = df.parse(sc.nextLine());
						hhoa= new HangSanhSu(maHang,tenHang,donGia,soLuongTon,nhaSanXuat,ngayNhapKho);
					}
					else 
					{
						System.out.print("Nhập Th�?i Gian Bảo Hành: ");
						thoiGianBaoHanh=sc.nextInt();
						System.out.print("Nhập Công suất: ");
						congSuat=sc.nextDouble();
						hhoa= new HangDienMay(maHang,tenHang,donGia,soLuongTon,thoiGianBaoHanh,congSuat);
					}
				}

			}
			while (dsHH.timKiem(maHang)!=null);
		}
		catch(ParseException e1) 
        {
               	System.out.println("[THÔNG BÁO] Nhập Ngày sai!");
        }
		catch (Exception e)
		{
			System.err.println(e.getMessage());
		}
		return hhoa;
	}
	static void themHangHoa() throws Exception
	{
		hhoa=nhapMem();
		dsHH.themVao(hhoa);
		System.out.println("[THÔNG BÁO] Thêm thành công Hàng Hóa!");
	}
	// <=======================3. Xóa một Hàng Hóa=======================>
	static void xoaHangHoa() throws Exception 
	{
		try
		{
			String maHangHoa="";
			String xacNhan;
			do
			{
				sc.nextLine();
				System.out.print("Nhập Mã Hàng cần xóa: ");
				maHangHoa=sc.nextLine();
				if (dsHH.timKiem(maHangHoa)!=null)
				{
					System.out.print("Nhập xác nhận [Y/N]: ");
					xacNhan=sc.nextLine();
					if (xacNhan.equalsIgnoreCase("Y")) {
						if(dsHH.xoaRa(maHangHoa))
							System.out.println("[THÔNG BÁO] Xóa thành công!");
						else System.out.println("[THÔNG BÁO] Xóa không thành công!"); 
					}
					else System.out.println("[THÔNG BÁO] Bạn chọn giữ lại!");
				}
				else System.out.println("[THÔNG BÁO] Không tồn tại Mã Hàng này! Vui lòng nhập lại!");
			}
			while(dsHH.timKiem(maHangHoa)!=null);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}	
	// <=======================4. Sửa một Hàng Hóa=======================>
	static void suaHangHoa() throws Exception 
	{	
		int chon = -1;
		String maHangHoa="";
		try {
			sc.nextLine();
			System.out.print("Nhập Mã Hàng cần sửa: ");
			maHangHoa=sc.nextLine();
			HangHoa hhoa = dsHH.timKiem(maHangHoa);
			if (hhoa != null)
			{
				if (hhoa instanceof HangThucPham) 
				{
					HangThucPham shtp = (HangThucPham)hhoa;
					do {
						MenuSuaHTP();
						System.out.print("Nhập lựa chọn: ");
						chon = sc.nextInt();
						switch (chon) {
							case 1:
								System.out.print("Nhập Tên Hàng: ");
								sc.nextLine();
								shtp.setTenHang(sc.nextLine());
								break;
							case 2:
								System.out.print("Nhập Đơn Giá: ");
						        shtp.setDonGia(sc.nextDouble());
								break;
							case 3:
								System.out.print("Nhập Số Lượng Tồn: ");
						        shtp.setSoLuongTon(sc.nextInt());
						        break;
							case 4:
								System.out.print("Nhập Nhà Cung Cấp: ");
								sc.nextLine();
						        shtp.setNhaCungCap(sc.nextLine());
						        break;
							case 5:
								System.out.print("Nhập Ngày Sản Xuất: ");
								sc.nextLine();
								Date ngaySanXuat = df.parse(sc.nextLine());
								shtp.setNgaySanXuat(ngaySanXuat);
								break;
							case 6:
								System.out.print("Nhập Ngày Hết Hạn: ");
								sc.nextLine();
								Date ngayHetHan = df.parse(sc.nextLine());
								shtp.setNgayHetHan(ngayHetHan);
								break;
							default:
								if(dsHH.suaThongTin(shtp)) System.out.println("[THÔNG BÁO] Sửa thành công!");
								System.out.println("Về menu chính");
								break;
						}
					} while (chon < 7);
	
				} 
				else if (hhoa instanceof HangSanhSu) 
				{
					HangSanhSu shss = (HangSanhSu)hhoa;
					do {
						MenuSuaHSS();
						System.out.println("Nhập lựa chọn");
						chon = sc.nextInt();
						switch (chon) {
						case 1:
							System.out.print("Nhập Tên Hàng: ");
							sc.nextLine();
							shss.setTenHang(sc.nextLine());
							break;
						case 2:
							System.out.print("Nhập Đơn Giá: ");
							shss.setDonGia(sc.nextDouble());
							break;
						case 3:
							System.out.print("Nhập Số Lượng Tồn: ");
							shss.setSoLuongTon(sc.nextInt());
					        break;
						case 4:
							System.out.print("Nhập Nhà Sản Xuất: ");
							sc.nextLine();
							shss.setNhaSanXuat(sc.nextLine());
					        break;
						case 5:
							System.out.print("Nhập Ngày Nhập Kho: ");
							sc.nextLine();
							Date ngayNhapKho = df.parse(sc.nextLine());
							shss.setNgayNhapKho(ngayNhapKho);
							break;
						default:
							if(dsHH.suaThongTin(shss)) System.out.println("[THÔNG BÁO] Sửa thành công!");
							System.out.println("Về menu chính");
							break;
						}
					} while (chon < 6);
				}
				else
				{
					HangDienMay shss = (HangDienMay)hhoa;
					do {
						MenuSuaHDM();
						System.out.println("Nhập lựa chọn");
						chon = sc.nextInt();
						switch (chon) {
						case 1:
							System.out.print("Nhập Tên Hàng: ");
							sc.nextLine();
							shss.setTenHang(sc.nextLine());
							System.out.println("[THÔNG BÁO] Đã sửa thành công!");
							break;
						case 2:
							System.out.print("Nhập Đơn Giá: ");
							shss.setDonGia(sc.nextDouble());
							System.out.println("[THÔNG BÁO] Đã sửa thành công!");
							break;
						case 3:
							System.out.print("Nhập Số Lượng Tồn: ");
							shss.setSoLuongTon(sc.nextInt());
							System.out.println("[THÔNG BÁO] Đã sửa thành công!");
					        break;
						case 4:
							System.out.print("Nhập Th�?i Gian Bảo Hành: ");
							shss.setThoiGianBaoHanh(sc.nextInt());
							System.out.println("[THÔNG BÁO] Đã sửa thành công!");
					        break;
						case 5:
							System.out.print("Nhập Công Suất: ");
							shss.setCongSuat(sc.nextDouble());
							System.out.println("[THÔNG BÁO] Đã sửa thành công!");
							break;
						default:
							if(dsHH.suaThongTin(shss)) System.out.println("[THÔNG BÁO] Sửa thành công!");
							System.out.println("Về menu chính");
							break;
						}
					} while (chon < 6);
				}
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	// <=======================5. Xuất thông tin theo tùy chọn=======================>
	static void xuatThongTin() throws Exception
	{
		int luachon=-1;
		try
		{
			do {
				MenuXuatThongTin();
				System.out.print("Mời bạn nhập lựa chọn: ");
				luachon=sc.nextInt();
				switch(luachon)
				{
					case 1:
						System.out.println("1. Xuất tất cả thông tin trong Danh Sách\n");
						line();
						tieuDe();
						for(HangHoa hhoa: dsHH.getDsHangHoa())
						{
							line();
							System.out.println(hhoa);
						}
						line();
						break;
					case 2:
						System.out.println("2. Xuất thông tin Hàng Thực Phẩm\n");
						line();
						tieuDe();
						for(HangHoa hhoa: dsHH.getDsHTP())
						{
							line();
							System.out.println(hhoa);
						}
						line();
						break;
					case 3:
						System.out.println("3. Xuất thông tin Hàng Sành Sứ\n");
						line();
						tieuDe();
						for(HangHoa hhoa: dsHH.getDsHSS())
						{
							line();
							System.out.println(hhoa);
						}
						line();	
						break;
					case 4:
						System.out.println("4. Xuất thông tin Hàng Điện Máy\n");
						line();
						tieuDe();
						for(HangHoa hhoa: dsHH.getDsHDM())
						{
							line();
							System.out.println(hhoa);
						}
						line();
						break;
					case 5:
						System.out.println("5. Xuất thông tin Hàng hóa khó bán");
						line();
						tieuDe();
						for(HangHoa hhoa: dsHH.getDsHHKhoBan())
						{
							line();
							System.out.println(hhoa);
						}
						line();	
						break;
					default:
						System.out.println("[THÔNG BÁO] Quay Về Menu chính");
						break;
				}
			}
			while(luachon<6);
		}
		catch (Exception e) {System.out.println(e.getMessage());}
	}
	// <=======================6. Sắp xếp theo tùy chọn=======================>
	static void sapXep()
	{
		int luachon=-1;
		try
		{
			do {
				MenuSapXep();
				System.out.print("Mời bạn nhập lựa chọn: ");
				luachon=sc.nextInt();
				switch(luachon)
				{
					case 1:
						System.out.println("1. Sắp xếp theo tên Hàng Hóa tăng dần\n");
						dsHH.sortTheoTenHangHoa();
						System.out.println("[THÔNG BÁO] Đã sắp xếp thành công!");
						break;
					case 2:
						System.out.println("2. Sắp xếp theo Số lượng tồn giảm dần\n");
						dsHH.sortTheoSoLuongTon();
						System.out.println("[THÔNG BÁO] Đã sắp xếp thành công!");
						break;
					case 3:
						System.out.println("3. Sắp xếp theo Thành Tiền và Tên Hàng Hóa\n");
						dsHH.sortTheo2ThuocTinh();
						System.out.println("[THÔNG BÁO] Đã sắp xếp thành công!");
						break;
					default:
						System.out.println("[THÔNG BÁO] Quay Về Menu chính");
						break;
				}
			}
			while(luachon<4);
		}
		catch (Exception e) {System.out.println(e.getMessage());}
	}
	// <=======================MAIN-MAIN-MAIN=======================>
	public static void main(String[] args) throws Exception {
		int luaChon=-1;
		nhapCung();
		try
		{
			do
			{
				System.out.println();
				Menu();
				System.out.print("Mời bạn nhập lựa chọn: ");
				luaChon=sc.nextInt();
				switch(luaChon)
				{
					case 1:
						System.out.println("[THÔNG BÁO] Bạn chọn 1. Thêm Hàng Hóa!\n");
						themHangHoa();
						break;
					case 2:
						System.out.println("[THÔNG BÁO] Bạn chọn 2. Xóa Hàng Hóa!\n");
						xoaHangHoa();
						break;
					case 3:
						System.out.println("[THÔNG BÁO] Bạn chọn 3. Sửa Hàng Hóa!\n");
						suaHangHoa();
						break;
					case 4: 
						System.out.println("[THÔNG BÁO] Bạn chọn 4. Xuất thông tin theo tùy chọn!\n");
						xuatThongTin();
						break;
					case 5:
						System.out.println("[THÔNG BÁO] Bạn chọn 5. Sắp xếp theo tùy chọn!\n");
						sapXep();
						break;
					case 6:
						String xacNhan;
						System.out.println("[THÔNG BÁO] Bạn chọn 6. Thoát!\n");
						System.out.print("Nhập xác nhận thoát [Y/N]: ");
						sc.nextLine();
						xacNhan=sc.nextLine();
						if (xacNhan.compareToIgnoreCase("Y")==0){
							System.out.println("Cám ơn bạn đã sử dụng chương trình!");
							System.exit(0);
						}
						else {
							System.out.println("Bạn chọn ở lại chương trình!");
							break;
						}
						
				}
			} while(luaChon<7);
			
		}
		catch(InputMismatchException e1) {System.out.println("[THÔNG BÁO] Lỗi nhập giá trị là kí tự!");}
		catch(ArithmeticException e2) {System.out.println ("[THÔNG BÁO] Lỗi nhập giá trị số không đúng!");}
		catch(ArrayIndexOutOfBoundsException e3) {System.out.println("[THÔNG BÁO] Lỗi truy xuất mảng!");}
		catch(Exception e ){System.out.println("[THÔNG BÁO] Lỗi chưa xác định!");}
		sc.close();
	}
}
