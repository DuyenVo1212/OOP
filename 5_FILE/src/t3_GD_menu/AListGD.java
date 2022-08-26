package t3_GD_menu;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class AListGD {
	ArrayList<GiaoDich> ds;
	DecimalFormat dt = new DecimalFormat("#,###.0");

	public AListGD() {
		ds = new ArrayList<GiaoDich>();
	}

	public boolean ThemGD(GiaoDich gd) {
		if (gd != null) {
			for (GiaoDich g : ds) {
				if (g.getMaGD().equalsIgnoreCase(gd.getMaGD())) {
					//System.out.println("Khong them duoc");
					return false;
				}
			}
			ds.add(gd);
			return true;
		}
		return false;
	}

	public int SLTien() {
		int count = 0;
		for (GiaoDich i : ds)
			if (i instanceof GDTien)
				count++;
		return count;
	}

	public int SLVang() {
		int count1 = 0;
		for (GiaoDich i : ds)
			if (i instanceof GDVang)
				count1++;
		return count1;
	}

//	public void TinhTongGD() {
//		int slV = 0; int slT = 0;
//		
//		for(int i =0; i < ds.size(); i++) {
//			if(ds.get(i) instanceof GDVang) {
//				slV +=ds.get(i).getSoLuong();
//			} else {
//				slT += ds.get(i).getSoLuong();
//			}
//		}
//		System.out.println("So luong vang: "+ slV);
//		System.out.println("So luong tien: "+ slT);
//	}

	public void TBThanhTien() {
		double tb = 0, tbc = 0;
		int d = 0;
		for (int i = 0; i < ds.size(); i++) {
			if (ds.get(i) instanceof GDTien) {
				tbc += ((GDTien) ds.get(i)).ThanhTien();
				d++;
			}
		}
		tb = tbc / d;

		System.out.println("Trung binh thanh tien cua GD tien te: " + dt.format(tb));
	}

	public void DonGia1Ti() {
		for (int i = 0; i < ds.size(); i++) {
			if (ds.get(i).getDonGia() > 1000) {
				System.out.println(ds.get(i).toString());
			}
		}
	}

	public void GDThang9() {
		System.out.println("GD thang 9 la: ");
		for (GiaoDich i : ds) {
			if (i.getNgayGD().getMonthValue() == 9) {
				System.out.println(i.toString());
			}
		}
	}

	public double tttien = 0, ttvang = 0;

	public void TinhTongTungLoai() {
		for (GiaoDich i : ds) {
			if (i instanceof GDTien) {
				tttien += ((GDTien) i).ThanhTien();
			} else {
				ttvang += ((GDVang) i).ThanhTien();
			}
		}
		System.out.println("Tong thanh tien tien te: " + tttien);
		System.out.println("Tong thanh tien vang: " + ttvang);
		System.out.println("Tong tien: " + tttien + ttvang);
	}

	public void xuatGDTien() {
		for (int i = 0; i < ds.size(); i++)
			if (ds.get(i) instanceof GDTien)
				System.out.println(ds.get(i));

	}

	public void xuatGDVang() {
		for (int i = 0; i < ds.size(); i++)
			if (ds.get(i) instanceof GDVang)
				System.out.println(ds.get(i));
	}

	public void XuatGD() {
		for (int i = 0; i < ds.size(); i++) {
			System.out.println(ds.get(i).toString());
		}
	}
}
