package NhaDat;

import java.util.ArrayList;

public class AListNhaDat {
	ArrayList<NhaDat> ds;
	public AListNhaDat() {
		ds = new ArrayList<NhaDat>();
	}
	public boolean ThemNhaDat(NhaDat nd) {
		if(nd != null) {
			for(NhaDat n: ds) {
				if(n.getMaGD().equalsIgnoreCase(nd.getMaGD())) {
					System.out.println("Khong Them Duoc");
					return false;
				}
			}
			ds.add(nd);
			return true;
		}
		return false;
	}

	public double ttnha = 0, ttdat = 0; 
	public void TinhTongTungLoai() {
		for(NhaDat n : ds) {
			if(n instanceof GDNha) {
				ttnha += ((GDNha) n).ThanhTien();
			} else {
				ttdat += ((GDDat) n).ThanhTien();
			}
		}
		System.out.println("Tong tien nha: "+ ttnha);
		System.out.println("Tong tien dat: "+ ttdat);
		System.out.println("Tong tien: "+ ttdat + ttnha);
	}
	public void TBThanhTien() {
		System.out.println("Trung binh thanh tien: "+ (ttnha+ttdat)/ds.size());
	}
	public void GDThang9() {
		System.out.println("GD thang 9 la: ");
		for(NhaDat n: ds) {
			if(n.getNgayGD().getMonthValue() == 9) {
				System.out.println(n.toString());
			}
		}
	}
	public void XuatNhaDat() {
		for(NhaDat n : ds) {
			System.out.println(n.toString());
		}
	}
}
