package X_PHONG;
import java.util.InputMismatchException;
import java.util.Scanner;
public class KiemThuPhong {
	static DanhSachPhong DsPhong = new DanhSachPhong();
	static PhongHoc phong;
	static Scanner sc = new Scanner(System.in);
	
	static void tieuDeTong() {
		String tieude= String.format("%-10s%-15s%-15s%-15s%-30s%-20s%-20s", "Dãy nhà", "Mã phòng", "SL Bóng �?èn", "Diện tích", "Ghi Chú","Chuyên Ngành","Sức chứa");
		System.out.println(tieude);
	}
	static void tieuDePhong() {
		String tieude= String.format("%-10s%-15s%-15s%-15s%-30s", "Dãy nhà", "Mã phòng", "SL Bóng �?èn", "Diện tích", "Ghi Chú");
		System.out.println(tieude);
	}
	static void tieuDePhongMay() {
		String tieude= String.format("%-10s%-15s%-15s%-15s%-30s%30s", "Dãy nhà", "Mã phòng", "SL Bóng �?èn", "Diện tích", "Ghi Chú","Số Lượng");
		System.out.println(tieude);
	}
	// <=======================Tất tần tật Menu=======================>
	// Menu chính
	static void Menu() {
		System.out.println("\t*************************************************");
		System.out.println("\t*\t Chương trình quản lí Phòng h�?c\t\t*");
		System.out.println("\t*\t 1. Thêm Phòng hoc\t\t\t*");
		System.out.println("\t*\t 2. Xóa Phòng hoc\t\t\t*");
		System.out.println("\t*\t 3. Sửa Phòng hoc\t\t\t*");
		System.out.println("\t*\t 4. Xuất Danh sách theo tùy ch�?n\t*");
		System.out.println("\t*\t 5. Sắp xếp Danh sách theo tùy ch�?n\t*");
		System.out.println("\t*\t 6. Tính Tổng số phòng h�?c\t\t*");
		System.out.println("\t*\t 7. Tính Tổng số dãy nhà\t\t*");
		System.out.println("\t*\t 8. Thoát\t\t\t\t*");
		System.out.println("\t*************************************************");
	}
	// Menu sửa Phòng Lý thuyết
	static void MenuSuaPLT() {
		System.out.println("\t*************************************************");
		System.out.println("\t*\t 1. Dãy nhà\t\t\t\t*");
		System.out.println("\t*\t 2. Số bóng đèn\t\t\t\t*");
		System.out.println("\t*\t 3. Diện tích\t\t\t\t*");
		System.out.println("\t*\t 4. Máy chiếu\t\t\t\t*");
		System.out.println("\t*\t [Phím khác]. Quay v�? Menu chính\t*");
		System.out.println("\t*************************************************");
	}
	
	// Menu sửa Phòng Máy tính
	static void MenuSuaPMT() {
		System.out.println("\t*************************************************");
		System.out.println("\t*\t 1. Dãy nhà\t\t\t\t*");
		System.out.println("\t*\t 2. Số bóng đèn\t\t\t\t*");
		System.out.println("\t*\t 3. Diện tích\t\t\t\t*");
		System.out.println("\t*\t 4. Số lượng máy tính\t\t\t*");
		System.out.println("\t*\t [Phím khác]. Quay v�? Menu chính\t*");
		System.out.println("\t*************************************************");
	}

	// Menu sửa Phòng Thí nghiệm
	static void MenuSuaPTN() {
		System.out.println("\t*************************************************");
		System.out.println("\t*\t 1. Dãy nhà\t\t\t\t*");
		System.out.println("\t*\t 2. Số bóng đèn\t\t\t\t*");
		System.out.println("\t*\t 3. Diện tích\t\t\t\t*");
		System.out.println("\t*\t 4. Bồn rửa tay\t\t\t\t*");
		System.out.println("\t*\t [Phím khác]. Quay v�? Menu chính\t*");
		System.out.println("\t*************************************************");
	}
	
	// Menu Xuất thông tin theo tuỳ ch�?n
	static void MenuXuatThongTin()
	{
		System.out.println("\t*********************************************************");
		System.out.println("\t*\t 1. Xuất tất cả thông tin trong Danh Sách\t*");
		System.out.println("\t*\t 2. Xuất Danh sách Phòng Lý Thuyết\t\t*");
		System.out.println("\t*\t 3. Xuất Danh sách Phòng Máy Tính\t\t*");
		System.out.println("\t*\t 4. Xuất Danh sách Phòng Thí Nghiệm\t\t*");
		System.out.println("\t*\t 5. Xuất Danh sách Phòng có 60 máy\t\t*");
		System.out.println("\t*\t 6. Xuất Danh sách Phòng đạt chuẩn\t\t*");
		System.out.println("\t*\t [Phím khác]. Quay v�? Menu chính\t\t*");
		System.out.println("\t*********************************************************");
	}
	// Menu sắp xếp theo tuỳ ch�?n
	static void MenuSapXep()
	{
		System.out.println("\t*********************************************************");
		System.out.println("\t*\t 1. Sắp xếp theo Dãy nhà\t\t\t*");
		System.out.println("\t*\t 2. Sắp xếp theo Diện tích\t\t\t*");
		System.out.println("\t*\t 3. Sắp xếp theo Số Bóng đèn\t\t\t*");
		System.out.println("\t*\t 4. Sắp xếp theo 3 thuộc tính\t\t\t*");
		System.out.println("\t*\t [Phím khác]. Quay về Menu chính\t\t*");
		System.out.println("\t*********************************************************");
	}
	static void MenuNhapThongTin()
	{
		System.out.println("1. Phòng Lý Thuyết");
		System.out.println("2. phòng máy tính");
		System.out.println("[Số khác] phòng thí nghiệm");
		System.out.println("Nhập lựa chọn: ");
	}
	
	// <=======================1. Nhập cứng=======================>
	static void nhapCung() throws Exception {

		PhongHoc p1 = new PhongLyThuyet("LT", "LT14.01", 100, 100, true);
		DsPhong.themVao(p1);
		PhongHoc p2 = new PhongLyThuyet("LT", "LT14.02", 80, 80, false);
		DsPhong.themVao(p2);
		PhongHoc p3 = new PhongMayTinh("MT", "MT51", 61, 65, 60);
		DsPhong.themVao(p3);
		PhongHoc p4 = new PhongMayTinh("MT", "MT52", 70, 40, 7);
		DsPhong.themVao(p4);
		PhongHoc p5 = new PhongThiNghiem("TN", "TN10", 20, 10, false,"Sinh Vật",20);
		DsPhong.themVao(p5);
		PhongHoc p6 = new PhongThiNghiem("TN", "TN12", 30, 15, true,"Sinh Họcc",10);
		DsPhong.themVao(p6);
	}
	
	// <=======================2. Thêm một Phòng H�?c=======================>
	static PhongHoc nhapMem() 
	{
		String dayNha, maPhong;
		double dienTich;
		int soBongDen;
		System.out.print("Nhập mã phòng: ");
		sc.nextLine();
		maPhong = sc.nextLine();
		try 
		{
			if(DsPhong.timKiem(maPhong)!=null)
				System.out.println("Mã Sách đã tồn tại! Vui lòng nhập lại!");
			else 
			{
				System.out.print("Nhập dãy nhà:");
				dayNha = sc.nextLine();
				System.out.print("Nhập diện tích: ");
				dienTich = sc.nextDouble();
				System.out.print("Nhập số bóng đèn: ");
				soBongDen = sc.nextInt();
				MenuNhapThongTin();
				int luaChon = sc.nextInt();
				// Phòng Lý thuyết
				if (luaChon == 1) 
				{
					boolean mayChieu;
					String coMayChieu="";
					
					do
					{
						System.out.print("Phòng này có máy chiếu hay không [Y/N]: ");
						sc.nextLine();
						coMayChieu = sc.nextLine();
						if (!coMayChieu.equalsIgnoreCase("Y") && !coMayChieu.equalsIgnoreCase("N"))
							System.out.println("Bạn nhập không đúng! Vui lòng nhập lại!");
						else
						{
							mayChieu = (coMayChieu.equalsIgnoreCase("Y")) ? true : false;
							phong = new PhongLyThuyet(dayNha, maPhong, dienTich, soBongDen, mayChieu);
						}
					}
					while(!coMayChieu.equalsIgnoreCase("Y") && !coMayChieu.equalsIgnoreCase("Y"));
				} 
				// Phòng Máy tính
				else if (luaChon == 2) { 
					int soLuong;
					System.out.print("Nhập số lượng máy tính: ");
					soLuong = sc.nextInt();
					phong = new PhongMayTinh(dayNha, maPhong, dienTich, soBongDen, soLuong);
				} 
				// Phòng Thí nghiệm
				else {
					boolean bonRuaTay;
					String coBonRuaTay="";
					
					do
					{
						sc.nextLine();
						System.out.println("Thuộc Chuyên ngành: ");
						String chuyenNganh=sc.nextLine();
						System.out.println("Sức chứa: ");
						int sucChua=sc.nextInt();
						sc.nextLine();
						System.out.println("Phòng này có Bồn rửa tay hay không [Y/N]: ");
						coBonRuaTay = sc.nextLine();
						if (!coBonRuaTay.equalsIgnoreCase("y") && !coBonRuaTay.equalsIgnoreCase("N"))
							System.out.println("Bạn nhập không đúng! Vui lòng nhập lại!");
						else
						{
							bonRuaTay = (coBonRuaTay.equalsIgnoreCase("Y")) ? true : false;
							phong= new PhongThiNghiem(dayNha, maPhong, dienTich, soBongDen, bonRuaTay, chuyenNganh, sucChua);
						}
					}
					while(!coBonRuaTay.equalsIgnoreCase("Y") && !coBonRuaTay.equalsIgnoreCase("N"));
					
				}
			
			}
		}
		catch (Exception e) {System.out.println(e.getMessage());}
		return phong;
	}
	static void themPhongHoc() throws Exception
	{
		try
		{
			PhongHoc ph= nhapMem();
			DsPhong.themVao(ph);
		}
		catch (Exception e) {System.out.println(e.getMessage());}
	}
	// <=======================3. Xóa một Phòng h�?c=======================>
	static void xoaPhongHoc() throws Exception {
		try
		{
			String maPhong="";
			String xacNhan;
			do
			{
				sc.nextLine();
				System.out.print("Nhập Mã Phòng cần xóa: ");
				maPhong=sc.nextLine();
				if (DsPhong.timKiem(maPhong)!=null)
				{
					System.out.print("Nhập xác nhận [Y/N]: ");
					xacNhan=sc.nextLine();
					if (xacNhan.equalsIgnoreCase("Y")) {
						if(DsPhong.xoaRa(maPhong))
							System.out.println("[THÔNG BÁO] Xóa thành công!");
						else System.out.println("[THÔNG BÁO] Xóa không thành công!"); 
					}
					else System.out.println("[THÔNG BÁO] Bạn ch�?n giữ lại!");
				}
				else System.out.println("[THÔNG BÁO] Không tồn tại Mã Phòng này! Vui lòng nhập lại!");
			}
			while(DsPhong.timKiem(maPhong)!=null);
		}
		catch (Exception e) {System.out.println(e.getMessage());}
	}	
	// <=======================4. Sửa một Phòng h�?c=======================>
	static void suaPhongHoc() throws Exception {	
			int chon = -1;
			String maPhong="";
			try {
				sc.nextLine();
				System.out.print("Nhập Mã Phòng cần sửa: ");
				maPhong=sc.nextLine();
				PhongHoc phong = DsPhong.timKiem(maPhong);
				if (phong != null)
				{
					if (phong instanceof PhongLyThuyet) 
					{
						PhongLyThuyet splt = (PhongLyThuyet)phong;
						do {
							MenuSuaPLT();
							System.out.print("Nhập lựa ch�?n: ");
							chon = sc.nextInt();
							switch (chon) {
								case 1:
									System.out.print("Nhập Dãy nhà: ");
									splt.setDayNha(sc.nextLine());
									break;
								case 2:
									System.out.print("Nhập Số bóng đèn: ");
									splt.setSoBongDen(sc.nextInt());
									break;
								case 3:
									System.out.print("Nhập Diện tích: ");
									splt.setDienTich(sc.nextDouble());
							        break;
								case 4:
									System.out.print("Nhập Máy chiếu [Y/N]: ");
									String mayChieu=sc.nextLine();
									boolean coMayChieu=(mayChieu.compareToIgnoreCase("Y")==0) ? true : false;
									splt.setMayChieu(coMayChieu);
									break;
								default:
									if(DsPhong.suaDoi(splt)) System.out.println("[THÔNG B�?O] Sửa thành công!");
									System.out.println("V�? menu chính");
									break;
							}
						} while (chon < 5);
		
					} 
					else if (phong instanceof PhongMayTinh) 
					{
						PhongMayTinh spmt = (PhongMayTinh)phong;
						do {
							MenuSuaPMT();
							System.out.print("Nhập lựa ch�?n: ");
							chon = sc.nextInt();
							switch (chon) {
							case 1:
								System.out.print("Nhập Dãy nhà: ");
								spmt.setDayNha(sc.nextLine());
								break;
							case 2:
								System.out.print("Nhập Số bóng đèn: ");
								spmt.setSoBongDen(sc.nextInt());
								break;
							case 3:
								System.out.print("Nhập Diện tích: ");
								spmt.setDienTich(sc.nextDouble());
						        break;
							case 4:
								System.out.print("Nhập Số lượng máy tính: ");
								spmt.setSoLuongMayTinh(sc.nextInt());
								break;
							default:
								if(DsPhong.suaDoi(spmt)) System.out.println("[THÔNG B�?O] Sửa thành công!");
								System.out.println("V�? menu chính");
								break;
							}
						} while (chon < 5);
					}
					else
					{
						PhongThiNghiem sptn = (PhongThiNghiem)phong;
						do {
							MenuSuaPTN();
							System.out.print("Nhập lựa ch�?n: ");
							chon = sc.nextInt();
							switch (chon) {
							case 1:
								System.out.print("Nhập Dãy nhà: ");
								sptn.setDayNha(sc.nextLine());
								break;
							case 2:
								System.out.print("Nhập Số bóng đèn: ");
								sptn.setSoBongDen(sc.nextInt());
								break;
							case 3:
								System.out.print("Nhập Diện tích: ");
								sptn.setDienTich(sc.nextDouble());
						        break;
							case 4:
								System.out.print("Nhập Bồn rửa tay [Y/N]: ");
								String bonRua=sc.nextLine();
								boolean coBonRua=(bonRua.compareToIgnoreCase("Y")==0) ? true : false;
								sptn.setBonRuaTay(coBonRua);
								break;
							default:
								if(DsPhong.suaDoi(sptn)) System.out.println("[THÔNG B�?O] Sửa thành công!");
								System.out.println("V�? menu chính");
								break;
							}
						} while (chon < 6);
					}
				}
			}
			catch (Exception e) {System.out.println(e.getMessage());}
	}
	// <=======================5. Xuất thông tin theo tuỳ ch�?n=======================>
	static void xuatThongTin() throws Exception
	{
		int luachon=-1;
		try
		{
			do {
				MenuXuatThongTin();
				System.out.print("M�?i bạn nhập lựa ch�?n: ");
				luachon=sc.nextInt();
				switch(luachon)
				{
					case 1:
						System.out.println("1. Xuất tất cả thông tin trong Danh Sách\n");
						tieuDeTong();
						for(PhongHoc phong: DsPhong.getDSPhong())
							System.out.println(phong);
						break;
					case 2:
						System.out.println("2. Xuất Danh sách Phòng Lý Thuyết\n");
						tieuDePhong();
						for(PhongHoc phong: DsPhong.getDsPLT())
							System.out.println(phong);
						break;
					case 3:
						System.out.println("3. Xuất Danh sách Phòng Máy Tính\n");
						tieuDePhongMay();
						for(PhongHoc phong: DsPhong.getDsPMT())
							System.out.println(phong);
						break;
					case 4:
						System.out.println("4. Xuất Danh sách Phòng Thí Nghiệm\n");
						tieuDeTong();
						for(PhongHoc phong: DsPhong.getDsPTN())
							System.out.println(phong);
						break;
					case 5:
						System.out.println("5. Xuất Danh sách Phòng có 60 máy\n");
						tieuDePhongMay();
						for(PhongHoc phong: DsPhong.DSPhongCo60May())
							System.out.println(phong);
						break;
					case 6:
						System.out.println("6. Xuất Danh sách Phòng đạt chuẩn\n");
						tieuDeTong();
						for(PhongHoc phong: DsPhong.getDSPhongDatChuan())
							System.out.println(phong);
						break;
					default:
						System.out.println("[THÔNG B�?O] Quay v�? Menu chính");
						break;
				}
			}
			while(luachon<7);
		}
		catch (Exception e) {System.out.println(e.getMessage());}
	}
	// <=======================6. Sắp xếp theo tuỳ ch�?n=======================>
	static void sapXep()
	{
		int luachon=-1;
		try
		{
			do {
				MenuSapXep();
				System.out.print("M�?i bạn nhập lựa ch�?n: ");
				luachon=sc.nextInt();
				switch(luachon)
				{
				case 1:
					System.out.println("1. Sắp xếp theo Dãy Nhà\n");
					DsPhong.sortTheoDayNha();
					System.out.println("[THÔNG B�?O] �?ã sắp xếp thành công!");
					xuatThongTin();
					break;
				case 2:
					System.out.println("2. Sắp xếp theo Diện Tích\n");
					DsPhong.sortTheoDienTich();
					System.out.println("[THÔNG B�?O] �?ã sắp xếp thành công!");
					xuatThongTin();
					break;
				case 3:
					System.out.println("3. Sắp xếp theo Số Bóng �?èn\n");
					DsPhong.sortTheoBongDen();
					System.out.println("[THÔNG B�?O] �?ã sắp xếp thành công!");
					xuatThongTin();
					break;
				case 4:
					System.out.println("4. Sắp xếp theo 3 thuộc tính\n");
					DsPhong.sortTheo3ThuocTinh();
					System.out.println("[THÔNG B�?O] �?ã sắp xếp thành công!");
					xuatThongTin();
					break;
				default:
					System.out.println("[THÔNG B�?O] Quay v�? Menu chính");
					break;
				}
			}
			while(luachon<5);
		}
		catch (Exception e) {System.out.println(e.getMessage());}
	}
	// <=======================7. Tính tổng số phòng h�?c=======================>
	static void tongSoPhongHoc() {
		System.out.print("\nTổng số Phòng h�?c: " + DsPhong.getSoLuongPhong());
	}
	// <=======================8. Tính tổng dãy nhà=======================>
	static void tongSoDayNha() {
		System.out.print("\nTổng số Dãy nhà: " + DsPhong.demSoDayNha2());
	}
	public static void main(String[] args) throws Exception {
		int luaChon=-1;
		nhapCung();
		try
		{
			do
			{
				System.out.println();
				Menu();
				System.out.print("M�?i bạn nhập lựa ch�?n: ");
				luaChon=sc.nextInt();
				switch(luaChon)
				{
					case 1:
						System.out.println("[THÔNG B�?O] Bạn ch�?n 1. Thêm Phòng!\n");
						themPhongHoc();
						break;
					case 2:
						System.out.println("[THÔNG B�?O] Bạn ch�?n 2. Xóa Phòng!\n");
						xoaPhongHoc();
						break;
					case 3:
						System.out.println("[THÔNG B�?O] Bạn ch�?n 3. Sửa Phòng!\n");
						suaPhongHoc();
						break;
					case 4:
						System.out.println("[THÔNG B�?O] Bạn ch�?n 4. Xuất Danh sách theo tùy ch�?n!\n");
						xuatThongTin();
						break;
					case 5: 
						System.out.println("[THÔNG B�?O] Bạn ch�?n 5. Sắp xếp Danh sách theo tùy ch�?n!\n");
						sapXep();
						break;
					case 6: 
						System.out.println("[THÔNG B�?O] Bạn ch�?n 6. Tính tổng số Phòng h�?c!\n");
						tongSoPhongHoc();
						break;
					case 7:
						System.out.println("[THÔNG B�?O] Bạn ch�?n 7. Tính tổng số Dãy nhà!\n");
						tongSoDayNha();
						break;
					case 8:
						String xacNhan;
						System.out.println("[THÔNG B�?O] Bạn ch�?n 8. Thoát!\n");
						System.out.print("Nhập xác nhận thoát [Y/N]: ");
						sc.nextLine();
						xacNhan=sc.nextLine();
						if (xacNhan.compareToIgnoreCase("Y")==0){
							System.out.println("Cám ơn bạn đã sử dụng chương trình!");
							System.exit(0);
						}
						else {
							System.out.println("Bạn ch�?n ở lại chương trình!");
							break;
						}
						break;
					default:
						break;
				}
			} while(luaChon<9);
			
		}
		catch(InputMismatchException e1) {System.out.println("[THÔNG B�?O] Lỗi nhập giá trị là kí tự!");}
		catch(ArithmeticException e2) {System.out.println ("[THÔNG B�?O] Lỗi nhập giá trị số không đúng!");}
		catch(ArrayIndexOutOfBoundsException e3) {System.out.println("[THÔNG B�?O] Lỗi truy xuất mảng!");}
		catch(Exception e ){System.out.println("[THÔNG B�?O] Lỗi chưa xác định!");}
		sc.close();
	}
}

	