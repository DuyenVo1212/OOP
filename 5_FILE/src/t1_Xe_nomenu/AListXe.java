package t1_Xe_nomenu;

import java.util.ArrayList;

public class AListXe {
	ArrayList<ChuyenXe> ds;
	public AListXe(){
		ds = new ArrayList<ChuyenXe>();
	}
	public boolean AddXe(ChuyenXe xe) {
		if(xe != null) {
			for(ChuyenXe c : ds) {
				if(c.getMaSC().equalsIgnoreCase(xe.getMaSC())) {
					System.out.println("Khong them duoc");
					return false;
				}
			}
			ds.add(xe);
			return true;
		}
		return false;
	}
	public void XuatNoiThanh() {
		System.out.println("Xuat Noi Thanh");
		for(int i = 0; i < ds.size(); i++) {
			if(ds.get(i) instanceof NoiThanh) {
				System.out.println(ds.get(i).toString());
			}
		}
	}
	public double TongTien() {
		double tt = 0;
		for(int i = 0; i < ds.size(); i++) {
			tt += ds.get(i).getDoanhthu();
		}
		return tt;
	}
	public double TongTienNoiThanh() {
		double tt = 0;
		for(int i = 0; i <  ds.size(); i++) {
			if(ds.get(i) instanceof NoiThanh) {
				tt += ds.get(i).getDoanhthu();
			}
		}
		return tt;
	}
	public void XuatXe() {
		for(int i = 0; i < ds.size(); i++) {
			System.out.println(ds.get(i).toString());
		}
	}
}
