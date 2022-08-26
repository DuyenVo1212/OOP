package GD;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class AListGD {
	ArrayList<GiaoDich> ds;
	public AListGD(){
		ds = new ArrayList<GiaoDich>();
	}
	public boolean ThemGD(GiaoDich gd) {
		if(gd != null) {
			for(GiaoDich g : ds) {
				if(g.getMaGD().equalsIgnoreCase(gd.getMaGD())) {
					System.out.println("Khong them duoc");
					return false;
				}
			}
			ds.add(gd);
			return true;
		}
		return false;
	}
	public void SoLuongGD() {
		int v =0, t = 0;
		for(int i = 0; i < ds.size(); i++) {
			if(ds.get(i) instanceof GDVang) {
				v += ds.get(i).getSoLuong();
			}
			else {
				t += ds.get(i).getSoLuong();
			}
		}
		System.out.println("Giao dich vang: "+ v);
		System.out.println("Guo dich tien: "+ t);
	}
	public void TBThanhTien() {
		double tb = 0, tbc = 0;
		int d = 0;
		for(int i = 0; i < ds.size(); i++) {
			if(ds.get(i) instanceof GDTien) {
				tbc += ((GDTien) ds.get(i)).ThanhTien();
				d++;
			}
		}
		tb = tbc/d;
		DecimalFormat dt = new DecimalFormat("#,###.0");
		System.out.println("Trung binh thanh tien cua GD tien te: "+ dt.format(tb));
	}
	public void DonGia1Ti() {
		for(int i = 0; i < ds.size(); i++) {
			if(ds.get(i).getDonGia() >= 1000000000) {
				System.out.println(ds.get(i).toString());
			}
		}
	}
	public void XuatGD() {
		for(int i = 0; i < ds.size(); i++) {
			System.out.println(ds.get(i).toString());
		}
	}
}
