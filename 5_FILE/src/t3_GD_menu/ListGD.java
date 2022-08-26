package t3_GD_menu;
//package t3_GD_menu_noa;
//
//import java.text.DecimalFormat;
//import java.util.Scanner;
//
//import t3_GD_menu.GDTien;
//import t3_GD_menu.GDVang;
//import t3_GD_menu.GiaoDich;
//
//public class ListGD {
//	private GiaoDich[] dsGD = new GiaoDich[100];
//	private int dem;
//	public ListGD() {
//		dem = 0;
//		for(int i =0; i < 100; i++) {
//			dsGD[i] = new GiaoDich(); 
//		}
//	}
//	public boolean ThemGD(GiaoDich gd) {
//		if(gd != null) {
//			if(dem > 100) {
//				System.out.println("Full");
//				return false;
//			} else {
//				for(int i =0; i < dem; i++) {
//					if(dsGD[i].getMaGD().equalsIgnoreCase(gd.getMaGD())) {
//						System.out.println("Trung ma");
//						return false;
//					}
//				}
//			}
//			dsGD[dem] = gd;
//			dem++;
//			return true;
//		}
//		return false;
//	}
//	public void TinhTongGD() {
//		int slV = 0; int slT = 0;
//		for(int i =0; i < dem; i++) {
//			if(dsGD[i] instanceof GDVang) {
//				slV += dsGD[i].getSoLuong();
//			} else {
//				slT += dsGD[i].getSoLuong();
//			}
//		}
//		System.out.println("So luong vang: "+ slV);
//		System.out.println("So luong tien: "+ slT);
//	}
//	public void TBThanhTien() {
//		double tb = 0, tbc = 0;
//		int d = 0;
//		for(int i = 0; i < dem; i++) {
//			if(dsGD[i] instanceof GDTien) {
//				tbc += ((GDTien)dsGD[i]).ThanhTien();
//				d++;
//			}
//		}
//		tb = tbc/d;
//		DecimalFormat dt = new DecimalFormat("#,###.0");
//		System.out.println("Trung binh thanh tien cua GD tien te: "+ dt.format(tb));
//	}
//	public void DonGia1Ti() {
//		for(int i = 0; i < dem; i++) {
//			if(dsGD[i].getDonGia() > 1000000000) {
//				System.out.println(dsGD[i]);
//			}
//		}
//	}
//	
//	
//	public void XuatGD() {
//		for(int i = 0; i < dem; i++) {
//			System.out.println(dsGD[i].toString());
//		}
//	}
//}
