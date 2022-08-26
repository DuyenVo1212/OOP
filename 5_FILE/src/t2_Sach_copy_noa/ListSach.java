package t2_Sach_copy_noa;

import java.text.DecimalFormat;

public class ListSach {
	Sach dsS[] = new Sach[100];
	private int dem;
	public ListSach() {
		dem = 0;
		for (int i = 0; i < 100; i++)
			dsS[i] = new Sach();
	}

	public boolean ThemSach(Sach s) {
		if (s != null) {
			if (dem > 100) {
				System.out.println("Full");
				return false;
			} else {
				for (int i = 0; i < dem; i++) {
					if (dsS[i].getMaS().equalsIgnoreCase(s.getMaS())) {
						System.out.println("Trung ma");
						return false;
					}
				}
			}
			dsS[dem] = s;
			dem++;
			return true;
		}
		return false;
	}

	public void TongTienLoaiSach() {
		double gk = 0, tk = 0;
		for (int i = 0; i < dem; i++) {
			if (dsS[i] instanceof SachGK) {
				gk = gk + ((SachGK) dsS[i]).ThanhTien();
			} else {
				tk = tk + ((SachTK) dsS[i]).ThanhTien();
			}
		}
		System.out.println("TT SGK: " + gk);
		System.out.println("TT STK: " + tk);
	}

	public void TrungBinh() {
		double tb = 0, tbc = 0;
		int dem = 0;
		for (int i = 0; i < dem; i++) {
			if (dsS[i] instanceof SachTK) {
				tbc = tbc + dsS[i].getDonGia();
				dem++;
			}
		}
		tb = tbc / dem;
		DecimalFormat dt = new DecimalFormat("#,###.0");
		System.out.println("Trung binh cong don gia DS Tkhao: " + dt.format(tb));
	}

	public void XuatSach() {
		for (int i = 0; i < dem; i++) {
			System.out.println(dsS[i].toString());
		}
	}

	public void XuatNXB(String nxb) {
		for (int i = 0; i < dem; i++) {
			if (dsS[i].getNxb().equalsIgnoreCase(nxb)) {
				System.out.println(dsS[i].toString());
			}
		}
	}

	public void xuatSachGK() {
		for (int i = 0; i < dsS.length; i++)
			if (dsS[i] instanceof SachGK)
				System.out.println(dsS[i]);
	}

	public void xuatSachTK() {
		for (int i = 0; i < dsS.length; i++)
			if (dsS[i] instanceof SachTK)
				System.out.println(dsS[i]);
	}

	public void xuatThang3() {
		for (int i = 0; i < dem; i++) {
			if (dsS[i].getNgayNhap().getMonth().getValue() == 3 && dsS[i].getNgayNhap().getYear() == 2019) 
			{
				System.out.println("Sach thang 3 nam 2019 la:");
				System.out.println(dsS[i].toString());
			}		
		}
		
	}

}