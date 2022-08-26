package Sach;

public class List {

	private Sach s[] = new Sach[100];
	private int CountKH, sum1 = 0, sum2 = 0, dem = 0, sumtien = 0;

	public List() {
		CountKH = 0;
		for (int i = 0; i < 100; i++)
			s[i] = new Sach();
	}

	public void ThemKH(int temp) {
		if (CountKH > 100)
			System.out.println("Bo Nho Da Day, ko the them!");
		else {
			if (temp == 1) {
				s[CountKH] = new SachGK();
				SachGK sgk = new SachGK();
				sgk.nhap();
				sgk.tt = sgk.TTien();
				s[CountKH] = sgk;
				sum1 += sgk.sl;
			} else {
				s[CountKH] = new SachTK();
				SachTK stk = new SachTK();
				stk.nhap();
				stk.tt = stk.TTien();
				s[CountKH] = stk;
				sum2 += stk.sl;
				sumtien += stk.tt;
				dem++;
			}
			CountKH++;
		}
	}

	public void HienThiKH() {
		for (int i = 0; i < CountKH; i++) {
			System.out.println("\nSo TT: " + (i + 1));
			System.out.println(s[i].toString());

		}

	}

	public void TongSL() {
		System.out.println(":::->> Tong So Luong(KW) Dien cua KH Viet Nam: " + sum1);
		System.out.println(":::->> Tong So Luong(KW) Dien cua KH Nuoc Ngoai: " + sum2);
	}

	public void TrungBinh() {
		System.out.println("|-->> Trung Binh Thanh Tien cua KH Nuoc Ngoai: " + (sumtien / dem));
	}
}