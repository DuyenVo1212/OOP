package BTSACH_HIEU_BOSUNG;

import java.util.Collections;
import java.util.Scanner;

public class Test {
	static ListGiaoDich listGiaoDich = new ListGiaoDich();

	public static void menu(Scanner scanner) {
		int chon1, chon2;
		do {
			System.out.println("1. Nhap giao dich");
			System.out.println("2. Xuat giao dich");
			System.out.println("3.Tinh tong so luong giao dich");
			System.out.println("4. Tinh tong so luong tung loai");
			System.out.println("5.Dem so dia chi cua gd nha ko trung nhau");
			System.out.println("6.In ra thong tin gd nha co dia chi trung");
			// loi

			System.out.println("7. Tinh trung binh thanh tien cua giao dich dat");
			System.out.println("8. Tinh tong thanh tien tung loai va tong tien danh sach");
			System.out.println("9. Tinh tong thanh tien theo thang nhap vao");
			System.out.println("10. Tinh trung binh cong don gia gd dat");

			System.out.println("11. Xuat giao dich co ma x");
			System.out.println("12. Xuat giao dich dat co ma x");
			System.out.println("13. Xuat giao dich trong 9/2013");
			System.out.println("14. Xuat giao dich dat");
			System.out.println("15. Xuat loai nha THUONG cua giao dich nha");
			System.out.println("16. Xuat giao dich co don gia >1000");

			System.out.println("17. Tim kiem theo ma gd nhap vao");
			System.out.println("18. Xoa toi uu");
			System.out.println("19. Xoa ko toi uu");
			System.out.println("20. Edit don gia theo ma giao dich");

			System.out.println("21. Tim dien tich co gia tri lon nhat");
			System.out.println("22. Xuat thong tin dien tich lon nhat");

			System.out.println("23. Sắp Xếp ArrayList theo thứ tự giảm dần ");
			System.out.println("24. Sắp xếp theo thanh tien tang dan");
			System.out.println("25. Sap xep theo ma tang dan");
			System.out.println("26. Sap xep theo ma giam dan 2");
			System.out.println("27. Sap xep theo don gia giam dan");
			System.out.println("28. Sắp xếp theo magd va thanh tien(ma=>tt)");
			System.out.println("29. Sap xep don gia -> diện tích -> mã gd");
			System.out.println("30. Xoa theo ma gd, thong bao neu ko tim thay ma");
			
			System.out.println("31. Xuat giao dich có tt thấp hơn mức tt trung bình của công ty");
			
			System.out.println("0. Thoat");
			System.out.println("Moi ban chon: ");
			chon1 = scanner.nextInt();

			switch (chon1) {
			case 1://NHAP
				/*
				 * System.out.println("\t1. Nhap giao dich dat");
				 * System.out.println("\t2. Nhap giao dich nha");
				 * System.out.println("Moi ban chon: "); chon2 = scanner.nextInt();
				 * listGiaoDich.nhapList(chon2, scanner);
				 */
				int loai;
				System.out.println("chon loai muon nhap : \n\t1.Nhap gd dat \n\t2.Nhap gd nha");
				loai = scanner.nextInt();
				//scanner.nextLine();
				listGiaoDich.themNV(loai, scanner);
				System.out.println();
				break;
				
			case 2://XUAT ALL GD
				listGiaoDich.xuatList();
				break;
				
			case 3://DEM TONG SL ALL GD
				System.out.println("Tong so luong gd: " + listGiaoDich.getSoLuongGD());
				break;
				
			case 4://DEM TONG SL TUNG LOAI
				System.out.println("So luong giao dich dat: " + listGiaoDich.getSoLuongDat());
				System.out.println("So luong giao dich nha: " + listGiaoDich.getSoLuongNha());
				// C2
				listGiaoDich.ThongKeSoLuongHoaDon();
				break;
				
			case 5://DEM SO GD TRUNG
				System.out.println("So gd trung dia chi1: " + listGiaoDich.demdiachi1());
				System.out.println("So gd trung dia chi2: " + listGiaoDich.demdiachi2());
				break;
				
			case 6://LOI: IN THONG TIN GD TRUNG=
				listGiaoDich.indiachitrung();
				break;
				
			case 7://TB TT GD DAT
				System.out.println("Trung binh thanh tien cho giao dich dat: " + listGiaoDich.TBTTGDdat());
				break;
				
			case 8://TONG TT TUNG LOAI
				listGiaoDich.TinhTongTungLoai();
				break;
				
			case 9://TONG TT THEO THANG NHAP
				int thang;
				System.out.print("Nhap vao thang can tinh thanh tien: ");
				thang = scanner.nextInt();
				listGiaoDich.TongThanhtien_theothang(thang);
				// l.TinhTongThanhTien(thang,nam);
				break;
				
			case 10://TINH TBC DON GIA GD DAT
				listGiaoDich.xuatTongTBC();
				break;
				
			case 11://XUAT GD CO MA X
				String magd;
				System.out.println("Nhap ma gd :");
				scanner.nextLine();
				magd = scanner.nextLine();
				listGiaoDich.xuatGD_magd(magd);
				break;
				
			case 12://XUAT GD DAT CO MA X
				System.out.println("Nhap ma giao dich cua gd dat :");
				magd = scanner.next();
				listGiaoDich.xuatGDDat_magd(magd);
				break;
				
			case 13://XUA GD THANG 9/2013
				listGiaoDich.xuatThang9();
				break;
				
			case 14://XUAT THONG TIN GD DAT
				listGiaoDich.xuatGDDat();
				break;
				
			case 15://XUAT LOAI NHA THUONG GD DAT
				System.out.println("Giao dich nha loai thuong:");
				listGiaoDich.Xuatloaithuong_GDNha();
				break;
				
			case 16://XUAT GD CO DON GIA >1000
				System.out.println("Don gia lon hon 1 ngan la: ");
				listGiaoDich.DonGia1K();
				break;
				
			case 17://TIM THEO MA X
				System.out.println("Nhap ma giao dich cua gd dat :");
				magd = scanner.next();
				listGiaoDich.searchMa(magd);
				break;
				
			case 18:// XOA TOI UU
				System.out.print("Nhap ma gd can xoa: ");
				Scanner scan = new Scanner(System.in);
				String x = scan.next();
				if (listGiaoDich.searchMa(x) == null)
					System.out.println("khong tim thay ma");
				else {
					System.out.print("Nhap 1 de xoa:");
					int i = scan.nextInt();
					if (i == 1) {
						listGiaoDich.xoaGD(x);
						System.out.println("xoa thanh cong");
					} else
						System.out.println("xoa that bai");
				}
				listGiaoDich.xuatList();
				break;
				
			case 19:// XOA KHONG TOI UU
				String choice;
				System.out.println("Nhap magd can xoa: ");
				scanner.nextLine();
				magd = scanner.nextLine();
				System.out.println("Bạn có muốn xóa Y/N? nhấn Y để xóa");
				choice = scanner.nextLine();
				if (choice.equalsIgnoreCase("y")) {
					listGiaoDich.xoaMaGD(magd);
					System.out.println("Ma gd " + magd + " da xoa");
					System.out.println("Ket qua sau khi xoa");
					listGiaoDich.xuatList();
				}
				break;

			case 20://SUA DON GIA THEO MA X
				int dongia;
				String maGD;
				scanner.nextLine();
				System.out.println("Nhap magd can sua: ");
				maGD = scanner.nextLine();
				System.out.print("Nhap don gia can sua: ");
				dongia = scanner.nextInt();
				if (listGiaoDich.EditDongia(maGD, dongia)) {
					System.out.println("Don gia da sua");
					listGiaoDich.xuatList();
				} else
					System.out.println("Sửa thất bại");
				break;

			case 21://TIM DT LON NHAT
				listGiaoDich.timmax();
				break;

			case 22://XUAT THONG TIN DTLN
				listGiaoDich.Xuatdtln();
				break;

			case 23://TIM MAGD LON NHAT
				listGiaoDich.Timmaxdt();// LOI
				break;
				
			case 24:
				Collections.sort(listGiaoDich.getAllGD());
				System.out.println("Da sap xep ARRAYLIST ");
				listGiaoDich.xuatList();
				break;
				
			case 25:
				// SAP XEP TT TNAG DAN
				listGiaoDich.SapXepTT();
				System.out.println("Da sap xep TT TANG DAN");
				listGiaoDich.xuatList();
				break;
				
			case 26:
				System.out.println("Da sap xep MAGD TANG DAN");
				listGiaoDich.Tangmagd();
				listGiaoDich.xuatList();
				break;

			case 27:
				System.out.println("Da sap xep MAGD GIAM DAN");
				listGiaoDich.sepXepTheoMa();
				listGiaoDich.xuatList();
				break;

			case 28:
				listGiaoDich.Sort_Giamdongia();
				System.out.println("Da sap xep GIAM DON GIA");
				listGiaoDich.xuatList();
				break;

			case 29:
				// Hoten xep truoc tuoi xep sau(string truoc int)
				listGiaoDich.SapXep_magd_tt();
				System.out.println("Da sap xep MAGD=>TT");
				listGiaoDich.xuatList();
				break;

			case 30:
				listGiaoDich.sortTheo3ThuocTinh();
				System.out.println("Da sap xep DONGIA=>DIENTICH=>MAGD");
				listGiaoDich.xuatList();
				break;
		
			case 31:
				System.out.println("Danh sách giao dich có tt thấp hơn mức tt trung bình của công ty");
				listGiaoDich.XuatTTThap();
				break;
			case 0:
				System.out.println("Good bye");
				System.exit(0);

			default:
				System.out.println("Ban da nhap lua chon sai");
				break;
			}
		} while (chon1 != 0);

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		menu(scanner);
	}
}
