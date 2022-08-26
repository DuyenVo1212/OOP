package t3TaiKhoanNganHang;

import java.util.Scanner;

public class KiemThuAccount {

		static Scanner scanner = new Scanner(System.in);
		
		static DanhSachAccount doiTuong;
		
		static String Header() {
			return String.format("%-10s %32s %13s", "Mã tài khoản", "Tên chủ tài khoản", "Số dư");
		}
		
		static void nhapCung() throws Exception {
			Account acc1 = new Account(1111, "Nguyen Xuan Phuc", 100000);
			doiTuong.themACC(acc1);
			Account acc2 = new Account(2222, "Nguyen Phu Trong", 335000);
			doiTuong.themACC(acc2);
			Account acc3 = new Account(3333, "Nguyen Van Bay", 220000);
			doiTuong.themACC(acc3);
		}
		
		static Account nhapMem() {
				Scanner scn = new Scanner(System.in);
				long ma;
				String hoTen;
				double soDu;
				Account acc = new Account();
				System.out.println("Nhập mã tài khoản: ");
				ma = scn.nextLong();
				if(doiTuong.timKiemMa(ma) == null) {
					scn.nextLine();
					System.out.println("Nhập tên chủ tài khoản: ");
					hoTen = scn.nextLine();
					System.out.println("Nhập số dư: ");
					soDu = scn.nextDouble();
					acc = new Account(ma, hoTen, soDu);
					return acc;
				}
				else 
					return null;
			}
		
		static void napTien() throws Exception {
			long maTaiKhoan;
			long soTienNap;
			Account accNap = null;
			Scanner scn = new Scanner(System.in);
			System.out.println("Nhập mã tài khoản bạn muốn nạp: ");
			maTaiKhoan = scn.nextLong();
			accNap = doiTuong.timKiemMa(maTaiKhoan);
			if(accNap != null) {
				System.out.println("Nhập số tiền bạn muốn nạp: ");
				soTienNap = scn.nextLong();
				accNap.napTien(soTienNap);
			}
			else
				System.out.println("Mã tài khoản này không tồn tại!!");
		}
		
		static void xoaTaiKhoan() throws Exception {
			Scanner scn = new Scanner(System.in);
			long maTaiKhoan;
			System.out.println("Nhập mã tài khoản cần xóa: ");
			maTaiKhoan = scn.nextLong();
			if(maTaiKhoan != -1) {
				System.out.println("Bạn có chắc chắn muốn xóa không [y/n]");
				String acpString = new Scanner(System.in).nextLine();
				if (acpString.equals("y") || acpString.equals("Y")) {
					doiTuong.xoaAcc(maTaiKhoan);
					System.out.println("Xóa thành công");
				} else {
					System.out.println("Bạn đã không xóa ^^");
				}
			} 
			else {
				System.out.println("Mã tài khoản không tồn tại, xóa thất bại");
				}
		}
		
		static void suaThongTinTaiKhoan() {
			Scanner scn = new Scanner(System.in);
			long maTaiKhoan;
			System.out.println("Nhập mã tài khoản cần sửa: ");
			maTaiKhoan = scn.nextLong();
			int diaChi = doiTuong.timKiem(maTaiKhoan);
			Account acc = doiTuong.getDanhSach()[diaChi];
			if (acc == null) {
				System.out.println("Mã tài khoản không tồn tại");
			} else {
				System.out.println("Thông tin tài khoản trước khi sửa\n" + acc);
				int luaChonSua = -1;
				do {
					menuSua();
					System.out.println("Mời nhập lựa chọn");
					luaChonSua = scanner.nextInt();
					scanner.nextLine();
					switch (luaChonSua) {
					case 1:
						System.out.println("Nhập tên chủ tài khoản: ");
						acc.setTenChuAcc(scanner.nextLine());
						break;
					default:
						doiTuong.suaThongTin(acc, diaChi);
						System.out.println("Trở về menu chính!!");
						break;
					}
				} while (luaChonSua < 2);
			}
		}
		
		static void rutTien() throws Exception {
			long maTaiKhoan;
			long soTienRut;
			Account accRut = null;
			Scanner scn = new Scanner(System.in);
			System.out.println("Nhập mã tài khoản bạn muốn rút: ");
			maTaiKhoan = scn.nextLong();
			accRut = doiTuong.timKiemMa(maTaiKhoan);
			if(accRut != null) {
				System.out.println("Nhập số tiền bạn muốn rút: ");
				soTienRut = scn.nextLong();
				accRut.rutTien(soTienRut);
			}
			else
				System.out.println("Mã tài khoản này không tồn tại!!");
		}
		
		static void chuyenTien() throws Exception {
			long maTaiKhoanChuyenTien;
			long soTienChuyen;
			long maTaiKhoanNhanTien;
			Account accChuyen = null;
			Account accNhan = null;
			Scanner scn = new Scanner(System.in);
			System.out.println("Nhập mã tài khoản của bạn: ");
			maTaiKhoanChuyenTien = scn.nextLong();
			accChuyen = doiTuong.timKiemMa(maTaiKhoanChuyenTien);
			if(accChuyen != null) {
				System.out.println("Nhập mã tài khoản bạn muốn chuyển: ");
				maTaiKhoanNhanTien = scn.nextLong();
				accNhan = doiTuong.timKiemMa(maTaiKhoanNhanTien);
				if(accNhan != null) {
				System.out.println("Nhập số tiền bạn muốn chuyển: ");
				soTienChuyen = scn.nextLong();
				accChuyen.rutTien(soTienChuyen);
				accNhan.napTien(soTienChuyen);
				}
				else
					System.out.println("Mã tài khoản này không tồn tại!!");
			}
			else
				System.out.println("Mã tài khoản này không tồn tại!!");
		}
		
		static void daoHanNganHang() {
			long maTaiKhoan;
			Account accLaiSuat = null;
			Scanner scn = new Scanner(System.in);
			System.out.println("Nhập mã tài khoản bạn đáo hạn: ");
			maTaiKhoan = scn.nextLong();
			accLaiSuat = doiTuong.timKiemMa(maTaiKhoan);
			if(accLaiSuat != null) {
				accLaiSuat.daoHan();
			}
			else
				System.out.println("Mã tài khoản này không tồn tại!!");
		}

		static void Menu() {
			System.out.println("\t**************************************************");
			System.out.println("\t**        Thông Tin Tài Khoản Khách Hàng        **");
			System.out.println("\t*   1. Thêm tài khoản                            *");
			System.out.println("\t*   2. In thông tin tài khoản ra màn hình        *");	
			System.out.println("\t*   3. Nạp tiền                                  *");
			System.out.println("\t*   4. Rút tiền                                  *");
			System.out.println("\t*   5. Chuyển tiền                               *");
			System.out.println("\t*   6. Đáo hạn                                   *");
			System.out.println("\t*   7. Xóa tài khoản                             *");
			System.out.println("\t*   8. Sửa tài khoản                             *");
			System.out.println("\t*  10. Thoát                                     *");
			System.out.println("\t**************************************************");
		}

		static void menuSua() {
			System.out.println("\t*****************************************");
			System.out.println("\t**       Mời nhập thông tin cần sửa    **");
			System.out.println("\t*   1. Tên chủ tài khoản                *");
			System.out.println("\t* Nhập phím bất kì để trở về menu chính *");
			System.out.println("\t*****************************************");
		}
		
		static void xuatDanhSach() {
			int soLuongThuc = doiTuong.soLuongAcc;
			Account accKH[];
			accKH = doiTuong.getHetDanhSach();
			for (int i = 0; i < soLuongThuc; i++) {
				System.out.println(accKH[i]);
			}
			System.out.println("\n\n\n");
		}
		
		public static void main(String[] args) {
			try {
				int chon;
				doiTuong = new DanhSachAccount(3);
				nhapCung();
				Account acc = new Account();
				do {
					Menu();
					System.out.println("Nhập lựa chọn của bạn: ");
					chon = scanner.nextInt();
					switch (chon) {
					case 1:
						acc = nhapMem();
						if(acc == null)
							System.out.println("bị trùng mã");
						else
							doiTuong.themACC(acc);
						break;
					case 2:
						System.out.println(Header());
						System.out.println("============================================================");
						xuatDanhSach();
						break;
					case 3:
						napTien();
						break;
					case 4:
						rutTien();
						break;
					case 5:
						chuyenTien();
						break;
					case 6:
						daoHanNganHang();
						break;
					case 7:
						xoaTaiKhoan();
						break;
					case 8:
						suaThongTinTaiKhoan();
						break;
					default:
						System.out.println("Cảm ơn quý khách đã sử dụng dịch vụ!!");
						System.exit(0);
					}
				} while (chon != 10);
			} catch (Exception e) {
				System.out.println("" + e.getMessage());
			}
		}
}
