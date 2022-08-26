//package t4_NhaDat_menu_error;
//
//import java.time.LocalDate;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.Scanner;
//
//import t1_Xe_menu_full.ChuyenXe;
//
//public class ListNhaDat {
//	private NhaDat[] ds = new NhaDat[100];
//	private int dem;
//
//	public ListNhaDat() {
//		dem = 0;
//		for (int i = 0; i < 100; i++) {
//			ds[i] = new NhaDat();
//		}
//	}
//
//	public boolean ThemNhaDat(NhaDat nd) {
//		if (nd != null) {
//			if (dem > 100) {
//				System.out.println("Full");
//				return false;
//			} else {
//				for (int i = 0; i < dem; i++) {
//					if (ds[i].getMaGD().equalsIgnoreCase(nd.getMaGD())) {
//						System.out.println("Trung Ma GD");
//						return false;
//					}
//				}
//			}
//			ds[dem] = nd;
//			dem++;
//			return true;
//		}
//		return false;
//	}
//
//	public void TinhTongTungLoai() {
//		int slDat = 0, slNha = 0;
//		for (int i = 0; i < dem; i++) {
//			if (ds[i] instanceof GDDat) {
//				slDat++;
//			} else {
//				slNha++;
//			}
//		}
//		System.out.println("So luong GD Dat la: " + slDat);
//		System.out.println("So luong GD Dat la: " + slNha);
//	}
//
//	public void TBThanhTien() {
//		double tb = 0, tbd = 0;
//		int d = 0;
//		for (int i = 0; i < dem; i++) {
//			if (ds[i] instanceof GDDat) {
//				tbd += ((GDDat) ds[i]).ThanhTien();
//				d++;
//			}
//		}
//		tb = tbd / d;
//		System.out.printf("Trung binh thanh tien cua GD Dat la: %10.2f", tb);
//	}
//
//	public void GDThang9() {
//		for (int i = 0; i < dem; i++) {
//			if (ds[i].getNgayGD().getMonth().getValue() == 9) {
//				System.out.println(ds[i].toString());
//			}
//		}
//	}
//
//	public void XuatNhaDat() {
//		for (int i = 0; i < dem; i++) {
//			System.out.println(ds[i].toString());
//		}
//	}
//
//}
