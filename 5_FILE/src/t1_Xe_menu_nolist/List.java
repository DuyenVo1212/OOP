package t1_Xe_menu_nolist;

import java.util.ArrayList;

import java.util.Scanner;

public class List {
	ArrayList<Xe> listXe = new ArrayList<Xe>();
	public List() {
		listXe = new ArrayList();
	}

	public boolean themCX(Xe cx) {
		if (listXe.contains(cx)) {
			return false;
		} else
			listXe.add(cx);
		return true;
	}

	public static void tuade() {
		String str = "";
		str += String.format("%10s %10s %10s %10s %15s %15s", "maSoChuyen", "hoTen", "soXe", "doanhThu",
				"soTuyen/NoiDen", "soKm/NgayDiDuoc");
		System.out.println(str);
	}

	public void xuatxe() {
		tuade();
		for (Xe i : listXe) {
			System.out.println(i);
		}
	}

	public  void tongDoanhThu() {
		int tong = 0;
		for (Xe i : listXe) {
			tong += i.getDoanhThu();
		}
		System.out.println("Tong doanh thu: " + tong);
	}

}
